
package models;

import LOGIN.conexion;
import interfaces.DAOUsers;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Usersm;
import vistas.Users;



public class DAOUsersImpl extends conexion implements DAOUsers{

    
    @Override
    public void registrar(Usersm user) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO users(name, last_name_p, last_name_m,domicilio, tel) VALUES (?,?,?,?,?)");
           
            
            st.setString(1, user.getName());
            st.setString(2, user.getLast_name_p());
            st.setString(3, user.getLast_name_m());
            st.setString(4, user.getDomicilio());
            st.setString(5, user.getTel());
          
            st.executeUpdate();
            st.close();
            
        }catch(Exception e){
            throw e;
        } finally {
            this.cerrar();
        }
            
    }

    @Override
    public void modificar(Usersm user) throws Exception {
        
          try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE users SET name = ? , last_name_p = ? , last_name_m = ? , domicilio = ? , tel=? WHERE id = ?" );
           
            
            st.setString(1, user.getName());
            st.setString(2, user.getLast_name_p());
            st.setString(3, user.getLast_name_m());
            st.setString(4, user.getDomicilio());
            st.setString(5, user.getTel());
            st.setInt(6, user.getId());
           
            
            
            st.executeUpdate();
            st.close();
            
        }catch(Exception e){
            throw e;
        } finally {
            this.cerrar();
        }
        

    }

    @Override
    public void eliminar(int userId) throws Exception {
        
         try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM users WHERE id = ?");
           
            
            st.setInt(1, userId);
           
            
            st.executeUpdate();
            st.close();
            
        }catch(Exception e){
            throw e;
        } finally {
            this.cerrar();
        }
        
    }
    
    
    

    @Override
    public List<Usersm > listar(String name) throws Exception {
       List <Usersm> lista = null;
       try{
           
          
           
           this.conectar();
           
           String Query = name.isEmpty() ? " SELECT * FROM users " : "SELECT * FROM users WHERE name LIKE '%" + name + "%'";
            PreparedStatement st = this.conexion.prepareStatement(Query);  
            
           
            lista =  new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Usersm user =  new Usersm();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setLast_name_p(rs.getString("last_name_p"));
                user.setLast_name_m(rs.getString("last_name_m"));
                user.setDomicilio(rs.getString("domicilio"));
                user.setTel(rs.getString("tel"));
                user.setSanctions(rs.getInt("sanctions"));
                user.setSanc_money(rs.getInt("sanc_money"));
                
                
                lista.add(user);
                
            }
            rs.close(); 
            st.close();  
            
       }catch(Exception e ){
           throw e;
       }finally {
           this.cerrar();
       }
       return lista;
             
    }

    @Override
    public Usersm getUserById(int userId) throws Exception {
        Usersm user = new Usersm();
        
        try{
           
          
           
           this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM users WHERE id = ? LIMIT 1");  
            st.setInt(1, userId);
           
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setLast_name_p(rs.getString("last_name_p"));
                user.setLast_name_m(rs.getString("last_name_m"));
                user.setDomicilio(rs.getString("domicilio"));
                user.setTel(rs.getString("tel"));
                user.setSanctions(rs.getInt("sanctions"));
                user.setSanc_money(rs.getInt("sanc_money"));
                
               
                
            }
            rs.close();  
            st.close();   
            
       }catch(Exception e ){
           throw e;
       }finally {
           this.cerrar();
       }
       return user;
    }
    

    @Override
    public void sancionar(Usersm user) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE users SET sanctions = ?, sanc_money = ? WHERE id = ?");
            st.setInt(1, user.getSanctions());
            st.setInt(2, user.getSanc_money());
            st.setInt(3, user.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

  

    

    
    
}
