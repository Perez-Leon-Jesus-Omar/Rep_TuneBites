/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import static Caja.Ticket.GenerarTicket;



/**
 *
 * @author johan
 */
public class DiscMusica extends Producto{
    String NomD;
    String Artista;
    int cantidad;
    float Precio;
    int Ncanciones;
    String codigo;
    float duracion;
    
    String NomD2;
    String Artista2;
    int cantidad2;
    float Precio2;
    int Ncanciones2;
    String codigo2;
    float duracion2;
    
    String NomD3;
    String Artista3;
    int cantidad3;
    float Precio3;
    int Ncanciones3;
    String codigo3;
    float duracion3;

    
    public DiscMusica() {
        this.NomD = "Rock";
        this.Artista = "Led Zeppelin";
        this.cantidad = 4;
        this.Precio = 40;
        this.Ncanciones = 15;
        this.codigo = "ABDC";
        this.duracion = 22.3f;
        
        this.NomD2 = "Pop";
        this.Artista2 = "Lady Gaga";
        this.cantidad2 = 5;
        this.Precio2 = 45;
        this.Ncanciones2 = 13;
        this.codigo2 = "DEFG";
        this.duracion2 = 25.4f;
        
        this.NomD3 = "Electronica";
        this.Artista3 = "Martin Garrix";
        this.cantidad3 = 2;
        this.Precio3 = 60;
        this.Ncanciones3 = 10;
        this.codigo3 = "HIJK";
        this.duracion3 = 26.4f;
    }

    

    public String getNomD() {
        return NomD;
    }

    public void setNomD(String NomD) {
        this.NomD = NomD;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getNcanciones() {
        return Ncanciones;
    }

    public void setNcanciones(int Ncanciones) {
        this.Ncanciones = Ncanciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getNomD2() {
        return NomD2;
    }

    public void setNomD2(String NomD2) {
        this.NomD2 = NomD2;
    }

    public String getArtista2() {
        return Artista2;
    }

    public void setArtista2(String Artista2) {
        this.Artista2 = Artista2;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public float getPrecio2() {
        return Precio2;
    }

    public void setPrecio2(float Precio2) {
        this.Precio2 = Precio2;
    }

    public int getNcanciones2() {
        return Ncanciones2;
    }

    public void setNcanciones2(int Ncanciones2) {
        this.Ncanciones2 = Ncanciones2;
    }

    public String getCodigo2() {
        return codigo2;
    }

    public void setCodigo2(String codigo2) {
        this.codigo2 = codigo2;
    }

    public float getDuracion2() {
        return duracion2;
    }

    public void setDuracion2(float duracion2) {
        this.duracion2 = duracion2;
    }

    public String getNomD3() {
        return NomD3;
    }

    public void setNomD3(String NomD3) {
        this.NomD3 = NomD3;
    }

    public String getArtista3() {
        return Artista3;
    }

    public void setArtista3(String Artista3) {
        this.Artista3 = Artista3;
    }

    public int getCantidad3() {
        return cantidad3;
    }

    public void setCantidad3(int cantidad3) {
        this.cantidad3 = cantidad3;
    }

    public float getPrecio3() {
        return Precio3;
    }

    public void setPrecio3(float Precio3) {
        this.Precio3 = Precio3;
    }

    public int getNcanciones3() {
        return Ncanciones3;
    }

    public void setNcanciones3(int Ncanciones3) {
        this.Ncanciones3 = Ncanciones3;
    }

    public String getCodigo3() {
        return codigo3;
    }

    public void setCodigo3(String codigo3) {
        this.codigo3 = codigo3;
    }

    public float getDuracion3() {
        return duracion3;
    }

    public void setDuracion3(float duracion3) {
        this.duracion3 = duracion3;
    }

     
    public void aumentar1(double monto){
        System.out.println("Enviando: "+monto+" albumes de bodega");
        cantidad+=monto;
        System.out.println("Nuevo stock: "+cantidad);
    }
    
    public void aumentar2(double monto){
        System.out.println("Enviando: "+monto+" albumes de bodega");
        cantidad2+=monto;
        System.out.println("Nuevo stock: "+cantidad2);
    }
    
    public void aumentar3(double monto){
        System.out.println("Enviando: "+monto+" albumes de bodega");
        cantidad3+=monto;
        System.out.println("Nuevo stock: "+cantidad3);
    }
    
    
    
    public void vender1(int monto) throws SinStock2{
        System.out.println("Vendiendo");
        if(cantidad < monto){
            throw new SinStock2();
        }else{
           cantidad -= monto; 
        }
        System.out.println("Se ha vendido" + monto + " Album por $" + (Precio*monto)); 
        GenerarTicket(monto,NomD, Artista,(Precio*monto));
    }
    
    
    public void vender2(int monto) throws SinStock2{
        System.out.println("Vendiendo");
        if(cantidad2 < monto){
            throw new SinStock2();
        }else{
           cantidad2 -= monto; 
        }
        System.out.println("Se ha vendido" + monto + " Album por $" + (Precio2*monto)); 
        GenerarTicket(monto,NomD2, Artista2,(Precio2*monto));
    }
    
    
    public void vender3(int monto) throws SinStock2{
        System.out.println("Vendiendo");
        if(cantidad3 < monto){
            throw new SinStock2();
        }else{
           cantidad3 -= monto; 
        }
        System.out.println("Se ha vendido " + monto + " Album por $" + (Precio3*monto)); 
        GenerarTicket(monto,NomD3, Artista3,(Precio3*monto));
    }
    
        
public class SinStock2 extends Exception {
    SinStock2(){
        super("No hay dicha cantidad en stock");
    }
    
}
    
    @Override
    public String toString() {
        return "DiscMusica{" + "NomD=" + NomD + ", Artista=" + Artista + ", cantidad=" + cantidad + ", Precio=" + Precio + ", Ncanciones=" + Ncanciones + ", codigo=" + codigo + ", duracion=" + duracion + ", NomD2=" + NomD2 + ", Artista2=" + Artista2 + ", cantidad2=" + cantidad2 + ", Precio2=" + Precio2 + ", Ncanciones2=" + Ncanciones2 + ", codigo2=" + codigo2 + ", duracion2=" + duracion2 + ", NomD3=" + NomD3 + ", Artista3=" + Artista3 + ", cantidad3=" + cantidad3 + ", Precio3=" + Precio3 + ", Ncanciones3=" + Ncanciones3 + ", codigo3=" + codigo3 + ", duracion3=" + duracion3 + '}';
    }
    
    
    
}
