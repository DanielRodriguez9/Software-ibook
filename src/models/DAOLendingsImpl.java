
package models;

import LOGIN.conexion;
import interfaces.DAOLendings;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vistas.Lendings;


public  class DAOLendingsImpl extends conexion implements DAOLendings {

    
    @Override
    public void registrar(Lendingsm lending) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO lendings(user_id, book_id, date_out) VALUES(?,?,?);");
            st.setInt(1, lending.getUser_id());
            st.setInt(2, lending.getBook_id());
            st.setString(3, lending.getDate_out());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    
    @Override
    public void modificar(Lendingsm lending) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE lendings SET user_id = ?, book_id = ?, date_out = ?, date_return = ? WHERE id = ?");
            st.setInt(1, lending.getUser_id());
            st.setInt(2, lending.getBook_id());
            st.setString(3, lending.getDate_out());
            st.setString(4, lending.getDate_return());
            st.setInt(5, lending.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    
   
    @Override
    public Lendingsm getLendingsm(Usersm user, Booksm book) throws Exception {
        Lendingsm lending = null;
        
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM lendings WHERE user_id = ? AND book_id = ? AND date_return IS NULL ORDER BY id DESC LIMIT 1");
            st.setInt(1, user.getId());
            st.setInt(2, book.getId());
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lending = new Lendingsm();
                lending.setId(rs.getInt("id"));
                lending.setUser_id(rs.getInt("user_id"));
                lending.setBook_id(rs.getInt("book_id"));
                lending.setDate_out(rs.getString("date_out"));
                lending.setDate_return(rs.getString("date_return"));
            }
            
            st.close();
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        
        return lending;
    }

    
    
    @Override
    public List<Lendingsm> listar() throws Exception {
        List<Lendingsm> lista = null;
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM lendings ORDER BY id DESC");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Lendingsm lending = new Lendingsm();
                lending.setId(rs.getInt("id"));
                lending.setUser_id(rs.getInt("user_id"));
                lending.setBook_id(rs.getInt("book_id"));
                lending.setDate_out(rs.getString("date_out"));
                lending.setDate_return(rs.getString("date_return"));
                lista.add(lending);
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lista;
    }


   

   

    
    

}

