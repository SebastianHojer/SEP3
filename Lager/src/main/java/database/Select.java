package database;

import dto.AuthenticationDto;
import lager.PasswordAuthenticationResponse;
import lager.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
      e.printStackTrace();
      return false;
    }
    return false;
  }

  public boolean productExists(String ean) {
    String SQL = "select * from sep3.warehouse where ean = '" + ean + "'";
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      ResultSet rs = preparedStatement.executeQuery();
      if(rs.next()){
        return true;
      }
    } catch (SQLException e){
      e.printStackTrace();
      return false;
    }
    return false;
  }

  public ArrayList<String> retrieveUsers() {
      String SQL = "select * from sep3.\"user\"";
      ArrayList<String> usernames = new ArrayList<>();
      try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)) {
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()){
          usernames.add(rs.getString("username"));
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return usernames;
  }

  public PasswordAuthenticationResponse authenticatePassword(String username, String password)
  {
    boolean isAdmin = false;
    boolean authenticated = false;
    String SQL = "select * from sep3.\"user\" where username = '" + username + "'";
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      ResultSet rs = preparedStatement.executeQuery();
      String actualPassword = "";

      if(rs.next()){
        actualPassword = rs.getString("password");
        isAdmin = rs.getBoolean("admin");
      }
      if(actualPassword.equals(password)){
        authenticated = true;
      }
    } catch (SQLException e){
      e.printStackTrace();
    }
    return PasswordAuthenticationResponse.newBuilder().setAuthenticated(authenticated).setIsAdmin(isAdmin).build();
  }

  public Product retrieveProduct(String ean)
  {
    Product product = null;
    String SQL = "select * from sep3.warehouse where ean = '" + ean + "'";
    try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)) {
      ResultSet rs = preparedStatement.executeQuery();
      while(rs.next()){
        String productname = rs.getString("productname");
        int stock = rs.getInt("stock");
        String photopath = rs.getString("photopath");
        product = Product.newBuilder().setEan(ean).setProductName(productname).setStock(stock).setPhotoPath(photopath).build();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return product;
  }

  public ArrayList<Product> retrieveProducts() {
    String SQL = "select * from sep3.warehouse";
    ArrayList<Product> products = new ArrayList<>();
    try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)) {
      ResultSet rs = preparedStatement.executeQuery();
      while(rs.next()){
        String ean = rs.getString("ean");
        String productname = rs.getString("productname");
        int stock = rs.getInt("stock");
        String photopath = rs.getString("photopath");
        Product product = Product.newBuilder().setEan(ean).setProductName(productname).setStock(stock).setPhotoPath(photopath).build();
        products.add(product);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return products;
  }
}
