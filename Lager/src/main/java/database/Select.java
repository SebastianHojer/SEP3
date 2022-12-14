package database;
import lager.Loss;
import lager.PasswordAuthenticationResponse;
import lager.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Select
{

  public Connection connect() throws SQLException
  {
    String url = ConnInfo.url;
    String user = ConnInfo.user;
    String password = ConnInfo.password;
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

  public boolean productExists(long ean) {
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

  public Product retrieveProduct(long ean)
  {
    Product product = null;
    String SQL = "select * from sep3.warehouse where ean = '" + ean + "'";
    try (Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)) {
      ResultSet rs = preparedStatement.executeQuery();
      while(rs.next()){
        String productname = rs.getString("productname");
        int stock = rs.getInt("stock");
        String photopath = rs.getString("photopath");
        List<String> locations = retrieveLocation(ean);
        product = Product.newBuilder().setEan(ean).setProductName(productname).setStock(stock).setPhotoPath(photopath).addAllLocation(locations).build();
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
        long ean = rs.getLong("ean");
        String productname = rs.getString("productname");
        int stock = rs.getInt("stock");
        String photopath = rs.getString("photopath");
        List<String> locations = retrieveLocation(ean);
        Product product = Product.newBuilder().setEan(ean).setProductName(productname).setStock(stock).setPhotoPath(photopath).addAllLocation(locations).build();
        products.add(product);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return products;
  }

  public ArrayList<String> retrieveLocation(long ean)
  {
    String SQL = "select * from sep3.location where ean = '" + ean + "'";
    ArrayList<String> locations = new ArrayList<>();
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      ResultSet rs = preparedStatement.executeQuery();
      while(rs.next()){
        String location = rs.getString("location");
        locations.add(location);
      }
    } catch(SQLException e){
      e.printStackTrace();
    }
    return locations;
  }

  public ArrayList<Long> retrieveAllProductsEan(){
    String SQL = "select * from sep3.warehouse";
    ArrayList<Long> toReturn = new ArrayList<>();
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      ResultSet rs = preparedStatement.executeQuery();
      while(rs.next()){
        long ean = rs.getLong("ean");
        int stock = rs.getInt("stock");
        System.out.println(stock);
        for (int i = 0; i<stock; i++){
          toReturn.add(ean);
        }
        System.out.println(toReturn);
      }
    } catch(SQLException e){
      e.printStackTrace();
    }
    return toReturn;
  }

  public Loss retrieveLoss(int caseId) {
    String SQL = "select * from sep3.productloss where caseid = '" + caseId + "'";
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      ResultSet rs = preparedStatement.executeQuery();
      rs.next();
      int id = rs.getInt("caseid");
      long ean = rs.getLong("ean");
      boolean handled = rs.getBoolean("handled");
      int amount = rs.getInt("amount");
      return Loss.newBuilder().setEan(ean).setCaseId(id).setHandled(handled).setAmount(amount).build();
    } catch(SQLException e){
      e.printStackTrace();
    }
    return null;
  }


  public ArrayList<Loss> retrieveAllLoss() {
    String SQL = "select * from sep3.productloss ORDER BY caseid";
    ArrayList<Loss> losses = new ArrayList<>();
    try(Connection conn = connect(); PreparedStatement preparedStatement = conn.prepareStatement(SQL)){
      ResultSet rs = preparedStatement.executeQuery();
      while(rs.next()){
        int id = rs.getInt("caseid");
        long ean = rs.getLong("ean");
        boolean handled = rs.getBoolean("handled");
        int amount = rs.getInt("amount");
        Loss loss = Loss.newBuilder().setEan(ean).setCaseId(id).setHandled(handled).setAmount(amount).build();
        losses.add(loss);
      }
    } catch(SQLException e){
      e.printStackTrace();
    }
    return losses;
  }
}
