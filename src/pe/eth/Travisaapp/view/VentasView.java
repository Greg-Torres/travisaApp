package pe.eth.Travisaapp.view;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.eth.Travisaapp.controller.ClienteController;
import pe.eth.Travisaapp.controller.LogonController;
import pe.eth.Travisaapp.controller.ProductoController;
import pe.eth.Travisaapp.controller.VentasController;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.domain.DetalleVenta;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.domain.Producto;
import pe.eth.Travisaapp.domain.ventas;
import pe.eth.Travisaapp.util.Memoria;


public class VentasView extends javax.swing.JInternalFrame {
static int r;
    DefaultTableModel modelotabla;
       int items;
       public void tabla(){
        setTitle("REGISTRAR VENTA DE PRODUCTOS");
        //establecer columnas a la bd
        String[]cabezera={"ITEMS","COD PRODUCTO","NOMBRE","CANTIDAD","PRECIO","SUBTOTAL"};
        //estableciendo el modelo de la tabla
       modelotabla= new DefaultTableModel(null, cabezera);
        //asignar modelo a la tabla
        tabladetalle.setModel(modelotabla);
        
    }
    public VentasView() {
        initComponents();
        tabla();
        fecha();
cargarEmpleado();
generaridventa();
   // float TOP_ALIGNMENT1 = JInternalFrame.TOP_ALIGNMENT;
   
txtidventa.setEnabled(false);
//txtCanti;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneldatosventa = new javax.swing.JPanel();
        lblidcliente = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNomCliente = new javax.swing.JTextField();
        lblnombrecli = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        lblempleado = new javax.swing.JLabel();
        lblnombreEmpleado = new javax.swing.JLabel();
        panelproductos = new javax.swing.JPanel();
        lblprecio = new javax.swing.JLabel();
        lblstock = new javax.swing.JLabel();
        lblcodprod = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        lblinicialesprod = new javax.swing.JLabel();
        lblcantprod = new javax.swing.JLabel();
        txtiniciales = new javax.swing.JTextField();
        lbldescrip_prod = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<>();
        btnagregardetalle = new javax.swing.JButton();
        btnquitardetalle = new javax.swing.JButton();
        btnregistraventa = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtObservacion = new javax.swing.JTextField();
        txtCanti = new javax.swing.JSpinner();
        paneldetalleventa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        lbltotal = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        Panelv = new javax.swing.JPanel();
        jPanelNroBoleta = new javax.swing.JPanel();
        txtidventa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnrodoc = new javax.swing.JTextField();
        LblLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setMaximizable(true);
        setTitle("R E G I S T R A R   V E N T A S");

        paneldatosventa.setBackground(new java.awt.Color(204, 204, 204));
        paneldatosventa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblidcliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblidcliente.setText("ID Cliente");

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfecha.setText("Fecha");

        txtIdCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(0, 0, 255));
        txtIdCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdClienteMouseClicked(evt);
            }
        });
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyReleased(evt);
            }
        });

        txtNomCliente.setForeground(new java.awt.Color(0, 0, 255));

        lblnombrecli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombrecli.setText("Nombres");

        txtfecha.setForeground(new java.awt.Color(0, 0, 255));
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        lblempleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblempleado.setText("Vendedor");

        lblnombreEmpleado.setForeground(new java.awt.Color(0, 0, 255));
        lblnombreEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout paneldatosventaLayout = new javax.swing.GroupLayout(paneldatosventa);
        paneldatosventa.setLayout(paneldatosventaLayout);
        paneldatosventaLayout.setHorizontalGroup(
            paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldatosventaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidcliente)
                    .addComponent(lblnombrecli))
                .addGap(44, 44, 44)
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneldatosventaLayout.createSequentialGroup()
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblfecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblempleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblnombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneldatosventaLayout.setVerticalGroup(
            paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldatosventaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblidcliente)
                        .addComponent(lblfecha)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblempleado))
                    .addComponent(lblnombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombrecli)
                    .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelproductos.setBackground(new java.awt.Color(204, 204, 204));
        panelproductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblprecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblprecio.setText("Precio");

        lblstock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblstock.setText("Stock");

        lblcodprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcodprod.setText("Codigo");

        txtprecio.setForeground(new java.awt.Color(0, 0, 255));
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtStock.setForeground(new java.awt.Color(0, 0, 255));
        txtStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStockKeyReleased(evt);
            }
        });

        lblinicialesprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblinicialesprod.setText("Iniciales");

        lblcantprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcantprod.setText("Cantidad");

        txtiniciales.setForeground(new java.awt.Color(0, 0, 204));
        txtiniciales.setCaretColor(new java.awt.Color(255, 0, 0));
        txtiniciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinicialesActionPerformed(evt);
            }
        });
        txtiniciales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinicialesKeyPressed(evt);
            }
        });

        lbldescrip_prod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldescrip_prod.setText("Descripcion");

        lstProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        lstProductos.setForeground(new java.awt.Color(0, 0, 255));
        lstProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstProductos);

        btnagregardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/add.png"))); // NOI18N
        btnagregardetalle.setText("Agregar Detalle");
        btnagregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregardetalleActionPerformed(evt);
            }
        });

        btnquitardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/eliminar.png"))); // NOI18N
        btnquitardetalle.setText("Quitar Detalle");
        btnquitardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitardetalleActionPerformed(evt);
            }
        });

        btnregistraventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/grabar.png"))); // NOI18N
        btnregistraventa.setText("Registrar Venta");
        btnregistraventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraventaActionPerformed(evt);
            }
        });

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/printer.png"))); // NOI18N
        btnimprimir.setText("Imprimir");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/salir.png"))); // NOI18N
        btnCerrar.setText("Salir");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtObservacion.setForeground(new java.awt.Color(0, 0, 255));
        txtObservacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout panelproductosLayout = new javax.swing.GroupLayout(panelproductos);
        panelproductos.setLayout(panelproductosLayout);
        panelproductosLayout.setHorizontalGroup(
            panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelproductosLayout.createSequentialGroup()
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprecio)
                            .addComponent(lblstock, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcantprod, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCanti, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelproductosLayout.createSequentialGroup()
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldescrip_prod)
                            .addComponent(lblcodprod)
                            .addComponent(lblinicialesprod))
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelproductosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtiniciales, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelproductosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnquitardetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnregistraventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnimprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnagregardetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelproductosLayout.setVerticalGroup(
            panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductosLayout.createSequentialGroup()
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelproductosLayout.createSequentialGroup()
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblinicialesprod)
                            .addComponent(txtiniciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcodprod)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldescrip_prod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblprecio)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcantprod)
                            .addComponent(txtCanti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelproductosLayout.createSequentialGroup()
                        .addComponent(btnagregardetalle)
                        .addGap(1, 1, 1)
                        .addComponent(btnquitardetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnregistraventa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnimprimir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneldetalleventa.setBackground(new java.awt.Color(204, 204, 204));
        paneldetalleventa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tabladetalle.setBackground(new java.awt.Color(102, 204, 255));
        tabladetalle.setForeground(new java.awt.Color(0, 0, 255));
        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladetalle);

        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/money_1.png"))); // NOI18N
        lbltotal.setText("Total");

        txttotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout paneldetalleventaLayout = new javax.swing.GroupLayout(paneldetalleventa);
        paneldetalleventa.setLayout(paneldetalleventaLayout);
        paneldetalleventaLayout.setHorizontalGroup(
            paneldetalleventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetalleventaLayout.createSequentialGroup()
                .addGroup(paneldetalleventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldetalleventaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneldetalleventaLayout.setVerticalGroup(
            paneldetalleventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetalleventaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneldetalleventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotal)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panelv.setLayout(new java.awt.GridLayout(5, 0));

        jPanelNroBoleta.setBackground(new java.awt.Color(204, 204, 204));
        jPanelNroBoleta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelNroBoleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtidventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidventaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("NRO BOLETA");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("RUC N:");

        txtnrodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnrodocActionPerformed(evt);
            }
        });

        LblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/inv marin.png"))); // NOI18N
        LblLogo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelNroBoletaLayout = new javax.swing.GroupLayout(jPanelNroBoleta);
        jPanelNroBoleta.setLayout(jPanelNroBoletaLayout);
        jPanelNroBoletaLayout.setHorizontalGroup(
            jPanelNroBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNroBoletaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelNroBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelNroBoletaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnrodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNroBoletaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidventa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        jPanelNroBoletaLayout.setVerticalGroup(
            jPanelNroBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNroBoletaLayout.createSequentialGroup()
                .addGap(23, 49, Short.MAX_VALUE)
                .addGroup(jPanelNroBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnrodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNroBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)))
            .addComponent(LblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelproductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneldatosventa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panelv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneldetalleventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNroBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(Panelv, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelNroBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneldatosventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneldetalleventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // cerrar
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyReleased
       
    }//GEN-LAST:event_txtStockKeyReleased

    private void btnagregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregardetalleActionPerformed
   agregarItemaTabla();

    }//GEN-LAST:event_btnagregardetalleActionPerformed

    private void btnquitardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitardetalleActionPerformed
    borrarFilaTablaPedidos();
