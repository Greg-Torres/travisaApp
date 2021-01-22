

package pe.eth.Travisaapp.view;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.service.impl.Mensaje;
import pe.eth.Travisaapp.util.Memoria;

/**
 *
 * @author Alumno
 */
public class Principalview extends javax.swing.JFrame {

 /**
  * Creates new form Principalview
  */
    
 public Principalview() {
  initComponents();
  setExtendedState(MAXIMIZED_BOTH);
  establecerTitulo();
 
 }
  
  private void establecerTitulo(){
    Empleado bean = (Empleado) Memoria.get("usuario");
    String titulo = "TRAVISA   [Usuario:" + bean.getUsuario() + "]";
    this.setTitle(titulo);
    
  }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        lblprincipal = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIClientes = new javax.swing.JMenuItem();
        jMIEmpleados = new javax.swing.JMenuItem();
        jMICategorias = new javax.swing.JMenuItem();
        jMIProductos = new javax.swing.JMenuItem();
        jMIProveedores = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMISlir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMICompras = new javax.swing.JMenuItem();
        jMIPedidos = new javax.swing.JMenuItem();
        jMItemVentas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMIProd_Todos = new javax.swing.JMenuItem();
        jMIProd_x_Categ = new javax.swing.JMenuItem();
        jMIProd_x_Nombre = new javax.swing.JMenuItem();
        jMIProd_x_Proveedor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        reportelistadeprecios = new javax.swing.JMenuItem();
        reporteventasporfecha = new javax.swing.JMenuItem();
        ReporteClientes = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL EMPRESARIAL");

        VentanaPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblprincipal.setBackground(new java.awt.Color(0, 153, 153));
        lblprincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/logo_travisa_1.jpg"))); // NOI18N
        lblprincipal.setOpaque(true);

        VentanaPrincipal.setLayer(lblprincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaPrincipalLayout.createSequentialGroup()
                .addComponent(lblprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(VentanaPrincipal, java.awt.BorderLayout.CENTER);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/logomanten.png"))); // NOI18N
        jMenu1.setText("Mantenimiento");

        jMIClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMIClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Cliente.png"))); // NOI18N
        jMIClientes.setMnemonic('c');
        jMIClientes.setText("Clientes");
        jMIClientes.setToolTipText("Clientes");
        jMIClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMIClientes);

        jMIEmpleados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMIEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Business_People.png"))); // NOI18N
        jMIEmpleados.setText("Empleados");
        jMIEmpleados.setToolTipText("Empleados");
        jMIEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(jMIEmpleados);

        jMICategorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMICategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/categoria.png"))); // NOI18N
        jMICategorias.setText("Categoria");
        jMICategorias.setToolTipText("Categorias");
        jMICategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICategoriasActionPerformed(evt);
            }
        });
        jMenu1.add(jMICategorias);

        jMIProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMIProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/shopping_cart.png"))); // NOI18N
        jMIProductos.setText("Productos");
        jMIProductos.setToolTipText("Prodcutos");
        jMIProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMIProductos);

        jMIProveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMIProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Vista Users.png"))); // NOI18N
        jMIProveedores.setText("Proveedores");
        jMIProveedores.setToolTipText("Proveedores");
        jMIProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(jMIProveedores);
        jMenu1.add(jSeparator1);

        jMISlir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMISlir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/old-go-previous.png"))); // NOI18N
        jMISlir.setText("Salir");
        jMISlir.setToolTipText("Salir");
        jMISlir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISlirActionPerformed(evt);
            }
        });
        jMenu1.add(jMISlir);

        menuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/logoventas.png"))); // NOI18N
        jMenu2.setText("Ventas");

        jMICompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMICompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/shopping_cart.png"))); // NOI18N
        jMICompras.setText("Compras");
        jMenu2.add(jMICompras);

        jMIPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMIPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/libro_azul.png"))); // NOI18N
        jMIPedidos.setText("Pedidos");
        jMenu2.add(jMIPedidos);

        jMItemVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMItemVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/monedas_24x24.png"))); // NOI18N
        jMItemVentas.setText("Generar Ventas");
        jMItemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemVentasActionPerformed(evt);
            }
        });
        jMenu2.add(jMItemVentas);

        menuBar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/buscar_1.png"))); // NOI18N
        jMenu3.setText("Consultas");

        jMIProd_Todos.setText("Productos Todo");
        jMIProd_Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProd_TodosActionPerformed(evt);
            }
        });
        jMenu3.add(jMIProd_Todos);

        jMIProd_x_Categ.setText("Productos por Linea");
        jMIProd_x_Categ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProd_x_CategActionPerformed(evt);
            }
        });
        jMenu3.add(jMIProd_x_Categ);

        jMIProd_x_Nombre.setText("Productos por Nombre");
        jMIProd_x_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProd_x_NombreActionPerformed(evt);
            }
        });
        jMenu3.add(jMIProd_x_Nombre);

        jMIProd_x_Proveedor.setText("Productos por proveedor");
        jMIProd_x_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProd_x_ProveedorActionPerformed(evt);
            }
        });
        jMenu3.add(jMIProd_x_Proveedor);

        menuBar.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/reportes.png"))); // NOI18N
        jMenu4.setText("Reportes");

        reportelistadeprecios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        reportelistadeprecios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/US-dollar.png"))); // NOI18N
        reportelistadeprecios.setText("Lista de precios");
        reportelistadeprecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportelistadepreciosActionPerformed(evt);
            }
        });
        jMenu4.add(reportelistadeprecios);

        reporteventasporfecha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        reporteventasporfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/view_icon.png"))); // NOI18N
        reporteventasporfecha.setText("Ventas por Fecha");
        reporteventasporfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteventasporfechaActionPerformed(evt);
            }
        });
        jMenu4.add(reporteventasporfecha);

        ReporteClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Cliente.png"))); // NOI18N
        ReporteClientes.setText("Lista de Clientes");
        ReporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteClientesActionPerformed(evt);
            }
        });
        jMenu4.add(ReporteClientes);

        menuBar.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/ayuda.png"))); // NOI18N
        jMenu6.setText("Ayuda");

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/valores.png"))); // NOI18N
        jMenuItem16.setText("Indice");
        jMenu6.add(jMenuItem16);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/help.png"))); // NOI18N
        jMenuItem17.setText("Acerca de");
        jMenu6.add(jMenuItem17);

        menuBar.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Utilities.png"))); // NOI18N
        jMenu5.setText("Utilitarios");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/backup-restore.png"))); // NOI18N
        jMenuItem1.setText("Backup DB");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/running_process.png"))); // NOI18N
        jMenuItem2.setText("Restaurar DB");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void reporteventasporfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteventasporfechaActionPerformed
