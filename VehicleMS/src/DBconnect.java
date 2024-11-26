// Import necessary classes for database connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DBconnect class manages the database connection for the Vehicle Management System.
 * It includes methods for opening and closing the connection.
 * 
 * @author JHED
 */
public class DBconnect {
    
    // Database URL, username, and password constants for connecting to MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/vcdatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "09776630489";
    
    /**
     * Establishes a connection to the MySQL database.
     * 
     * @return Connection object if successful, null if there's an error.
     */
    public static Connection getConnection(){
        Connection connection = null; // Initialize the connection object
        try {
            // Load and register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection successful"); // Log success message
        } catch (SQLException e) {
            // Handle SQL errors, like incorrect URL, user, or password
            System.out.println("Error connecting to the database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Handle errors if the MySQL JDBC driver class is not found
            System.out.println("MYSQL JDBC Driver not found: " + e.getMessage());
        }
        return connection; // Return the established connection or null if failed
    }
    
    /**
     * Closes an existing database connection.
     * 
     * @param connection The Connection object to be closed.
     */
    public static void closeConnection(Connection connection){
        if (connection != null) { // Check if connection is not null before closing
            try {
                connection.close(); // Attempt to close the connection
                System.out.println("Connection closed."); // Log success message
            } catch (SQLException e) {
                // Handle errors that occur while closing the connection
                System.out.println("Error closing the connection: " + e.getMessage());
            }
        }
    }
}
