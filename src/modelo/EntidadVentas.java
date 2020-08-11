
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author jhoa_
 */
public class EntidadVentas {
    
    //establecemos conexion con base de datos
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    //metodo para el numero de serie
    public int nroSerieVentas(){
    
        int serie = 0;
        String sql = "SELECT MAX(numero_ventas) FROM ventas";
        
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                serie = rs.getInt(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return serie;
    }
    
    //método para generar idVentas
    public String idVentas(){
        
        String idVentas = "";
        String sql = "SELECT MAX(id_ventas) FROM ventas";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                idVentas = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return idVentas;
    }
    
    public int guardarVentas(Ventas venta){
    
        
        String sql = "INSERT INTO ventas (id_ventas, numero_ventas, "
                + "fecha_ventas, monto_venta, estado_venta, id_cliente, "
                + "id_vendedor) VALUES (?,?,?,?,?,?,?)";
        
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, venta.getId());
            ps.setString(2, venta.getSerie());
            ps.setString(3, venta.getFecha());
            ps.setDouble(4, venta.getMonto());
            ps.setString(5, venta.getEstado());
            ps.setInt(6, venta.getId_cliente());
            ps.setInt(7, venta.getId_vendedor());
            
            r = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }
    
    public int guardarDetalleVentas(DetalleVentas detalle){
    
        String sql = "INSERT INTO detalle_ventas (id_detalle_ventas, cantidad_ventas, precio_ventas, "
                + "id_ventas, id_producto) "
                + "VALUES (?,?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, detalle.getId());
            ps.setInt(2, detalle.getCantidadVentas());
            ps.setDouble(3, detalle.getPrecioVenta());
            ps.setInt(4, detalle.getId_ventas());
            ps.setInt(5, detalle.getId_producto());
            
            r = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }
}

