/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aakash Gadhave
 */
public class MyPrisonConnection {
    
    private static final String USERNAME_STRING = "root";
    private static final String PASSWORD_STRING = "mysql";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/prison";
    
    
    Connection con ;
    
    public Connection getMyConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyPrisonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(CONN_STRING,USERNAME_STRING,PASSWORD_STRING);
            System.out.println("Connection established");
        } catch (SQLException ex) {
            Logger.getLogger(MyPrisonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
