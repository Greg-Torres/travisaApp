
package pe.eth.Travisaapp.view;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.eth.Travisaapp.controller.CategoriaController;
import pe.eth.Travisaapp.controller.ProductoController;
import pe.eth.Travisaapp.domain.Categoria;
import pe.eth.Travisaapp.domain.Producto;

/**
 *
 * @author CARLOS
 */
public class CategoriamanView extends javax.swing.JInternalFrame {

   String col[]={"Id","Descripcion","Precio","Stock","Observacion"};
    DefaultTableModel modelo=new DefaultTableModel(null,col);
   public void agregarCategorias(){
        ArrayList<Categoria> listacate=CategoriaController.listarcategoria();
         for (Categoria cat : listacate) {
           CBoCat.addItem(cat.getNombre());   
       }
   }
   //ArrayList<Categoria> lista=CategoriaServiceImpl.listar();
      public void mensaje(String m){
    JOptionPane.showMessageDialog(null, m);
}
    public CategoriamanView() {
        initComponents();
          agregarCategorias();
        TablaCat.setModel(modelo);
        txtIdcat.setEnabled(false);
       // camposeditables(false);
    }
public void limpiar() {
while (TablaCat.getRowCount() > 0) {
((DefaultTableModel) TablaCat.getModel()).removeRow(0);
}
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCat = new javax.swing.JTable();
        CBoCat = new javax.swing.JComboBox<>();
        Panelbotones = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnAct = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        txtcodProd = new javax.swing.JTextField();
        txtDescr = new javax.swing.JTextField();
        txtPv = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtObs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdcat = new javax.swing.JTextField();

        setTitle("Categoria ");

        TablaCat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaCat);

        Panelbotones.setLayout(new java.awt.GridLayout(1, 0));

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/buscar.png"))); // NOI18N
        BtnBuscar.setText("Listar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        Panelbotones.add(BtnBuscar);

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/editar.png"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });
        Panelbotones.add(BtnEditar);

        BtnAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/backup-restore.png"))); // NOI18N
        BtnAct.setText("Actualizar");
        BtnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActActionPerformed(evt);
            }
        });
        Panelbotones.add(BtnAct);

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        Panelbotones.add(BtnEliminar);

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/salir.png"))); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        Panelbotones.add(BtnSalir);

        jLabel1.setText("IdProducto");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Precio Venta");

        jLabel4.setText("Stock");

        jLabel5.setText("Observacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBoCat, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panelbotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcodProd))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDescr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPv, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdcat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panelbotones, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CBoCat)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(txtIdcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
         limpiar() ;
        String cat=CBoCat.getSelectedItem().toString();
     //   ArrayList<Categoria> lista=ArticuloDAO.articulosPorCategoria(cat);
        ArrayList<Producto> lista=ProductoController.listarProductoxcategoria(cat);
        for (Producto p : lista) {
            modelo.addRow(new Object[]{p.getIDPRODUCTO(),
                p.getDESCRIPCION(),p.getPRECIOVENTA(),
                p.getSTOCK(),p.getObservacion()});
        } 
       
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
this.dispose();

    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
  
        String v=JOptionPane.showInputDialog(null, "Ingrese código");
        if(!v.equals("")){
            
            //int codigo=Integer.parseInt(v);
           // EmpleadoDAO e=new EmpleadoDAO();
            Producto p=ProductoController.BuscarProducto(v);
//buscare empleado
            //Empleado emp=e.get(codigo);
            if(p!=null){
               
            //asignar datos del objeto empleado
            //a los cuadros de  texto
            txtcodProd.setText(String.valueOf(p.getIDPRODUCTO()));
            txtDescr.setText(p.getDESCRIPCION());
            txtPv.setText(String.valueOf(p.getPRECIOVENTA()));
            txtStock.setText(String.valueOf(p.getSTOCK()));
            txtObs.setText(p.getObservacion());
            txtIdcat.setText(String.valueOf(p.getIDCATEGORIA()));
            }else{
            mensaje("Codigo no existe...!!!");
            }
        }else{
            mensaje("No ha ingresado codigo...");
        }
        
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActActionPerformed
ActualizarCategoria();
    }//GEN-LAST:event_BtnActActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
EliminarProducto();
    }//GEN-LAST:event_BtnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAct;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CBoCat;
    private javax.swing.JPanel Panelbotones;
    private javax.swing.JTable TablaCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDescr;
    private javax.swing.JTextField txtIdcat;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtPv;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtcodProd;
    // End of variables declaration//GEN-END:variables

    private void ActualizarCategoria() {
    
Producto pro= new Producto();
pro.setIDPRODUCTO(txtcodProd.getText());
pro.setDESCRIPCION(txtDescr.getText());
pro.setPRECIOVENTA(Double.parseDouble(txtPv.getText()));
pro.setSTOCK(Integer.parseInt(txtStock.getText()));
pro.setObservacion(txtObs.getText());
pro.setIDCATEGORIA(Integer.parseInt(txtIdcat.getText()));
ProductoController.updateProducto(pro);
    limpiarcampos();
    }    

    private void limpiarcampos() {
        txtDescr.setText("");
        txtPv.setText("");
        txtStock.setText("");
        txtcodProd.setText("");
        txtObs.setText("");
        txtIdcat.setText("");
    }

    private void camposeditables(boolean v) {
txtcodProd.setVisible(v);
txtDescr.setVisible(v);
txtPv.setVisible(v);
txtStock.setVisible(v);
txtObs.setVisible(v);
    }

    private void EliminarProducto() {
        
        String v=JOptionPane.showInputDialog(null, "Ingrese código");
        if(!v.equals("")){
            
       Producto cod=ProductoController.buscarCodigo(v);
  
            
            if(cod!=null){
         ProductoController.eliminar(v);
//            txtcodProd.setText(String.valueOf(p.getIDPRODUCTO()));
//            txtDescr.setText(p.getDESCRIPCION());
//            txtPv.setText(String.valueOf(p.getPRECIOVENTA()));
//            txtStock.setText(String.valueOf(p.getSTOCK()));
//            txtObs.setText(p.getObservacion());
//            txtIdcat.setText(String.valueOf(p.getIDCATEGORIA()));
            }else{
            mensaje("Codigo no existe...!!!");
            }
        }else{
            mensaje("No ha ingresado codigo...");
        }
     
       
    }
      private static void cuadromensaje(String rs) {
    JOptionPane.showMessageDialog(null,rs);

    }
}
