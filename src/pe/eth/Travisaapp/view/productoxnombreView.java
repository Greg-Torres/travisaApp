
package pe.eth.Travisaapp.view;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import pe.eth.Travisaapp.controller.ProductoController;
import pe.eth.Travisaapp.domain.Producto;

public class productoxnombreView extends javax.swing.JInternalFrame {
    String col[]={"Id","Descripcion","Precio","Stock","Observacion"};
    DefaultTableModel modelo=new DefaultTableModel(null,col);
    ArrayList<Producto> productos;

    public productoxnombreView() {
        initComponents();
         tabla_Productos.setModel(modelo);
    }
public void limpiar() {
while (tabla_Productos.getRowCount() > 0) {
((DefaultTableModel) tabla_Productos.getModel()).removeRow(0);
}
}
  private void Productosenlalista() {
        productos=ProductoController.listarProducto(txtiniciales.getText());
       // DefaultTableModel modelo= new  DefaultTableModel();
        for(Producto p:productos){
           //modelo.addElement(a.getDESCRIPCION());
            modelo.addRow(new Object[]{p.getIDPRODUCTO(),
                p.getDESCRIPCION(),p.getPRECIOVENTA(),
                p.getSTOCK(),p.getObservacion()});
        }
     //  lstProductos.setModel(modelo); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtiniciales = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Productos = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        lblmensaje = new javax.swing.JLabel();

        setTitle("CONSULTA DE PRODUCTOS POR NOMBRE");

        jLabel1.setText("Nomnbre Producto");

        txtiniciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinicialesActionPerformed(evt);
            }
        });
        txtiniciales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtinicialesKeyReleased(evt);
            }
        });

        tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_Productos);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblmensaje.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtiniciales, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtiniciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(lblmensaje))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
 }//GEN-LAST:event_btnCerrarActionPerformed

 private void txtinicialesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinicialesKeyReleased
     //verProductos();
 }//GEN-LAST:event_txtinicialesKeyReleased

    private void txtinicialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinicialesActionPerformed
Productosenlalista();
    }//GEN-LAST:event_txtinicialesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JTable tabla_Productos;
    private javax.swing.JTextField txtiniciales;
    // End of variables declaration//GEN-END:variables

    
}
