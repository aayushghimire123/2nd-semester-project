/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import Model.*;
import View.*;
import database.myConnection;
import java.sql.*;

/**
 *
 * @author asism
 */
public class LoginController {
    
    LoginModel model;
    LoginView view;
    ResultSet rs;
    Statement stmt;
    
    public LoginController(LoginView view)
    {
        this.view=view;
        
        new LoginListener().actionPerformed();
        
        
    }
    class LoginListener
    {
        public void actionPerformed() {
            try
            {
                model=view.getUser();
                if(checkUser(model))
                {
                    
                    view.setMessage("Login Successfully");
                    if (true==LoginView.checkbox){DashbordView a= new DashbordView();
                    a.ManagementAcess();
                        System.out.println("i am manager");}
                    else{DashbordView a= new DashbordView();
                    a.EmployeAcess();
                        System.out.println("i am employee");}
                    view.dispose();
                }
                else
                {
                    view.setMessage("Invalid username or password");
                    
                }
            }
            catch(Exception e1)
            {
                System.out.println(e1.getMessage());
            }
        }
        
    public boolean checkUser(LoginModel user) throws Exception
        {

          Connection conn = myConnection.myDatabase();
          String sql="select * from EMPLOYEE where USERNAME='"+user.getUsername()+"' AND PASS='"+user.getPassword()+"'";
          String sql1="select * from MANAGEMENT where USERNAME='"+user.getUsername()+"' AND PASS='"+user.getPassword()+"'";
          try
          {
            stmt=conn.createStatement();
            if (true==LoginView.checkbox){rs=stmt.executeQuery(sql1);
          }else{
            rs=stmt.executeQuery(sql);}
            if(rs.next())
             {
                 return true;
             }
             
             conn.close();
            
          
          }
          catch(Exception e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }

        }
    
}
