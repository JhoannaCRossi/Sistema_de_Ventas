
package modelo;

import java.sql.Date;

/**
 * @author jhoa_
 */
public class Ventas {
    
    private int id;
    private int id_cliente;
    private int id_vendedor;
    private String serie;
    private String fecha;
    private double monto;
    private String estado;

    public Ventas(){
    }

    public Ventas(int id, int id_cliente, int id_vendedor, String serie, String fecha, double monto, String estado) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_vendedor = id_vendedor;
        this.serie = serie;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
