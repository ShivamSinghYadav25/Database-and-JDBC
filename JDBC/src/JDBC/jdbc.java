package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;  // Ensure you're importing the correct SQLException class

public class jdbc {

    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/jdbc"; // Ensure this is the correct database name
        String user = "root"; // Your MySQL Username
        String password = "shivam9500@"; // Your MySQL password

        Connection con = null;

        try {
            // Establish the connection
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

        } catch (SQLException e) {
            // Catch SQL exceptions and print the error stack trace
            e.printStackTrace(); // This will print the stack trace for debugging
        } finally {
            // Close the connection if it's not null
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
