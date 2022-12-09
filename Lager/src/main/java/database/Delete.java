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
            System.out.println("Affected rows: " + affectedRows);
            return affectedRows > 0;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteProduct(long ean) {
        String SQL = "delete from sep3.warehouse where ean = ?";
        try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
            preparedStatement.setLong(1, ean);
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println("Affected rows: " + affectedRows);
            return affectedRows > 0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
