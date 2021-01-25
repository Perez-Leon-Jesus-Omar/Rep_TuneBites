/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import static Inventario.MusicPlayer.Tocar;
import static Inventario.VideoPlayer.Reproducir;
import static Personal.Acomodador.TeleportAcomodador;
import static Personal.Cliente.TeleportCliente;
import static Personal.Vendedor.TeleportVendedor;
import tuneBitesProject.KeyboardInput;
import static tuneBitesProject.TuneBitesProject.MuestraTxt;
import static tuneBitesProject.TuneBitesProject.mainScreen;

/**
 *
 * @author johan
 */
public class Gerente {
    
    public static void main(String[] args) {
        TeleportGerente();
    }
    
    
     public static void TeleportGerente() {  
        MuestraTxt("files/Gerente Screen.txt");
        
        
        KeyboardInput input = new KeyboardInput(); 
        System.out.println("▼");
        int a = input.readInteger();
        switch (a){
            case 1:
                
                TeleportCliente();            
                
                break;
            case 2:
                
                TeleportAcomodador();
                   
                break;
            case 3:                
                
                TeleportVendedor();
                
                break;
            case 4:                
                
                System.out.println("Reproductor de audio:\n[1] Musica\n[2] Video"); 
                int c = input.readInteger();
                switch(c){
                    case 1:
                        Tocar();
                        break;
                    case 2:
                        Reproducir();
                        break;
                    default:
                        break;
                }
                mainScreen();
                
                break;
            case 5:                
                
                System.out.println("Saliendo del sistema");
                mainScreen();
                
                break;
            default:
                
                System.out.println("ERROR");
                TeleportGerente();
                
                break;              
            
        }
    }
}
