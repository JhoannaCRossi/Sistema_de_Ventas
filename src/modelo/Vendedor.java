
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhoa_
 */
public class Vendedor implements CRUD{
    
    Conexion con = new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;
    
    public EntidadVendedr validarVendedor(String dni, String user){
        
        EntidadVendedr ev = new EntidadVendedr();
    
        String sql = "SELECT * FROM vendedor WHERE dni_vendedor=? AND user_vendedor=?";
        
        try {
            
            acceso=con.conectar();    
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            
            while(rs.next()){
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNames(rs.getString(3));
                ev.setTelephone(rs.getString(4));
                ev.setState(rs.getString(5));
                ev.setUser(rs.getString(6));
            
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ev;
    }
    
        public EntidadVendedr listarId(int id){
       
        EntidadVendedr ev = new EntidadVendedr();
        
        String sql = "SELECT * FROM vendedor where id_vendedor=?";
        
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            rs= ps.executeQuery();
            
            while(rs.next()){
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNames(rs.getString(3));
                ev.setTelephone(rs.getString(4));
                ev.setState(rs.getString(5));
                ev.setUser(rs.getString(6));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ev;
    }
    
    @Override
    public List listar() {
        List<EntidadVendedr> lista = new ArrayList<>();
        String sql = "SELECT * FROM vendedor";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                EntidadVendedr v = new EntidadVendedr();
                
                v.setId(rs.getInt(1));
                v.setDni(rs.getString(2));
                v.setNames(rs.getString(3));
                v.setTelephone(rs.getString(4));
                v.setState(rs.getString(5));
                v.setUser(rs.getString(6));
                lista.add(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int respuesta = 0;
        
        String sql = "INSERT INTO vendedor(id_vendedor, dni_vendedor, "
                + "nombres_vendedor, telefono_vendedor, estado_vendedor, user_vendedor) "
                + "VALUES (?,?,?,?,?,?)";
    
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    @Override
    public int actualizar(Object[] o) {
         int respuesta = 0;
     
        String sql = "UPDATE vendedor SET dni_vendedor=?, nombres_vendedor=?, telefono_vendedor=?, "
             + "estado_vendedor=?, user_vendedor=? WHERE id_vendedor=?";
    
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            
            respuesta = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return respuesta;
    }
    
    @Override
    public void eliminar(int id) {
         String sql = "DELETE FROM vendedor WHERE id_vendedor=?";
    
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
