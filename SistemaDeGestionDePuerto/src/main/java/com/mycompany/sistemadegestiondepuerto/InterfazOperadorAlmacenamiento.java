/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemadegestiondepuerto;

import VentanasAlmacenamiento.ContenedoresExportacion;
import VentanasAlmacenamiento.ContenedoresImportacion;
import VentanasAlmacenamiento.GenerarReporte;
import VentanasAlmacenamiento.GestionarAlmacen;

/**
 *
 * @author villa
 */
public class InterfazOperadorAlmacenamiento extends javax.swing.JFrame {

    /**
     * Creates new form InterfazOperadorAlmacenamiento
     */
    public InterfazOperadorAlmacenamiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ValidezContExport = new javax.swing.JButton();
        ValidezContImport = new javax.swing.JButton();
        GestionarAlmacen = new javax.swing.JButton();
        GenerarReporte = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        CerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPERADOR DE ALMACENAMIENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        ValidezContExport.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ValidezContExport.setText("Visualizar validez de contenedores de exportación");
        ValidezContExport.setToolTipText("");
        ValidezContExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidezContExportActionPerformed(evt);
            }
        });

        ValidezContImport.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ValidezContImport.setText("Verificar validez de contenedores de importación");
        ValidezContImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidezContImportActionPerformed(evt);
            }
        });

        GestionarAlmacen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        GestionarAlmacen.setText("Gestionar almacén");
        GestionarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarAlmacenActionPerformed(evt);
            }
        });

        GenerarReporte.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        GenerarReporte.setText("Generar reporte ");
        GenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValidezContImport, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValidezContExport, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GestionarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(ValidezContExport, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ValidezContImport, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(GestionarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(GenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        Inicio.setText("Inicio");

        CerrarSesion.setText("CerrarSesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        Inicio.add(CerrarSesion);

        jMenuBar1.add(Inicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
       InterfazLogin login = new InterfazLogin();
       login.setLocationRelativeTo(null);
       login.setSize(800,500);
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void ValidezContExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidezContExportActionPerformed
     ContenedoresExportacion e = new ContenedoresExportacion();
        e.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_ValidezContExportActionPerformed

    private void GestionarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarAlmacenActionPerformed
     GestionarAlmacen g = new GestionarAlmacen();
        g.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_GestionarAlmacenActionPerformed

    private void ValidezContImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidezContImportActionPerformed
        ContenedoresImportacion i = new ContenedoresImportacion();
        i.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_ValidezContImportActionPerformed

    private void GenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteActionPerformed
        GenerarReporte ga = new GenerarReporte();
        ga.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_GenerarReporteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazOperadorAlmacenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazOperadorAlmacenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazOperadorAlmacenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazOperadorAlmacenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazOperadorAlmacenamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JButton GenerarReporte;
    private javax.swing.JButton GestionarAlmacen;
    private javax.swing.JMenu Inicio;
    private javax.swing.JButton ValidezContExport;
    private javax.swing.JButton ValidezContImport;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
