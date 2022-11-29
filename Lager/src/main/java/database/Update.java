package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update
{
  private final String url = ConnInfo.url;
  private final String user = ConnInfo.user;
  private final String password = ConnInfo.password;

  public Connection connect() throws SQLException
  {
    return DriverManager.getConnection(url, user, password);
  }

}
