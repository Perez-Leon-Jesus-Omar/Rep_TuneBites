/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import tuneBitesProject.KeyboardInput;


/**
 *
 * @author johan
 */
public class MusicPlayer {
    
    public static void Tocar() {  
        
        
        DiscMusica Musica = new DiscMusica();
        KeyboardInput input = new KeyboardInput(); 
        
        System.out.print("Seleccione el genero a reproducir:\n"); 
        System.out.println("[1] " + Musica.NomD );
        System.out.println("[2] " + Musica.NomD2 );
        System.out.println("[3] " + Musica.NomD3 );
        System.out.println("▼");
        int a = input.readInteger();
        switch(a){
            case 1:
                Achuu(Musica.NomD,Musica.duracion, Musica.Artista,"files/1.mp3");
                break;
            case 2:
                Achuu(Musica.NomD2,Musica.duracion2, Musica.Artista2,"files/2.mpeg");
                break;
            case 3:
                Achuu(Musica.NomD3,Musica.duracion3, Musica.Artista3,"files/3.mpeg");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
    
     public static void Achuu(String nombre, double duracion, String artista,String archivo){
         System.out.println("\n\nReproduciendo " + nombre+ " de "+artista+" con una duracion de: "+ duracion);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        abrirArchivo(archivo);
        
     }
     
     public static void abrirArchivo(String archivo){
          PlayAudio misProcesos=new PlayAudio();
        misProcesos.cargarArchivo(archivo);
     }
     
}
