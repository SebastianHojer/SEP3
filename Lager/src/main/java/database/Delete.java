package database;

import java.sql.*;

public class Delete
{
    public Connection connect() throws SQLException {
        String password = ConnInfo.password;
        String user = ConnInfo.user;
        String url = ConnInfo.url;
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

    public void deleteLoss(int caseId) {
        String SQL = "delete from sep3.productloss where caseid = ?";
        try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
            preparedStatement.setInt(1, caseId);
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println("Affected rows: " + affectedRows);
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
