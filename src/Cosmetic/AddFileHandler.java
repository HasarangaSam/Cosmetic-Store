/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cosmetic;

import java.io.FileWriter;
import java.io.IOException;


public class AddFileHandler extends FileHandler{

    @Override
    public void addProductToFile(Product product) {
        try {
            FileWriter writer = new FileWriter("product.txt", true);
            if (product instanceof Shampoo) {
                Shampoo shampoo = (Shampoo) product;
                writer.write(shampoo.getCategory() + "," + shampoo.getName() + "," + String.format("%.2f", shampoo.getPrice()) + "," + shampoo.getHairType()+ "," + shampoo.getStock());
            } else if (product instanceof BodyLotion) {
                BodyLotion bodyLotion = (BodyLotion) product;
                writer.write(bodyLotion.getCategory() + "," + bodyLotion.getName() + "," + String.format("%.2f", bodyLotion.getPrice()) + "," + bodyLotion.getSkinType() + "," + bodyLotion.getStock());
            } else if (product instanceof FaceWash) {
                FaceWash faceWash = (FaceWash) product;
                writer.write(faceWash.getCategory() + "," + faceWash.getName() + "," + String.format("%.2f", faceWash.getPrice()) + "," + faceWash.getSkinType() + "," + faceWash.getStock());
            } else {   
                System.out.println("Error");
        }
            writer.write(System.lineSeparator());
            writer.close();
         } catch (IOException ex) {
            System.out.println("Error: " +ex);
        }
    }

    @Override
    public void addUserToFile(Cashier cashierNew) {
        try {
            FileWriter writer = new FileWriter("user.txt", true);
            writer.write(cashierNew.getUserType() + "," + cashierNew.getUsername() + "," + cashierNew.getPassword());
            writer.write(System.lineSeparator());
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
      }
    } 
       
}
