import java.sql.*;

// To compile and run:
// javac -cp ".;mysql-connector-j-9.3.0.jar" xampps.java
// java -cp ".;mysql-connector-j-9.3.0.jar" xamppsy

public class xampps {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println(" Connection established successfully!");

                // Insert data
                // PreparedStatement prestmt = conn.prepareStatement(
                //         "CREATE TABLE IF NOT EXISTS student (" +
                //         "id SERIAL PRIMARY KEY, " +
                //         "name VARCHAR(100) NOT NULL, " +
                //         "age INT NOT NULL)"
                //     );
                // prestmt.executeUpdate();
                // System.out.println("✅ Table 'student' created (if it didn’t already exist).");
                // prestmt.close();

                // // PreparedStatement insertStmt = conn.prepareStatement(
                // //         "INSERT INTO student (name, age) VALUES (?, ?)"
                // //     );
                // //     insertStmt.setString(1, "MK");
                // //     insertStmt.setInt(2, 25);
                // //     insertStmt.executeUpdate();
                // //     insertStmt.close();
                
                // PreparedStatement updatestmt = conn.prepareStatement(
                //         "UPDATE student SET name = ? where id = ? " 
                //     );
                //     updatestmt.setString(1, "MK");
                //     updatestmt.setInt(2, 1);
                //     updatestmt.executeUpdate();
                //     updatestmt.close();
                

                
                conn.close();
            } else {
                System.out.println(" Failed to establish connection.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println(" PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error occurred.");
            e.printStackTrace();
        }
    }
}
