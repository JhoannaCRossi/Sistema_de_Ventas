
package vistas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.DetalleVentas;
import modelo.EntidadCliente;
import modelo.EntidadProducto;
import modelo.EntidadVendedr;
import modelo.EntidadVentas;
import modelo.Producto;
import modelo.Vendedor;
import vistas.LoginForm;
import modelo.Ventas;



/**
 *
 * @author jhoa_
 */
public class VentasForm extends javax.swing.JInternalFrame {
    
    Cliente cliente = new Cliente();
    Producto producto = new Producto();
    DefaultTableModel modelo = new DefaultTableModel();
    EntidadProducto entidadProd = new EntidadProducto();
    Ventas ventas = new Ventas();
    EntidadVentas entidadVenta = new EntidadVentas();
    DetalleVentas detalleVentas = new DetalleVentas();
    EntidadCliente client = new EntidadCliente();
    EntidadVendedr vended = new EntidadVendedr();
    Vendedor vendedorId = new Vendedor();
    
    int idProducto, cantidadProducto, item, id;
    double totalPagar, precioProducto;
    public static String ventaRegistrada;
    
    
    public VentasForm() {
        initComponents();
        generarSerie();
        fecha();
        generarIDVendedor();
        txtVende.setText(""+ LoginForm.entidadV.getId());
    }
    
    public void fecha(){
        Calendar calendar = new GregorianCalendar();
        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        txtFecha.setText(""+dia+"-"+(mes+1)
                +"-"+ano);
    }
    public void generarSerie(){
        int ultimaSerie = entidadVenta.nroSerieVentas();
        
        if(ultimaSerie >= 0){
            int idVenta = ultimaSerie;  
            txtSerie.setText("00000" + (idVenta+1));
        }else{
            txtSerie.setText("000001");
        }
    }
    
