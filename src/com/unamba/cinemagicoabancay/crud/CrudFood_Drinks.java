package com.unamba.cinemagicoabancay.crud;

import com.unamba.cinemagicoabancay.databaseconnection.dbConnection;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class CrudFood_Drinks {
    dbConnection cc=new dbConnection();
    Connection con=cc.connect();
    public String dateToday(){
        Calendar date=new GregorianCalendar();
        String day,month,year,currentDate;
        day=Integer.toString(date.get(Calendar.DATE));
        month=Integer.toString(date.get(Calendar.MONTH)+1);
        year=Integer.toString(date.get(Calendar.YEAR));
        currentDate=day+"/"+month+"/"+year;
        return currentDate;
    }
    public void InsertFood_drinks(JTextField name,JTextField price,FileInputStream img){
        String SQL="insert into tfood_drinks(namefood_drink,price,fechaInicio,fechaUpdate,img) values(?,?,?,?,?);";
        try {
            PreparedStatement pst=con.prepareStatement(SQL);
            pst.setString(1, name.getText());
            pst.setFloat(2, Float.parseFloat(price.getText()));
            pst.setString(3, dateToday());
            pst.setString(4, dateToday());
            pst.setBlob(5, img);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de registro:"+e.getMessage());
        }
    }
    public void search_and_show_Food_drinksTable(JTable table,String nameSearch){
        String SQL="";
        if(nameSearch.equals("")){
            SQL="Select * from tfood_drinks";
        }else{
            SQL="Select * from tfood_drinks where namefood_drink like'%"+nameSearch+"%'";
        }
        Statement st;
        table.setDefaultRenderer(Object.class, new tableImgRenderer());
        DefaultTableModel model = new DefaultTableModel(){
	@Override
        public boolean isCellEditable(int row, int column) {
                return false;//no se puede editar
            }
	};
        model.addColumn("Nombre");
        model.addColumn("Precio S/.");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Actualizaciòn");
        model.addColumn("Imagen");
        table.setModel(model);
        Object data[]=new Object[5];
        try {
            st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                data[0]=rs.getObject(2);
                data[1]=rs.getObject(3);
                data[2]=rs.getObject(4);
                data[3]=rs.getObject(5);
                
                Blob blob=rs.getBlob(6);
                byte[] dat=blob.getBytes(1,(int)blob.length());
                BufferedImage img=null;
                try {
                    img=ImageIO.read(new ByteArrayInputStream(dat));
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"Error al leer la imagen"+e.getMessage());
                }
                ImageIcon icon=new ImageIcon(img.getScaledInstance(60, 60, 0));
                data[4]=new JLabel(icon);
                model.addRow(data);
                table.setRowHeight(64);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar el registro:"+e.getMessage());
        }
           
    }
    public void datePersonTable(JTable table,JTextField name,JLabel usuariolbl,JTextField price,JLabel lblimg){
        int row=table.getSelectedRow();
        if(row>=0){
            name.setText(table.getValueAt(row, 0).toString());
            usuariolbl.setText(table.getValueAt(row, 0).toString());
            price.setText(table.getValueAt(row, 1).toString());
            String SQL="select img from tfood_drinks where namefood_drink='"+table.getValueAt(row, 0).toString()+"';";
            try {
                PreparedStatement pst=con.prepareStatement(SQL);
                ResultSet rs=pst.executeQuery();
                if(rs.next()){                  
                    Blob blob=rs.getBlob(1);
                    byte[] dat=blob.getBytes(1,(int)blob.length());
                    BufferedImage img=null;
                    try {
                        img=ImageIO.read(new ByteArrayInputStream(dat));
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null,"Error al leer la imagen"+e.getMessage());
                    }
                    ImageIcon icon=new ImageIcon(img);
                    Icon imagen=new ImageIcon(icon.getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_DEFAULT));
                    lblimg.setIcon(imagen);
                }else{
                    JOptionPane.showMessageDialog(null,"Error de acceso. Usuario no registrado o contraseña incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Conexión incorrecta:"+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione una fila");
        }
        
    }
    public void updateFood_drinksDataWithoutTable(JTable table,JTextField name,JLabel lblname,JTextField price){
        if("".equals(name.getText())||"".equals(price.getText())){
            JOptionPane.showMessageDialog(null,"Rellene todos los datos");
        }else{
            try {   
                PreparedStatement pass=con.prepareStatement("Update tfood_drinks set namefood_drink='"+name.getText()+"',price='"+Float.parseFloat(price.getText())
                +"',fechaUpdate='"+dateToday()+"' where namefood_drink='"+lblname.getText()+"'");
                pass.executeUpdate();
                search_and_show_Food_drinksTable(table,"");
                JOptionPane.showMessageDialog(null,"Datos actualizados");
            } catch (SQLException ex) {
                Logger.getLogger(CrudUsers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void updateFood_drinksDataImg(JTable table,JLabel lblname,FileInputStream img){
        String SQL="Update tfood_drinks set img=? where namefood_drink=?";
        try {
            PreparedStatement pst=con.prepareStatement(SQL); 
            pst.setBlob(1,img);
            pst.setString(2,lblname.getText());
            pst.executeUpdate();
            search_and_show_Food_drinksTable(table,"");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de registro:"+e.getMessage());
        }  
    }
    public void deleteFood_drinks(JTable table,JLabel usuariolbl){
        try {
            PreparedStatement pass=con.prepareStatement("delete from tfood_drinks where namefood_drink='"+usuariolbl.getText()+"'");
            pass.executeUpdate();
            search_and_show_Food_drinksTable(table,"");
            JOptionPane.showMessageDialog(null,"Usuario eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(CrudUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
