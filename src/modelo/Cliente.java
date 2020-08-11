
package modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author jhoa_
 */
public class Cliente implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //Método para listar cliente en formulario ventas
    public EntidadCliente listarId(String dni){
        EntidadCliente cliente = new EntidadCliente();
        
        String sql = "SELECT * FROM cliente where dni_cliente=?";
        
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            rs= ps.executeQuery();
            
            while(rs.next()){
                cliente.setId(rs.getInt(1));
                cliente.setDni(rs.getString(2));
                cliente.setNombres(rs.getString(3));
                cliente.setDireccion(rs.getString(4));
                cliente.setEstado(rs.getString(5));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cliente;
    }
    
    //Métodos de Mantenimiento CRUD
    @Override
    public List listar() {
        List<EntidadCliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                EntidadCliente c = new EntidadCliente();
                
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setDireccion(rs.getString(4));
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
        
        String sql = "INSERT INTO cliente(id_cliente, dni_cliente, "
                + "nombres_cliente, direccion_cliente, estado_cliente) "
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
     
     String sql = "UPDATE cliente SET dni_cliente=?, nombres_cliente=?,"
             + "direccion_cliente=?, estado_cliente=? WHERE id_cliente=?";
    
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
        String sql = "DELETE FROM cliente WHERE id_cliente=?";
    
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
