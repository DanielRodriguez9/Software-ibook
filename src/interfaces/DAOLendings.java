
package interfaces;

import java.util.List;
import models.Booksm;
import models.Lendingsm;
import models.Usersm;
import vistas.Lendings;

/**
 *
 * @author Daniel Rodriguez
 */
public interface DAOLendings {
    
    public void registrar(Lendingsm lending) throws Exception;
    public void modificar(Lendingsm lending) throws Exception;
    public Lendingsm getLendingsm(Usersm user, Booksm book) throws Exception;
    
    public List<Lendingsm> listar() throws Exception;
    
}