    public void generarIDVendedor(){
        id = vended.getId();
        
        if(id == 1){
            txtVende.setText("Empleado 1");
        }else if(id == 2){
            txtVende.setText("Empleado 2");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        txtCodProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        spinnerCantidad = new javax.swing.JSpinner();
        buttonCodCliente = new javax.swing.JButton();
        buttonCodProducto = new javax.swing.JButton();
        buttonAgregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtVende = new javax.swing.JTextField();
        buttonEliminar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        buttonVendedor = new javax.swing.JButton();
        txtVendedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        buttonCancelarVenta = new javax.swing.JButton();
        buttonGenerarVenta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modulo Ventas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panaderia.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PUNTO DE VENTA \"BAKERY\"");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Venta de Productos Pasteleros");

        jLabel4.setText("Teléfono : 8030-45678-68");

        jLabel5.setText("NRO SERIE: ");

        txtSerie.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("COD CLIENTE: ");

        jLabel8.setText("COD PRODUCTO:");

        jLabel9.setText("PRECIO:");

        jLabel10.setText("CANTIDAD:");

        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        buttonCodCliente.setText("Buscar");
        buttonCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCodClienteActionPerformed(evt);
            }
        });

        buttonCodProducto.setText("Buscar");
        buttonCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCodProductoActionPerformed(evt);
            }
        });

        buttonAgregar.setText("Agregar");
        buttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarActionPerformed(evt);
            }
        });

        jLabel11.setText("CLIENTE:");

        jLabel12.setText("PRODUCTO:");

        jLabel13.setText("STOCK:");

        jLabel14.setText("VENDE:");

        txtCliente.setEditable(false);

        txtProducto.setEditable(false);

        txtStock.setEditable(false);

        txtVende.setEnabled(false);

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        txtFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        buttonVendedor.setText("Buscar");
        buttonVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVendedorActionPerformed(evt);
            }
        });

        txtVendedor.setEditable(false);
        txtVendedor.setEnabled(false);

        jLabel15.setText("FECHA:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodProducto)
                                    .addComponent(txtPrecio)
                                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonCodProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(buttonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)))
                            .addComponent(jLabel11)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVendedor)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(txtStock)
                        .addComponent(txtVende))
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCodCliente)
                        .addComponent(jLabel11)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCodProducto)
                    .addComponent(jLabel12)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAgregar)
                    .addComponent(jLabel13)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtVende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonVendedor)
                            .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(17, 41, Short.MAX_VALUE))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "CDO", "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonCancelarVenta.setText("CANCELAR VENTA");
        buttonCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarVentaActionPerformed(evt);
            }
        });

        buttonGenerarVenta.setText("GENERAR VENTA");
        buttonGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerarVentaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dinero.png"))); // NOI18N
        jLabel6.setText("TOTAL A PAGAR:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(buttonCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(buttonGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel6)
                .addGap(45, 45, 45)
                .addComponent(txtTotal)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarVentaActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarVentaActionPerformed

    private void buttonCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCodClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_buttonCodClienteActionPerformed

    private void buttonCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCodProductoActionPerformed
        buscarProducto();
    }//GEN-LAST:event_buttonCodProductoActionPerformed

    private void buttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarActionPerformed
        agregarProducto();
    }//GEN-LAST:event_buttonAgregarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
       eliminarProducto();
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void buttonGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerarVentaActionPerformed
        if(txtTotal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar datos.");
        }else{
            guardarVenta();
            guardarDetalle();
            actualizarStock();
            reporteVenta();
            limpiarForm();
            limpiarTabla();
            JOptionPane.showMessageDialog(this, "Se realizo con éxito.");
            generarSerie();
            
        }
    }//GEN-LAST:event_buttonGenerarVentaActionPerformed

    public void actualizarStock(){
    
        for (int i = 0; i < modelo.getRowCount(); i++) {
            
            idProducto = Integer.parseInt(tabla.getValueAt(i, 1).toString());
            cantidadProducto = Integer.parseInt(tabla.getValueAt(i, 3).toString());
            
            entidadProd = producto.listarId(idProducto);
            
            int stockActual = entidadProd.getStock() - cantidadProducto;
            
            producto.actualizarStock(stockActual, idProducto);
        }
    }
    private void buttonVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVendedorActionPerformed
        buscarVendedor();
    }//GEN-LAST:event_buttonVendedorActionPerformed
    
    public void guardarVenta(){
        
        int idVendedor = Integer.parseInt(txtVende.getText());
        int idCliente = client.getId();
        String serieVenta = txtSerie.getText();
        String fechaVenta = txtFecha.getText();
        double montoVenta = totalPagar;
        String estado = "Activa";
        
        ventas.setSerie(serieVenta);
        ventas.setFecha(fechaVenta);
        ventas.setMonto(montoVenta);
        ventas.setEstado(estado);
        ventas.setId_cliente(idCliente);
        ventas.setId_vendedor(idVendedor);
        
        entidadVenta.guardarVentas(ventas);
    }
    
    public void guardarDetalle(){
        String idVentas = entidadVenta.idVentas();
        int idVenta = Integer.parseInt(idVentas);
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            int idProducto = Integer.parseInt(tabla.getValueAt(i, 1).toString());
            int cantidad = Integer.parseInt(tabla.getValueAt(i, 3).toString());
            double precio = Double.parseDouble(tabla.getValueAt(i, 4).toString());
            detalleVentas.setId_ventas(idVenta);
            detalleVentas.setId_producto(idProducto);
            detalleVentas.setCantidadVentas(cantidad);
            detalleVentas.setPrecioVenta(precio);
            
            entidadVenta.guardarDetalleVentas(detalleVentas);
        }
    }
    
    public void eliminarProducto(){
        int fila = tabla.getSelectedRow();
        double precioEliminado = Double.parseDouble(tabla.getValueAt(fila, 5).toString());
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla");
        }else{
            
            double precioTotal = Double.parseDouble(txtTotal.getText());
            double precioRestado = precioTotal - precioEliminado;
            txtTotal.setText(""+precioRestado);
            modelo.removeRow(fila);
        }
    }
    public void agregarProducto(){
        double totalCompra = 0;
        
        modelo = (DefaultTableModel)tabla.getModel();
        item++;
        idProducto = Integer.parseInt(txtCodProducto.getText());
        String nombreProducto = txtProducto.getText();
        precioProducto = Double.parseDouble(txtPrecio.getText());
        cantidadProducto = Integer.parseInt(spinnerCantidad.getValue().toString());
        int stockProducto = Integer.parseInt(txtStock.getText());
        totalCompra = cantidadProducto * precioProducto;
        
        ArrayList lista = new ArrayList();
        if(stockProducto>0){
            lista.add(item);
            lista.add(idProducto);
            lista.add(nombreProducto);
            lista.add(cantidadProducto);
            lista.add(precioProducto);
            lista.add(totalCompra);

            Object[] objeto = new Object[6];
                objeto[0] = lista.get(0);
                objeto[1] = lista.get(1);
                objeto[2] = lista.get(2);
                objeto[3] = lista.get(3);
                objeto[4] = lista.get(4);
                objeto[5] = lista.get(5);
                
            modelo.addRow(objeto);
            tabla.setModel(modelo);
            
            calcularTotal();
        }else{
            JOptionPane.showMessageDialog(this, "Stock del Producto no disponible.");
        }
    }
    
    public void calcularTotal(){
        totalPagar = 0;
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            cantidadProducto = Integer.parseInt(tabla.getValueAt(i, 3).toString());
            precioProducto = Double.parseDouble(tabla.getValueAt(i, 4).toString());
            totalPagar = totalPagar + (cantidadProducto * precioProducto);
        
        }
        txtTotal.setText(""+totalPagar);
    }

    public void buscarProducto(){
        int id = Integer.parseInt(txtCodProducto.getText());
        if(txtCodProducto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el código del producto.");
        }else{
            EntidadProducto produ = producto.listarId(id);
            if(produ.getId()!= 0){
                txtProducto.setText(produ.getNombres());
                txtPrecio.setText(""+produ.getPrecio());
                txtStock.setText(""+produ.getStock());
            }else{
                JOptionPane.showMessageDialog(this, "Producto no encontrado.");
                txtCodProducto.requestFocus();
            }
        }
    }
    public void buscarCliente(){
        int respuesta;
        String codCliente = txtCodCliente.getText();
        if(txtCodCliente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar código de cliente.");
        }else{
            client = cliente.listarId(codCliente);
            
            if(client.getDni() != null){
                txtCliente.setText(client.getNombres());
                txtCodProducto.requestFocus();
            }else{
                respuesta = JOptionPane.showConfirmDialog(this, "Cliente no registrado, Desea Registrar?");
                if(respuesta == 0){
                    ClienteForm cf = new ClienteForm();
                    Principal.ventanaPrincipal.add(cf);
                    
                    cf.setVisible(true);
                }
            }
        }
    }
    
    public void reporteVenta(){
        int venta_id_venta = Integer.parseInt(entidadVenta.idVentas());
        
        ventaRegistrada = "";
        ventaRegistrada += "N°: " + venta_id_venta + "\n\n";
        ventaRegistrada += "Cliente: " + client.getNombres() + "\t\t";
        ventaRegistrada += "Vendedor: " + LoginForm.entidadV.getNames() + "\t\t";
        ventaRegistrada += "\n\nIdProducto\tCódigo\tProducto\tCantidad\tPrecio\tSub Total\n";
        for (int i = 0; i < modelo.getRowCount(); i++) {
            ventaRegistrada += Integer.parseInt(modelo.getValueAt(i, 0).toString()) + "\t";
            ventaRegistrada += Integer.parseInt(modelo.getValueAt(i, 1).toString()) + "\t";
            ventaRegistrada += modelo.getValueAt(i, 2).toString() + "\t";        
            ventaRegistrada += Integer.parseInt(modelo.getValueAt(i, 3).toString()) + "\t";
            ventaRegistrada += Double.parseDouble(modelo.getValueAt(i, 4).toString()) + "\t";
            ventaRegistrada += Double.parseDouble(modelo.getValueAt(i, 5).toString()) + "\t";
            ventaRegistrada += "\n";

        }
        ventaRegistrada += "\t\t\tTotal\t" + txtTotal.getText();
    }
    
    public void buscarVendedor(){
        int respuesta;
        int codVendedor = Integer.parseInt(txtVende.getText());
        if(txtVende.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar código de vendedor.");
        }else{
            vended = vendedorId.listarId(codVendedor);
            
            if(vended.getId() != 0){
                txtVendedor.setText(vended.getNames());
                txtVendedor.requestFocus();
            }else{
                respuesta = JOptionPane.showConfirmDialog(this, "Vendedor no registrado, Desea Registrar?");
                if(respuesta == 0){
                    VendedorForm cf = new VendedorForm();
                    Principal.ventanaPrincipal.add(cf);
                    
                    cf.setVisible(true);
                }
            }
        }
    }
    
    public void limpiarForm(){
        txtCodCliente.setText("");
        txtCodProducto.setText("");
        txtPrecio.setText("");
        txtFecha.setText("");
        spinnerCantidad.setValue(0);
        txtCliente.setText("");
        txtStock.setText("");
        txtProducto.setText("");
        txtVende.setText("");
        txtVendedor.setText("");
        txtTotal.setText("");
        txtCodCliente.requestFocus();
    }
    
    public void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonCancelarVenta;
    private javax.swing.JButton buttonCodCliente;
    private javax.swing.JButton buttonCodProducto;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGenerarVenta;
    private javax.swing.JButton buttonVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVende;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
