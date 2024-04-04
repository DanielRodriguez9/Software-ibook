package LOGIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para manejar la conexión a la base de datos.
 */
public class conexion {

    
    protected Connection conexion;

   
    public void conectar() throws ClassNotFoundException, SQLException {
    
        String myDB = "jdbc:mysql://localhost:3306/sistemabiblioteca?serverTimezone=UTC";
        
        conexion = DriverManager.getConnection(myDB, "root", "");
    }

   
    public void cerrar() throws SQLException {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close();
        }
    }
}
