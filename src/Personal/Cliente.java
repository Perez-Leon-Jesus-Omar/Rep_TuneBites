/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import static Inventario.Producto.verInventario;
import proyecto_poo.KeyboardInput;
import static proyecto_poo.Proyecto_poo.MuestraTxt;
import static proyecto_poo.Proyecto_poo.mainScreen;

/**
 *
 * @author jopl1
 */
public class Cliente {
    
    public static void main(String[] args) {
        TeleportCliente();
    }
    
    
     public static void TeleportCliente() {  
        MuestraTxt("files/Cliente Screen.txt");
        
        
        KeyboardInput input = new KeyboardInput(); 
        System.out.println("▼");
        int a = input.readInteger();
        switch (a){
            case 1:
                
                verInventario();           
                
                break;
            case 2:
                
                MuestraTxt("files/Creditos Screen.txt");
                System.out.println("▼");
                int b = input.readInteger();
                TeleportCliente();
                   
                   
                break;
            case 3:                
                
                System.out.println("Saliendo del sistema");
                mainScreen();
                
                break;
            default:
                
                System.out.println("ERROR");
                TeleportCliente();
                
                break;              
            
        }
        
    }
     

}
