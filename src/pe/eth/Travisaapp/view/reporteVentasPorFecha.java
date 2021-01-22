
package pe.eth.Travisaapp.view;

import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.service.impl.Mensaje;
import pe.eth.Travisaapp.util.ReportViewInternal;

/**
 *
 * @author CARLOS
 */
public class reporteVentasPorFecha extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarVentasPorFecha
     */
    public reporteVentasPorFecha() {
        initComponents();
        setTitle("VENTAS POR FECHA");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnconsultar = new javax.swing.JButton();
        txtfecha = new javax.swing.JTextField();
        PanelReporte = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Fecha:");

        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/buscar.png"))); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        PanelReporte.setMinimumSize(new java.awt.Dimension(0, 0));
        PanelReporte.setPreferredSize(new java.awt.Dimension(10, 474));

        javax.swing.GroupLayout PanelReporteLayout = new javax.swing.GroupLayout(PanelReporte);
        PanelReporte.setLayout(PanelReporteLayout);
        PanelReporteLayout.setHorizontalGroup(
            PanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelReporteLayout.setVerticalGroup(
            PanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(btnconsultar)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelReporte.getAccessibleContext().setAccessibleName("reporte");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
String fecha= txtfecha.getText();
           // Parámetros
    if (fecha.equals("")) {
     
       Mensaje.showInfo(this, "ingrese fecha..");
    }
    Connection cn = null;
    try {
      // Obtener el objeto Connection
      cn = AccesoDB.getConnection();
      // Parametros del reporte
      Map pars = new HashMap();
      //CUENTA->VENTA
      pars.put("FECHAVENTA", fecha);
      // El reporte
     // String fileRepo = "/pe/eth/travisaappbackup/reports/reporteporfecha.jasper";
     //D:\practicando java\TravisaAppv5backup\src\pe\eth\Travisaapp\reports\reporteporfecha.jasper
      String fileRepo = "/pe/eth/Travisaapp/reports/reportexfecha.jasper";
      InputStream ioRepo = Class.class.getResourceAsStream(fileRepo);
      // Ejecutando el reporte
      JasperPrint jpRepo = JasperFillManager.fillReport(ioRepo, pars, cn);
      // Mostrar el reporte
       JasperViewer viewer2 = new JasperViewer(jpRepo, false);
     viewer2.setTitle("Mi Reporte");
     viewer2.setVisible(true);
      
      // Cargando el reporte en el panel
        ReportViewInternal viewer = new ReportViewInternal("ventas por fecha");
      viewer.setReporte(jpRepo);
      viewer.setTitle("MOVIMIENTOS");
      PanelReporte.removeAll();
      PanelReporte.add(viewer);
      viewer.setVisible(true);
      viewer.setMaximum(true);
      viewer.setClosable(false);
      viewer.setIconifiable(false);
      viewer.setMaximizable(false);
      viewer.setResizable(false);
    } catch (Exception e) {
        Mensaje.showError(rootPane, e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }

    }//GEN-LAST:event_btnconsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelReporte;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}
