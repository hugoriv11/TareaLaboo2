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
public class Producto {
    private double precio;
    private int cant;
    private String proveedor;
    
    public Producto(double precio, int cant, String proveedor){
        this.precio = precio;
        this.cant = cant;
        this.proveedor = proveedor;
    }
    //Getters
    public double getPrecio(){
        return precio;
    }
    
    public int getCant(){
        return cant;
    }
    
    public String getProveedor(){
        return proveedor;
    }
    //Setters
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setCant(int cant){
        this.cant = cant;
    }
    
    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    } 
}
