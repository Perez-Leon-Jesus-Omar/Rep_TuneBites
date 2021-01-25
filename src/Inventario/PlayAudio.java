/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author jopl1
 */
import java.io.IOException;

public class PlayAudio {

   public void cargarArchivo(String archivo) {
       abrir(archivo);
   }

  private void abrir(String archivo) {
  //ruta del archivo en el pc
  String file = new String(archivo); 
  
 try{ 
   //definiendo la ruta en la propiedad file
   Runtime.getRuntime().exec("cmd /c start "+file);
    
   }catch(IOException e){
      e.printStackTrace();
   } 
  }
}
