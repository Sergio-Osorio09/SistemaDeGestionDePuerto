/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasEmbarque;

import Clases.CConexion;
import com.mycompany.sistemadegestiondepuerto.InterfazOperadorEmbarque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class GenerarReporte2 extends javax.swing.JFrame {

    CConexion con=new CConexion();
    Connection CConexion=con.estableceConexion();
    
    public GenerarReporte2() {
        initComponents();
        mostrardatosbarco();
        mostrardatoscontenedor();
        mostrardatosreporte();
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
        TextoIdReporte = new javax.swing.JTextField();
        TextoTiempoA = new javax.swing.JTextField();
        TextoTiempoE = new javax.swing.JTextField();
        TextoIdBarco = new javax.swing.JTextField();
        TextoTipoCarga = new javax.swing.JTextField();
        ComboEstibas = new javax.swing.JComboBox<>();
        TextoIdContenedor = new javax.swing.JTextField();
        TextoDestinoContenedor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBarco = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaContenedor = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaReporte = new javax.swing.JTable();
        BotonRegistrar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENERAR REPORTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        TextoIdReporte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TextoTiempoA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tiempo Asigando", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TextoTiempoE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tiempo Embarque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TextoIdBarco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Barco", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TextoTipoCarga.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Carga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        ComboEstibas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "si", "no" }));
        ComboEstibas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cumplir Estibas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TextoIdContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Contenedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TextoDestinoContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destino del Contenedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoIdReporte)
                    .addComponent(TextoTiempoA)
                    .addComponent(TextoTiempoE)
                    .addComponent(TextoIdBarco)
                    .addComponent(TextoTipoCarga)
                    .addComponent(ComboEstibas, 0, 336, Short.MAX_VALUE)
                    .addComponent(TextoIdContenedor)
                    .addComponent(TextoDestinoContenedor))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TextoIdReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoTiempoA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoTiempoE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoIdBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComboEstibas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoIdContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoTipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoDestinoContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VISUALIZAR DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        TablaBarco.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaBarco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBarcoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaBarco);

        TablaContenedor.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaContenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaContenedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaContenedor);

        TablaReporte.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaReporteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaReporte);

        BotonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        BotonVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(BotonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        try{
            PreparedStatement ps=CConexion.prepareStatement("INSERT INTO Reporte (CumplirEstibas,idReporte,tiempoAsignado,tiempoEmbarque,idBarco,idContenedor,TipoDeCarga,DestinoContenedor) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, ComboEstibas.getSelectedItem().toString());
            ps.setString(2, TextoIdReporte.getText());
            ps.setString(3, TextoTiempoA.getText());
            ps.setString(4, TextoTiempoE.getText());
            ps.setString(5, TextoIdBarco.getText());
            ps.setString(6, TextoIdContenedor.getText());
            ps.setString(7, TextoTipoCarga.getText());
            ps.setString(8, TextoDestinoContenedor.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
            mostrardatosreporte();
            limpiarentradas();
            
        } catch(SQLException e){
            System.out.println("Error al registrar usuario"+ e);
        }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        InterfazOperadorEmbarque embarque = new InterfazOperadorEmbarque();
        embarque.setLocationRelativeTo(null);
        embarque.setSize(618,608);
        embarque.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void TablaBarcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBarcoMouseClicked
        int fila=this.TablaBarco.getSelectedRow();
        this.TextoIdBarco.setText(this.TablaBarco.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_TablaBarcoMouseClicked

    private void TablaContenedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaContenedorMouseClicked
        int fila=this.TablaContenedor.getSelectedRow();
        this.TextoIdContenedor.setText(this.TablaContenedor.getValueAt(fila, 0).toString());
        this.TextoTipoCarga.setText(this.TablaContenedor.getValueAt(fila, 1).toString());
        this.TextoDestinoContenedor.setText(this.TablaContenedor.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_TablaContenedorMouseClicked

    private void TablaReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaReporteMouseClicked
        int fila=this.TablaReporte.getSelectedRow();
        this.TextoIdReporte.setText(this.TablaReporte.getValueAt(fila, 0).toString());
        this.TextoTiempoA.setText(this.TablaReporte.getValueAt(fila, 1).toString());
        this.TextoTiempoE.setText(this.TablaReporte.getValueAt(fila, 2).toString());
        this.TextoIdBarco.setText(this.TablaReporte.getValueAt(fila, 3).toString());
        this.ComboEstibas.setSelectedItem(this.TablaReporte.getValueAt(fila, 4).toString());
        this.TextoIdContenedor.setText(this.TablaReporte.getValueAt(fila, 5).toString());
        this.TextoTipoCarga.setText(this.TablaReporte.getValueAt(fila, 6).toString());
        this.TextoDestinoContenedor.setText(this.TablaReporte.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_TablaReporteMouseClicked

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        try{
            PreparedStatement ps=CConexion.prepareStatement
        ("Update reporte set tiempoAsignado='"+TextoTiempoA.getText()+"',tiempoEmbarque='"+TextoTiempoE.getText()+"',idBarco='"+TextoIdBarco.getText()+"',CumplirEstibas='"+ComboEstibas.getSelectedItem()+"',idContenedor='"+TextoIdContenedor.getText()+"',TipoDeCarga='"+TextoTipoCarga.getText()+"',DestinoContenedor='"+TextoDestinoContenedor.getText()+"' where idReporte='"+TextoIdReporte.getText()+"'");
            int indice=ps.executeUpdate();
            
            if(indice>0){
                JOptionPane.showMessageDialog(rootPane, "Datos Actualizados Correctamente");
                mostrardatosreporte();
                limpiarentradas();
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono Fila");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar datos"+e);
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarReporte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarReporte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarReporte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarReporte2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarReporte2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JComboBox<String> ComboEstibas;
    private javax.swing.JTable TablaBarco;
    private javax.swing.JTable TablaContenedor;
    private javax.swing.JTable TablaReporte;
    private javax.swing.JTextField TextoDestinoContenedor;
    private javax.swing.JTextField TextoIdBarco;
    private javax.swing.JTextField TextoIdContenedor;
    private javax.swing.JTextField TextoIdReporte;
    private javax.swing.JTextField TextoTiempoA;
    private javax.swing.JTextField TextoTiempoE;
    private javax.swing.JTextField TextoTipoCarga;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void mostrardatosbarco() {
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("ID Barco");
        modelo.addColumn("Destino Barco");
        TablaBarco.setModel(modelo);
        String consultasql="select * from barco where OperacionesBarco = 'Aprobado'";
        String data[]=new String[2];
        
        Statement st;
        try{
            st=CConexion.createStatement();
            ResultSet rs=st.executeQuery(consultasql);
            while(rs.next()){
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                modelo.addRow(data);
            }
        } catch(SQLException e){
            System.out.println("Error al mostrar Datos "+ e);
        }
    }

    private void mostrardatoscontenedor() {
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("ID Contenedor");
        modelo.addColumn("Tipo de Carga");
        modelo.addColumn("Destino de Carga");
        modelo.addColumn("ID Barco");
        TablaContenedor.setModel(modelo);
        String consultasql="select * from contenedor";
        String data[]=new String[10];
        
        Statement st;
        try{
            st=CConexion.createStatement();
            ResultSet rs=st.executeQuery(consultasql);
            while(rs.next()){
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(5);
                data[3]=rs.getString(9);
                modelo.addRow(data);
            }
        } catch(SQLException e){
            System.out.println("Error al mostrar Datos "+ e);
        }
    }

    private void mostrardatosreporte() {
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("ID Reporte");
        modelo.addColumn("Tiempo Asignado(min)");
        modelo.addColumn("Tiempo de Embarque(min)");
        modelo.addColumn("ID Barco");
        modelo.addColumn("Cumplimiento Estibas");
        modelo.addColumn("ID Contenedor");
        modelo.addColumn("Tipo de Carga");
        modelo.addColumn("Destino Contenedor");
        TablaReporte.setModel(modelo);
        String consultasql="select * from reporte";
        String data[]=new String[9];
        
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
                data[6]=rs.getString(7);
                data[7]=rs.getString(8);
                modelo.addRow(data);
            }
        } catch(SQLException e){
            System.out.println("Error al mostrar Datos "+ e);
        }
    }

    private void limpiarentradas() {
        TextoDestinoContenedor.setText("");
        TextoIdBarco.setText("");
        TextoIdContenedor.setText("");
        TextoIdReporte.setText("");
        TextoTiempoA.setText("");
        TextoTiempoE.setText("");
        TextoTipoCarga.setText("");
        ComboEstibas.setSelectedIndex(0);
    }
}