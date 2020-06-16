
package com.idesi.proyecto;

import javax.swing.JOptionPane;


public class ModidicarPer extends javax.swing.JFrame {

    Empleado Empleados[] = new Empleado[5];
    ControlPer vtnControlPer;
    int posArr;
    int actual = 0;
    int busPer;
   
    public ModidicarPer() {
        initComponents();
    }
    
   /* public Modificar (ControlPer vtnControlPer, Empleado[] Empleados){
        this.vtnControlPer = vtnControlPer;
        this.Empleados= Empleados;
        initComponents();
    }*/
    
    public void limpiar_cajas(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtRFC.setText("");
        txtCodigo.setText("");
        txtTipo.setText("");
        txtSalario.setText("");
    }
    
    public void Cargar_Datos(int actual){
        txtNombre.setText(Empleados[actual].getNombre());
        txtRFC.setText(Empleados[actual].getRFC());
        txtEdad.setText(Empleados[actual].getEdad());
        txtCodigo.setText(Empleados[actual].getCodigo());
        txtTipo.setText(Empleados[actual].gettipoEmpleado());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        lblIngrese = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtBuscado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniRegresar = new javax.swing.JMenuItem();
        mniAyuda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnchLimpiar = new javax.swing.JCheckBoxMenuItem();
        mnchHabilitar = new javax.swing.JCheckBoxMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIngrese.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIngrese.setText("Ingrese Empleado:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEdad.setText("Edad:");

        lblRFC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRFC.setText("RFC:");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setText("Codigo:");

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo.setText("Tipo de Empleado:");

        lblSalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSalario.setText("Salario:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        mniRegresar.setText("Regresar a Control Personal");
        mniRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegresarActionPerformed(evt);
            }
        });
        jMenu1.add(mniRegresar);

        mniAyuda.setText("Ayuda");
        mniAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAyudaActionPerformed(evt);
            }
        });
        jMenu1.add(mniAyuda);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");

        mnchLimpiar.setSelected(true);
        mnchLimpiar.setText("Limpiar Cajas");
        mnchLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnchLimpiarActionPerformed(evt);
            }
        });
        jMenu2.add(mnchLimpiar);

        mnchHabilitar.setSelected(true);
        mnchHabilitar.setText("Habilitar Cajas");
        mnchHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnchHabilitarActionPerformed(evt);
            }
        });
        jMenu2.add(mnchHabilitar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEdad)
                                    .addComponent(lblNombre)
                                    .addComponent(lblRFC)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblTipo)
                                    .addComponent(lblSalario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad)
                                    .addComponent(txtRFC)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtTipo)
                                    .addComponent(txtSalario)
                                    .addComponent(txtNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblIngrese)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnGuardar)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRFC)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegresarActionPerformed
        this.setVisible(false);
        vtnControlPer.setVisible(true);
        limpiar_cajas();
    }//GEN-LAST:event_mniRegresarActionPerformed

    private void mniAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAyudaActionPerformed
       JOptionPane.showMessageDialog(this, "La busqueda del Empleado es por su código");
    }//GEN-LAST:event_mniAyudaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        /* if (!((txtNombre.getText()).equals("")) && !((txtNombre.getText()).equals("")) && !(txtNombre.getText()).equals("")) {

            Empleados[busPer].setNombre(txtNombre.getText());
            Empleados[busPer].setEdad(txtEdad.getText());
            Empleados[busPer].setRFC(txtRFC.getText());
            Empleados[busPer].setCodigo(txtCodigo.getText());
            Empleados[busPer].settipoEmpleado(txttipoEmpleado.getText());
            Empleados[busPer].setSalario(txtSalario.getText());

            JOptionPane.showMessageDialog(this, "Se a guardado");
            busPer = 5;
            
            
        }*/
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
          
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mnchHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnchHabilitarActionPerformed
        if(mnchHabilitar.isSelected()){
            txtBuscado.setEnabled(true);
            txtNombre.setEnabled(true);
            txtEdad.setEnabled(true);
            txtRFC.setEnabled(true);
            txtCodigo.setEnabled(true);
            txtTipo.setEnabled(true);
            txtSalario.setEnabled(true);
        }else{
            txtBuscado.setEnabled(false);
            txtNombre.setEnabled(false);
            txtEdad.setEnabled(false);
            txtRFC.setEnabled(false);
            txtCodigo.setEnabled(false);
            txtTipo.setEnabled(false);
            txtSalario.setEnabled(false);
        }
    }//GEN-LAST:event_mnchHabilitarActionPerformed

    private void mnchLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnchLimpiarActionPerformed
        limpiar_cajas();
    }//GEN-LAST:event_mnchLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(ModidicarPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModidicarPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModidicarPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModidicarPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModidicarPer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblIngrese;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JCheckBoxMenuItem mnchHabilitar;
    private javax.swing.JCheckBoxMenuItem mnchLimpiar;
    private javax.swing.JMenuItem mniAyuda;
    private javax.swing.JMenuItem mniRegresar;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
