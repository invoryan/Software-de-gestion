package com.unamba.cinemagicoabancay.crud;

import com.unamba.cinemagicoabancay.circleLabel.CLabel;
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
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class CrudUsers {
    dbConnection cc=new dbConnection();
    Connection con=cc.connect();
    boolean idAdmin=false;// id to updatePersonData
    public String dateToday(){
        Calendar date=new GregorianCalendar();
        String day,month,year,currentDate;
        day=Integer.toString(date.get(Calendar.DATE));
        month=Integer.toString(date.get(Calendar.MONTH)+1);
        year=Integer.toString(date.get(Calendar.YEAR));
        currentDate=day+"/"+month+"/"+year;
        return currentDate;
    }
    public boolean preconfigurationInitialize(){
        boolean userExist=false;
        String SQL="select * from tuser";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next()){
                userExist=true;
            }else{
                userExist=false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexión incorrecta:"+e.getMessage());
        }
        return userExist;
    }
    public void InsertPerson(String user,String name,String cel,String pswd,String date,String dateUpdate,FileInputStream img){
        String SQL="insert into Tuser(usuario,nombre,cel,contraseña,fechaInicioLabor,fechaUpdate,img) values(?,?,?,?,?,?,?);";
        try {
            PreparedStatement pst=con.prepareStatement(SQL);
            pst.setString(1, user);
            pst.setString(2, name);
            pst.setString(3, cel);
            pst.setString(4, pswd);
            pst.setString(5, date);
            pst.setString(6, dateUpdate);
            pst.setBlob(7, img);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de registro:"+e.getMessage());
        }
    }
    public void updatePersonTable(JTable table,JTextField usuario,JLabel usuariolbl,JTextField nombre,JTextField celular,JPasswordField contraseña){
        int row=table.getSelectedRow();
        if(row>=0){
            usuario.setText(table.getValueAt(row, 0).toString());
            usuariolbl.setText(table.getValueAt(row, 0).toString());
            nombre.setText(table.getValueAt(row, 1).toString());
            celular.setText(table.getValueAt(row, 2).toString());
            contraseña.setText(table.getValueAt(row, 3).toString());
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione una fila");
        }
    }
    public void updatePersonData(JTable table,JTextField usuario,JLabel usuariolbl,JTextField nombre,JTextField celular,JPasswordField contraseña){
        String SQL="select * from tuser where usuario='"+usuariolbl.getText()+"' and id='1'";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next()){
                idAdmin=true;
                JOptionPane.showMessageDialog(null,"No puede modificar al administrador en este apartado");
            }else{
                idAdmin=false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexión incorrecta:"+e.getMessage());
        }
        if(idAdmin==false){
            if(usuariolbl.getText().equals("")||nombre.getText().equals("")||celular.getText().equals("")||contraseña.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Rellena todos los datos");
            }
            else{
                try {
                    PreparedStatement pass=con.prepareStatement("Update tuser set usuario='"+usuario.getText()+"',nombre='"+nombre.getText()
                            +"',cel='"+celular.getText()+"',contraseña='"+String.valueOf(contraseña.getPassword())+"',fechaUpdate='"+dateToday()+"' where usuario='"+usuariolbl.getText()+"'");
                    pass.executeUpdate();
                    search_and_show_PersonTable(table,"");
                    JOptionPane.showMessageDialog(null,"Datos actualizados");
                } catch (SQLException ex) {
                    Logger.getLogger(CrudUsers.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    public void updatePersonDataWithoutTable(JTextField usuario,String usuariolbl,JTextField nombre,JTextField celular,JPasswordField contraseña){
        if(usuario.getText().equals("")||nombre.getText().equals("")||celular.getText().equals("")||String.valueOf(contraseña.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null,"Llenar todos los campos");
        }else{
            try {   
                PreparedStatement pass=con.prepareStatement("Update tuser set usuario='"+usuario.getText()+"',nombre='"+nombre.getText()
                +"',cel='"+celular.getText()+"',contraseña='"+String.valueOf(contraseña.getPassword())+"',fechaUpdate='"+dateToday()+"' where usuario='"+usuariolbl+"'");
                pass.executeUpdate();
                JOptionPane.showMessageDialog(null,"Datos actualizados");
            } catch (SQLException ex) {
                Logger.getLogger(CrudUsers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void updatePersonDataImg(String usuariolbl,FileInputStream img){
        String SQL="Update tuser set img=? where usuario=?";
        try {
            PreparedStatement pst=con.prepareStatement(SQL); 
            pst.setBlob(1,img);
            pst.setString(2,usuariolbl);
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null,"actualizacion exitosa img");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de registro:"+e.getMessage());
        }
        
    }
    public void search_and_show_PersonTable(JTable table,String nameSearch){
        String SQL="";
        if(nameSearch.equals("")){
            SQL="Select * from tuser";
        }else{
            SQL="Select * from tuser where nombre like'%"+nameSearch+"%'";
        }
        Statement st;
        table.setDefaultRenderer(Object.class, new tableImgRenderer());
        DefaultTableModel model = new DefaultTableModel(){
	@Override
        public boolean isCellEditable(int row, int column) {
                return false;//no se puede editar
            }
	};
        model.addColumn("Usuario");
        model.addColumn("Nombre");
        model.addColumn("Celular");
        model.addColumn("Contraseña");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Actualizaciòn");
        model.addColumn("Imagen");
        table.setModel(model);
        Object data[]=new Object[7];
        try {
            st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                data[0]=rs.getObject(2);
                data[1]=rs.getObject(3);
                data[2]=rs.getObject(4);
                data[3]=rs.getObject(5);
                data[4]=rs.getObject(6);
                data[5]=rs.getObject(7);
                
                Blob blob=rs.getBlob(8);
                byte[] dat=blob.getBytes(1,(int)blob.length());
                BufferedImage img=null;
                try {
                    img=ImageIO.read(new ByteArrayInputStream(dat));
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"Error al leer la imagen"+e.getMessage());
                }
                ImageIcon icon=new ImageIcon(img.getScaledInstance(60, 60, 0));
                data[6]=new JLabel(icon);
                model.addRow(data);
                table.setRowHeight(64);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar el registro:"+e.getMessage());
        }    
        
    }
    public void userData(String usuario,JLabel lblusuario,JLabel lblnombre){
        int result=0;
        String SQL="select usuario,nombre,img from tuser where usuario='"+usuario+"';";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next()){
                result=1;
                if(result==1){                   
                    lblusuario.setText(rs.getObject(1).toString());
                    lblnombre.setText(rs.getObject(2).toString());                   
                }
            }else{
                JOptionPane.showMessageDialog(null,"Error de acceso. Usuario no registrado o contraseña incorrecta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexión incorrecta:"+e.getMessage());
        }
        
    }
    public void userImgShow(String usuario,CLabel cl){
        int result=0;
        String SQL="select img from tuser where usuario='"+usuario+"';";
        try {
            PreparedStatement pst=con.prepareStatement(SQL);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                result=1;
                if(result==1){                   
                    Blob blob=rs.getBlob(1);
                    byte[] dat=blob.getBytes(1,(int)blob.length());
                    BufferedImage img=null;
                    try {
                        img=ImageIO.read(new ByteArrayInputStream(dat));
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null,"Error al leer la imagen"+e.getMessage());
                    }
                    ImageIcon icon=new ImageIcon(img);
                    Icon imagen=new ImageIcon(icon.getImage().getScaledInstance(cl.getWidth(),cl.getHeight(),Image.SCALE_DEFAULT));
                    cl.setIcon(imagen);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Error de acceso. Usuario no registrado o contraseña incorrecta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexión incorrecta:"+e.getMessage());
        }
        
    }
    public void userDataComplete(String usuario,JTextField jtusuario,JTextField jtnombre,JTextField jtcel,JPasswordField pswd){
        int result=0;
        String SQL="select usuario,nombre,cel,contraseña from tuser where usuario='"+usuario+"';";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next()){
                result=1;
                if(result==1){                   
                    jtusuario.setText(rs.getObject(1).toString());
                    jtnombre.setText(rs.getObject(2).toString());
                    jtcel.setText(rs.getObject(3).toString());
                    pswd.setText(rs.getObject(4).toString()); 
                }
            }else{
                JOptionPane.showMessageDialog(null,"Error de acceso. Usuario no registrado o contraseña incorrecta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexión incorrecta:"+e.getMessage());
        }
        
    }
    public void deletePersonData(JTable table,JLabel usuariolbl){
        String SQL="select * from tuser where usuario='"+usuariolbl.getText()+"' and id='1'";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next()){
                idAdmin=true;
                JOptionPane.showMessageDialog(null,"No puede modificar al administrador en este apartado");
            }else{
                idAdmin=false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexión incorrecta:"+e.getMessage());
        }
        if(idAdmin==false){
            try {
                PreparedStatement pass=con.prepareStatement("delete from tuser where usuario='"+usuariolbl.getText()+"'");
                pass.executeUpdate();
                search_and_show_PersonTable(table,"");
                JOptionPane.showMessageDialog(null,"Usuario eliminado");
            } catch (SQLException ex) {
                Logger.getLogger(CrudUsers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
}
