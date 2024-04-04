
package interfaces;

import java.util.List;
import models.Usersm;
import vistas.Users;



public interface DAOUsers {
    
    
    
    public void registrar(Usersm user) throws Exception;  
    public void modificar(Usersm user) throws Exception;
    public void eliminar(int userId) throws Exception;
      public void sancionar(Usersm user) throws Exception;
    public List <Usersm> listar(String name) throws Exception; 
    
    public Usersm getUserById(int userId) throws Exception;
    
}
