/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBcon;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hinka
 */
public class Connection1 {
    
    static Connection con=null;
    
         //  Class.forName("com.jdbc.mysql.Driver");
         //  private static final Connection con= (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Inventory","user1","user1");
  public static Connection getCon()
    {
         
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?zeroDateTimeBehavior=convertToNull","root","");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;        
    }
    
    
}
