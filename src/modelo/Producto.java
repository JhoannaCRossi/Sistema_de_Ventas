
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jhoa_
 */
public class Producto implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //Método para actualizar stock de productos
    public int actualizarStock(int cant, int idProducto){
        int r = 0;
        String sql = "UPDATE productos SET stock_producto=? WHERE id_producto=?";
        
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idProducto);
            
            r= ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return r;
    }

    //Método para listar producto en formulario ventas
    public EntidadProducto listarId(int id){
        EntidadProducto producto = new EntidadProducto();
        
        String sql = "SELECT * FROM productos where id_producto=?";
        
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs= ps.executeQuery();
            
            while(rs.next()){
                producto.setId(rs.getInt(1));
                producto.setNombres(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setStock(rs.getInt(4));
                producto.setEstado(rs.getString(5));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return producto;
    }
    
    //Métodos de Mantenimiento CRUD
    @Override
    public List listar() {
        List<EntidadProducto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                EntidadProducto c = new EntidadProducto();
                
                c.setId(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setPrecio(rs.getDouble(3));
                c.setStock(rs.getInt(4));
                c.setEstado(rs.getString(5));
                lista.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    @Override
    public int add(Object[] o) {
        int respuesta = 0;
        
        String sql = "INSERT INTO productos(id_producto, nombres_producto, "
                + "precio_producto, stock_producto, estado_producto) "
                + "VALUES (?,?,?,?,?)";
    
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    @Override
    public int actualizar(Object[] o) {
        int respuesta = 0;
     
        String sql = "UPDATE productos SET nombres_producto=?, precio_producto=?, "
             + "stock_producto=?, estado_producto=? WHERE id_producto=?";
    
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            
            respuesta = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return respuesta;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM productos WHERE id_producto=?";
    
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
