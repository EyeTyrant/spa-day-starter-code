package org.launchcode.spaday.models;


import java.util.Objects;

public class User {

  private String userName;
  private String email;
  private String password;


  public User(String userName, String email, String password) {
    this.userName = userName;
    this.email = email;
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User)) return false;
    User user = (User) o;
    return getUserName().equals(user.getUserName()) &&
        getEmail().equals(user.getEmail()) &&
        getPassword().equals(user.getPassword());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUserName(), getEmail(), getPassword());
  }
}
