/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cosmetic;

import javax.swing.JOptionPane;


public class Product {
    private String category;
    private String name;
    private double price;
    private int stock;
    
    //Constructor
    public Product(String category,String name,double price,int stock){
        this.category = category;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    //getters
    public String getCategory(){
        return category;
    }
    
    public String getName(){
        return name;
    }
    
     public double getPrice(){
        return price;
    }
     
     public int getStock(){
        return stock;
    }
    
    //setters
    public void setCategory(String category){
        this.category = category;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    //Overriden method
    public void displayInfo(){
         JOptionPane.showMessageDialog(null, "Product added", "Successfull!", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
