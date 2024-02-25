/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemadegestiondepuerto;

import VentanasEmbarque.GenerarReporte;
import VentanasEmbarque.GestionarLaytime;
import VentanasEmbarque.ValidarDesembarque;
import VentanasEmbarque.VisualEmbarque;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author villa
 */
public class InterfazOperadorEmbarque extends javax.swing.JFrame {
     
    private JMenuItem barco;
    private JMenuItem almacen;
    private JMenuItem registros;
    private JMenuItem cerrar_sesion;
    
    /**
     * Creates new form InterfazOperadorEmbarque
     */
    public InterfazOperadorEmbarque() {
        initComponents();
              
        
    }
    
    private void cambiarVista(JPanel jpanel){
        
    }
    
    private void activarVista(JPanel jpanel){
               
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OperadorEmbarque = new javax.swing.JPanel();
        IngresarLaytime = new javax.swing.JPanel();
        BotonLaytime = new javax.swing.JButton();
        IngresarEmbarque = new javax.swing.JPanel();
        BotonEmbarque = new javax.swing.JButton();
        IngresarDesembarque = new javax.swing.JPanel();
        BotonDesembarque = new javax.swing.JButton();
        IngresarReporte = new javax.swing.JPanel();
        BotonReporte = new javax.swing.JButton();
        MenuInicio = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        CerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OperadorEmbarque.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "OPERADOR EMBARQUE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        IngresarLaytime.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Gestionar Laytime", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        BotonLaytime.setText("Ingresar");
        BotonLaytime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLaytimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarLaytimeLayout = new javax.swing.GroupLayout(IngresarLaytime);
        IngresarLaytime.setLayout(IngresarLaytimeLayout);
        IngresarLaytimeLayout.setHorizontalGroup(
            IngresarLaytimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarLaytimeLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BotonLaytime, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        IngresarLaytimeLayout.setVerticalGroup(
            IngresarLaytimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarLaytimeLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BotonLaytime)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IngresarEmbarque.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Gestionar Embarque", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        BotonEmbarque.setText("Ingresar");
        BotonEmbarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmbarqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarEmbarqueLayout = new javax.swing.GroupLayout(IngresarEmbarque);
        IngresarEmbarque.setLayout(IngresarEmbarqueLayout);
        IngresarEmbarqueLayout.setHorizontalGroup(
            IngresarEmbarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarEmbarqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        IngresarEmbarqueLayout.setVerticalGroup(
            IngresarEmbarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarEmbarqueLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BotonEmbarque)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        IngresarDesembarque.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Gestionar desembarque", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        BotonDesembarque.setText("Ingresar");
        BotonDesembarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDesembarqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarDesembarqueLayout = new javax.swing.GroupLayout(IngresarDesembarque);
        IngresarDesembarque.setLayout(IngresarDesembarqueLayout);
        IngresarDesembarqueLayout.setHorizontalGroup(
            IngresarDesembarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarDesembarqueLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(BotonDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        IngresarDesembarqueLayout.setVerticalGroup(
            IngresarDesembarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarDesembarqueLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BotonDesembarque)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        IngresarReporte.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Generar reporte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        BotonReporte.setText("Ingresar");
        BotonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarReporteLayout = new javax.swing.GroupLayout(IngresarReporte);
        IngresarReporte.setLayout(IngresarReporteLayout);
        IngresarReporteLayout.setHorizontalGroup(
            IngresarReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarReporteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BotonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        IngresarReporteLayout.setVerticalGroup(
            IngresarReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarReporteLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BotonReporte)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OperadorEmbarqueLayout = new javax.swing.GroupLayout(OperadorEmbarque);
        OperadorEmbarque.setLayout(OperadorEmbarqueLayout);
        OperadorEmbarqueLayout.setHorizontalGroup(
            OperadorEmbarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OperadorEmbarqueLayout.createSequentialGroup()
                .addGroup(OperadorEmbarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OperadorEmbarqueLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(IngresarLaytime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OperadorEmbarqueLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(IngresarDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(OperadorEmbarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IngresarEmbarque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IngresarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );
        OperadorEmbarqueLayout.setVerticalGroup(
            OperadorEmbarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperadorEmbarqueLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(OperadorEmbarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IngresarEmbarque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IngresarLaytime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(OperadorEmbarqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresarDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Inicio.setText("Inicio");

        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        Inicio.add(CerrarSesion);

        MenuInicio.add(Inicio);

        setJMenuBar(MenuInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OperadorEmbarque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OperadorEmbarque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        InterfazLogin login = new InterfazLogin();
        login.setLocationRelativeTo(null);
        login.setSize(450,460);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void BotonLaytimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLaytimeActionPerformed
        GestionarLaytime laytime = new GestionarLaytime();
        laytime.setLocationRelativeTo(null);
        laytime.setSize(800,500);
        laytime.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_BotonLaytimeActionPerformed

    private void BotonEmbarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmbarqueActionPerformed
        VisualEmbarque embarque = new VisualEmbarque();
        embarque.setLocationRelativeTo(null);
        embarque.setSize(1000,600);
        embarque.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_BotonEmbarqueActionPerformed

    private void BotonDesembarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDesembarqueActionPerformed
        ValidarDesembarque desembarque = new ValidarDesembarque();
        desembarque.setLocationRelativeTo(null);
        desembarque.setSize(1000,600);
        desembarque.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_BotonDesembarqueActionPerformed

    private void BotonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteActionPerformed
        GenerarReporte reporte = new GenerarReporte();
        reporte.setLocationRelativeTo(null);
        reporte.setSize(800,500);
        reporte.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_BotonReporteActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazOperadorEmbarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazOperadorEmbarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazOperadorEmbarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazOperadorEmbarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazOperadorEmbarque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDesembarque;
    private javax.swing.JButton BotonEmbarque;
    private javax.swing.JButton BotonLaytime;
    private javax.swing.JButton BotonReporte;
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JPanel IngresarDesembarque;
    private javax.swing.JPanel IngresarEmbarque;
    private javax.swing.JPanel IngresarLaytime;
    private javax.swing.JPanel IngresarReporte;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenuBar MenuInicio;
    private javax.swing.JPanel OperadorEmbarque;
    // End of variables declaration//GEN-END:variables
}
