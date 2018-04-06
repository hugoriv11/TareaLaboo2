/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Hjr;

/**
 *
 * @author Toshiba
 */
public class Proveedor {
    private String nombre;
    private String tel;
    private String producto;
    private double precio;
    private int cant;
    
    public Proveedor(String nombre, String tel, String producto, double precio, int cant){
        this.nombre = nombre;
        this.tel = tel;
        this.producto = producto;
        this.precio = precio;
        this.cant = cant;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    
    public String getTel(){
        return tel;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getCant(){
        return cant;
    }
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTel(String tel){
        this.tel = tel;
    }
    
    public void setProducto(String producto){
        this.producto = producto;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
     public void setCant(int cant){
         this.cant = cant;
    }
}
