/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fidemotor;

/**
 *
 * @author yagoa
 */
public class Motocicleta extends Vehiculo{
   private String tipo; 

    public Motocicleta(String tipo, String marca, int anio, String modelo, float precio) {
        super(marca, anio, modelo, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
