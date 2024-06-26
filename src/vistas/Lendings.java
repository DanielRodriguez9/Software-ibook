
package vistas;

import interfaces.DAOBooks;
import interfaces.DAOLendings;
import interfaces.DAOUsers;
import java.awt.Color;
import models.DAOBooksImpl;
import models.DAOLendingsImpl;
import models.DAOUsersImpl;
import utils.Utils;

/**
 *
 * @author Daniel Rodriguez
 */
public class Lendings extends javax.swing.JPanel {

    
    public Lendings() {
        initComponents();
        InitStyles();
    }
    
    private void InitStyles(){
        
         foliolabel.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
       foliolabel.setForeground(Color.black);
       
        libroid.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        libroid.setForeground(Color.black);
        
        
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        libroid = new javax.swing.JLabel();
        libroIdTxt = new javax.swing.JTextField();
        foliolabel = new javax.swing.JLabel();
        folioTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        imgpres = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        libroid.setText("Libro ID :");

        foliolabel.setText("Folio Usuario ID : ");

        button.setBackground(new java.awt.Color(0, 0, 153));
        button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Prestar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        imgpres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgpres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconprestamosperritolibro (1)400x400.png"))); // NOI18N
        imgpres.setRequestFocusEnabled(false);

        title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        title.setText("PRESTAMO  LIBRO");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(libroid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foliolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(imgpres, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(foliolabel)
                        .addGap(96, 96, 96)
                        .addComponent(libroid)
                        .addGap(16, 16, 16)
                        .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgpres, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        
        String folio = folioTxt.getText();
        String bookId = libroIdTxt.getText();

        
        if (folio.isEmpty() || bookId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(folio) || !Utils.isNumeric(bookId)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(bookId) <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        }

        try {
            DAOUsers daoUsers = new DAOUsersImpl();
            
          
            models.Usersm currentUser = daoUsers.getUserById(Integer.parseInt(folio));
            if (currentUser == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese folio. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                folioTxt.requestFocus();
                return;
            }
            
            DAOBooks daoBooks = new DAOBooksImpl();
            
            
            models.Booksm currentBook = daoBooks.getBookById(Integer.parseInt(bookId));
            if (currentBook == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún libro con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }
           
            else if (currentBook.getAvailable() < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ya no hay más libros disponibles con esa ID para prestar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }
            
            DAOLendings daoLendings = new DAOLendingsImpl() ;
            
           
            models.Lendingsm currentLending = daoLendings.getLendingsm(currentUser, currentBook);
            if (currentLending != null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Esa persona ya cuenta con el préstamo de ese mismo Libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }

           
            models.Lendingsm lending = new models.Lendingsm();
            lending.setBook_id(currentBook.getId());
            lending.setUser_id(currentUser.getId());
            lending.setDate_out(Utils.getFechaActual());
            daoLendings.registrar(lending);
            
           
            currentBook.setAvailable(currentBook.getAvailable() - 1);
            daoBooks.modificar(currentBook);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Libro ID: " + currentBook.getId() + " prestado exitosamente a " + currentUser.getName() + ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            libroIdTxt.setText("");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al prestar el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JLabel foliolabel;
    private javax.swing.JLabel imgpres;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField libroIdTxt;
    private javax.swing.JLabel libroid;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
