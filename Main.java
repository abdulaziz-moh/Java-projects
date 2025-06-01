import java.sql.*;

// To compile and run:
// javac -cp ".;postgresql-42.7.5.jar" Main.java
// java -cp ".;postgresql-42.7.5.jar" Main

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://ep-proud-voice-a41qunak-pooler.us-east-1.aws.neon.tech/neondb?sslmode=require";
        String user = "neondb_owner";
        String password = "npg_l4KLuYSgRFE9";

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println(" Connection established successfully!");

                // Insert data
                PreparedStatement prestmt = conn.prepareStatement(
                        "CREATE TABLE IF NOT EXISTS student (" +
                        "id SERIAL PRIMARY KEY, " +
                        "name VARCHAR(100) NOT NULL, " +
                        "age INT NOT NULL)"
                    );
                prestmt.executeUpdate();
                System.out.println("✅ Table 'student' created (if it didn’t already exist).");
                prestmt.close();

                // PreparedStatement insertStmt = conn.prepareStatement(
                //         "INSERT INTO student (name, age) VALUES (?, ?)"
                //     );
                //     insertStmt.setString(1, "MK");
                //     insertStmt.setInt(2, 25);
                //     insertStmt.executeUpdate();
                //     insertStmt.close();
                
                PreparedStatement updatestmt = conn.prepareStatement(
                        "UPDATE student SET name = ? where id = ? " 
                    );
                    updatestmt.setString(1, "MK");
                    updatestmt.setInt(2, 1);
                    updatestmt.executeUpdate();
                    updatestmt.close();
                

                
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
