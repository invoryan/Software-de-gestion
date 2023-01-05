package com.unamba.cinemagicoabancay.main;
import com.unamba.cinemagicoabancay.login.login;
public class main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    } 
}
