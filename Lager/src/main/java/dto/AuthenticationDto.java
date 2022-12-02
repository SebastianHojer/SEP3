package dto;

public class AuthenticationDto
{
  private boolean isAdmin;
  private boolean authenticated;

  public AuthenticationDto(boolean isAdmin, boolean authenticated){
    this.isAdmin=isAdmin;
    this.authenticated=authenticated;
  }

  public boolean isAdmin()
  {
    return isAdmin;
  }

  public void setAdmin(boolean admin)
  {
    isAdmin = admin;
  }

  public boolean isAuthenticated()
  {
    return authenticated;
  }

  public void setAuthenticated(boolean authenticated)
  {
    this.authenticated = authenticated;
  }
}
