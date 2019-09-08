import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import java.awt.AWTException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Javaconnect {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\acer\\Documents\\NetBeansProjects\\Automated Car Parking System\\acps.sqlite");
            return conn;
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
                    
                    }
        }
        
    }
