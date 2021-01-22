package pe.eth.Travisaapp.view;

import clases.CustomImageIcon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import pe.eth.Travisaapp.controller.CategoriaController;
import pe.eth.Travisaapp.controller.ProductoController;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Categoria;
import pe.eth.Travisaapp.domain.Producto;
import sun.misc.BASE64Encoder;


public class productomanview extends javax.swing.JInternalFrame {
    
      private FileInputStream fis;
    private int longitudBytes;
   private JPanel contentPane;
File fichero = null;
    public productomanview() {
        initComponents();
//        Cargarcombo();
agregarCategorias();
Habilitarcampos(false);
cboCat.setEnabled(false);
cboCat.setVisible(false);
btnModificar.setEnabled(false);
btnAdicionar.setEnabled(false);
btnEliminar.setEnabled(false);
btnHabilitar.setEnabled(false);
    }

     public void agregarCategorias(){
        ArrayList<Categoria> listacate=CategoriaController.listarcategoria();
         for (Categoria cat : listacate) {
           cboCat.addItem(cat.getNombre());   
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcategoria = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblobservacion = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtpreventa = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCATe = new javax.swing.JTextField();
        txtObservacion = new javax.swing.JTextField();
        cboCat = new javax.swing.JComboBox();
        jPanelbotones_P = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnHabilitar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        Panel_foto = new javax.swing.JPanel();
        lblfoto = new javax.swing.JLabel();
        txtIDCateg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setTitle("MANTENIMIENTO DE PRODUCTO");

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre de Producto");

        lblcategoria.setText("Categorias");

        jLabel4.setText("Categoria");

        jLabel5.setText("Precio Venta");

        jLabel6.setText("Stock");

        lblobservacion.setText("Observacion");

        jPanelbotones_P.setLayout(new java.awt.GridLayout(1, 0));

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/add.png"))); // NOI18N
        btnAdicionar.setText("Agregar");
        btnAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionar.setMaximumSize(new java.awt.Dimension(75, 49));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(75, 49));
        btnAdicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanelbotones_P.add(btnAdicionar);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setMaximumSize(new java.awt.Dimension(77, 51));
        btnBuscar.setMinimumSize(new java.awt.Dimension(77, 51));
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanelbotones_P.add(btnBuscar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setMaximumSize(new java.awt.Dimension(77, 51));
        btnEliminar.setMinimumSize(new java.awt.Dimension(77, 51));
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanelbotones_P.add(btnEliminar);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setMaximumSize(new java.awt.Dimension(75, 49));
        btnModificar.setMinimumSize(new java.awt.Dimension(75, 49));
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanelbotones_P.add(btnModificar);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanelbotones_P.add(btnNuevo);

        btnHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/habilitar.png"))); // NOI18N
        btnHabilitar.setText("Habilitar Edicion");
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
            }
        });
        jPanelbotones_P.add(btnHabilitar);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/exit2.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelbotones_P.add(btnCerrar);

        lblfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/insertarimagem.png"))); // NOI18N
        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblfoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_fotoLayout = new javax.swing.GroupLayout(Panel_foto);
        Panel_foto.setLayout(Panel_fotoLayout);
        Panel_fotoLayout.setHorizontalGroup(
            Panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_fotoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_fotoLayout.setVerticalGroup(
            Panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_fotoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setText("IDCategoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelbotones_P, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblobservacion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboCat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtpreventa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCATe, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180)
                        .addComponent(Panel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcategoria)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpreventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCATe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lblobservacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Panel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jPanelbotones_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
 }//GEN-LAST:event_btnCerrarActionPerformed

 private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
    InsertarProducto();
    limpiar();
 }//GEN-LAST:event_btnAdicionarActionPerformed

 private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

          try {  
              Actualizarproducto();
          } catch (FileNotFoundException ex) {
              Logger.getLogger(productomanview.class.getName()).log(Level.SEVERE, null, ex);
          }

limpiar();
 }//GEN-LAST:event_btnModificarActionPerformed

 private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
EliminarProducto();  
limpiar();
 }//GEN-LAST:event_btnEliminarActionPerformed

 private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

     String id = txtcodigo.getText();
     buscarProducto(id);

 }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

txtObservacion.setEditable(true);
txtpreventa.setEditable(true);
txtStock.setEditable(true);
txtCATe.setEditable(true);

txtIDCateg.setEditable(true);
txtnombre.setEditable(true);
btnAdicionar.setEnabled(true);
//lblfoto.setIcon(null);
lblfoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));
cboCat.setVisible(true);
cboCat.setEnabled(true);
      txtCATe.setEnabled(false);
limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void lblfotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfotoMouseClicked
      JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);       
        int estado = se.showOpenDialog(null);
        if(estado == JFileChooser.APPROVE_OPTION)
        {
            try {
                
                fis =  new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int)se.getSelectedFile().length();
                
                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT);
                lblfoto.setIcon(new ImageIcon(icono));
                lblfoto.updateUI(); 
                
            } catch (FileNotFoundException ex) {ex.printStackTrace();}
            catch (IOException ex){ex.printStackTrace();}
        }    }//GEN-LAST:event_lblfotoMouseClicked

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarActionPerformed
Habilitarcampos(true);
    }//GEN-LAST:event_btnHabilitarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_foto;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelbotones_P;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblobservacion;
    private javax.swing.JTextField txtCATe;
    private javax.swing.JTextField txtIDCateg;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpreventa;
    // End of variables declaration//GEN-END:variables

    private void buscarProducto(String id) {
        Habilitarcampos(false);
        txtCATe.setEditable(false);
        txtIDCateg.setEditable(false);
      lblfoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));
      if(id.isEmpty()){
          JOptionPane.showMessageDialog(this, "debe ingresar el codigo");
      }
      else{
      try {
            Producto   prod=ProductoController.BuscarProducto(id);
          
           
           txtnombre.setText(prod.getDESCRIPCION());
    txtpreventa.setText(prod.getPRECIOVENTA()+"");
    txtStock.setText(prod.getSTOCK()+"");
   txtIDCateg.setText(prod.getIDCATEGORIA()+"");
    int c=prod.getIDCATEGORIA();
       switch(c)
        {
        
            case 1: txtCATe.setText("jarras");    
            break;
            case 2: txtCATe.setText("Vasos"); 
             break;
            case 3: txtCATe.setText("Frascos");
             break;
            case 4: txtCATe.setText("Galoneras");
             break;
            case 5: txtCATe.setText("floreros");
             break;
            default: txtCATe.setText("otros");  
                
        }
    txtcodigo.setText(prod.getIDPRODUCTO());
txtObservacion.setText(prod.getObservacion());
btnHabilitar.setEnabled(true);
 String sql="select foto from producto where idProducto=?";
 CustomImageIcon foto = AccesoDB.getFoto(txtcodigo.getText(),sql);
                    if(foto!=null)
                    {
                       lblfoto.setIcon(foto);
                    }else{
                   //  lblfoto.setIcon(new CustomImageIcon(getClass().getResource("/pe.eth.Travisaapp.img/foto.gif")));
lblfoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5backup\\src\\pe\\eth\\Travisaapp\\img\\sinfoto.png"));
 //D:\practicando java\TravisaAppv5backup\src\pe\eth\Travisaapp\img\sinfoto.png                    
                    }
                    lblfoto.updateUI();       
         
            
    // extraer campos de la base de datos:
     
    
        } catch (Exception e) {
            System.out.println("error :" +e);
        }     
      }
     
     
    }

 
    private void Actualizarproducto() throws FileNotFoundException {
Producto Prod= new Producto();
String imagen=null;
Prod.setIDCATEGORIA(cboCat.getSelectedIndex()+1);
Prod.setDESCRIPCION(txtnombre.getText());
Prod.setPRECIOVENTA(Double.parseDouble(txtpreventa.getText()));
Prod.setSTOCK(Integer.parseInt(txtStock.getText()));
Prod.setIDPRODUCTO(txtcodigo.getText());
Prod.setObservacion(txtObservacion.getText());
Prod.setFoto(fis);

//Icon foto= lblfoto.getIcon();
//foto.getBytes();
//FileInputStream fotoconvert = new FileInputStream(foto);
//FileInputStream fotoconvert = new FileInputStream((File) foto);
//Prod.setFoto(fotoconvert);
ProductoController.updateProducto(Prod);
//lblfoto.setIcon(null);
lblfoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5backup\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));
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
    
    private void EliminarProducto() {
ProductoController.eliminar(txtcodigo.getText());
limpiar();
//lblfoto.setIcon(null);
 lblfoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));
    }

    private void limpiar() {
        txtCATe.setText("");
        txtIDCateg.setText("");
        txtObservacion.setText("");
        txtStock.setText("");
        txtnombre.setText("");
        txtpreventa.setText("");
        txtcodigo.setText("");
        txtcodigo.requestFocus();
    }

    private void InsertarProducto() {
    Producto CodigoEncontrado =ProductoController.buscarCodigo(this.txtcodigo.getText());
    
        if (this.txtnombre.getText().isEmpty()
                || this.txtStock.getText().isEmpty()
                || this.txtpreventa.getText().isEmpty()
                || this.cboCat.getSelectedIndex() == -1) //|| this.txtCATe.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Todos los campos son "
                    + "obligatorios, ecepto la observacion y/o la foto");
            return;
        }
        if(CodigoEncontrado!=null)
        {
           JOptionPane.showMessageDialog(this, "el codigo "+this.txtcodigo.getText()
                    + " ya existe ingrese otro codigo");
            return; 
        }
        else{
      Producto pro=new Producto();
pro.setDESCRIPCION(txtnombre.getText());
pro.setPRECIOVENTA(Double.parseDouble(txtpreventa.getText()));
pro.setSTOCK(Integer.parseInt(txtStock.getText()));
//pro.setIDCATEGORIA(Integer.parseInt(txtCATe.getText()));
pro.setIDCATEGORIA(cboCat.getSelectedIndex()+1);
pro.setIDPRODUCTO(txtcodigo.getText());
pro.setObservacion(txtObservacion.getText());
pro.setFoto(fis);
ProductoController.InsertarProducto(pro); 
lblfoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));
//    if(fis != null)
//                    try {
//                        fis.close();
//     } catch (IOException ex) {
//         Logger.getLogger(productomanview.class.getName()).log(Level.SEVERE, null, ex);
//     }
//                 fis = null;
    }
    }
    private void Habilitarcampos(boolean v) {
txtObservacion.setEditable(v);
txtpreventa.setEditable(v);
txtStock.setEditable(v);
txtCATe.setEditable(v);
txtIDCateg.setEditable(v);
txtnombre.setEditable(v);
btnModificar.setEnabled(v);
lblcategoria.setVisible(v);
cboCat.setVisible(v);
cboCat.setEnabled(v);
    }


}
