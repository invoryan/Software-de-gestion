package com.unamba.cinemagicoabancay.databaseconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class dbConnection2 {
    String url="jdbc:mysql://localhost:3306/";
    String db="db_cinemagicoabancay";
    String user="root";
    String password="bryan";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection conexion=null;

    public dbConnection2() {
    }
    public Connection connect(){
        try {
            Class.forName(driver);
            conexion=DriverManager.getConnection(url+db, user, password);
            JOptionPane.showMessageDialog(null,"Conexión Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de conexion: "+e.getMessage());
        }
        return conexion;
    }   
}
