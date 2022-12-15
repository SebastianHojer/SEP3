package database;

import lager.Loss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Update
{

  public Connection connect() throws SQLException
  {
    String url = ConnInfo.url;
    String user = ConnInfo.user;
    String password = ConnInfo.password;
    return DriverManager.getConnection(url, user, password);
  }

  public boolean updateProduct(long ean, String productName, int stock)
  {
    String SQL = "UPDATE Sep3.warehouse SET productName = ?, stock = ? WHERE ean = ?";
    try (Connection conn = connect();
        PreparedStatement pstmt = conn.prepareStatement(SQL))
    {
      pstmt.setString(1, productName);
      pstmt.setInt(2, stock);
      pstmt.setLong(3, ean);
      pstmt.executeUpdate();
    }
    catch (SQLException ex)
    {
      ex.printStackTrace();
      return false;
    }
    return true;
  }

  public boolean updateStock(long ean, int amount)
  {
    String SQLAdd = "UPDATE Sep3.warehouse SET stock = stock + " + amount + " where ean = '" + ean + "'";
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
    return true;
  }

  public void updateLocation(long ean, ArrayList<String> location){
    String DeleteSQL = "delete from sep3.location where ean = " + ean;
    String StartSQL = "insert into sep3.location (ean, location) values ('" + ean + "' , '" + location.get(0) + "')";
    for (int i=1; i<location.size(); i++)
    {
      StartSQL = String.join(" , ", StartSQL, "('" + ean + "','" + location.get(i) +"')");
    }
    int affectedRows;
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(DeleteSQL)){
      affectedRows = preparedStatement.executeUpdate();
      System.out.println("Affected rows: " + affectedRows);
    } catch(SQLException e){
      e.printStackTrace();
    }
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(StartSQL)){
      affectedRows = preparedStatement.executeUpdate();
      System.out.println("Affected rows: " + affectedRows);
    } catch(SQLException e){
      e.printStackTrace();
    }
  }

  public boolean updateLoss(Loss loss) {
    System.out.println("i am in update db now");
    String SQL = "UPDATE sep3.productloss SET handled = ?, amount = ? WHERE caseid = ?";
    try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(SQL))
    {
      pstmt.setBoolean(1, loss.getHandled());
      pstmt.setInt(2, loss.getAmount());
      pstmt.setInt(3, loss.getCaseId());
      pstmt.executeUpdate();
    }
    catch (SQLException ex)
    {
      ex.printStackTrace();
      return false;
    }
    return true;
  }
}
