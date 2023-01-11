package com.unamba.cinemagicoabancay.main;
import com.unamba.cinemagicoabancay.crud.CrudUsers;
import com.unamba.cinemagicoabancay.login.login;
import com.unamba.cinemagicoabancay.preconfiguration.preconfiguration;
public class main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            CrudUsers crud=new CrudUsers();
            public void run() {
                if(crud.preconfigurationInitialize()==false){
                    new preconfiguration().setVisible(true);
                }else{
                    new login().setVisible(true);
                }
                
            }
        });
    } 
}
