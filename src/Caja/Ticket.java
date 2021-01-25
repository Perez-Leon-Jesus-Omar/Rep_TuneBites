/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author johan
 */
public class Ticket {    
    
    public static void GenerarTicket(int cantidad,String nombre, String artista, float precio) {  
        
        System.out.println("Generando Ticket\n\n");
        
        BufferedReader br;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            
            FileWriter fw = new FileWriter("files/~Ticket.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.println("                   .___________. __    __  .__   __.  _______    .______    __  .___________. _______      _______.\n" +
"                   |           ||  |  |  | |  \\ |  | |   ____|   |   _  \\  |  | |           ||   ____|    /       |\n" +
"                   `---|  |----`|  |  |  | |   \\|  | |  |__      |  |_)  | |  | `---|  |----`|  |__      |   (----`\n" +
"                       |  |     |  |  |  | |  . `  | |   __|     |   _  <  |  |     |  |     |   __|      \\   \\    \n" +
"                       |  |     |  `--'  | |  |\\   | |  |____    |  |_)  | |  |     |  |     |  |____ .----)   |   \n" +
"                       |__|      \\______/  |__| \\__| |_______|   |______/  |__|     |__|     |_______||_______/    \n" +
"============================================================================================================================================\n\n                                                                                                \n");
            
             salida.println("                                               Gracias por tu compra!!");
             salida.println("                                               Hoy adquiriste "+ cantidad +": \n");
             salida.println("                                               "+nombre +" de "+ artista);
             salida.println("                                               Por: $" + precio );
             salida.println("\n\n\n============================================================================================================================================"
                     + "\n____    ____  __    __   _______  __      ____    ____      ___         .______   .______        ______   .__   __. .___________.  ______   \n" +
"\\   \\  /   / |  |  |  | |   ____||  |     \\   \\  /   /     /   \\        |   _  \\  |   _  \\      /  __  \\  |  \\ |  | |           | /  __  \\  \n" +
" \\   \\/   /  |  |  |  | |  |__   |  |      \\   \\/   /     /  ^  \\       |  |_)  | |  |_)  |    |  |  |  | |   \\|  | `---|  |----`|  |  |  | \n" +
"  \\      /   |  |  |  | |   __|  |  |       \\      /     /  /_\\  \\      |   ___/  |      /     |  |  |  | |  . `  |     |  |     |  |  |  | \n" +
"   \\    /    |  `--'  | |  |____ |  `----.   \\    /     /  _____  \\     |  |      |  |\\  \\----.|  `--'  | |  |\\   |     |  |     |  `--'  | \n" +
"    \\__/      \\______/  |_______||_______|    \\__/     /__/     \\__\\    | _|      | _| `._____| \\______/  |__| \\__|     |__|      \\______/  " );
            salida.close();
            
        }catch(IOException ioe){}
        abrirTicket();
    }
    
    public static void abrirTicket(){
        
        PrintTicket misProcesos=new PrintTicket();
        misProcesos.cargarArchivo();
    }
    
       
    
}
