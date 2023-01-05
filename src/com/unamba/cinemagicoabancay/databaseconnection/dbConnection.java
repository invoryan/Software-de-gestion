package com.unamba.cinemagicoabancay.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnection {
    String url="jdbc:mysql://localhost:3306/";
    String db="ejemplo";
    String user="root";
    String password="bryan";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection jdbc;
    /**/String error=" ,Error2 en conexion: ";
    
    public dbConnection(){
        
    }
    public Connection connect() throws SQLException{
        try {
            Class.forName(driver);
            jdbc=DriverManager.getConnection(url+db, user, password);
            System.out.println("La base de datos esta conectada");
        } catch (ClassNotFoundException|SQLException e) {
            System.out.println("No se conecto a la base de datos. Error:"+e);
            error+="No se conecto a la base de datos. Error:"+e+",";
        }
        return jdbc;
    }
    public void desconect(){
        try {
            System.out.println("coneccion finalizada");
            jdbc.close();
        } catch (SQLException e) {
            System.out.println("Error al finalizar la coneccion. Error:"+e);
            error+="Error al finalizar la coneccion. Error:"+e+",";
        }
    }
    public String error(){
        return error;
    }
    public static void main(String[] args) {
        dbConnection jdbc=new dbConnection();
        Statement st;
        ResultSet rs;
        try {
            st=jdbc.connect().createStatement();
            rs=st.executeQuery("select * from Tuser");
            System.out.println("Registros ");
            while(rs.next()){
                System.out.println("Id:"+rs.getInt("num"));  
            }
            jdbc.desconect();
        } catch (Exception e) {
            System.out.println("error:"+e);
        }
        
    }
}
