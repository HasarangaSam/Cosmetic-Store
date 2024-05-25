/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cosmetic;

import javax.swing.JOptionPane;


public class Shampoo extends Product{
    
    private String hairType;
    
    public Shampoo(String category, String name, double price, int stock,String hairType) {
        super(category, name, price, stock);
        this.hairType = hairType;
    }
    
    //getter    
    public String getHairType() {
        return hairType;
    }

    //setter
    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    @Override
    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Shampoo added", "Successfull!", JOptionPane.INFORMATION_MESSAGE);
    }

    
}