//reporteVentasPorFecha f= new reporteVentasPorFecha();
//desktopPane.add(f);
//f.show();
cargarFormulario(reporteVentasPorFecha.class);
 }//GEN-LAST:event_reporteventasporfechaActionPerformed

 private void jMIProd_TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProd_TodosActionPerformed
  productostodoView f = new productostodoView();
  VentanaPrincipal.add(f);
  f.show();
// centrarventana(f);
 }//GEN-LAST:event_jMIProd_TodosActionPerformed

 private void jMIProd_x_CategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProd_x_CategActionPerformed
  productoxlineaView f=null;
     try {
         f = new productoxlineaView();
     } catch (Exception ex) {
         Logger.getLogger(Principalview.class.getName()).log(Level.SEVERE, null, ex);
     }
  VentanaPrincipal.add(f);
  f.show();
// centrarventana(f);
 }//GEN-LAST:event_jMIProd_x_CategActionPerformed

 private void jMIProd_x_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProd_x_NombreActionPerformed
  productoxnombreView f = new productoxnombreView();
//  VentanaPrincipal.add(f);
//  f.show();
 centrarventana(f);
 }//GEN-LAST:event_jMIProd_x_NombreActionPerformed

 private void jMIProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProductosActionPerformed
  productomanview f = new productomanview();
  VentanaPrincipal.add(f);
  f.show();
// centrarventana(f);
 }//GEN-LAST:event_jMIProductosActionPerformed

 private void jMItemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemVentasActionPerformed
  VentasView f = new VentasView();
  centrarventana(f);
 // VentanaPrincipal.add(f);
 // f.show();
 }//GEN-LAST:event_jMItemVentasActionPerformed

 private void jMIEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEmpleadosActionPerformed
  empleadomanView f = new empleadomanView();
