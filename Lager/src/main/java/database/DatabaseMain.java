package database;

public class DatabaseMain
{

  ConnInfo connInfo;
  Delete delete;
  Insert insert;
  Update update;
  Select select;

  public DatabaseMain(){
    connInfo = new ConnInfo();
    delete = new Delete();
    insert = new Insert();
    update = new Update();
    select = new Select();
  }

  public boolean addUser(String username, String password, Boolean isAdmin){
    return insert.addUser(username, password, isAdmin);
  }

  public boolean usernameExists(String username){
    return select.userExists(username);
  }


}
