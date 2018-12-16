/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usis;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class javaconnect {
Connection conn=null;
public static Connection connectorDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Documents\\NetBeansProjects\\usis\\usis.sqlite");
        //JOptionPane.showMessageDialog(null, "connection established");
        
    return conn;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    

  
}
}
