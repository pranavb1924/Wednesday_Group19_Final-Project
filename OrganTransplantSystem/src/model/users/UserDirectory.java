/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pranavb
 */
public class UserDirectory {
   
    private ArrayList<User> userList;
    private String organization;
    

  public UserDirectory(){
        
    }
    public UserDirectory(String organization, ArrayList<User> userList){
        this.userList = new ArrayList<User>();
        this.organization = organization;  
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    
    public User getUser(String username){
        for(User user : this.userList){
            if (user.getUsername() == username){
                return user;
            }
        }
        return null;
    }
    
    public void AddUser(User u){
        if (this.userList == null){
            this.userList = new ArrayList<User>();
        }
        
        this.userList.add(u);
    }
    
    public boolean authenticateUser(){
        
       return false;
    }
}
