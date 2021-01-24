/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import static Inventario.Producto.Vender;
import proyecto_poo.KeyboardInput;
import static proyecto_poo.Proyecto_poo.MuestraTxt;
import static proyecto_poo.Proyecto_poo.mainScreen;

/**
 *
 * @author johan
 */
public class Vendedor {
    
    public static void main(String[] args) {
        TeleportVendedor();
    }
    
    
     public static void TeleportVendedor() {  
        MuestraTxt("files/Vendedor Screen.txt"); 
        
                
        KeyboardInput input = new KeyboardInput(); 
        System.out.println("▼");
        int a = input.readInteger();
        switch (a){
            case 1:
                
                Vender();            
                
                break;
            case 2:
                                
                System.out.println("Saliendo del sistema");
                mainScreen();
                                      
                break;
            default:
                
                System.out.println("ERROR");
                TeleportVendedor();
                
                break;              
            
        }
        
    }
     
}
