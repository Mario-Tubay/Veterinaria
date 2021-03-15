package Paneles;

import Class.Dueño;
import controller.DueñoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DueñoView extends javax.swing.JPanel {
    public DueñoView() {
        initComponents();
        mostrar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDueño = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtCedDueño = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreDueño = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblDueño.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDueño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDueñoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDueño);

        jPanel1.setBackground(new java.awt.Color(135, 221, 188));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DUEÑO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtCedDueño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedDueñoKeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo Dueño");

        txtNombreDueño.setEnabled(false);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Dueño");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección Dueño");

        txtDireccion.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cedula Dueño");

        txtCorreo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        btnEliminar.setBackground(new java.awt.Color(239, 42, 82));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(58, 201, 250));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(77, 71, 199));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    DueñoDAO dDAO = new DueñoDAO();
    private void txtCedDueñoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedDueñoKeyReleased
           mostrarId();
    }//GEN-LAST:event_txtCedDueñoKeyReleased

    private void tblDueñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDueñoMouseClicked
         int indice = tblDueño.getSelectedRow();

        String ced = (String)tblDueño.getValueAt(indice, 0);
        String nombre =(String)tblDueño.getValueAt(indice, 1);
        String correo =(String)tblDueño.getValueAt(indice, 2);
        String direccion =(String)tblDueño.getValueAt(indice, 3);
        txtCedDueño.setText(ced);
        txtNombreDueño.setText(nombre);
        txtCorreo.setText(correo);
        txtDireccion.setText(direccion);
       
        txtCedDueño.setEnabled(false);
        txtNombreDueño.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtDireccion.setEnabled(true);
          
        
    }//GEN-LAST:event_tblDueñoMouseClicked
    private boolean validarCampos(){
        if(txtCedDueño.getText().equals("")||txtCorreo.getText().equals("")||txtDireccion.getText().equals("")||txtNombreDueño.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Faltan campos aun por llenar");
           return false;
        }else{
           return true;
        }
    }
    private void limpiar(){
        txtCedDueño.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtNombreDueño.setText("");
        
        txtCedDueño.setEnabled(true);
        txtCorreo.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtNombreDueño.setEnabled(false);
        mostrar();
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(validarCampos()){
           String id = txtCedDueño.getText();
           String nombre = txtNombreDueño.getText();
           String correo = txtCorreo.getText();
           String direccion = txtDireccion.getText();
           Dueño d = new Dueño(direccion, correo, id, nombre);
           int filasAfectadas = dDAO.update(d);
           if(filasAfectadas>0){
               JOptionPane.showMessageDialog(null, "Se editaron los datos correctamente");
               mostrar();
               limpiar();
           }else{
               JOptionPane.showMessageDialog(null, "Error");
           }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtCedDueño.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar primero al dueño");
        }else{
            String id = txtCedDueño.getText();
            Dueño d = new Dueño("", "", id, "");
            int filasAfectadas = dDAO.delete(d);
           if(filasAfectadas>0){
               JOptionPane.showMessageDialog(null, "Se elimino el dueño");
               mostrar();
               limpiar();
           }else{
               JOptionPane.showMessageDialog(null, "Error");
           }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void mostrar(){
        DefaultTableModel modelo1 = new DefaultTableModel();
      modelo1.addColumn("Cedula");
      modelo1.addColumn("Nombre ");
      modelo1.addColumn("Correo");
      modelo1.addColumn("Direccion");
      tblDueño.setModel(modelo1);

      String sql = "SELECT id, nombre, correo, direccion FROM dueño WHERE eliminar=0;";
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        String datos1[]= new String[4];
        try {
            connection =  model.Conexion.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            datos1[0]= resultSet.getString(1);
            datos1[1]= resultSet.getString(2);
            datos1[2]= resultSet.getString(3);
            datos1[3]= resultSet.getString(4);
            modelo1.addRow(datos1);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void mostrarId(){
      String id = txtCedDueño.getText();
      DefaultTableModel modelo1 = new DefaultTableModel();
      modelo1.addColumn("Cedula");
      modelo1.addColumn("Nombre ");
      modelo1.addColumn("Correo");
      modelo1.addColumn("Direccion");
      tblDueño.setModel(modelo1);

      String sql = "SELECT id, nombre, correo, direccion FROM dueño WHERE id like '"+id+"%' and eliminar=0;";
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        String datos1[]= new String[4];
        try {
            connection =  model.Conexion.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            datos1[0]= resultSet.getString(1);
            datos1[1]= resultSet.getString(2);
            datos1[2]= resultSet.getString(3);
            datos1[3]= resultSet.getString(4);
            modelo1.addRow(datos1);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDueño;
    private javax.swing.JTextField txtCedDueño;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreDueño;
    // End of variables declaration//GEN-END:variables
}
