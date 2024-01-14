/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author lenovo
 */
public class users {
    private int ID;
    private String Name;
    private String Phone;
    private String Email;
    private String Address;
    private int Status;
    private  int Purse;
    public users(int ID, String Name , String Phone , String Email , String Address , int Status, int Purse){
        this.ID=ID;
        this.Name=Name;
        this.Phone=Phone;
        this.Email=Email;
        this.Address=Address;
        this.Status=Status;
        this.Purse=Purse;
    }
    public  void setID(int ID){
        this.ID = ID;
    }
    public  void setName(String Name){
        this.Name = Name;
    }
    public  void setPhone(String Phone){
        this.Phone = Phone;
    }
    public  void setEmail(String Email){
        this.Email = Email;
    }
    public  void setAddress(String Address){
        this.Address = Address;
    }
    public  void setStatus(int Status){
        this.Status = Status;
    }
    public  void setPurse(int Purse){
        this.Purse = Purse;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
    public String getPhone(){
        return Phone;
    }
    public String getEmail(){
        return Email;
    }
    public String getAddress(){
        return Address;
    }
    public int getStatus(){
        return Status;
    }
    public int getPurse(){
        return Purse;
    }
}
