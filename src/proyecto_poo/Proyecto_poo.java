/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.io.*;

public class Proyecto_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mainScreen();
        
    }
        
    
    
    public static void mainScreen() {
        
        MuestraTxt("files/Main Screen.txt");
                
        KeyboardInput input = new KeyboardInput(); 
        System.out.println("▼");
        int a = input.readInteger();
        switch (a){
            case 1:
                
                registro();               
                
                break;
            case 2:
                
                   inicioDeSesion();
                   
                break;
            case 3:
                
                   System.out.println("Saliendo del sistema");
                   System.exit(0);
                   
                break;
            default:
                System.out.println("ERROR, ocpcion no valida");
                mainScreen();
                break;
            
        }
        
    }
    
    public static void registro() {
                
        BufferedReader br;
        String user = "";
        String passcode = "";
        String profile = "";
        KeyboardInput input = new KeyboardInput(); 
        
        
        clearScreen();
        MuestraTxt("files/Register Screen.txt");
                
                try{
                    br = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Ingrese su nombre de usuario:");
                    user = br.readLine();    
                    System.out.println("\nIngrese su contraseña:");
                    passcode = br.readLine();    
                    System.out.println("\nIngrese su tipo de perfil:\n\n   [1] Cliente\n   [2] Empleado - Vendedor\n   [3] Empleado - Acomodador\n\n▼");
                    int b = input.readInteger();
                    switch (b){
                        case 1:
                            profile = "1";
                            break;
                        case 2:
                            profile = "2";
                            break;
                        case 3:
                            profile = "3";
                            break;
                        default:
                            System.out.println("Perfil no encontrado, generado como cliente por defecto.");
                            profile = "1";
                            break;
                    }                    
                    
                    FileWriter fw = new FileWriter("files/Registros.txt",true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                try (PrintWriter salida = new PrintWriter(bw)) {
                    salida.println("DATA");
                    salida.println(user);
                    salida.println(passcode);
                    salida.println(profile);
                    salida.close();
                    }            
                }catch(IOException ioe){}
                
                System.out.println("\n\nCuenta creada exitosamente");
                clearScreen();
                mainScreen();
    }
        
    public static void inicioDeSesion() {
        clearScreen();
        MuestraTxt("files/Sesion Screen.txt");
        
        BufferedReader br;
        String passcode = "";
        String profile = "";        
        KeyboardInput input = new KeyboardInput(); 
                         
         try{
            
            FileReader fr = new FileReader("files/Registros.txt");
            br = new BufferedReader(fr);       
            String linea = br.readLine();
            
            System.out.println("Ingrese su nombre de usuario:");
            String b = input.readString();
            
            while(linea != null){
                linea = br.readLine();
                
                if(linea.equalsIgnoreCase(b)) {

                System.out.println("\n\n>> Usuario " + linea + " encontrado <<\n\n");
                                
                passcode =  br.readLine(); 
                profile =  br.readLine();
                int type = Integer.parseInt(profile);
                
                System.out.println("Ingrese la contraseña: ");
                String c = input.readString();
                
                if (passcode.equalsIgnoreCase(c)){
                    System.out.println("Contraseña correcta :D\n\n\n");
                    System.out.println("\nBienvenido " + linea );
                    
                    switch(type){
                        case 1:
                            System.out.println("Redirigir a Cliente");
                            Personal.Cliente.TeleportCliente();
                            break;
                        case 2:
                            System.out.println("Redirigir a Vendedor");
                            Personal.Vendedor.TeleportVendedor();
                            break;
                        case 3:
                            System.out.println("Redirigir a Acomodador");
                            Personal.Acomodador.TeleportAcomodador();
                            break;
                        case 4:
                            System.out.println("Redirigir a Gerente");
                            Personal.Gerente.TeleportGerente();
                            break;
                        default:
                            System.out.println("Si estas viendo esto.... ¿Que hiciste?");
                            break;
                            
                    }
                }else{
                    System.out.println("Contraseña incorrecta :c");
                    clearScreen();
                    mainScreen();
                }
                
                break;

            }else{
                    System.out.println("Usuario no encontrado");
                    clearScreen();
                    mainScreen();
                }
                
            }
            br.close();
        }catch(IOException ioe){}
        
        
    }
    
    public static void clearScreen() {  
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
    }
        
     public static void MuestraTxt(String file) {  
        
        BufferedReader br;
        try{
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            System.out.println("\n");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException ioe){} 
    }
    
    }
    

