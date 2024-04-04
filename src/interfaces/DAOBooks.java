package interfaces;

//DAO para nuestra lógica de libros

import java.util.List;
import models.Booksm;
import vistas.Books;

public interface DAOBooks {
    public void registrar(Booksm book) throws Exception;  
    public void modificar(Booksm book) throws Exception; 
    public void eliminar(int bookId) throws Exception; 
    public List<Booksm> listar(String title) throws Exception; 
    public Booksm getBookById(int bookId) throws Exception; 
}
