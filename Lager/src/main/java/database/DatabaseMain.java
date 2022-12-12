package database;

import lager.PasswordAuthenticationResponse;
import lager.Product;

import java.util.ArrayList;

public class DatabaseMain
{
  private static DatabaseMain instance = null;
  ConnInfo connInfo;
  Delete delete;
  Insert insert;
  Update update;
  Select select;

  private DatabaseMain(){
    connInfo = new ConnInfo();
    delete = new Delete();
    insert = new Insert();
    update = new Update();
    select = new Select();
  }

  public static DatabaseMain getInstance(){
    if(instance == null){
      instance = new DatabaseMain();
    } return instance;
  }

  public boolean addUser(String username, String password, Boolean isAdmin){
    return insert.addUser(username, password, isAdmin);
  }

  public boolean usernameExists(String username){
    return select.userExists(username);
  }

  public ArrayList<String> retrieveUsers(){
    return select.retrieveUsers();
  }

  public boolean deleteUser(String username) {
    return delete.deleteUser(username);
  }

  public boolean createProduct(long ean, String productName, int stock, String photoPath) {
    return insert.createProduct(ean, productName, stock, photoPath);
  }

  public PasswordAuthenticationResponse authenticatePassword(String username, String password)
  {
    return select.authenticatePassword(username, password);
  }

  public boolean deleteProduct(long ean) {
    return delete.deleteProduct(ean);
  }

  public boolean productExists(long ean) {
    return select.productExists(ean);
  }

  public Product retrieveProduct(long ean)
  {
    return select.retrieveProduct(ean);
  }

  public ArrayList<Product> retrieveProducts() {
    return select.retrieveProducts();
  }

  public boolean addLocation(long ean, String location){
    return insert.addLocation(ean, location);
  }

  public ArrayList<String> retrieveLocation(long ean){
    return select.retrieveLocation(ean);
  }

  public boolean updateProduct(long ean, String productName, int stock, ArrayList<String> location)
  {
    ArrayList<String> locationRetrieved = retrieveLocation(ean);
    location.removeAll(locationRetrieved);
    update.updateLocation(ean, location);
    return update.updateProduct(ean, productName, stock);
  }

  public boolean updateStock(long ean, int amount)
  {
    return update.updateStock(ean, amount);
  }
}
