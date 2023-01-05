package com.unamba.cinemagicoabancay.login;

import com.unamba.cinemagicoabancay.body.homeAdmin;
import com.unamba.cinemagicoabancay.body.homeNormal;
import java.sql.*;
import com.unamba.cinemagicoabancay.databaseconnection.dbConnection;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    int xMouse,yMouse;
    dbConnection cc=new dbConnection();
    Connection con=cc.connect();
    String user,pswd;
    public login() {
        initComponents();
        this.setBackground(new Color(0,0,0,10));//Transparencia
        this.setLocationRelativeTo(null);
        jPanelPrincipalHead.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.unamba.cinemagicoabancay.login.PanelRound();
        jPanelPrincipalHead = new javax.swing.JPanel();
        jPanelElementsWindows = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelExpand = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelPwd = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        panelRoundgetInto = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabelgetInto = new javax.swing.JLabel();
        panelRoundOut = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabelOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(0, 0, 0));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jPanelPrincipalHead.setBackground(new java.awt.Color(217, 217, 217));
        jPanelPrincipalHead.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelPrincipalHeadMouseDragged(evt);
            }
        });
        jPanelPrincipalHead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelPrincipalHeadMousePressed(evt);
            }
        });

        jPanelElementsWindows.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMin.setFont(new java.awt.Font("Verdana", 0, 26)); // NOI18N
        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinMouseExited(evt);
            }
        });
        jPanelElementsWindows.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 47, 26));

        jLabelExpand.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelExpand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExpand.setText("■");
        jLabelExpand.setSize(30,30);
        jLabelExpand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExpandMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExpandMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExpandMouseExited(evt);
            }
        });
        jPanelElementsWindows.add(jLabelExpand, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 0, 47, 26));

        jLabelClose.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });
        jPanelElementsWindows.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 0, 47, 26));

        javax.swing.GroupLayout jPanelPrincipalHeadLayout = new javax.swing.GroupLayout(jPanelPrincipalHead);
        jPanelPrincipalHead.setLayout(jPanelPrincipalHeadLayout);
        jPanelPrincipalHeadLayout.setHorizontalGroup(
            jPanelPrincipalHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalHeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelElementsWindows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPrincipalHeadLayout.setVerticalGroup(
            jPanelPrincipalHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelElementsWindows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabelBienvenido.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenido.setText("BIENVENIDO");

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Nombre de usuario:");

        jLabelPwd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelPwd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPwd.setText("Contraseña:");

        panelRoundgetInto.setBackground(new java.awt.Color(6, 161, 227));
        panelRoundgetInto.setRoundBottomLeft(50);
        panelRoundgetInto.setRoundBottomRight(50);
        panelRoundgetInto.setRoundTopLeft(50);
        panelRoundgetInto.setRoundTopRight(50);
        panelRoundgetInto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRoundgetIntoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundgetIntoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundgetIntoMouseExited(evt);
            }
        });

        jLabelgetInto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelgetInto.setForeground(new java.awt.Color(0, 0, 102));
        jLabelgetInto.setText("Ingresar");

        javax.swing.GroupLayout panelRoundgetIntoLayout = new javax.swing.GroupLayout(panelRoundgetInto);
        panelRoundgetInto.setLayout(panelRoundgetIntoLayout);
        panelRoundgetIntoLayout.setHorizontalGroup(
            panelRoundgetIntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundgetIntoLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jLabelgetInto)
                .addGap(140, 140, 140))
        );
        panelRoundgetIntoLayout.setVerticalGroup(
            panelRoundgetIntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundgetIntoLayout.createSequentialGroup()
                .addComponent(jLabelgetInto)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        panelRoundOut.setRoundBottomLeft(50);
        panelRoundOut.setRoundBottomRight(50);
        panelRoundOut.setRoundTopLeft(50);
        panelRoundOut.setRoundTopRight(50);
        panelRoundOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRoundOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundOutMouseExited(evt);
            }
        });

        jLabelOut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelOut.setText("Salir");

        javax.swing.GroupLayout panelRoundOutLayout = new javax.swing.GroupLayout(panelRoundOut);
        panelRoundOut.setLayout(panelRoundOutLayout);
        panelRoundOutLayout.setHorizontalGroup(
            panelRoundOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelOut)
                .addGap(163, 163, 163))
        );
        panelRoundOutLayout.setVerticalGroup(
            panelRoundOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundOutLayout.createSequentialGroup()
                .addComponent(jLabelOut)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipalHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabelBienvenido))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField)
                            .addComponent(panelRoundgetInto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRoundOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldName))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(jPanelPrincipalHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(panelRoundgetInto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRoundOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseEntered
        jLabelMin.setOpaque(true);
        jLabelMin.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_jLabelMinMouseEntered

    private void jLabelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseExited
        jLabelMin.setBackground(new Color(242,242,242));
        jLabelMin.setOpaque(false);
    }//GEN-LAST:event_jLabelMinMouseExited

    private void jLabelExpandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExpandMouseClicked
        /*if(this.getExtendedState()==MAXIMIZED_BOTH){
            this.setExtendedState(NORMAL);
        }else{
            this.setExtendedState(MAXIMIZED_BOTH);
        }*/
    }//GEN-LAST:event_jLabelExpandMouseClicked

    private void jLabelExpandMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExpandMouseEntered
        /*jLabelExpand.setOpaque(true);
        jLabelExpand.setBackground(new Color(210,210,210));*/
    }//GEN-LAST:event_jLabelExpandMouseEntered

    private void jLabelExpandMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExpandMouseExited
        /*jLabelExpand.setBackground(new Color(242,242,242));
        jLabelExpand.setOpaque(false);*/
    }//GEN-LAST:event_jLabelExpandMouseExited

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        jLabelClose.setBackground(Color.RED);
        jLabelClose.setOpaque(true);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        jLabelClose.setBackground(new Color(242,242,242));
        jLabelClose.setOpaque(false);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jPanelPrincipalHeadMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrincipalHeadMouseDragged
        int x=evt.getXOnScreen(),y=evt.getYOnScreen();

        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanelPrincipalHeadMouseDragged

    private void jPanelPrincipalHeadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPrincipalHeadMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanelPrincipalHeadMousePressed

    private void panelRoundgetIntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetIntoMouseClicked
        int result=0;
        boolean idAdmin=false;
        user=jTextFieldName.getText();
        pswd=String.valueOf(jPasswordField.getPassword());
        String SQL="select * from tuser where usuario='"+user+"' and contraseña='"+pswd+"';";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next()){
                result=1;
                if(result==1){
                    JOptionPane.showMessageDialog(null,"Bienvenido "+user);
                    if(rs.getInt("id")==1){
                        idAdmin=true;
                        new homeAdmin().setVisible(true);
                    }else{
                        idAdmin=false;
                        new homeNormal().setVisible(true);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null,"Error de acceso. Usuario no registrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexión incorrecta:"+e.getMessage());
        }
        
    }//GEN-LAST:event_panelRoundgetIntoMouseClicked

    private void panelRoundgetIntoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetIntoMouseEntered
        panelRoundgetInto.setBackground(new Color(0,125,179));
    }//GEN-LAST:event_panelRoundgetIntoMouseEntered

    private void panelRoundgetIntoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetIntoMouseExited
        panelRoundgetInto.setBackground(new Color(6,161,227));
    }//GEN-LAST:event_panelRoundgetIntoMouseExited

    private void panelRoundOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundOutMouseEntered
        panelRoundOut.setBackground(new Color(170,166,166));
    }//GEN-LAST:event_panelRoundOutMouseEntered

    private void panelRoundOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundOutMouseExited
        panelRoundOut.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_panelRoundOutMouseExited

    private void panelRoundOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panelRoundOutMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelExpand;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelOut;
    private javax.swing.JLabel jLabelPwd;
    private javax.swing.JLabel jLabelgetInto;
    private javax.swing.JPanel jPanelElementsWindows;
    private javax.swing.JPanel jPanelPrincipalHead;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldName;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRound1;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRoundOut;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRoundgetInto;
    // End of variables declaration//GEN-END:variables
}
