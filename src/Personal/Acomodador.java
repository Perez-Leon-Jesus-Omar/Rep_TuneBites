/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import static Inventario.Producto.AcomodarInventario;
import tuneBitesProject.KeyboardInput;
import static tuneBitesProject.TuneBitesProject.MuestraTxt;
import static tuneBitesProject.TuneBitesProject.mainScreen;

/**
 *
 * @author johan
 */
public class Acomodador {
    
    public static void main(String[] args) {
        TeleportAcomodador();
    }
    
    
     public static void TeleportAcomodador() {  
        MuestraTxt("files/Acomodador Screen.txt");
        
                        
        KeyboardInput input = new KeyboardInput(); 
        System.out.println("▼");
        int a = input.readInteger();
        switch (a){
            case 1:
                
                AcomodarInventario();             
                
                break;
            case 2:
                                
                System.out.println("Saliendo del sistema");
                mainScreen();
                                      
                break;
            default:
                
                System.out.println("ERROR");
                TeleportAcomodador();
                
                break;              
            
        }
        
    }
     
     
}
