package com.unamba.cinemagicoabancay.preconfiguration;

import com.unamba.cinemagicoabancay.crud.CrudUsers;
import com.unamba.cinemagicoabancay.login.login;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class preconfiguration extends javax.swing.JFrame {
    int xMouse,yMouse;
    CrudUsers crud=new CrudUsers();
    String userPath;
    public preconfiguration() {
        initComponents();
        this.setBackground(new Color(0,0,0,10));//Transparencia
        this.setLocationRelativeTo(null);
        jPanelPrincipalHead.setOpaque(false);
    }
    public String dateToday(){
        Calendar date=new GregorianCalendar();
        String day,month,year,currentDate;
        day=Integer.toString(date.get(Calendar.DATE));
        month=Integer.toString(date.get(Calendar.MONTH)+1);
        year=Integer.toString(date.get(Calendar.YEAR));
        currentDate=day+"/"+month+"/"+year;
        return currentDate;
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
        jTextFieldUser = new javax.swing.JTextField();
        jLabelPwd = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        panelRoundgetAddImg = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabelgetInto = new javax.swing.JLabel();
        panelRoundOut = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabelOut = new javax.swing.JLabel();
        jLabelName1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelName2 = new javax.swing.JLabel();
        jTextFieldCel = new javax.swing.JTextField();
        panelRoundgetInto = new com.unamba.cinemagicoabancay.login.PanelRound();
        jLabelgetInto1 = new javax.swing.JLabel();
        jLabelImgPath = new javax.swing.JLabel();

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

        jLabelBienvenido.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenido.setText("CONFIGURACIÓN INICIAL ADMINISTRADOR");

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Usuario:");

        jLabelPwd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelPwd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPwd.setText("Contraseña:");

        panelRoundgetAddImg.setBackground(new java.awt.Color(86, 226, 0));
        panelRoundgetAddImg.setRoundBottomLeft(50);
        panelRoundgetAddImg.setRoundBottomRight(50);
        panelRoundgetAddImg.setRoundTopLeft(50);
        panelRoundgetAddImg.setRoundTopRight(50);
        panelRoundgetAddImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRoundgetAddImgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundgetAddImgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundgetAddImgMouseExited(evt);
            }
        });

        jLabelgetInto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelgetInto.setText("Agregar foto");

        javax.swing.GroupLayout panelRoundgetAddImgLayout = new javax.swing.GroupLayout(panelRoundgetAddImg);
        panelRoundgetAddImg.setLayout(panelRoundgetAddImgLayout);
        panelRoundgetAddImgLayout.setHorizontalGroup(
            panelRoundgetAddImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundgetAddImgLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabelgetInto)
                .addGap(17, 17, 17))
        );
        panelRoundgetAddImgLayout.setVerticalGroup(
            panelRoundgetAddImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundgetAddImgLayout.createSequentialGroup()
                .addComponent(jLabelgetInto, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(panelRoundOutLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabelOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRoundOutLayout.setVerticalGroup(
            panelRoundOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundOutLayout.createSequentialGroup()
                .addComponent(jLabelOut)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabelName1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelName1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName1.setText("Nombre:");

        jLabelName2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelName2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName2.setText("Celular:");

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

        jLabelgetInto1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelgetInto1.setForeground(new java.awt.Color(0, 0, 102));
        jLabelgetInto1.setText("Ingresar");

        javax.swing.GroupLayout panelRoundgetIntoLayout = new javax.swing.GroupLayout(panelRoundgetInto);
        panelRoundgetInto.setLayout(panelRoundgetIntoLayout);
        panelRoundgetIntoLayout.setHorizontalGroup(
            panelRoundgetIntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundgetIntoLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabelgetInto1)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        panelRoundgetIntoLayout.setVerticalGroup(
            panelRoundgetIntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundgetIntoLayout.createSequentialGroup()
                .addComponent(jLabelgetInto1)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabelImgPath.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabelImgPath.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipalHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelName1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField)
                    .addComponent(jTextFieldUser)
                    .addComponent(jLabelName2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName)
                    .addComponent(jTextFieldCel)
                    .addComponent(panelRoundOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(panelRoundgetAddImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImgPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(panelRoundgetInto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(jPanelPrincipalHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundgetAddImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(panelRoundOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                    .addContainerGap(497, Short.MAX_VALUE)
                    .addComponent(panelRoundgetInto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(62, 62, 62)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void panelRoundgetAddImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetAddImgMouseClicked
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
            jLabelImgPath.setText("ruta de imagen:"+userPath);
            //cq.setpathImg(userPath);
        }
    }//GEN-LAST:event_panelRoundgetAddImgMouseClicked

    private void panelRoundgetAddImgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetAddImgMouseEntered
        panelRoundgetAddImg.setBackground(new Color(59,199,0));
    }//GEN-LAST:event_panelRoundgetAddImgMouseEntered

    private void panelRoundgetAddImgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetAddImgMouseExited
        panelRoundgetAddImg.setBackground(new Color(86,226,0));
    }//GEN-LAST:event_panelRoundgetAddImgMouseExited

    private void panelRoundOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundOutMouseEntered
        panelRoundOut.setBackground(new Color(170,166,166));
    }//GEN-LAST:event_panelRoundOutMouseEntered

    private void panelRoundOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundOutMouseExited
        panelRoundOut.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_panelRoundOutMouseExited

    private void panelRoundOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panelRoundOutMouseClicked

    private void panelRoundgetIntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetIntoMouseClicked
        FileInputStream img=null;
        String pswd=String.valueOf(jPasswordField.getPassword());
        if("".equals(jTextFieldUser.getText())||"".equals(jTextFieldUser.getText())||"".equals(jTextFieldCel.getText())||"".equals(pswd)){
            JOptionPane.showMessageDialog(null,"Llenar todos los datos");
        }else{
            try {
                img = new FileInputStream(userPath);
                crud.InsertPerson(jTextFieldUser.getText(), jTextFieldName.getText(), jTextFieldCel.getText(), pswd,dateToday(),dateToday(),img);
                new login().setVisible(true);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Suba una imagen");
            }
        }
        
    }//GEN-LAST:event_panelRoundgetIntoMouseClicked

    private void panelRoundgetIntoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetIntoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelRoundgetIntoMouseEntered

    private void panelRoundgetIntoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundgetIntoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelRoundgetIntoMouseExited



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelExpand;
    private javax.swing.JLabel jLabelImgPath;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JLabel jLabelName2;
    private javax.swing.JLabel jLabelOut;
    private javax.swing.JLabel jLabelPwd;
    private javax.swing.JLabel jLabelgetInto;
    private javax.swing.JLabel jLabelgetInto1;
    private javax.swing.JPanel jPanelElementsWindows;
    private javax.swing.JPanel jPanelPrincipalHead;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldCel;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldUser;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRound1;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRoundOut;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRoundgetAddImg;
    private com.unamba.cinemagicoabancay.login.PanelRound panelRoundgetInto;
    // End of variables declaration//GEN-END:variables
}
