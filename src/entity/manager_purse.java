/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public class manager_purse {
    private int ID;
    private  int Type;
    private int Price;
    private Date Time; 
    private int Status;
    private String Note;
    private  int User_ID;
    
    public manager_purse(int ID, int Type , int Price, Date TimeDate, int Status, String Note , int User_ID){
        this.ID=ID;
        this.Type= Type;
        this.Price= Price;
        this.Time= TimeDate;
        this.Status= Status;
        this.Note= Note;
        this.User_ID= User_ID;
    }
    
    public manager_purse(){}
    
    public  void setID(int ID){
        this.ID=ID;
    }
    public  void setType(int Type){
        this.Type=Type;
    }
    public  void setPrice(int Price){
        this.Price = Price;
    }
    public  void setTime(Date Time){
        this.Time=Time;
    }
    public  void setStatus(int Status){
        this.Status = Status;
    }
    public  void setNote(String Note){
        this.Note=Note;
    }
    public  void setUser_ID(int User_ID){
        this.User_ID= User_ID;
    }
    public int getID(){
        return ID;
    }
    public int getType(){
        return Type;
    }
    public int getPrice(){
        return Price;
    }
    public Date getTime(){
        return Time;
    }
    public int getStatus(){
        return Status;
    }
    public String getNote(){
        return Note;
    }
    public int getUser_ID(){
        return User_ID;
    }
    
}