//  VentanaPrincipal.add(f);
//  f.show();
 centrarventana(f);
 }//GEN-LAST:event_jMIEmpleadosActionPerformed

 private void reportelistadepreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportelistadepreciosActionPerformed
//  try {
//   InformeView app = new InformeView("/pe/eth/Travisaapp/reports/reportedeprecios.jasper");
//   app.setBounds(0, 0, desktopPane.getWidth(), desktopPane.getHeight());
//   app.setVisible(true);
//   desktopPane.add(app);
//   app.setSelected(true);
//  } catch (Exception ex) {
//    //Logger.getLogger(reporteView.class.getName()).log(Level.SEVERE, null, ex);
//  }

 Connection cn=null;
        try {

	// Usando el archivo JRXML y el objeto Connection
	          cn = AccesoDB.getConnection();
	          Map pars = new HashMap();
                  String rutareporte="/pe/eth/Travisaapp/reports/reportedeprecios.jrxml";
                  InputStream isrepodeprecios=getClass().getResourceAsStream(rutareporte);
	          JasperReport rep = JasperCompileManager.compileReport(isrepodeprecios);
                  //reporte para mostrar
	          JasperPrint print = JasperFillManager.fillReport(rep, pars, cn);

	// Visualizando el Reporte
	          JasperViewer viewer = new JasperViewer(print, false);
	viewer.setTitle("Reporte de precios");
	viewer.setVisible(true);

	//JasperViewer.viewReport(print);
	
} catch (Exception ex) {
    //ex.printStackTrace();
	         //JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRORE", JOptionPane.ERROR_MESSAGE);
Mensaje.showError(rootPane,ex.getMessage());

}
finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
 
 }//GEN-LAST:event_reportelistadepreciosActionPerformed

    private void jMISlirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISlirActionPerformed
        // salir
        System.exit(0);
    }//GEN-LAST:event_jMISlirActionPerformed

    private void jMIClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClientesActionPerformed
ClientemanView f = new ClientemanView();
//  VentanaPrincipal.add(f);
 centrarventana(f);
  f.show();    }//GEN-LAST:event_jMIClientesActionPerformed

    
    private void ReporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteClientesActionPerformed
       Connection cn=null;
        try {

	// Usando el archivo JRXML y el objeto Connection
	          cn = AccesoDB.getConnection();
	          Map pars = new HashMap();
                  Empleado emp=(Empleado) Memoria.get("usuario");
               pars.put("USUARIO", emp.getNombre()+"," +emp.getApellidos());
               
                  String rutareporte="/pe/eth/Travisaapp/reports/reporteclientes.jrxml";
                  InputStream isrepoclientes=getClass().getResourceAsStream(rutareporte);
	          JasperReport rep = JasperCompileManager.compileReport(isrepoclientes);
                  //reporte para mostrar
	          JasperPrint print = JasperFillManager.fillReport(rep, pars, cn);

	// Visualizando el Reporte
	          JasperViewer viewer = new JasperViewer(print, false);
	viewer.setTitle("Reporte de Clientes");
	viewer.setVisible(true);

	//JasperViewer.viewReport(print);
	
} catch (Exception ex) {
    //ex.printStackTrace();
	         //JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRORE", JOptionPane.ERROR_MESSAGE);
Mensaje.showError(rootPane,ex.getMessage());

}
finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
 
    }//GEN-LAST:event_ReporteClientesActionPerformed

    private void jMIProd_x_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProd_x_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIProd_x_ProveedorActionPerformed

    private void jMICategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICategoriasActionPerformed
      CategoriamanView f = new CategoriamanView();
