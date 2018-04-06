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
public class Factura {
    private String cliente;
    private String producto;
    private double precio;
    private double total;
    
    public Factura(String cliente, String producto, int precio, double total){
        this.cliente = cliente;
        this.producto = producto;
        this.precio = precio;
        this.total = total;
    }
    //Getters
    public String getCliente(){
        return cliente;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public double getTotal(){
        return total;
    }
    //Setters
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    public void setProducto(String producto){
        this.producto = producto;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
}
