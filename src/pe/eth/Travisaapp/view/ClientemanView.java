
package pe.eth.Travisaapp.view;
import Atxy2k.CustomTextField.RestrictedTextField;
import clases.CustomImageIcon;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import pe.eth.Travisaapp.controller.ClienteController;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.util.Mensaje;

/**
 *
 * @author CARLOS
 */
public class ClientemanView extends javax.swing.JInternalFrame {
   RestrictedTextField telef;
      RestrictedTextField dni;
      private FileInputStream fis;
    private int longitudBytes;
    public ClientemanView() {
        initComponents();
        txtIdClien.setEnabled(false);
        txtNombreCliente.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtRucDni.setText("");
        habilitarbotones(false);
         Habilitarcampos(false);  
         lblestado.setVisible(false);
         cboestado.setVisible(false);
//      telef= new RestrictedTextField(txtTelefono);
//      dni = new RestrictedTextField(txtRucDni);
//         telef.setLimit(9);
//         telef.setOnlyNums(true);
//         dni.setLimit(8);
//         dni.setOnlyNums(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        panelEtiquetas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtIdClien = new javax.swing.JTextField();
        txtRucDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        LblFoto = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        lbl_estado = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        panelBusqueda = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnDni = new javax.swing.JButton();
        btnCodigo = new javax.swing.JButton();
        BtnNewClient = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        BtnHabilitar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        setTitle("MANTENIMIENTO DE CLIENTES");

        panelEtiquetas.setBackground(new java.awt.Color(204, 204, 204));
        panelEtiquetas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("IdCliente");

        jLabel2.setText("Nombres ");

        jLabel3.setText("Direccion");

        jLabel5.setText("Telefono");

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtRucDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucDniActionPerformed(evt);
            }
        });
        txtRucDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucDniKeyTyped(evt);
            }
        });

        jLabel7.setText("DNI");

        LblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/foto.gif"))); // NOI18N
        LblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LblFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblFotoMouseClicked(evt);
            }
        });

        lblestado.setText("Estado");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Activo", "Inactivo" }));

        lbl_estado.setText("Estado");

        javax.swing.GroupLayout panelEtiquetasLayout = new javax.swing.GroupLayout(panelEtiquetas);
        panelEtiquetas.setLayout(panelEtiquetasLayout);
        panelEtiquetasLayout.setHorizontalGroup(
            panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiquetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(lbl_estado))
                .addGap(10, 10, 10)
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEtiquetasLayout.createSequentialGroup()
                        .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEtiquetasLayout.createSequentialGroup()
                                .addComponent(txtDireccion)
                                .addGap(64, 64, 64))
                            .addGroup(panelEtiquetasLayout.createSequentialGroup()
                                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRucDni, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdClien, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEtiquetasLayout.createSequentialGroup()
                        .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblestado)
                        .addGap(18, 18, 18)
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        panelEtiquetasLayout.setVerticalGroup(
            panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiquetasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEtiquetasLayout.createSequentialGroup()
                        .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtRucDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado)
                    .addComponent(lbl_estado)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        panelBusqueda.setBackground(new java.awt.Color(204, 204, 204));
        panelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel4.setText("DNI");

        jLabel6.setText("Codigo Cliente");

        BtnDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/buscar.png"))); // NOI18N
        BtnDni.setText("DNI");
        BtnDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDniActionPerformed(evt);
            }
        });

        btnCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/buscar.png"))); // NOI18N
        btnCodigo.setText("Codigo");
        btnCodigo.setPreferredSize(new java.awt.Dimension(193, 33));
        btnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoActionPerformed(evt);
            }
        });

        BtnNewClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Cliente.png"))); // NOI18N
        BtnNewClient.setText("New Cliente");
        BtnNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewClientActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/running_process.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setPreferredSize(new java.awt.Dimension(117, 33));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        BtnHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/habilitar.png"))); // NOI18N
        BtnHabilitar.setText("Habilitar");
        BtnHabilitar.setPreferredSize(new java.awt.Dimension(117, 33));
        BtnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHabilitarActionPerformed(evt);
            }
        });

        btnInsertar.setBackground(new java.awt.Color(240, 240, 200));
        btnInsertar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/add.png"))); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.setMaximumSize(new java.awt.Dimension(50, 33));
        btnInsertar.setMinimumSize(new java.awt.Dimension(79, 33));
        btnInsertar.setPreferredSize(new java.awt.Dimension(117, 33));
        btnInsertar.setRequestFocusEnabled(false);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(117, 33));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/salir.png"))); // NOI18N
        BtnCerrar.setText("Cerrar");
        BtnCerrar.setPreferredSize(new java.awt.Dimension(117, 33));
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBusquedaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBusquedaLayout.createSequentialGroup()
                        .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBusquedaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBusquedaLayout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBusquedaLayout.createSequentialGroup()
                                .addComponent(BtnHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnNewClient))
                            .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(btnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigo))
                .addGap(43, 43, 43)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNewClient))
                .addGap(6, 6, 6)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEtiquetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoActionPerformed
