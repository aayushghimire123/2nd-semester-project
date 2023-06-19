 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asism
 */
public class myConnection {
    
    public static Connection myDatabase()
    {
        {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/RESTURENT","root","aayushghimire@123");
                    System.out.println("Database Connected!");
                    return conn;
        }
        catch (ClassNotFoundException | SQLException e)
        
        {
            System.out.println(e);
        return null;    
        }
        
        }
    }
}
    

