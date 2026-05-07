/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warnetapp;

import warnetapp.Rolemenu.Rolemenu;

/**
 *
 * @author rajaa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Cek Server Alert
        if (DBConnection.getConnection() != null) {
            System.out.println("Connection Database successful!");
        } else {
            System.out.println("Connection Database failed!");
        }
        
        Rolemenu frame = new warnetapp.Rolemenu.Rolemenu();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
}