//  desktopPane.add(f);
VentanaPrincipal.add(f);
  //f.show();
    }//GEN-LAST:event_jMICategoriasActionPerformed

    private void jMIProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIProveedoresActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     try {
         BACKUPDATABASE();
         JOptionPane.showMessageDialog(this, "base de datos guardada exitosamente");
     } catch (IOException ex) {
         Logger.getLogger(Principalview.class.getName()).log(Level.SEVERE, null, ex);
     }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     try {
         RESTAURARBASEDEDATOS();
          JOptionPane.showMessageDialog(this, "base de datos restaurada exitosamente");
     } catch (IOException ex) {
         Logger.getLogger(Principalview.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

 /**
  * @param args the command line arguments
  */
 public static void main(String args[]) {
  /*
   * Set the Nimbus look and feel
   */
  //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
   * If Nimbus (introduced in Java SE 6) is not available, stay with the default
   * look and feel. For details see
   * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
   */
  try {
   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
    }
   }
  } catch (ClassNotFoundException ex) {
   java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>
  //</editor-fold>

  /*
   * Create and display the form
   */
  java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
   public void run() {
    new Principalview().setVisible(true);
   }
  });
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ReporteClientes;
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenuItem jMICategorias;
    private javax.swing.JMenuItem jMIClientes;
    private javax.swing.JMenuItem jMICompras;
    private javax.swing.JMenuItem jMIEmpleados;
    private javax.swing.JMenuItem jMIPedidos;
    private javax.swing.JMenuItem jMIProd_Todos;
    private javax.swing.JMenuItem jMIProd_x_Categ;
    private javax.swing.JMenuItem jMIProd_x_Nombre;
    private javax.swing.JMenuItem jMIProd_x_Proveedor;
    private javax.swing.JMenuItem jMIProductos;
    private javax.swing.JMenuItem jMIProveedores;
    private javax.swing.JMenuItem jMISlir;
    private javax.swing.JMenuItem jMItemVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblprincipal;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem reportelistadeprecios;
    private javax.swing.JMenuItem reporteventasporfecha;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario(Class<?> aClass) {

         try {
      // Buscar una instancia
      JInternalFrame view = null;
      for (JInternalFrame frame : VentanaPrincipal.getAllFrames()) {
        if (aClass.isInstance(frame)) {
          view = frame;
          break;
        }
      }
      // Crear la instancia
      if (view == null) {
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        VentanaPrincipal.add(view);
      }
      // Hacerlo visible
      view.setVisible(true);
      view.setSelected(true);
      view.setMaximum(true);
    } catch (Exception e) {
    }

    }

    private void centrarventana(JInternalFrame frame) {
VentanaPrincipal.add(frame);
Dimension d=VentanaPrincipal.getSize();
Dimension dframe=frame.getSize();
frame.setLocation((d.width-dframe.height)/2,(d.height-dframe.width)/2);
frame.show();
    }

    private void BACKUPDATABASE() throws IOException {
Process p = Runtime.getRuntime().exec("C:\\wamp64\\bin\\mysql\\mysql5.7.19\\bin\\mysqldump -u root travisa2");
 
InputStream is = p.getInputStream();//Pedimos la entrada
FileOutputStream fos=null;
     try {
         fos = new FileOutputStream("backup_travisa.sql"); //creamos el archivo para le respaldo
     } catch (FileNotFoundException ex) {
         Logger.getLogger(Principalview.class.getName()).log(Level.SEVERE, null, ex);
     }
byte[] buffer = new byte[1000]; //Creamos una variable de tipo byte para el buffer
 
int leido = is.read(buffer); //Devuelve el número de bytes leídos o -1 si se alcanzó el final del stream.
while (leido > 0) {
	fos.write(buffer, 0, leido);//Buffer de caracteres, Desplazamiento de partida para empezar a escribir caracteres, Número de caracteres para escribir
	leido = is.read(buffer);
}
 
fos.close();//Cierra respaldo   
        
    }

    private void RESTAURARBASEDEDATOS() throws IOException {
Process p = Runtime.getRuntime().exec("mysql -u root  travisa2");
 
        OutputStream os = p.getOutputStream(); //Pedimos la salida
FileInputStream fis=null;
     try {
         fis = new FileInputStream("backup_pruebas.sql"); //creamos el archivo para le respaldo
     } catch (FileNotFoundException ex) {
         Logger.getLogger(Principalview.class.getName()).log(Level.SEVERE, null, ex);
     }
byte[] buffer = new byte[1000]; //Creamos una variable de tipo byte para el buffer
 
int leido = fis.read(buffer);//Devuelve el número de bytes leídos o -1 si se alcanzó el final del stream.
while (leido > 0) {
	os.write(buffer, 0, leido); //Buffer de caracteres, Desplazamiento de partida para empezar a escribir caracteres, Número de caracteres para escribir
	leido = fis.read(buffer);
}
 
os.flush(); //vacía los buffers de salida
os.close(); //Cierra
fis.close(); //Cierra respaldo

    }

  
}
