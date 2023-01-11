package com.unamba.cinemagicoabancay.body.panels;


import com.unamba.cinemagicoabancay.circleLabel.CLabel;
import com.unamba.cinemagicoabancay.crud.CrudUsers;
import com.unamba.cinemagicoabancay.login.login;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class editPanel extends javax.swing.JPanel {
    CrudUsers crud=new CrudUsers();
    login lg=new login();
    String user=lg.getUser();
    String userPath="";
    CLabel cq=new CLabel(265, 265,5, Color.BLACK, userPath);
    public editPanel(String user) {
        this.user=user;
        initComponents();        
        cq.setOpaque(false);
        jPanel2.add(cq);
        //36*36
        crud.userDataComplete(user, jTextFieldUser1,jTextFieldname, jTextFieldCel, jPasswordField);
        crud.userImgShow(user, cq);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabelName = new javax.swing.JLabel();
        jTextFieldUser1 = new javax.swing.JTextField();
        jLabelUser = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jLabelCel = new javax.swing.JLabel();
        jTextFieldCel = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        panelRound2 = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(783, 516));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));

        panelRound1.setBackground(new java.awt.Color(32, 39, 58));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Usuario:");

        jLabelUser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("Nombre:");

        jLabelCel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelCel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCel.setText("Celular:");

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Nueva Contraseña:");

        panelRound2.setBackground(new java.awt.Color(0, 172, 226));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRound2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRound2MouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Guardar");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(25, 25, 25))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUser1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUser, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unamba/cinemagicoabancay/body/img/Icons/addUserUpdate.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 210, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 212, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(114, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(439, 439, 439))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setOpaque(true);
        jLabel14.setBackground(new Color(190,190,190));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setOpaque(false);
        jLabel14.setBackground(new Color(217,217,217));
    }//GEN-LAST:event_jLabel14MouseExited

    private void panelRound2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MouseEntered
        panelRound2.setBackground(new Color(0,145,199));
    }//GEN-LAST:event_panelRound2MouseEntered

    private void panelRound2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MouseExited
        panelRound2.setBackground(new Color(0,172,226));
    }//GEN-LAST:event_panelRound2MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Formatos de archivos *.JPEG,*.JPG,*.JFIF & *.PNG","jpg","jpeg","jfif","png");
        JFileChooser file=new JFileChooser();
        file.setFileFilter(filter);
        file.setDialogTitle("Abrir archivo");
        File pathDefect=new File("Donwloads");
        file.setCurrentDirectory(pathDefect);
        int fileW=file.showOpenDialog(null);
        if(fileW==JFileChooser.APPROVE_OPTION){
            File imgFile =file.getSelectedFile();
            userPath=String.valueOf(imgFile);
            System.out.println("ruta de imagen:"+userPath);
            cq.setpathImg(userPath);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void panelRound2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MouseClicked
        FileInputStream img=null;
        if("".equals(jTextFieldname.getText())||"".equals(jTextFieldUser1.getText())||"".equals(jTextFieldCel.getText())||"".equals(jPasswordField)){
            JOptionPane.showMessageDialog(null,"Llenar todos los datos");
        }else{
            try {
                if(userPath.equals("")){
                    crud.updatePersonDataWithoutTable(jTextFieldUser1, user, jTextFieldname, jTextFieldCel, jPasswordField);
                    JOptionPane.showMessageDialog(null,"Vuelva a ejecutar el programa");
                    System.exit(0);  
                }else{
                    crud.updatePersonDataWithoutTable(jTextFieldUser1, user, jTextFieldname, jTextFieldCel, jPasswordField);
                    img = new FileInputStream(userPath);
                    crud.updatePersonDataImg(user, img);
                    JOptionPane.showMessageDialog(null,"Vuelva a ejecutar el programa");
                    System.exit(0); 
                }     
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Suba una imagen"+e.getMessage());
            }
        }
        
        
    }//GEN-LAST:event_panelRound2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabelCel;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldCel;
    private javax.swing.JTextField jTextFieldUser1;
    private javax.swing.JTextField jTextFieldname;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRound1;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