totalpedido();
    }//GEN-LAST:event_btnquitardetalleActionPerformed

    private void btnregistraventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraventaActionPerformed
        try {
            RegistrarVenta();
            limpiarcampos();
         generaridventa();
            vaciartabla();
        } catch (SQLException ex) {
            Logger.getLogger(VentasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnregistraventaActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
 buscarclienteporcodigo();
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtinicialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinicialesActionPerformed
Productosenlalista();
    }//GEN-LAST:event_txtinicialesActionPerformed

    private void txtinicialesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinicialesKeyPressed

    }//GEN-LAST:event_txtinicialesKeyPressed

    private void lstProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductosValueChanged
      asignarproductosentext();

    }//GEN-LAST:event_lstProductosValueChanged

    private void txtIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyPressed
 
    }//GEN-LAST:event_txtIdClienteKeyPressed

    private void txtIdClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyReleased
 
    }//GEN-LAST:event_txtIdClienteKeyReleased

    private void txtIdClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdClienteMouseClicked
 //buscarclienteporcodigo();
    }//GEN-LAST:event_txtIdClienteMouseClicked

    private void txtnrodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnrodocActionPerformed
     BuscarClientexDniRuc();
    }//GEN-LAST:event_txtnrodocActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txtidventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidventaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblLogo;
    private javax.swing.JPanel Panelv;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnagregardetalle;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnquitardetalle;
    private javax.swing.JButton btnregistraventa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelNroBoleta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcantprod;
    private javax.swing.JLabel lblcodprod;
    private javax.swing.JLabel lbldescrip_prod;
    private javax.swing.JLabel lblempleado;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblidcliente;
    private javax.swing.JLabel lblinicialesprod;
    private javax.swing.JLabel lblnombreEmpleado;
    private javax.swing.JLabel lblnombrecli;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lblstock;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JList<String> lstProductos;
    private javax.swing.JPanel paneldatosventa;
    private javax.swing.JPanel paneldetalleventa;
    private javax.swing.JPanel panelproductos;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JSpinner txtCanti;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtidventa;
    private javax.swing.JTextField txtiniciales;
    private javax.swing.JTextField txtnrodoc;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
