/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Modelo.AccesoDatosJDBC1;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashli
 * 
 */
public class Filtros extends javax.swing.JFrame {

    /**
     * Creates new form Filtros
     */
    DefaultTableModel modelo;
    
    BufferedImage buffer1 = null;
    Image imagen1 = null;
    int contador = 0;
    
    Statement estado;
    ResultSet resultadoConsulta;
    Connection conexion;
    
    public Filtros() {
        initComponents();
                   
        modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("name");
        modelo.addColumn("generation_id");
        modelo.addColumn("height");
        this.TablaMostrar.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboFiltroColores = new javax.swing.JComboBox<>();
        cboFiltroHabitat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMostrar = new javax.swing.JTable();
        btnCorreo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRateCaptura = new javax.swing.JTextField();
        txtExperienciaBase = new javax.swing.JTextField();
        btnFiltroCaptura = new javax.swing.JButton();
        btnFiltroExperiencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboFiltroColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "red", "green", "white", "brown", "yellow", "purple", "blue", "pink", "gray", "black" }));
        cboFiltroColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFiltroColoresActionPerformed(evt);
            }
        });

        cboFiltroHabitat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "grassland", "mountain", "forest", "rough terrain", "cave", "urban", "sea", "rare" }));
        cboFiltroHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFiltroHabitatActionPerformed(evt);
            }
        });

        jLabel1.setText("Color:");

        jLabel2.setText("Habitat:");

        jLabel3.setText("Experiencia Base:");

        jLabel4.setText("Rate de Captura:");

        TablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "name", "Title 3", "Title 4"
            }
        ));
        TablaMostrar.setGridColor(new java.awt.Color(0, 255, 153));
        jScrollPane1.setViewportView(TablaMostrar);

        btnCorreo.setText("Enviar por correo");
        btnCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreoActionPerformed(evt);
            }
        });

        jButton1.setText("Convertir PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel5.setText("Filtros pokedex");

        txtRateCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRateCapturaActionPerformed(evt);
            }
        });

        btnFiltroCaptura.setText("->");
        btnFiltroCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroCapturaActionPerformed(evt);
            }
        });

        btnFiltroExperiencia.setText("->");
        btnFiltroExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroExperienciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(cboFiltroColores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addComponent(cboFiltroHabitat, 0, 145, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtRateCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFiltroCaptura))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtExperienciaBase, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFiltroExperiencia))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(btnCorreo)
                                .addGap(52, 52, 52)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFiltroColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboFiltroHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRateCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFiltroCaptura)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtExperienciaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFiltroExperiencia))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCorreo)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejecutarConsulta(String consul){    
        String tabla = "pokemon ";
        
        try {
            resultadoConsulta = AccesoDatosJDBC1.ejecutarConsulta(tabla, consul);
            
                            String []info=new String[4];
            while (resultadoConsulta.next()){
                //contador=Integer.valueOf(resultadoConsulta.getString(1))-1;
                info[0]=resultadoConsulta.getString(1);
                info[1]=resultadoConsulta.getString(2);
                info[2]=resultadoConsulta.getString(5);
                info[3]=resultadoConsulta.getString(10);
                modelo.addRow(info);
            } /*else {
                nombrePokemon.setText("Este chucho no esta en el pokedex");
            }*/
              
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Clavo con sql");
        }
    }
    
    
    private void btnCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorreoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboFiltroColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFiltroColoresActionPerformed
        // TODO add your handling code here:
      //para eliminar todas las filas de la tabla
      while (modelo.getRowCount() > 0)
            {
                modelo.removeRow(0);
            }
        String ColorElegido=cboFiltroColores.getSelectedItem().toString();
        ejecutarConsulta("where color = '"+ColorElegido+"'");
        
        
    }//GEN-LAST:event_cboFiltroColoresActionPerformed

    private void btnFiltroCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroCapturaActionPerformed
        // TODO add your handling code here:
        while (modelo.getRowCount() > 0)
            {
                modelo.removeRow(0);
            }
         String CapturaElegida=txtRateCaptura.getText().toString();
        ejecutarConsulta("where capture_rate = '"+CapturaElegida+"'");
        
    }//GEN-LAST:event_btnFiltroCapturaActionPerformed

    private void txtRateCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRateCapturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRateCapturaActionPerformed

    private void cboFiltroHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFiltroHabitatActionPerformed
        // TODO add your handling code here:
        while (modelo.getRowCount() > 0)
            {
                modelo.removeRow(0);
            }
         String HabitatElegida=cboFiltroHabitat.getSelectedItem().toString();
        ejecutarConsulta("where habitat = '"+HabitatElegida+"'");
       
    }//GEN-LAST:event_cboFiltroHabitatActionPerformed

    private void btnFiltroExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroExperienciaActionPerformed
        // TODO add your handling code here:
         while (modelo.getRowCount() > 0)
            {
                modelo.removeRow(0);
            }
         String ExperienciaElegida=txtExperienciaBase.getText().toString();
        ejecutarConsulta("where base_experience = '"+ExperienciaElegida+"'");
    }//GEN-LAST:event_btnFiltroExperienciaActionPerformed

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
            java.util.logging.Logger.getLogger(Filtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filtros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMostrar;
    private javax.swing.JButton btnCorreo;
    private javax.swing.JButton btnFiltroCaptura;
    private javax.swing.JButton btnFiltroExperiencia;
    private javax.swing.JComboBox<String> cboFiltroColores;
    private javax.swing.JComboBox<String> cboFiltroHabitat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtExperienciaBase;
    private javax.swing.JTextField txtRateCaptura;
    // End of variables declaration//GEN-END:variables
}
