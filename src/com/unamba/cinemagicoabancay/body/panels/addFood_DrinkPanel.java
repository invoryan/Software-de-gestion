package com.unamba.cinemagicoabancay.body.panels;

import com.unamba.cinemagicoabancay.crud.CrudFood_Drinks;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
public class addFood_DrinkPanel extends javax.swing.JPanel {
    String userPath="";
    CrudFood_Drinks crud=new CrudFood_Drinks();
    public addFood_DrinkPanel() {
        initComponents();
        jLabelImg.setSize(207, 172);
        initialImg();        
    }
    public void initialImg(){
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/com/unamba/cinemagicoabancay/body/img/food_drink.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabelImg.getWidth(),jLabelImg.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        jLabelImg.setIcon(iconoEscalado); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelName1 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelName2 = new javax.swing.JLabel();
        panelRoundImg = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jLabelImgPath = new javax.swing.JLabel();
        panelRoundSave = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabelImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 217, 217));

        panelRound1.setBackground(new java.awt.Color(36, 38, 69));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Comida, bebida o producto:");

        jLabelName1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelName1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName1.setText("Precio:");

        jLabelName2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelName2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName2.setText("S/.");

        panelRoundImg.setBackground(new java.awt.Color(86, 226, 0));
        panelRoundImg.setRoundBottomLeft(20);
        panelRoundImg.setRoundBottomRight(20);
        panelRoundImg.setRoundTopLeft(20);
        panelRoundImg.setRoundTopRight(20);
        panelRoundImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRoundImgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundImgMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Foto");

        javax.swing.GroupLayout panelRoundImgLayout = new javax.swing.GroupLayout(panelRoundImg);
        panelRoundImg.setLayout(panelRoundImgLayout);
        panelRoundImgLayout.setHorizontalGroup(
            panelRoundImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundImgLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelRoundImgLayout.setVerticalGroup(
            panelRoundImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabelImgPath.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelImgPath.setForeground(new java.awt.Color(255, 255, 255));
        jLabelImgPath.setRequestFocusEnabled(false);

        panelRoundSave.setBackground(new java.awt.Color(1, 217, 204));
        panelRoundSave.setRoundBottomLeft(20);
        panelRoundSave.setRoundBottomRight(20);
        panelRoundSave.setRoundTopLeft(20);
        panelRoundSave.setRoundTopRight(20);
        panelRoundSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRoundSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundSaveMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Guardar");

        javax.swing.GroupLayout panelRoundSaveLayout = new javax.swing.GroupLayout(panelRoundSave);
        panelRoundSave.setLayout(panelRoundSaveLayout);
        panelRoundSaveLayout.setHorizontalGroup(
            panelRoundSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundSaveLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelRoundSaveLayout.setVerticalGroup(
            panelRoundSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound1Layout.createSequentialGroup()
                            .addComponent(panelRoundImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelImgPath, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                        .addGroup(panelRound1Layout.createSequentialGroup()
                            .addComponent(jLabelName2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldPrice))
                        .addComponent(jLabelName1)
                        .addComponent(jLabelName)
                        .addComponent(jTextFieldName))
                    .addComponent(panelRoundSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName2))
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelRoundImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelImgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRoundSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelRoundImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundImgMouseClicked
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
            jLabelImgPath.setText(userPath);
            ImageIcon imgIcon = new ImageIcon(userPath);
            Image imgEscalada = imgIcon.getImage().getScaledInstance(jLabelImg.getWidth(),jLabelImg.getHeight(), Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            jLabelImg.setIcon(iconoEscalado);   
        }
    }//GEN-LAST:event_panelRoundImgMouseClicked

    private void panelRoundImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundImgMouseEntered
        panelRoundImg.setBackground(new Color(59,199,0));
    }//GEN-LAST:event_panelRoundImgMouseEntered

    private void panelRoundImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundImgMouseExited
        panelRoundImg.setBackground(new Color(86,226,0));
    }//GEN-LAST:event_panelRoundImgMouseExited

    private void panelRoundSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundSaveMouseClicked
        FileInputStream img=null;
        if("".equals(jTextFieldName.getText())||"".equals(jTextFieldPrice.getText())){
            JOptionPane.showMessageDialog(null,"Llenar todos los datos");
        }else{
            try {
                img = new FileInputStream(userPath);
                crud.InsertFood_drinks(jTextFieldName,jTextFieldPrice,img);
                jTextFieldName.setText("");
                jTextFieldPrice.setText("");
                userPath="";
                initialImg();
                jLabelImgPath.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Suba una imagen"+e.getMessage());
            }
        }
        
        
        
        
        
        
    }//GEN-LAST:event_panelRoundSaveMouseClicked

    private void panelRoundSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundSaveMouseEntered
        panelRoundSave.setBackground(new Color(0,217,255));
    }//GEN-LAST:event_panelRoundSaveMouseEntered

    private void panelRoundSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundSaveMouseExited
        panelRoundSave.setBackground(new Color(1,217,204));
    }//GEN-LAST:event_panelRoundSaveMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelImgPath;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JLabel jLabelName2;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPrice;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRound1;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRoundImg;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRoundSave;
    // End of variables declaration//GEN-END:variables
}