String id= txtcodigo.getText();
        buscarclienteXCodigo(id);
    }//GEN-LAST:event_btnCodigoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
insertarcliente();
limpiar2();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
Eliminarcliente();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
actualizarcliente();
limpiar2();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDniActionPerformed
   String id= txtDni.getText();
//   if(id.equals("")){
//       System.out.println("debe ingresar un codigo valido..");
//       Mensaje.showInfo(null, "debe ingresar un codigo valido..");
//   }
//   else{
//           buscarclienteXDni(id);   
//   }
   buscarclienteXDni(id);
        
    }//GEN-LAST:event_BtnDniActionPerformed

    private void BtnNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewClientActionPerformed
//         generaridcliente();
        Habilitarcampos(true);     
limpiar();    }//GEN-LAST:event_BtnNewClientActionPerformed

    
    
    
    private void LblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblFotoMouseClicked
       JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);       
        int estado = se.showOpenDialog(null);
        if(estado == JFileChooser.APPROVE_OPTION)
        {
            try {
                
                fis =  new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int)se.getSelectedFile().length();
                
                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(LblFoto.getWidth(), LblFoto.getHeight(), Image.SCALE_DEFAULT);
                LblFoto.setIcon(new ImageIcon(icono));
                LblFoto.updateUI(); 
                
            } catch (FileNotFoundException ex) {ex.printStackTrace();}
            catch (IOException ex){ex.printStackTrace();}
        }
    }//GEN-LAST:event_LblFotoMouseClicked

    private void BtnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHabilitarActionPerformed
Habilitarcampos(true);    }//GEN-LAST:event_BtnHabilitarActionPerformed

    private void txtRucDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucDniKeyTyped

    }//GEN-LAST:event_txtRucDniKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
               char c=evt.getKeyChar();
