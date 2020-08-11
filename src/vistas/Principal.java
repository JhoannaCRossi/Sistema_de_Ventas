
package vistas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 * @author jhoa_
 */
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        ventanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAyuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuGenerarVenta = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuClient = new javax.swing.JMenuItem();
        menuProducto = new javax.swing.JMenuItem();
        menuVendedor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuReporteVentas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuAtribuciones = new javax.swing.JMenuItem();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ventanaPrincipalLayout = new javax.swing.GroupLayout(ventanaPrincipal);
        ventanaPrincipal.setLayout(ventanaPrincipalLayout);
        ventanaPrincipalLayout.setHorizontalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        ventanaPrincipalLayout.setVerticalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu (1).png"))); // NOI18N
        menuAyuda.setText("Menu");
        menuAyuda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pregunta.png"))); // NOI18N
        jMenuItem1.setText("Ayuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAyuda.add(jMenuItem1);

        menuSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuAyuda.add(menuSalir);

        jMenuBar1.add(menuAyuda);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        jMenu2.setText("Ventas");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuGenerarVenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        menuGenerarVenta.setText("Generar Venta");
        menuGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGenerarVentaActionPerformed(evt);
            }
        });
        jMenu2.add(menuGenerarVenta);

        jMenuBar1.add(jMenu2);

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento.png"))); // NOI18N
        menuCliente.setText("Mantenimiento");
        menuCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuClient.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/persona.png"))); // NOI18N
        menuClient.setText("Cliente");
        menuClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientActionPerformed(evt);
            }
        });
        menuCliente.add(menuClient);

        menuProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/orden.png"))); // NOI18N
        menuProducto.setText("Producto");
        menuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductoActionPerformed(evt);
            }
        });
        menuCliente.add(menuProducto);

        menuVendedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedor.png"))); // NOI18N
        menuVendedor.setText("Vendedor");
        menuVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendedorActionPerformed(evt);
            }
        });
        menuCliente.add(menuVendedor);

        jMenuBar1.add(menuCliente);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafico.png"))); // NOI18N
        jMenu4.setText("Reportes");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuReporteVentas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analisis.png"))); // NOI18N
        menuReporteVentas.setText("Reporte de Ventas");
        menuReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReporteVentasActionPerformed(evt);
            }
        });
        jMenu4.add(menuReporteVentas);

        jMenuBar1.add(jMenu4);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alert.png"))); // NOI18N
        jMenu1.setText("Acerca de");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        menuAtribuciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuAtribuciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        menuAtribuciones.setText("Atribuciones");
        menuAtribuciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtribucionesActionPerformed(evt);
            }
        });
        jMenu1.add(menuAtribuciones);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ventanaPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGenerarVentaActionPerformed
        VentasForm vf = new VentasForm();
        centrarVentanaPrincipal(vf);
    }//GEN-LAST:event_menuGenerarVentaActionPerformed

    private void menuClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientActionPerformed
        
        ClienteForm cf = new ClienteForm();
        centrarVentanaPrincipal(cf);
    }//GEN-LAST:event_menuClientActionPerformed

    private void menuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductoActionPerformed
        ProductosForm producto = new ProductosForm();
        centrarVentanaPrincipal(producto);
    }//GEN-LAST:event_menuProductoActionPerformed

    private void menuVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendedorActionPerformed
        VendedorForm vf = new VendedorForm();
        centrarVentanaPrincipal(vf);
    }//GEN-LAST:event_menuVendedorActionPerformed

    private void menuReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReporteVentasActionPerformed
        ReporteVenta rv = new ReporteVenta();
        centrarVentanaPrincipal(rv);
    }//GEN-LAST:event_menuReporteVentasActionPerformed

    private void menuAtribucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtribucionesActionPerformed
        AtribucionesForm af = new AtribucionesForm();
        centrarVentanaPrincipal(af);
    }//GEN-LAST:event_menuAtribucionesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public void centrarVentanaPrincipal(JInternalFrame frame){
        ventanaPrincipal.add(frame);
        Dimension dimension = ventanaPrincipal.getSize();
        Dimension dFrame = frame.getSize();
        
        frame.setLocation((dimension.width - dFrame.height)/2, 
                (dimension.height-dFrame.width)/2);
        frame.show();
    }   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JMenuItem menuAtribuciones;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuClient;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuGenerarVenta;
    private javax.swing.JMenuItem menuProducto;
    private javax.swing.JMenuItem menuReporteVentas;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuVendedor;
    public static javax.swing.JDesktopPane ventanaPrincipal;
    // End of variables declaration//GEN-END:variables
}
