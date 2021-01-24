/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import static Personal.Cliente.TeleportCliente;
import proyecto_poo.KeyboardInput;
import static proyecto_poo.Proyecto_poo.MuestraTxt;
import static proyecto_poo.Proyecto_poo.mainScreen;

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
                
                System.out.println("Aun no pongo esto, awanta XD");             
                
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