//       if((c<'a' || c>'z' || c== '\b' && c<'A' || c>'Z' || c== '\b')){
//          evt.consume();
//       }
if(!Character.isLetter(c) && c!= KeyEvent.VK_SPACE){
    evt.consume();
}
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtRucDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnDni;
    private javax.swing.JButton BtnHabilitar;
    private javax.swing.JButton BtnNewClient;
    private javax.swing.JLabel LblFoto;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCodigo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lblestado;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelEtiquetas;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIdClien;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtRucDni;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtestado;
    // End of variables declaration//GEN-END:variables

    private void buscarclienteXCodigo(String id) {
     lbl_estado.setVisible(true);
     txtestado.setVisible(true);
     txtestado.setEnabled(false);
        try {
      
               if(id.equals("")){
                    //    System.out.print("debe ingresar Codigo cliente");
          Mensaje.showInfo(null,"debe ingresar Codigo cliente");  
          return;
               }
                       Cliente clie=ClienteController.BuscarClientexCodigo(id);
               if(clie==null){
                  return; 
               }
               else {
                   
        LblFoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));        
     // LblFoto.setEnabled(false);
    txtNombreCliente.setText(clie.getNOMBRE());
    txtDireccion.setText(clie.getDIRECCION());
    txtRucDni.setText(clie.getRUCDNI());
    txtTelefono.setText(clie.getTELEFONO());
    txtIdClien.setText(clie.getIDCLIENTE());
    txtestado.setText(clie.getESTADO());
   int e= Integer.parseInt(clie.getESTADO());
            System.out.println("estado antes de la actualizacion "+e);
    if(e==1){
      txtestado.setText("Activo");    
    }
    else{
      txtestado.setText("Inactivo");        
    }
  
    btnActualizar.setEnabled(true);
    btnEliminar.setEnabled(true);
    String sql="select foto from cliente where idCliente=?";
    
CustomImageIcon foto = AccesoDB.getFoto(txtcodigo.getText(),sql);
                    if(foto!=null)
                    {
                       LblFoto.setIcon(foto);
                       
                    }else{
                   //  LblFoto.setIcon(new CustomImageIcon(getClass().getResource("/pe.eth.Travisaapp.img/foto.gif")));
LblFoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5backup\\src\\pe\\eth\\Travisaapp\\img\\sinfoto.png"));
                    }
                    LblFoto.updateUI();    
        }
           
    }
        catch (NumberFormatException e) {
            System.out.print("error"+e);
        }
        
       
    }
    private void buscarclienteXDni(String id) {
        if(id.equals("")){
         Mensaje.showInfo(this,"debe ingresar DNI cliente");
        }
         else{
           
              try {
         LblFoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));

        Cliente clie=ClienteController.BuscarClientexDni(id);
    // extraer campos de la base de datos:
        txtNombreCliente.setText(clie.getNOMBRE());
    txtDireccion.setText(clie.getDIRECCION());
    txtRucDni.setText(clie.getRUCDNI());
    txtTelefono.setText(clie.getTELEFONO());
    txtIdClien.setText(clie.getIDCLIENTE());
    btnActualizar.setEnabled(true);
    btnEliminar.setEnabled(true);
     String sql="select foto from cliente where RucDNI=?";
    CustomImageIcon foto = AccesoDB.getFoto(txtDni.getText(),sql);
                    if(foto!=null)
                    {
                       LblFoto.setIcon(foto);
                    }else{
                     LblFoto.setIcon(new CustomImageIcon(getClass().getResource("/pe.eth.Travisaapp.img/foto.gif")));
                    }
                    LblFoto.updateUI();   
        } catch (Exception e) {
        }
 
        }
       
    
    }
    private void Eliminarcliente() {
ClienteController.eliminarCliente(txtcodigo.getText());
limpiar();
    }

    private void actualizarcliente() {
         String estado;
Cliente cli= new Cliente();
cli.setIDCLIENTE(txtIdClien.getText());
cli.setNOMBRE(txtNombreCliente.getText());
cli.setRUCDNI(txtRucDni.getText());
cli.setTELEFONO(txtTelefono.getText());
cli.setDIRECCION(txtDireccion.getText());
cli.setFoto(fis);
String e=cboestado.getSelectedItem().toString();
if(e.equals("Activo")){
    estado="1";
}
else{
    estado="0";
}
cli.setESTADO(estado);
 System.out.println("estado despues de la actualizacion :"+e);
ClienteController.updateCliente(cli);
LblFoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));
if(fis != null)
               {
                   try {
                        fis.close();
                    } catch (IOException ex) {
                           Logger.getLogger(productomanview.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
                 fis = null;

    }

    private void insertarcliente() {
        
  //Cliente CodigoEncontrado =ClienteController.buscarCodigo(this.txtIdClien.getText());;
          if(this.txtNombreCliente.getText().isEmpty() 
           || this.txtDireccion.getText().isEmpty()
        //   || this.txtIdClien.getText().isEmpty()
                 // || this.LblFoto.getText().isEmpty()
           || this.txtRucDni.getText().isEmpty()
             || this.txtTelefono.getText().isEmpty()
              || this.cboestado.getSelectedItem().toString().isEmpty())
                  {
            JOptionPane.showMessageDialog(this, "Todos los campos son "
                    + "obligatorios, excepto la foto");
          //  return;
        } 
   
     /*   if(CodigoEncontrado!=null)
        {
           JOptionPane.showMessageDialog(this, "el codigo "+this.txtIdClien.getText()
                    + " ya existe ingrese otro codigo");
            return; 
        }    
*/
        else{
             String estado;
Cliente cli=new Cliente();
//cli.setIDCLIENTE(txtIdClien.getText());
cli.setNOMBRE(txtNombreCliente.getText());
cli.setDIRECCION(txtDireccion.getText());
cli.setRUCDNI(txtRucDni.getText());
cli.setTELEFONO(txtTelefono.getText());
cli.setESTADO(cboestado.getSelectedItem().toString());
cli.setFoto(fis);
String e=cboestado.getSelectedItem().toString();
if(e.equals("Activo")){
    estado="1";
}
else{
    estado="0";
}
cli.setESTADO(estado);
              System.out.println("estado capturado :"+estado);
ClienteController.insertarCliente(cli);
    LblFoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));
        }
    }
    private void limpiar2() {
txtIdClien.setText("");
txtIdClien.setEditable(false);
txtNombreCliente.setText("");
txtRucDni.setText("");
txtTelefono.setText("");
txtDireccion.setText("");
txtRucDni.requestFocus();
btnActualizar.setEnabled(false);
btnEliminar.setEnabled(false);
btnInsertar.setEnabled(false);
lblestado.setVisible(false);
cboestado.setVisible(false);
txtcodigo.setText("");
txtestado.setText("");
   }

    private void habilitarbotones(boolean b) {
        btnActualizar.setEnabled(b);
        btnEliminar.setEnabled(b);
       btnInsertar.setEnabled(b);
    }

    private void Habilitarcampos(boolean b) {
        
       txtNombreCliente.setEditable(b);
       txtDireccion.setEditable(b);
       txtIdClien.setEditable(b);
       txtRucDni.setEditable(b);
       txtTelefono.setEditable(b);
       btnInsertar.setEnabled(b);
       txtestado.setVisible(!b);
       lblestado.setVisible(true);
       cboestado.setVisible(true);
       lbl_estado.setVisible(!b);
    }

    private void generaridcliente() {
       int nrocorrelativo;
    String nro=   ClienteController.obteneridcliente();
    nrocorrelativo= Integer.parseInt(nro)+1;
txtIdClien.setText(String.valueOf("C00"+nrocorrelativo)); 
txtIdClien.setEditable(false);
    }

    private void limpiar() {
txtNombreCliente.setText("");
txtDireccion.setText("");
txtRucDni.setText("");
txtTelefono.setText("");
cboestado.setToolTipText("");
txtIdClien.setText("");
txtestado.setText("");
    }
    
}