ArrayList<Producto> productos;
    private void Productosenlalista() {
        productos=ProductoController.listarProducto(txtiniciales.getText());
        DefaultListModel modelo= new  DefaultListModel();
        for(Producto a:productos){
           modelo.addElement(a.getDESCRIPCION());
        }
       lstProductos.setModel(modelo); 
    }

    private void asignarproductosentext() {
   productos=ProductoController.listarProducto(String.valueOf(lstProductos.getSelectedValue()));
        for(Producto x:productos){
          txtcodigo.setText(x.getIDPRODUCTO()+"");
          txtDescripcion.setText(x.getDESCRIPCION());
          txtObservacion.setText(x.getObservacion());
          txtprecio.setText(x.getPRECIOVENTA()+"");
          txtStock.setText(String.valueOf(x.getSTOCK()));
          txtcodigo.setEditable(false);
          txtDescripcion.setEditable(false);
          txtprecio.setEditable(false);
          txtStock.setEditable(false);
          txtObservacion.setEditable(false);
        }
    }

    private void agregarItemaTabla() {
     items=items+1;
if(txtcodigo.getText().trim().length()!=0 && Integer.parseInt(txtCanti.getValue().toString())!=0){
       //  int cantidad= Integer.parseInt(txtcantidad.getText());
         int cantidad= Integer.parseInt(txtCanti.getValue().toString());
         double pr=Double.parseDouble(txtprecio.getText());
         double subtotal=cantidad*pr;
         modelotabla.addRow(new Object[]{ items,txtcodigo.getText(),txtDescripcion.getText(),txtCanti.getValue().toString()
         ,txtprecio.getText(),subtotal});
         
     totalpedido();
     txtDescripcion.setText("");
     txtprecio.setText("");
     txtStock.setText("");
     txtcodigo.setText("");
     txtiniciales.setText("");
     txtObservacion.setText("");
     lstProductos.removeAll();
    // tabladetalle.setEnabled(false);
     }
     else{
       mensaje("ingrese datos del articulo");  
     }
    }

    private void totalpedido() {
            
  double total=0;
  for(int i=0;i<tabladetalle.getRowCount();i++){
      total= total+(double)tabladetalle.getValueAt(i, 5);
      
  }
  txttotal.setText(String.valueOf(total));
    }

    private void mensaje(String msg) {
 JOptionPane.showMessageDialog(null, msg);
    }

    private void borrarFilaTablaPedidos() {
          if(this.tabladetalle.getSelectedRow()>=0){
          modelotabla.removeRow(tabladetalle.getSelectedRow());
          
      }
      else{
          mensaje("seleccione filas  a quitar..!!");
      }   
    }

    private void fecha() {
        Date ahora= new Date(System.currentTimeMillis());
        SimpleDateFormat formateador= new SimpleDateFormat("dd-MM-yyy");
        txtfecha.setText(formateador.format(ahora));
        txtfecha.setEditable(false);
    }

    private void buscarclienteporcodigo() {
     Cliente clien= ClienteController.BuscarClientexCodigo(txtIdCliente.getText());
  if (clien != null) {
          
 txtNomCliente.setText(clien.getNOMBRE());
        txtnrodoc.setText(clien.getRUCDNI());
        requestFocus();
    txtNomCliente.setEditable(false);
    txtnrodoc.setEditable(false);
        }
         else{
              mensaje2("cliente no existe con ese codigo..¡¡ ,desea registrarlo ?");
        
              if(r==0){
                ClientemanView cmv= new ClientemanView();
                   Principalview.VentanaPrincipal.add(cmv);
                cmv.setVisible(true);
              }
         }
       
    }

    private void RegistrarVenta() throws SQLException {
       // VentasController Objpedido;
        ventas ve;
        //si la jtable tiene registros encapsulamos datos tanto 
        //para encabezado de pedido y detalles de pedido
        if(tabladetalle.getRowCount()>0){
        ve= new ventas();
    //    int idventa= Integer.parseInt(txtidventa.getText());
        int idventa= Integer.parseInt(txtidventa.getText());
      ve.setIDVENTA(idventa);
      ve.setIDUSUARIO(bean.getIdUsuario());
      ve.setFECHA(txtfecha.getText());
      ve.setIDCLIENTE(txtIdCliente.getText());
      ve.setTOTAL(Double.parseDouble(txttotal.getText()));
        //DaoPedido.registar(ve);
        //numero de filas del jtable
        int nfilas= tabladetalle.getRowCount();
        //objeto arraylist para agregar conjunto de articulos que se insertaran en
        //la tabla detalle
        ArrayList<DetalleVenta> list= new ArrayList<DetalleVenta>();
        DetalleVenta det;
        for(int i=0;i<nfilas;i++){
            det = new DetalleVenta();
            det.setIDVENTA(Integer.parseInt(txtidventa.getText()));
            det.setIDPRODUCTO(String.valueOf(tabladetalle.getValueAt(i,1)));
            det.setCANTIDAD(Integer.parseInt(String.valueOf(tabladetalle.getValueAt(i, 3))));
             det.setPRECIO(Double.parseDouble(String.valueOf(tabladetalle.getValueAt(i, 4))));
            det.setIMPORTE(Double.parseDouble(String.valueOf(tabladetalle.getValueAt(i, 5))));
            list.add(det);
        }
        //entregamos como parametros los objetos para el encabezado del pedido
        // que se insertara una sola vez en la tabla pedido y la lista se insertara
        //en funcion a la cantidad de registros que haya en la tabla
        boolean f=VentasController.registrarPedido(ve, list);
        if(f){
            mensaje("venta registrada");
            
        }
        }
        else{
            mensaje("ingrese datos a la tabla");
        }

    }
