import java.sql.*;
public class SFUserBase {

    static String url = "jdbc:mysql://localhost:3306/bedmc";
    static String username = "root";
    static String password = "admin";

    public static void main(String[] args) throws SQLException {
        System.out.println("connecting...");

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e){
        }

        try(Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("connected!");
        } catch (SQLException e){
            throw new IllegalStateException("Failed to connect!",e );
        }
    }

}
