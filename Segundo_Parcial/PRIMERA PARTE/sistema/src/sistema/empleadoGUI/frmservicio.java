/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.empleadoGUI;

import sistema.empleadoBL.VariablesDeRetornoServi;
import sistema.empleadoDAL.metodosservi;

/**
 *
 * @author PC Masters
 */
public class frmservicio extends javax.swing.JFrame {

    /**
     * Creates new form frmservicio
     */
    public frmservicio() {
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

        jid_servicio = new javax.swing.JLabel();
        jtipo_servicio = new javax.swing.JLabel();
        jcosto_servicio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnguardars = new javax.swing.JButton();
        btneditars = new javax.swing.JButton();
        btneliminars = new javax.swing.JButton();
        btnfinalizars = new javax.swing.JButton();
        txtid_servicio = new javax.swing.JTextField();
        txtipo_servicio = new javax.swing.JTextField();
        txtcosto_servicio = new javax.swing.JTextField();
        txtbuscar_servicio = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jcosto_servicio1 = new javax.swing.JLabel();
        txtfecha_servicio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jid_servicio.setText("ID:");

        jtipo_servicio.setText("Tipo Servicio:");

        jcosto_servicio.setText("Costo Servicio:");

        jLabel4.setText("ID servicio");

        btnguardars.setText("Guardar");
        btnguardars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarsActionPerformed(evt);
            }
        });

        btneditars.setText("Editar");
        btneditars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarsActionPerformed(evt);
            }
        });

        btneliminars.setText("Eliminar");
        btneliminars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarsActionPerformed(evt);
            }
        });

        btnfinalizars.setText("Siguiente");
        btnfinalizars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarsActionPerformed(evt);
            }
        });

        txtipo_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtipo_servicioActionPerformed(evt);
            }
        });

        txtbuscar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar_servicioActionPerformed(evt);
            }
        });

        jButton5.setText("Buscar por ID");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 255, 204));
        jLabel5.setText("INFORMACION SERVICIO");

        jcosto_servicio1.setText("fecha_servicio");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcosto_servicio)
                            .addComponent(jtipo_servicio)
                            .addComponent(jid_servicio)
                            .addComponent(jcosto_servicio1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtipo_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcosto_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfecha_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnguardars)
                        .addGap(33, 33, 33)
                        .addComponent(btneditars)
                        .addGap(42, 42, 42)
                        .addComponent(btneliminars))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnfinalizars)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jid_servicio)
                    .addComponent(txtid_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtipo_servicio)
                    .addComponent(txtipo_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcosto_servicio)
                    .addComponent(txtcosto_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcosto_servicio1)
                    .addComponent(txtfecha_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtbuscar_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardars)
                    .addComponent(btneditars)
                    .addComponent(btneliminars)
                    .addComponent(btnfinalizars))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtipo_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtipo_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipo_servicioActionPerformed

    private void txtbuscar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar_servicioActionPerformed

    private void btnguardarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarsActionPerformed
     metodosservi Objcrud=new metodosservi();
       Objcrud.InsertarServicio(txtid_servicio.getText(), txtipo_servicio.getText(), txtcosto_servicio.getText(), txtfecha_servicio.getText());
    }//GEN-LAST:event_btnguardarsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtid_servicio.setEditable(false);
        metodosservi objcrud = new metodosservi();
        VariablesDeRetornoServi var = new VariablesDeRetornoServi();
        objcrud.buscar(txtbuscar_servicio.getText());
        txtid_servicio.setText(var.getId_servicio());
        txtipo_servicio.setText(var.getTipo_servicio());
        txtcosto_servicio.setText(var.getCosto_servicio());
        txtfecha_servicio.setText(var.getFecha_servicio());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btneditarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarsActionPerformed
        // TODO add your handling code here:
        txtid_servicio.setEditable(false);
        metodosservi objcrud = new metodosservi();
        VariablesDeRetornoServi var = new VariablesDeRetornoServi();
        var.setId_servicio(txtid_servicio.getText());
        var.setTipo_servicio(txtipo_servicio.getText());
        var.setCosto_servicio(txtcosto_servicio.getText());
        var.setFecha_servicio(txtfecha_servicio.getText());
        objcrud.actualizar(var.getTipo_servicio(), var.getCosto_servicio(), var.getFecha_servicio(), var.getId_servicio());
        txtid_servicio.setText("");
        txtipo_servicio.setText("");
        txtcosto_servicio.setText("");
        txtfecha_servicio.setText("");
        
    }//GEN-LAST:event_btneditarsActionPerformed

    private void btneliminarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarsActionPerformed
        txtid_servicio.setEditable(true);
        metodosservi objcrud = new metodosservi();
        VariablesDeRetornoServi var = new VariablesDeRetornoServi();
        var.setId_servicio(txtid_servicio.getText());
        objcrud.eliminar(var.getId_servicio());
        txtid_servicio.setText("");
        txtipo_servicio.setText("");
        txtcosto_servicio.setText("");
        txtfecha_servicio.setText("");
        txtbuscar_servicio.setText("");
        
    }//GEN-LAST:event_btneliminarsActionPerformed

    private void btnfinalizarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarsActionPerformed
        frmtransaccion1 objtranuno = new frmtransaccion1();
        objtranuno.setVisible(true);
        objtranuno.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnfinalizarsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmempleado objtrandos = new frmempleado();
        objtrandos.setVisible(true);
        objtrandos.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmservicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmservicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmservicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmservicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmservicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditars;
    private javax.swing.JButton btneliminars;
    private javax.swing.JButton btnfinalizars;
    private javax.swing.JButton btnguardars;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jcosto_servicio;
    private javax.swing.JLabel jcosto_servicio1;
    private javax.swing.JLabel jid_servicio;
    private javax.swing.JLabel jtipo_servicio;
    private javax.swing.JTextField txtbuscar_servicio;
    private javax.swing.JTextField txtcosto_servicio;
    private javax.swing.JTextField txtfecha_servicio;
    private javax.swing.JTextField txtid_servicio;
    private javax.swing.JTextField txtipo_servicio;
    // End of variables declaration//GEN-END:variables
}