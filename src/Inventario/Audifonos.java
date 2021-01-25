/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import static Caja.Ticket.GenerarTicket;

public class Audifonos extends Producto {
    int precio1;
    String marca1;
    String codigo1;
    int cantidad1;
    
    int precio2;
    String marca2;
    String codigo2;
    int cantidad2;
    
    int precio3;
    String marca3;
    String codigo3;
    int cantidad3;

    public Audifonos() {
        this.precio1 = 100;
        this.marca1 = "SkullCandy";
        this.codigo1 = "poo";
        this.cantidad1 = 20;
        
        this.precio2 = 3000;
        this.marca2 = "Airpods";
        this.codigo2 = "eda";
        this.cantidad2 = 400;
        
        this.precio3 = 800;
        this.marca3 = "edap";
        this.codigo3 = "jlmn";
        this.cantidad3 = 34;
    }

    public int getPrecio1() {
        return precio1;
    }

    public void setPrecio1(int precio1) {
        this.precio1 = precio1;
    }

    public String getMarca1() {
        return marca1;
    }

    public void setMarca1(String marca1) {
        this.marca1 = marca1;
    }

    public String getCodigo1() {
        return codigo1;
    }

    public void setCodigo1(String codigo1) {
        this.codigo1 = codigo1;
    }

    public int getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public int getPrecio2() {
        return precio2;
    }

    public void setPrecio2(int precio2) {
        this.precio2 = precio2;
    }

    public String getMarca2() {
        return marca2;
    }

    public void setMarca2(String marca2) {
        this.marca2 = marca2;
    }

    public String getCodigo2() {
        return codigo2;
    }

    public void setCodigo2(String codigo2) {
        this.codigo2 = codigo2;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public int getPrecio3() {
        return precio3;
    }

    public void setPrecio3(int precio3) {
        this.precio3 = precio3;
    }

    public String getMarca3() {
        return marca3;
    }

    public void setMarca3(String marca3) {
        this.marca3 = marca3;
    }

    public String getCodigo3() {
        return codigo3;
    }

    public void setCodigo3(String codigo3) {
        this.codigo3 = codigo3;
    }

    public int getCantidad3() {
        return cantidad3;
    }

    public void setCantidad3(int cantidad3) {
        this.cantidad3 = cantidad3;
    }
    
    
    public void aumentar1(double monto){
        System.out.println("Enviando: "+monto+" albumes de bodega");
        cantidad1+=monto;
        System.out.println("Nuevo stock: "+cantidad1);
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
    
    
    
    public void vender1(int monto) throws SinStock3{
        System.out.println("Vendiendo");
        if(cantidad1 < monto){
            throw new SinStock3();
        }else{
           cantidad1 -= monto; 
        }
        System.out.println("Se ha vendido " + monto + " Audifonos por $" + (precio1*monto));
        GenerarTicket(monto,"Audifonos", marca1,(precio1*monto)); 
    }
    
    
    public void vender2(int monto) throws SinStock3{
        System.out.println("Vendiendo");
        if(cantidad2 < monto){
            throw new SinStock3();
        }else{
           cantidad2 -= monto; 
        }
        System.out.println("Se ha vendido " + monto + " Audifonos por $" + (precio2*monto)); 
        GenerarTicket(monto,"Audifonos", marca2,(precio2*monto)); 
    }
    
    
    public void vender3(int monto) throws SinStock3{
        System.out.println("Vendiendo");
        if(cantidad3 < monto){
            throw new SinStock3();
        }else{
           cantidad3 -= monto; 
        }
        System.out.println("Se ha vendido " + monto + " Audifonospor $" + (precio3*monto)); 
        GenerarTicket(monto,"Audifonos", marca3,(precio3*monto)); 
    }
    
    
public class SinStock3 extends Exception {
    SinStock3(){
        super("No hay dicha cantidad en stock");
    }
    
}
    
}
