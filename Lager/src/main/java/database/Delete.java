package database;

import java.sql.*;

public class Delete
{
    private final String url = ConnInfo.url;
    private final String user = ConnInfo.user;
    private final String password = ConnInfo.password;


    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public boolean deleteUser(String username){
        String SQL = "delete from sep3.\"user\" where username = ?";
        try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
            preparedStatement.setString(1, username);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows>0){
                System.out.println("Affected rows: " + affectedRows);
                return true;
            } else{return false;}
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
