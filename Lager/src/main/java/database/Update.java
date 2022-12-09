package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Update
{
  private final String url = ConnInfo.url;
  private final String user = ConnInfo.user;
  private final String password = ConnInfo.password;

  public Connection connect() throws SQLException
  {
    return DriverManager.getConnection(url, user, password);
  }

  public boolean updateProduct(String ean, String productName, int stock, String photoPath)
  {
    String SQL = "UPDATE Sep3.warehouse SET productName = ?, stock = ?, photopath = ? WHERE ean = ?";
    try (Connection conn = connect();
        PreparedStatement pstmt = conn.prepareStatement(SQL))
    {
      pstmt.setString(1, productName);
      pstmt.setInt(2, stock);
      pstmt.setString(3, photoPath);
      pstmt.setString(4, ean);
      pstmt.executeUpdate();
    }
    catch (SQLException ex)
    {
      ex.printStackTrace();
      return false;
    }
    return true;
  }

  public boolean updateStock(String ean, int amount)
  {
    String SQLSubtract = "UPDATE Sep3.warehouse SET stock = stock - " + amount + " where ean = '" + ean + "'";
    String SQLAdd = "UPDATE Sep3.warehouse SET stock = stock + " + amount + " where ean = '" + ean + "'";

    if(amount>0){
      try(Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQLAdd))
      {
        int affectedRows = pstmt.executeUpdate();
        if(affectedRows==0){
          return false;
        }
      }
      catch(SQLException ex)
      {
        ex.printStackTrace();
        return false;
      }
    } else
    {
      try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQLSubtract))
      {
        int affectedRows = pstmt.executeUpdate();
        if (affectedRows == 0)
        {
          return false;
        }
      }
      catch (SQLException ex)
      {
        ex.printStackTrace();
        return false;
      }
    }
    return true;
  }
}
