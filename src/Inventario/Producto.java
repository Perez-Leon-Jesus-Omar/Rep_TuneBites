/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import Inventario.Audifonos.SinStock3;
import Inventario.DiscMusica.SinStock2;
import Inventario.DiscVideo.SinStock;
import static Personal.Acomodador.TeleportAcomodador;
import static Personal.Cliente.TeleportCliente;
import static Personal.Vendedor.TeleportVendedor;
import tuneBitesProject.KeyboardInput;
import static tuneBitesProject.TuneBitesProject.MuestraTxt;

/**
 *
 * @author johan
 */
public class Producto {
    
    public static void main(String[] args) {
        Vender();
    }
     
    public static void verInventario() {  
        
        DiscVideo Video = new DiscVideo();
        DiscMusica Musica = new DiscMusica();
        Audifonos HeadPhones = new Audifonos();
        
        KeyboardInput input = new KeyboardInput();  
        
        MuestraTxt("files/Disponibilidad Screen.txt");
        System.out.println("\n▼");
        
        int c = input.readInteger();
        switch (c){
                        case 1:
                            System.out.println("Album: "+Video.NomD);
                            System.out.println("Artista: "+Video.Artista);
                            System.out.println("Canciones: "+Video.Ncanciones);
                            System.out.println("Duración: "+Video.duracion);
                            System.out.println("Precio: $"+Video.Precio);
                            System.out.println("\n");
                            
                            System.out.println("Album: "+Video.NomD2);
                            System.out.println("Artista: "+Video.Artista2);
                            System.out.println("Canciones: "+Video.Ncanciones2);
                            System.out.println("Duración: "+Video.duracion2);
                            System.out.println("Precio: $"+Video.Precio2);
                            System.out.println("\n");
                            
                            System.out.println("Album: "+Video.NomD3);
                            System.out.println("Artista: "+Video.Artista3);
                            System.out.println("Canciones: "+Video.Ncanciones3);
                            System.out.println("Duración: "+Video.duracion3);
                            System.out.println("Precio: $"+Video.Precio3);
                            System.out.println("\n");
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int b = input.readInteger();
                            
                            verInventario();
                            
                            break;
                        case 2:
                            System.out.println("Album: "+Musica.NomD);
                            System.out.println("Artista: "+Musica.Artista);
                            System.out.println("Canciones: "+Musica.Ncanciones);
                            System.out.println("Duración: "+Musica.duracion);
                            System.out.println("Precio: $"+Musica.Precio);
                            System.out.println("\n");
                            
                            System.out.println("Album: "+Musica.NomD2);
                            System.out.println("Artista: "+Musica.Artista2);
                            System.out.println("Canciones: "+Musica.Ncanciones2);
                            System.out.println("Duración: "+Musica.duracion2);
                            System.out.println("Precio: $"+Musica.Precio2);
                            System.out.println("\n");
                            
                            System.out.println("Album: "+Musica.NomD3);
                            System.out.println("Artista: "+Musica.Artista3);
                            System.out.println("Canciones: "+Musica.Ncanciones3);
                            System.out.println("Duración: "+Musica.duracion3);
                            System.out.println("Precio: $"+Musica.Precio3);
                            System.out.println("\n");
                            
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int v = input.readInteger();
                            
                            verInventario();
                            
                            break;
                        case 3:
                            
                            System.out.println("Marca: "+HeadPhones.marca1);
                            System.out.println("Precio: "+HeadPhones.precio1);
                            System.out.println("\n");
                            
                            System.out.println("Marca: "+HeadPhones.marca2);
                            System.out.println("Precio: "+HeadPhones.precio2);
                            System.out.println("\n");
                            
                            System.out.println("Marca: "+HeadPhones.marca3);
                            System.out.println("Precio: "+HeadPhones.precio3);
                            System.out.println("\n");
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int x = input.readInteger();
                            
                            verInventario();
                            
                            
                            break;
                        default:
                            System.out.println("Error");
                            TeleportCliente();
                            break;
                    }                    
        
    }
    
