/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MangeEmployee;
import View.MangeEmployeeView;
import database.DbOperations;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Legion
 */
public class MangeEmployeeController {
    public static void save(MangeEmployee employee){
        String query = "insert into MangeEmployee (EmployeeName,Department,Salary) values('"+MangeEmployee.getEmployeeName()+"','"+MangeEmployee.getDepartment()+"','"+MangeEmployee.getSalary()+"')";
        DbOperations.setDataOrDelete(query,"Category Added Successfully");
        
    }
     public static ArrayList<MangeEmployee>getAllRecords(){
        ArrayList<MangeEmployee> arrayList = new ArrayList<>();
        try{
            ResultSet rs =DbOperations.getData("Select *from MangeEmployee");
            while(rs.next()){
                MangeEmployee Employee = new MangeEmployee();
                Employee.setEmployeeName(rs.getString("Employee Name"));
                Employee.setDepartment(rs.getString("Department"));
                Employee.setSalary(rs.getString("Salary"));
                arrayList.add(Employee);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public MangeEmployeeController(MangeEmployeeView aThis) {
    }
    
}
