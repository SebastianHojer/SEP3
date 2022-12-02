package database;

import dto.AuthenticationDto;

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

  public boolean createProduct(String ean, String productName, int stock, String information) {
    return insert.createProduct(ean, productName, stock, information);
  }

  public AuthenticationDto authenticatePassword(String username, String password)
  {
    return select.authenticatePassword(username, password);
  }
}
