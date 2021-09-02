
package vista;

import conexion.Aplicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class frmEstudiante extends javax.swing.JFrame {
    private Aplicacion conecta = new Aplicacion();
    PreparedStatement ps;
    ResultSet rs;
    
    int cd = -1;
    int[] datos = null;
    int i = 0, n = 0;

    public frmEstudiante() {
        initComponents();
    }

    public void limpiar() {
        txtBuscar.setText(null);
        txtNombre.setText(null);
        cbGenero.setSelectedIndex(0);
        cbMateria.setSelectedIndex(0);
        txtNota.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEstudiante = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDerecha = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        txtBuscar.setColumns(5);
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRES");

        txtNombre.setColumns(30);

        jLabel2.setText("GENERO");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "MASCULINO", "FEMENINO" }));

        jLabel3.setText("MATERIA");

        cbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "MATEMATICAS", "FISICA", "QUIMICA", "PROGRAMACION" }));

        jLabel4.setText("NOTA");

        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnDerecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDerecha.setText("-->");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnIzquierda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIzquierda.setText("<--");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEstudianteLayout = new javax.swing.GroupLayout(pnlEstudiante);
        pnlEstudiante.setLayout(pnlEstudianteLayout);
        pnlEstudianteLayout.setHorizontalGroup(
            pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstudianteLayout.createSequentialGroup()
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(cbGenero, 0, 144, Short.MAX_VALUE)))
                            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlEstudianteLayout.createSequentialGroup()
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                                .addComponent(btnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))))
            .addComponent(jSeparator1)
        );
        pnlEstudianteLayout.setVerticalGroup(
            pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstudianteLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(pnlEstudianteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDerecha)
                    .addComponent(btnIzquierda))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        try {
            Connection conexion = conecta.getConnection();
            ps = conexion.prepareStatement("select * from estudiante where codigoE=?");
            ps.setInt(1, Integer.parseInt(txtBuscar.getText()));
            rs = ps.executeQuery();
            if (rs.next()) {
                txtNombre.setText(rs.getString("nombreE"));
                cbGenero.setSelectedItem(rs.getString("sexo"));
                cbMateria.setSelectedItem(rs.getString("materia"));
                txtNota.setText(String.valueOf(rs.getDouble("nota")));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el registro");
            }
            conexion.close();

        } catch (Exception ex) {
            System.err.println("Error " + ex.getMessage());
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        try {
            Connection conexion = conecta.getConnection();
            ps = conexion.prepareStatement("insert into estudiante (nombree,nota,sexo,materia) values (?,?,?,?)");
            ps.setString(1, txtNombre.getText());
            ps.setDouble(2, Double.parseDouble(txtNota.getText()));
            ps.setString(3, cbGenero.getSelectedItem().toString());
            ps.setString(4, cbMateria.getSelectedItem().toString());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Insercion correcta");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Insercion fallida");
            }
            conexion.close();

        } catch (Exception ex) {
            System.err.println("Error no se puede abrir la tabla");
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            Connection conexion = conecta.getConnection();
            ps = conexion.prepareStatement("update estudiante set nombreE=?,nota=?,sexo=?,materia=? where codigoE=?");
            ps.setString(1, txtNombre.getText());
            ps.setDouble(2, Double.parseDouble(txtNota.getText()));
            ps.setString(3, cbGenero.getSelectedItem().toString());
            ps.setString(4, cbMateria.getSelectedItem().toString());
            ps.setInt(5, Integer.parseInt(txtBuscar.getText()));
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                System.out.println("Cambios registrados");
                limpiar();
            } else {
                System.out.println("No se realizaron los cambios");
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error no se puede abrir la tabla");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection conexion = conecta.getConnection();
            ps = conexion.prepareStatement("delete from estudiante where codigoe=?");
            ps.setInt(1, Integer.parseInt(txtBuscar.getText()));
            var resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro elminado ");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el registro");
            }
        } catch (Exception ex) {
            System.err.println("Error No se puedel leer el archivo ");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        // TODO add your handling code here:
        try {
            int i = 0;
            int n = 0;
            int aux;
            Connection conexion = conecta.getConnection();
            ps = conexion.prepareStatement("select * from estudiante ");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                n++;
            }
            datos = new int[n];
            ps = conexion.prepareStatement("select * from estudiante ");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                datos[i] = rs.getInt("codigoE");
                i++;
            }
            aux = n-1;
            
            if (cd >= aux) {
                JOptionPane.showMessageDialog(null, "Ultimo de la lista");
                cd = aux-1;
            }
            cd++;
            ps = conexion.prepareStatement("select * from estudiante where codigoE=?");
            ps.setInt(1, Integer.parseInt(String.valueOf(datos[cd])));
            rs = ps.executeQuery();
            if (rs.next()) {
                txtNombre.setText(rs.getString("nombreE"));
                cbGenero.setSelectedItem(rs.getString("sexo"));
                cbMateria.setSelectedItem(rs.getString("materia"));
                txtNota.setText(String.valueOf(rs.getDouble("nota")));
                txtBuscar.setText(String.valueOf(datos[cd]));
            } else {
                JOptionPane.showMessageDialog(null, "El registro no existe");
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error " + ex.getMessage());
        }
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        // TODO add your handling code here:
        try {
            int i = 0;
            int n = 0;
            Connection conexion = conecta.getConnection();
            ps = conexion.prepareStatement("select * from estudiante ");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                n++;
            }
            datos = new int[n];
            ps = conexion.prepareStatement("select * from estudiante ");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                datos[i] = rs.getInt("codigoE");
                i++;
            }
            if (cd <= 0) {
                cd = 1;
                JOptionPane.showMessageDialog(null, "Primero de la lista");
            }
            cd--;
            ps = conexion.prepareStatement("select * from estudiante where codigoE=?");
            ps.setInt(1, Integer.parseInt(String.valueOf(datos[cd])));
            rs = ps.executeQuery();
            
            if (rs.next()) {
                txtNombre.setText(rs.getString("nombreE"));
                cbGenero.setSelectedItem(rs.getString("sexo"));
                cbMateria.setSelectedItem(rs.getString("materia"));
                txtNota.setText(String.valueOf(rs.getDouble("nota")));
                txtBuscar.setText(String.valueOf(datos[cd]));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el registro");
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error " + ex.getMessage());
        }
    }//GEN-LAST:event_btnIzquierdaActionPerformed

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
            java.util.logging.Logger.getLogger(frmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlEstudiante;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables

}
