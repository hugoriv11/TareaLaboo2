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
public class Admin {
    private String nombre;
    private String pass;
    
    public Admin(String nombre, String pass){
        this.nombre = nombre;
        this.pass = pass;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    
    public String getPass(){
        return pass;
    }
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
}
