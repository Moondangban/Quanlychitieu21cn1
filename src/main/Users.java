/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Phuong Thao
 */
public class Users {
    String username, email, password,phone;
    int ID;
    int Purse;
    

    public Users() {
    }

    public Users(String username, String email, String phone, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        
    }
    
    
    public Users(String username, String email, String phone, String password, int ID) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.ID = ID;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setPurse(int Purse){
        this.Purse = Purse;
    }
    
    public int getPurse(){
        return Purse;
    }
}