Empleado bean;
    public void cargarEmpleado() {
 
     bean = (Empleado) Memoria.get("usuario");
   // String titulo = "TRAVISA   [Usuario:" + bean.getUsuario() + "]";
  mostrarnombreEmpleado();
    }

    private void mostrarnombreEmpleado() {
       lblnombreEmpleado.setText(bean.getNombre()+","+bean.getApellidos());
    }

    private void BuscarClientexDniRuc() {
Cliente clien= ClienteController.BuscarClientexDni(txtnrodoc.getText());
       
        txtNomCliente.setText(clien.getNOMBRE());
        txtIdCliente.setText(clien.getIDCLIENTE());
    }

   private static void mensaje2(String msj) {
          r=     JOptionPane.showConfirmDialog(null,msj);

    }

    private void limpiarcampos() {
txtcodigo.setText("");
txtNomCliente.setText("");
txtnrodoc.setText("");
lstProductos.setListData(new String[0]);
txtIdCliente.setText("");
txttotal.setText("");
txtidventa.setText("");
//tabladetalle.removeAll();
    }

    private void vaciartabla() {
      int numDatos = modelotabla.getRowCount();
for (int i = 0; i < numDatos; i++) {
 modelotabla.removeRow(0);
}
    }

//    private void generarSerie() {
//   String serie = vdao.NroSerieVentas();
//        if (serie == null) {
//            txtidventa.setText("0000001");
//        } else {
//            int increment = Integer.parseInt(serie);
//            increment = increment + 1;
//            txtidventa.setText("000000" + increment);
//        }
//    }

    private void generaridventa() {
//txtidventa.setText(String.valueOf("00000"+VentasController.obteneridventa()));  
txtidventa.setText(String.valueOf(VentasController.obteneridventa()));  
    
    }
  
    
}