     public static void AcomodarInventario() {  
        
        DiscVideo Video = new DiscVideo();
        DiscMusica Musica = new DiscMusica();
        Audifonos HeadPhones = new Audifonos();
        
        KeyboardInput input = new KeyboardInput();  
        
        MuestraTxt("files/Disponibilidad Screen.txt");
        System.out.println("\n▼");
        
        int c = input.readInteger();
        switch (c){
                        case 1:
                            System.out.println("¡Que album se desea aumentar de bodega?");
                            System.out.println("[1] Album: "+Video.NomD + "    Candidad: " + Video.cantidad);                            
                            System.out.println("[2] Album: "+Video.NomD2 + "    Candidad: " + Video.cantidad2);                            
                            System.out.println("[3] Album: "+Video.NomD3 + "    Candidad: " + Video.cantidad3);
                            System.out.println("\n▼");
                            int b = input.readInteger();
                            System.out.println("Seleccione la cantidad a aumentar:\n");
                            int z = input.readInteger();
                            switch(b){
                                case 1:
                                    Video.aumentar1(z);
                                    break;
                                
                                case 2:
                                    Video.aumentar2(z);
                                    break;
                                    
                                case 3:
                                    Video.aumentar3(z);
                                    break;
                                    
                                default:
                                    System.out.println("ERROR");
                                    AcomodarInventario();
                                    break;
                            }
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int v = input.readInteger();
                            
                            AcomodarInventario();
                            
                            break;
                        case 2:
                            System.out.println("¡Que album se desea aumentar de bodega?");
                            System.out.println("[1] Album: "+Musica.NomD + "    Candidad: " + Musica.cantidad);                            
                            System.out.println("[2] Album: "+Musica.NomD2 + "    Candidad: " + Musica.cantidad2);                            
                            System.out.println("[3] Album: "+Musica.NomD3 + "    Candidad: " + Musica.cantidad3);
                            System.out.println("\n▼");
                            int n = input.readInteger();
                            System.out.println("Seleccione la cantidad a aumentar:\n");
                            int p = input.readInteger();
                            switch(n){
                                case 1:
                                    Musica.aumentar1(p);
                                    break;
                                
                                case 2:
                                    Musica.aumentar2(p);
                                    break;
                                    
                                case 3:
                                    Musica.aumentar3(p);
                                    break;
                                    
                                default:
                                    System.out.println("ERROR");
                                    AcomodarInventario();
                                    break;
                            }
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int q = input.readInteger();
                            
                            AcomodarInventario();
                            
                            break;
                        case 3:
                            System.out.println("¡Que audifonos se desea aumentar de bodega?");
                            System.out.println("[1] Marca: "+HeadPhones.marca1 + "    Candidad: " + HeadPhones.cantidad1);                            
                            System.out.println("[2] Marca: "+HeadPhones.marca2 + "    Candidad: " + HeadPhones.cantidad2);                            
                            System.out.println("[3] Marca: "+HeadPhones.marca3 + "    Candidad: " + HeadPhones.cantidad3);
                            System.out.println("\n▼");
                            int t = input.readInteger();
                            System.out.println("Seleccione la cantidad a aumentar:\n");
                            int u = input.readInteger();
                            switch(t){
                                case 1:
                                    HeadPhones.aumentar1(u);
                                    break;
                                
                                case 2:
                                    HeadPhones.aumentar2(u);
                                    break;
                                    
                                case 3:
                                    HeadPhones.aumentar3(u);
                                    break;
                                    
                                default:
                                    System.out.println("ERROR");
                                    AcomodarInventario();
                                    break;
                            }
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int r = input.readInteger();
                            
                            AcomodarInventario();
                            
                            break;
                        default:
                            System.out.println("Error");
                            TeleportAcomodador();
                            break;
                    }                    
        
    }
       
