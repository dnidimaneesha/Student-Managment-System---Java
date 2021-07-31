
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class databaseConnection {
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/newstudentdb";
    
    final static String USER ="root";
    final static String PASS = "";
    
    public static Connection connection() throws ClassNotFoundException{
        
        try{
            Class.forName(JDBC_DRIVER);
            
            java.sql.Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return (Connection) conn;
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
       
    }
    
}
