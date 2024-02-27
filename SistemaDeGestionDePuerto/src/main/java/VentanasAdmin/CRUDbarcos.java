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
 * @author SERGIO
 */
public class CRUDbarcos extends javax.swing.JFrame {
    
    CConexion con=new CConexion();
    Connection CConexion=con.estableceConexion();

    /**
     * Creates new form CRUDbarcos
     */
    public CRUDbarcos() {
        initComponents();
        mostrardatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtid = new javax.swing.JTextField();
        txtdestino = new javax.swing.JTextField();
        txtcantidaddescar = new javax.swing.JTextField();
        txtcanpacidadmax = new javax.swing.JTextField();
        combooperacion = new javax.swing.JComboBox<>();
        txtidmuelle = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabledatos2 = new javax.swing.JTable();

        jPopupMenu1.setComponentPopupMenu(jPopupMenu1);

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GESTION DE BARCOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID BARCO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtdestino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESTINO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdestinoActionPerformed(evt);
            }
        });

        txtcantidaddescar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDAD DESCARGABLE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtcantidaddescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidaddescarActionPerformed(evt);
            }
        });

        txtcanpacidadmax.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAPACIDAD MAXIMA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtcanpacidadmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcanpacidadmaxActionPerformed(evt);
            }
        });

        combooperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Aprobado", "Finalizado" }));
        combooperacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO DE OPERACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        combooperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combooperacionActionPerformed(evt);
            }
        });

        txtidmuelle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID MUELLE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtidmuelle.setEnabled(false);

        btnregistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnactualizar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtidmuelle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combooperacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcanpacidadmax, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcantidaddescar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdestino))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcantidaddescar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcanpacidadmax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combooperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtidmuelle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE BARCOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jtabledatos2.setModel(new javax.swing.table.DefaultTableModel(
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
        jtabledatos2.setComponentPopupMenu(jPopupMenu1);
        jtabledatos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatos2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabledatos2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdestinoActionPerformed

    private void txtcantidaddescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidaddescarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidaddescarActionPerformed

    private void txtcanpacidadmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcanpacidadmaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcanpacidadmaxActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        try{
            PreparedStatement ps=CConexion.prepareStatement("INSERT INTO barco(idBarco,DestinoBarco,CantidadDescargable,CapacidadMaxima,OperacionesBarco) VALUES(?,?,?,?,?)"); //idMuelle eliminado
            ps.setString(1, txtid.getText());
            ps.setString(2, txtdestino.getText());
            ps.setString(3, txtcantidaddescar.getText());
            ps.setString(4, txtcanpacidadmax.getText());
            ps.setString(5, combooperacion.getSelectedItem().toString());
            //ps.setString(6, txtidmuelle.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
            mostrardatos();
            limpiarentradas();
            
        } catch(SQLException e){
            System.out.println("Error al registrar usuario"+ e);
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try{
            PreparedStatement ps=CConexion.prepareStatement
        ("Update barco set OperacionesBarco='"+combooperacion.getSelectedItem()+"',CapacidadMaxima='"+txtcanpacidadmax.getText()+"',DestinoBarco='"+txtdestino.getText()+"',CantidadDescargable='"+txtcantidaddescar.getText()+"',idMuelle='"+txtidmuelle.getText()+"' where idBarco='"+txtid.getText()+"'");
            int indice=ps.executeUpdate();
            
            if(indice>0){
                JOptionPane.showMessageDialog(rootPane, "Datos Actualizados Correctamente");
                mostrardatos();
                limpiarentradas();
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono Fila");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar datos"+e);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jtabledatos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatos2MouseClicked
        btnregistrar.setEnabled(false);
        btnactualizar.setEnabled(true);
        int fila=this.jtabledatos2.getSelectedRow();
        this.txtid.setText(this.jtabledatos2.getValueAt(fila, 0).toString());
        this.txtdestino.setText(this.jtabledatos2.getValueAt(fila, 1).toString());
        this.txtcantidaddescar.setText(this.jtabledatos2.getValueAt(fila, 2).toString());
        this.txtcanpacidadmax.setText(this.jtabledatos2.getValueAt(fila, 3).toString());
        this.combooperacion.setSelectedItem(this.jtabledatos2.getValueAt(fila, 4).toString());
        this.txtidmuelle.setText(this.jtabledatos2.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_jtabledatos2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar barco","Salir",JOptionPane.YES_NO_CANCEL_OPTION)==0){
        try{
            PreparedStatement ps=CConexion.prepareStatement("DELETE FROM barco where idBarco='"+txtid.getText()+"'");
        int indice=ps.executeUpdate();
        if(indice>0){
            mostrardatos();
        }else{
            System.out.println("No selecciono fila");
        }    
        }catch(SQLException e){
            System.out.println("Error al eliminar"+ e);
        }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        InterfazAdministradorSistema salir = new InterfazAdministradorSistema();
        salir.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        btnactualizar.setEnabled(false);
        btnregistrar.setEnabled(true);
        limpiarentradas();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void combooperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combooperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combooperacionActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDbarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDbarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDbarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDbarcos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDbarcos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> combooperacion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabledatos2;
    private javax.swing.JTextField txtcanpacidadmax;
    private javax.swing.JTextField txtcantidaddescar;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidmuelle;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos() {
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("ID BARCO");
        modelo.addColumn("DESTINO");
        modelo.addColumn("CANTIDAD DESCARGABLE");
        modelo.addColumn("CAPACIDAD MAX");
        modelo.addColumn("OPERACIONESBARCO");
        modelo.addColumn("ID MUELLE");
        jtabledatos2.setModel(modelo);
        String consultasql="select * from barco";
        String data[]=new String[7];
        
        Statement st;
        try{
            st=CConexion.createStatement();
            ResultSet rs=st.executeQuery(consultasql);
            while(rs.next()){
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                data[4]=rs.getString(5);
                data[5]=rs.getString(6);
                modelo.addRow(data);
            }
        } catch(SQLException e){
            System.out.println("Error al mostrar Datos "+ e);
        }
    }

    private void limpiarentradas() {
        combooperacion.setSelectedIndex(0);
        txtid.setText("");
        txtdestino.setText("");
        txtcantidaddescar.setText("");
        txtcanpacidadmax.setText("");
        txtidmuelle.setText("");
    }
}
