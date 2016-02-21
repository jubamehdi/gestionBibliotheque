/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juba
 */
public class Singleton {
    private String host = "jdbc:derby://localhost:1527/Biblio";
    private String uName = "root";
    private String uPass= "root";  
    
    private  Connection con  ;
    private static final Singleton singleton = new Singleton();
    
    private Singleton() {
        try {
            con =  DriverManager.getConnection( host, uName, uPass );
                    } catch (SQLException ex) {
            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection(){
        return singleton.con;
    }
}
