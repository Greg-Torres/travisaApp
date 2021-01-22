package pe.eth.Travisaapp.view;

import clases.CustomImageIcon;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import pe.eth.Travisaapp.controller.CategoriaController;
import pe.eth.Travisaapp.controller.ProductoController;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Categoria;
import pe.eth.Travisaapp.domain.Producto;



public final class productoxlineaView extends javax.swing.JInternalFrame {
    Producto pro;
      public String id;
   String col[]={"Id","Descripcion","Precio","Stock","Observacion"};
    DefaultTableModel modelo=new DefaultTableModel(null,col);
   public void agregarCategorias(){
        ArrayList<Categoria> listacate=CategoriaController.listarcategoria();
         for (Categoria cat : listacate) {
           cboCat.addItem(cat.getNombre());   
       }
   }
    public productoxlineaView() throws Exception {
        initComponents();
       agregarCategorias();
       tablaproductos.setModel(modelo);
       
       tablaproductos.getSelectionModel()
               .addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
lblFoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5backup\\src\\pe\\eth\\Travisaapp\\img\\insertarimagem.png"));
         
               if(tablaproductos.getSelectedRow() != -1)
               {
                   int fila = tablaproductos.getSelectedRow();
                //   pro = ((DefaultTableModel)tablaproductos.getModel()).;
                   id = tablaproductos.getValueAt(fila, 0).toString();
//                   txtNombre.setText(cl.getNombre());
//                   txtApellido.setText(cl.getApelldos());
//                   txtEmail.setText(cl.getEmail());
//                   cbEstado.setSelectedItem(cl.getEstadoCuenta());
 String sql="select foto from producto where idProducto=?";
                    CustomImageIcon foto = AccesoDB.getFoto(id,sql);
                    if(foto!=null)
                    {
                       lblFoto.setIcon(foto);
                    }else{
                   //  lblFoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5\\src\\pe\\eth\\Travisaapp\\img\\sinfoto.png"));
                    lblFoto.setIcon(new ImageIcon("D:\\practicando java\\TravisaAppv5backup\\src\\pe\\eth\\Travisaapp\\img\\sinfoto.png"));
                    }
                    lblFoto.updateUI();
               }
            }
        });
    }
public void limpiar() {
while (tablaproductos.getRowCount() > 0) {
((DefaultTableModel) tablaproductos.getModel()).removeRow(0);
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboCat = new javax.swing.JComboBox();
        lblFoto = new javax.swing.JLabel();

        setTitle("CONSULTA DE PRODUCTOS POR LINEA");

        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaproductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaproductos);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/salir.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Linea de Producto");

        cboCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCatItemStateChanged(evt);
            }
        });
        cboCat.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cboCatMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cboCatMouseMoved(evt);
            }
        });
        cboCat.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                cboCatMouseWheelMoved(evt);
            }
        });
        cboCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboCatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboCatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cboCatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboCatMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboCatMouseReleased(evt);
            }
        });
        cboCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCatActionPerformed(evt);
            }
        });

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/insertarimagem.png"))); // NOI18N
        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboCat, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnCerrar)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
 }//GEN-LAST:event_btnCerrarActionPerformed

 private void cboCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCatActionPerformed
  limpiar() ;
                 
        String cat=cboCat.getSelectedItem().toString();
            try {
                   
        ArrayList<Producto> lista=ProductoController.listarProductoxcategoria(cat);
                     // if(lista.isEmpty()){
                       //   System.out.println("no existe productos..");      
 // ProductoController.mensaje(" no existe productos en la categoria"+cat, "informativo");
//}
//                      else{
         
               for (Producto p : lista) {
            modelo.addRow(new Object[]{p.getIDPRODUCTO(),
                p.getDESCRIPCION(),p.getPRECIOVENTA(),
                p.getSTOCK(),p.getObservacion()});
        }   
                 //     }
            } catch (Exception e) {
                System.out.println("error:" +e);
            }    
 }//GEN-LAST:event_cboCatActionPerformed

    private void cboCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboCatMouseClicked
 
    }//GEN-LAST:event_cboCatMouseClicked

    private void cboCatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboCatMousePressed
        
    }//GEN-LAST:event_cboCatMousePressed

    private void cboCatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboCatMouseExited
     
    }//GEN-LAST:event_cboCatMouseExited

    private void cboCatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboCatMouseReleased
      
    }//GEN-LAST:event_cboCatMouseReleased

    private void cboCatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboCatMouseEntered
 
    }//GEN-LAST:event_cboCatMouseEntered

    private void cboCatMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboCatMouseDragged
       
    }//GEN-LAST:event_cboCatMouseDragged

    private void cboCatMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboCatMouseMoved
 
    }//GEN-LAST:event_cboCatMouseMoved

    private void cboCatMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_cboCatMouseWheelMoved
   
    }//GEN-LAST:event_cboCatMouseWheelMoved

    private void cboCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCatItemStateChanged
//                 limpiar() ;
//                 
//        String cat=cboCat.getSelectedItem().toString();
//            try {
//                   
//        ArrayList<Producto> lista=ProductoController.listarProductoxcategoria(cat);
//                      if(lista.isEmpty()){
//                          System.out.println("no existe productos..");      
//  //  ProductoController.mensaje(" no existe productos en esa categoria", "informativo");
//}
//                      else{
//         
//               for (Producto p : lista) {
//            modelo.addRow(new Object[]{p.getIDPRODUCTO(),
//                p.getDESCRIPCION(),p.getPRECIOVENTA(),
//                p.getSTOCK(),p.getObservacion()});
//        }   
//                      }
//            } catch (Exception e) {
//                System.out.println("error:" +e);
//            }
        
     
    }//GEN-LAST:event_cboCatItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox cboCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTable tablaproductos;
    // End of variables declaration//GEN-END:variables

   
}
