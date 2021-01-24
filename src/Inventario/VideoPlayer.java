/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import static Inventario.MusicPlayer.Achuu;
import proyecto_poo.KeyboardInput;


/**
 *
 * @author johan
 */
public class VideoPlayer {
    
    public static void Reproducir() {  
        
        
        DiscVideo Video = new DiscVideo();
        KeyboardInput input = new KeyboardInput(); 
        
        System.out.print("Seleccione la pista a reproducir:\n"); 
        System.out.println("[1] " + Video.NomD );
        System.out.println("[2] " + Video.NomD2 );
        System.out.println("[3] " + Video.NomD3 );
        System.out.println("▼");
        int a = input.readInteger();
        switch(a){
            case 1:
                Achuu(Video.NomD,Video.duracion, Video.Artista,"files/Reproductor.txt");
                break;
            case 2:
                Achuu(Video.NomD2,Video.duracion2, Video.Artista2,"files/Reproductor.txt");
                break;
            case 3:
                Achuu(Video.NomD3,Video.duracion3, Video.Artista3,"files/Reproductor.txt");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
