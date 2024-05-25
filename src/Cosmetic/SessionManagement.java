/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cosmetic;


public class SessionManagement {
    private static SessionManagement instance;
    private String currentUserRole;

    private SessionManagement() {
        // Private constructor to prevent instantiation
    }

    public static SessionManagement getInstance() {
        if (instance == null) {
            instance = new SessionManagement();
        }
        return instance;
    }

    public void setCurrentUserRole(String role) {
        this.currentUserRole = role;
    }

    public String getCurrentUserRole() {
        return this.currentUserRole;
    }
}
