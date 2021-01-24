/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caja;

/**
 *
 * @author jopl1
 */
import java.io.IOException;

public class Procesos {

   public void cargarArchivo() {
       abrir();
   }

  private void abrir() {
  //ruta del archivo en el pc
  String file = new String("files/~Ticket.txt"); 
  
 try{ 
   //definiendo la ruta en la propiedad file
   Runtime.getRuntime().exec("cmd /c start "+file);
    
   }catch(IOException e){
      e.printStackTrace();
   } 
  }
}
