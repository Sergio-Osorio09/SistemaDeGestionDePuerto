/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasAdmin;

import Clases.CConexion;
import com.mycompany.sistemadegestiondepuerto.InterfazAdministradorSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class GestionDeSalidaDeBarcos extends javax.swing.JFrame {
    
    CConexion con=new CConexion();
    Connection CConexion = con.estableceConexion();

    /**
     * Creates new form GestionDeSalidaDeBarcos
     */
    public GestionDeSalidaDeBarcos() {
        initComponents();
        mostrarDatos();
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
        jPanel2 = new javax.swing.JPanel();
        textoIdBarco = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        textoEstadoFisicoBarco = new javax.swing.JComboBox<>();
        textoAprobAutoridadesBarco = new javax.swing.JComboBox<>();
        textoEstadoAprobacionDeSalida = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalidaDeBarcoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTIÓN DE SALIDA DE BARCOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        textoIdBarco.setEditable(false);
        textoIdBarco.setBorder(javax.swing.BorderFactory.createTitledBorder("Id de barco"));
        textoIdBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdBarcoActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        textoEstadoFisicoBarco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buen estado", "Dañado" }));
        textoEstadoFisicoBarco.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado físico de barco"));
        textoEstadoFisicoBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEstadoFisicoBarcoActionPerformed(evt);
            }
        });

        textoAprobAutoridadesBarco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Desaprobado" }));
        textoAprobAutoridadesBarco.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de aprobación de autoridades"));
        textoAprobAutoridadesBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAprobAutoridadesBarcoActionPerformed(evt);
            }
        });

        textoEstadoAprobacionDeSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Derivado a puerto de reparación", "Derivado a autoridades" }));
        textoEstadoAprobacionDeSalida.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de aprobación de salida"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textoIdBarco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoEstadoFisicoBarco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoAprobAutoridadesBarco, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoEstadoAprobacionDeSalida, 0, 358, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(textoIdBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoEstadoFisicoBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoAprobAutoridadesBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoEstadoAprobacionDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PARA SALIDA DE BARCO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        SalidaDeBarcoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        SalidaDeBarcoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalidaDeBarcoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SalidaDeBarcoTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoIdBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdBarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIdBarcoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        InterfazAdministradorSistema volver = new InterfazAdministradorSistema();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void textoEstadoFisicoBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEstadoFisicoBarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEstadoFisicoBarcoActionPerformed

    private void textoAprobAutoridadesBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAprobAutoridadesBarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAprobAutoridadesBarcoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
            PreparedStatement ps = CConexion.prepareStatement
        ("Update barco set estadoFisico='"+textoEstadoFisicoBarco.getSelectedItem()+"',aprobacionAutoridades='"+textoAprobAutoridadesBarco.getSelectedItem()+"',estadoSalida='"+textoEstadoAprobacionDeSalida.getSelectedItem()+"' where idBarco='"+textoIdBarco.getText()+"'");
            int indice = ps.executeUpdate();
            
            if(indice>0){
                JOptionPane.showMessageDialog(rootPane, "Datos Actualizados Correctamente");
                mostrarDatos();
                limpiarEntradas();
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono Fila");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar datos"+e);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void SalidaDeBarcoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidaDeBarcoTableMouseClicked
        int fila = this.SalidaDeBarcoTable.getSelectedRow();
        this.textoIdBarco.setText(this.SalidaDeBarcoTable.getValueAt(fila, 0).toString());
        this.textoEstadoFisicoBarco.setSelectedItem(this.SalidaDeBarcoTable.getValueAt(fila, 1).toString());
        this.textoAprobAutoridadesBarco.setSelectedItem(this.SalidaDeBarcoTable.getValueAt(fila, 2).toString());
        this.textoEstadoAprobacionDeSalida.setSelectedItem(this.SalidaDeBarcoTable.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_SalidaDeBarcoTableMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        //btnActualizar.setEnabled(false);
        //limpiarEntradas();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        //btnActualizar.setEnabled(false);
        //limpiarEntradas();
    }//GEN-LAST:event_jPanel2MouseClicked

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
            java.util.logging.Logger.getLogger(GestionDeSalidaDeBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeSalidaDeBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeSalidaDeBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeSalidaDeBarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeSalidaDeBarcos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SalidaDeBarcoTable;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> textoAprobAutoridadesBarco;
    private javax.swing.JComboBox<String> textoEstadoAprobacionDeSalida;
    private javax.swing.JComboBox<String> textoEstadoFisicoBarco;
    private javax.swing.JTextField textoIdBarco;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id barco");
        modelo.addColumn("Estado físico de barco");
        modelo.addColumn("Estado de aprobación de autoridades");
        modelo.addColumn("Estado de salida");
        SalidaDeBarcoTable.setModel(modelo);
        String consultaSQL = "select*from Barco";

        String data[] = new String[4];
        
        Statement st;
        try {
            st = CConexion.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while(rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(7);
                data[2] = rs.getString(8);
                data[3] = rs.getString(9);
                modelo.addRow(data);
            }
            
            
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos: " + e);
        }
    }
        
    private void limpiarEntradas() {
        textoIdBarco.setText("");
    }
}