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
public class Cliente {
    private String nombre;
    
    public Cliente(String nombre){
        this.nombre = nombre;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
