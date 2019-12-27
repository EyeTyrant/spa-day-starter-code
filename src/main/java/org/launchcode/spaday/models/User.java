package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class User {
    @NotBlank(message = "Must enter user name")
    @Size(min=5, max=15, message = "Must be 5-15 characters long")
    private String username;
    @Email(message = "Must be valid email address")
    private String email;
    @NotBlank(message = "Must enter password")
    @Size(min=6, message = "Minimum 6 characters long")
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        return getPassword().equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassword());
    }
}
