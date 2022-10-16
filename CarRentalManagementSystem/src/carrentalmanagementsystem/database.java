/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MarcoMan
 * Youtube Channel: https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
    Subscribe our Channel, thank you for the support!
 */
public class database {
    
    public static Connection connectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // NOTE!! MAKE YOUR OWN DATABASE
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/rentcar", "root", ""); // root is the default username while "" or empty is for the password
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
