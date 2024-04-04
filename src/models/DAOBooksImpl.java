
package models;
import java.sql.PreparedStatement;
import LOGIN.conexion;
import interfaces.DAOBooks;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vistas.Books;


public  class DAOBooksImpl extends conexion implements DAOBooks {

    
    public void registrar(Booksm book) throws Exception {
        try {
            
            this.conectar();
            
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO books(title, date, author, category, edit, lang, pages, description, ejemplares, stock, available) VALUES(?,?,?,?,?,?,?,?,?,?,?);");
           
            st.setString(1, book.getTitle());
            st.setString(2, book.getDate());
            st.setString(3, book.getAuthor());
            st.setString(4, book.getCategory());
            st.setString(5, book.getEdit());
            st.setString(6, book.getLang());
            st.setString(7, book.getPages());
            st.setString(8, book.getDescription());
            st.setString(9, book.getEjemplares());
            st.setInt(10, book.getStock());
            st.setInt(11, book.getAvailable());
            
            st.executeUpdate();
          
            st.close();  
        } catch(Exception e) {
           
            throw e;
        } finally {
           
            this.cerrar();
        }
    }

   
    public void modificar(Booksm book) throws Exception {
        try {
            
            this.conectar();
            
            PreparedStatement st = this.conexion.prepareStatement("UPDATE books SET title = ?, date = ?, author = ?, category = ?, edit = ?, lang = ?, pages = ?, description = ?, ejemplares = ?, stock = ?, available = ? WHERE id = ?");
            
            st.setString(1, book.getTitle());
            st.setString(2, book.getDate());
            st.setString(3, book.getAuthor());
            st.setString(4, book.getCategory());
            st.setString(5, book.getEdit());
            st.setString(6, book.getLang());
            st.setString(7, book.getPages());
            st.setString(8, book.getDescription());
            st.setString(9, book.getEjemplares());
            st.setInt(10, book.getStock());
            st.setInt(11, book.getAvailable());
            st.setInt(12, book.getId());
           
            st.executeUpdate();
          
            st.close();
        } catch(Exception e) {
            
            throw e;
        } finally {
            
            this.cerrar();
        }
    }

    
    public void eliminar(int bookId) throws Exception {
        try {
           
            this.conectar();
          
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM books WHERE id = ?");
            
            st.setInt(1, bookId);
           
            st.executeUpdate();
            
            st.close();
        } catch(Exception e) {
            
            throw e;
        } finally {
           
            this.cerrar();
        }
    }

    
    public List<Booksm> listar(String title) throws Exception {
        List<Booksm> lista = null;
        try {
           
            this.conectar();
          
            String Query = title.isEmpty() ? "SELECT * FROM books;" : "SELECT * FROM books WHERE title LIKE '%" + title + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            
            ResultSet rs = st.executeQuery();
           
            while(rs.next()) {
                Booksm book = new Booksm();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setDate(rs.getString("date"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.setEdit(rs.getString("edit"));
                book.setLang(rs.getString("lang"));
                book.setPages(rs.getString("pages"));
                book.setDescription(rs.getString("description"));
                book.setEjemplares(rs.getString("ejemplares"));
                book.setStock(rs.getInt("stock"));
                book.setAvailable(rs.getInt("available"));
                lista.add(book);
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

   
    @Override
    public Booksm getBookById(int bookId) throws Exception {
        Booksm book = null;
        
        try {
           
            this.conectar();
           
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM books WHERE id = ? LIMIT 1;");
            
            st.setInt(1, bookId);
            
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                book = new Booksm();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setDate(rs.getString("date"));
               

                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.setEdit(rs.getString("edit"));
                book.setLang(rs.getString("lang"));
                book.setPages(rs.getString("pages"));
                book.setDescription(rs.getString("description"));
                book.setEjemplares(rs.getString("ejemplares"));
                book.setStock(rs.getInt("stock"));
                book.setAvailable(rs.getInt("available"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return book;
    }   

  
    

   
}