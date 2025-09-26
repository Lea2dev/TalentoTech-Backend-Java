package com.talentotech.inicio;

public class Usuario {

    private int id;
    private String userName;
    private String pass;
    
    public Usuario(int id, String user, String pass) {
        this.id = id;
        this.userName = user;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String user) {
        this.userName = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", user=" + userName + ", pass=" + pass + "]";
    }
    
        
    
}
