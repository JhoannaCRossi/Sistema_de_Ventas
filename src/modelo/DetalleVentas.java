
package modelo;

/**
 * @author jhoa_
 */
public class DetalleVentas {
    private int id;
    private int id_ventas;
    private int id_producto;
    private int cantidadVentas;
    private double precioVenta;

    public DetalleVentas() {
    }

    public DetalleVentas(int id, int id_ventas, int id_producto, int cantidadVentas, double precioVenta) {
        this.id = id;
        this.id_ventas = id_ventas;
        this.id_producto = id_producto;
        this.cantidadVentas = cantidadVentas;
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
}
