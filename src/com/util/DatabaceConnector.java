 
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

 

public class DatabaceConnector {
    public static Connection dataConnect(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connData = DriverManager.getConnection("jdbc:mysql://localhost:3306/courier","root","123456");
            return connData;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaceConnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaceConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
