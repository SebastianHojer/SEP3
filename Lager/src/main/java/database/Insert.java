package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert
{

  public Connection connect() throws SQLException{
    String url = ConnInfo.url;
    String user = ConnInfo.user;
    String password = ConnInfo.password;
    return DriverManager.getConnection(url, user, password);
  }

  public boolean createUser(String username, String password, Boolean isAdmin)
  {
    String SQL = "insert into sep3.\"user\" (Username, Password, Admin) values  (?, ?, ?)";
    int affectedRows;
    try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      preparedStatement.setString(1, username);
      preparedStatement.setString(2, password);
      preparedStatement.setBoolean(3, isAdmin);
      affectedRows = preparedStatement.executeUpdate();
      System.out.println("Affected rows: " + affectedRows);
      if(affectedRows>0){ return true;}
    } catch (SQLException e){
      e.printStackTrace();
    }
    return false;
  }

  public boolean createProduct(long ean, String productName, int stock, String photopath){
    String SQL = "insert into sep3.warehouse (ean, productname, stock, photopath) values (?, ?, ?, ?)";
    int affectedRows;
    try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      preparedStatement.setLong(1, ean);
      preparedStatement.setString(2, productName);
      preparedStatement.setInt(3, stock);
      preparedStatement.setString(4, photopath);
      affectedRows = preparedStatement.executeUpdate();
      System.out.println("Affected rows: " + affectedRows);
      if(affectedRows>0){ return true;}
    } catch (SQLException e){
      e.printStackTrace();
    }
    return false;
  }

  public boolean addLocation(long ean, String location){
    String SQL = "insert into sep3.location (ean, location) values (?, ?) ";
    int affectedRows;
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      preparedStatement.setLong(1, ean);
      preparedStatement.setString(2, location);
      affectedRows = preparedStatement.executeUpdate();
      System.out.println("Affected rows: " + affectedRows);
      if(affectedRows>0){return true;}
    } catch(SQLException e){
      e.printStackTrace();
    }
    return false;
  }

  public boolean registerLoss(long ean, int amount) {
    String SQL = "insert into sep3.productloss (ean, amount) values (?, ?) ";
    int affectedRows;
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      preparedStatement.setLong(1, ean);
      preparedStatement.setInt(2, amount);
      affectedRows = preparedStatement.executeUpdate();
      System.out.println("affected : " + affectedRows);
      if(affectedRows>0){return true;}
    } catch(SQLException e){
      e.printStackTrace();
    }
    return false;
  }
}
