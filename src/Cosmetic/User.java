/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cosmetic;

public class User {
    
    private String userType;
    private String username;
    private String password;
    
    public User(String userType,String username,String password){
        this.userType = userType;
        this.username=username;
        this.password=password;
    } 
    
    //getters
    public String getUserType() {
        return userType;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    
    //setters
    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }   
             
}
