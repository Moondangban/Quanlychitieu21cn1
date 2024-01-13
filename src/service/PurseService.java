
package service;

import entity.manager_purse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class PurseService {
    ConnectionDB cn = new ConnectionDB();
    Connection conn;
    public void create(int User_ID, int Type, int Price, String Note, Date Time){
        conn = cn.getConnection();
        try {
                    // Create a SimpleDateFormat object with the desired format
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    // Format the Date object
                    String formattedDate = dateFormat.format(Time);
                    String sql = "Insert into manager_purse(Type, Price, Time, Status, Note, User_ID) values("+Type+","+Price+",'"+formattedDate+"',1,'"+Note+"',"+User_ID+")";
                    Statement st = conn.createStatement();
                    int kq = st.executeUpdate(sql);
                    
                    //find --> user --> + / - tiền ví
                    Integer purse = 0;
                    
                    String sqlGetPurse = "select Purse from `users` where ID = " + User_ID;
                    
                    //st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sqlGetPurse);

                    while (rs.next()){
                        purse = rs.getInt("Purse");
                    }
                    
                    if(Type == 1){
                        purse += Price;
                    }
                    else{
                        purse -= Price;
                    }
                    
                    String sqlUpdate = "Update `users` set Purse = " + purse + " where ID = " + User_ID;
                    st.executeUpdate(sqlUpdate);
        } catch (Exception e) {
        }
    }
    
    
    public List<manager_purse> list(){
        try {
            conn = cn.getConnection();
            List<manager_purse> mList = new ArrayList<>();
            String sql = "select * from manager_purse";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            while (rs.next()) {
                manager_purse data = new manager_purse();
                
                data.setID(rs.getInt("ID"));
                data.setType(rs.getInt("Type"));
                data.setPrice(rs.getInt("Price"));
                data.setTime(rs.getDate("Time"));
                data.setStatus(rs.getInt("Status"));
                data.setNote(rs.getString("Note"));
                data.setUser_ID(rs.getInt("User_Id"));
               
                mList.add(data);
            }
            st.close();
            rs.close();
            conn.close();
                
            return mList;
        } catch (Exception e) {
            
            return new ArrayList<>();
        }
    }
    
    public String getPriceText(int userId){
        //ConnectionDB.userId = 12;
        try {
        conn = cn.getConnection();
        String sqlGetPurse = "select Purse from `users` where ID = " + userId;
                    
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sqlGetPurse);
        
        int purse = 0;
        
        while (rs.next()){
            purse = rs.getInt("Purse");
        }
        
        return String.valueOf(purse);
        }
        catch(Exception e){
            return "0";
        }
    }
}