      public static void Vender() {  
        
        DiscVideo Video = new DiscVideo();
        DiscMusica Musica = new DiscMusica();
        Audifonos HeadPhones = new Audifonos();
        
        KeyboardInput input = new KeyboardInput();  
        
        MuestraTxt("files/Disponibilidad Screen.txt");
        System.out.println("\n▼");
        
        int c = input.readInteger();
        switch (c){
                        case 1:
                            System.out.println("Que album se va a vender?");
                            System.out.println("[1] Album: "+Video.NomD + "    Candidad: " + Video.cantidad + "    Precio: " + Video.Precio);                            
                            System.out.println("[2] Album: "+Video.NomD2 + "    Candidad: " + Video.cantidad2 + "    Precio: " + Video.Precio);                            
                            System.out.println("[3] Album: "+Video.NomD3 + "    Candidad: " + Video.cantidad3 + "    Precio: " + Video.Precio);
                            System.out.println("\n▼");
                            int b = input.readInteger();
                            System.out.println("Seleccione la cantidad a vender:\n");
                            int z = input.readInteger();
                            switch(b){
                                case 1:
                                    try {
                                        Video.vender1(z);
                                        } catch (SinStock ex) {
                                        System.out.println("No hay en stock");
                                        }
                                    break;
                                
                                case 2:
                                    try {
                                        Video.vender2(z);
                                        } catch (SinStock ex) {
                                        System.out.println("No hay en stock");
                                        }
                                    break;
                                    
                                case 3:
                                    try {
                                        Video.vender3(z);
                                        } catch (SinStock ex) {
                                        System.out.println("No hay en stock");
                                        }
                                    break;
                                    
                                default:
                                    System.out.println("ERROR");
                                    AcomodarInventario();
                                    break;
                            }
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int v = input.readInteger();
                            
                            AcomodarInventario();
                            
                            break;
                        case 2:
                            System.out.println("¿Que album se va a vender?");
                            System.out.println("[1] Album: "+Musica.NomD + "    Candidad: " + Musica.cantidad + "    Precio: " + Musica.Precio);                            
                            System.out.println("[2] Album: "+Musica.NomD2 + "    Candidad: " + Musica.cantidad2 + "    Precio: " + Musica.Precio2);                            
                            System.out.println("[3] Album: "+Musica.NomD3 + "    Candidad: " + Musica.cantidad3 + "    Precio: " + Musica.Precio3);
                            System.out.println("\n▼");
                            int n = input.readInteger();
                            System.out.println("Seleccione la cantidad a vender:\n");
                            int p = input.readInteger();
                            switch(n){
                                case 1:
                                    try {
                                        Musica.vender1(p);
                                        } catch (SinStock2 ex) {
                                        System.out.println("No hay en stock");
                                        }
                                    break;
                                
                                case 2:
                                    try {
                                        Musica.vender2(p);
                                        } catch (SinStock2 ex) {
                                        System.out.println("No hay en stock");
                                        }
                                    break;
                                    
                                case 3:
                                    try {
                                        Musica.vender3(p);
                                        } catch (SinStock2 ex) {
                                        System.out.println("No hay en stock");
                                        }
                                    break;
                                    
                                default:
                                    System.out.println("ERROR");
                                    AcomodarInventario();
                                    break;
                            }
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int q = input.readInteger();
                            
                            AcomodarInventario();
                            
                            break;
                        case 3:
                            System.out.println("¿Que audifonos se van a vender?");
                            System.out.println("[1] Marca: "+HeadPhones.marca1 + "    Candidad: " + HeadPhones.cantidad1 + "    Precio: " + HeadPhones.precio1);                            
                            System.out.println("[2] Marca: "+HeadPhones.marca2 + "    Candidad: " + HeadPhones.cantidad2 + "    Precio: " + HeadPhones.precio2);                            
                            System.out.println("[3] Marca: "+HeadPhones.marca3 + "    Candidad: " + HeadPhones.cantidad3 + "    Precio: " + HeadPhones.precio3);
                            System.out.println("\n▼");
                            int t = input.readInteger();
                            System.out.println("Seleccione la cantidad a vender:\n");
                            int u = input.readInteger();
                            switch(t){
                                case 1:
                                    try {
                                        HeadPhones.vender1(u);
                                        } catch (SinStock3 ex) {
                                        System.out.println("No hay en stock");
                                        }
                                    break;
                                
                                case 2:
                                    try {
                                        HeadPhones.vender2(u);
                                        } catch (SinStock3 ex) {
                                        System.out.println("No hay en stock");
                                        }
                                    break;
                                    
                                case 3:
                                    try {
                                        HeadPhones.vender3(u);
                                        } catch (SinStock3 ex) {
                                        System.out.println("No hay en stock");
                                        };
                                    break;
                                    
                                default:
                                    System.out.println("ERROR");
                                    AcomodarInventario();
                                    break;
                            }
                            
                            System.out.println("Presione ENTER para volver al menu\n▼");
                            int r = input.readInteger();
                            
                            AcomodarInventario();
                            
                            break;
                        default:
                            System.out.println("Error");
                            TeleportVendedor();
                            break;
                    }                    
        
    }
    
}
