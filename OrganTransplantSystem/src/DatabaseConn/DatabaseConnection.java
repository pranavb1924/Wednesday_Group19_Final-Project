/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConn;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author rexinshiminsutongxue
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/OrganTransplantDb";
    private static final String USER = "root";
    private static final String PASSWORD = "jl30473353"; 
    private static Connection connection = null;

    public static Connection getConnection() { 
        if (connection == null) { 
            try { 
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }catch (SQLException e) { 
                e.printStackTrace();
            } 
        } 
        return connection;
    }
}
