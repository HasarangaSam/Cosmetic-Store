/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cosmetic;

import javax.swing.JOptionPane;

public class FaceWash extends Product{
    
    private String skinType;
    
    public FaceWash(String category, String name, double price, int stock, String skinType) {
        super(category, name, price, stock);
        this.skinType = skinType;
    }
    
    //getter
    public String getSkinType() {
        return skinType;
    }
    
    //setter
    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    @Override
    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Face Wash added", "Successfull!", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
