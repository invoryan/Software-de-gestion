package com.unamba.cinemagicoabancay.main;
import com.unamba.cinemagicoabancay.body.homeAdmin;

public class main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeAdmin().setVisible(true);
            }
        });
    } 
}
