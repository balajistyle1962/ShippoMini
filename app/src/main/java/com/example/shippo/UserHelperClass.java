package com.example.shippo;

public class UserHelperClass {
    String email,username,password,phonenumber;

    public UserHelperClass() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public UserHelperClass(String email, String username, String password, String phonenumber) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
    }
}
