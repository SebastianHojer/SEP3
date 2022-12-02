package database;

import java.sql.*;
import java.util.ArrayList;

public class Select
{
  private final String url = ConnInfo.url;
  private final String user = ConnInfo.user;
  private final String password = ConnInfo.password;

  public Connection connect() throws SQLException
  {
    return DriverManager.getConnection(url, user, password);
  }


  public boolean userExists(String username)
  {
    String SQL = "select * from sep3.\"user\" where username = '" + username + "'";
    try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      ResultSet rs = preparedStatement.executeQuery();
      if(rs.next()){
        return true;
      }
    } catch (SQLException e){
      return false;
    }
    return false;
  }

  public ArrayList<String> retrieveUsers() {
      String SQL = "select * from sep3.\"user\"";
      try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)) {
        ResultSet rs = preparedStatement.executeQuery();
        ArrayList<String> usernames = new ArrayList<>();
        while(rs.next()){
          usernames.add(rs.getString("username"));
        }
        return usernames;
      } catch (SQLException e) {
        e.printStackTrace();
        return null;
      }
  }

  public boolean authenticatePassword(String username, String password)
  {
    String SQL = "select * from sep3.\"user\" where username = '" + username + "'";
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      ResultSet rs = preparedStatement.executeQuery();
      String actualPassword;
      if(rs.next()){
        actualPassword = rs.getString("password");
      } else return false;

      if(actualPassword.equals(password)){
        return true;
      }
    } catch (SQLException e){
      e.printStackTrace();
      return false;
    }
    return false;
  }
}
