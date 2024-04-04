package LOGIN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase para manejar el acceso a datos relacionados con el login.
 */
public class LoginDao {
    
    // Conexión a la base de datos
    Connection con;
    // Preparación de consultas con sql
    PreparedStatement ps;
    // Resultado de consultas
    ResultSet rs;
    // Instancia de la clase conexión
    conexion cn = new conexion();

    // Método para realizar el login
    public login log(String nombre, String pass) {
        
        login l = new login();
        
        String sql = "SELECT * FROM login WHERE nombre=? AND pass=?";
        try {
          
            cn.conectar();
            
            ps = cn.conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, pass);
          
            rs = ps.executeQuery();
            
            if (rs.next()) {
                l.setId(rs.getInt("id"));
                l.setNombre(rs.getString("nombre"));
                l.setPass(rs.getString("pass"));
            }
        } catch (SQLException | ClassNotFoundException e) {
           
            e.printStackTrace();
        } finally {
           
            try {
                cn.cerrar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       
        return l;
    }
}
