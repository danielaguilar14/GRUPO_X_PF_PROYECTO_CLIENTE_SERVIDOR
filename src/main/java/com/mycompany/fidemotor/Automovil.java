/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fidemotor;

/**
 *
 * @author yagoa
 */
public class Automovil extends Vehiculo {
   private int capacidadPasajero;

    public Automovil(int capacidadPasajero, String marca, int anio, String modelo, float precio) {
        super(marca, anio, modelo, precio);
        this.capacidadPasajero = capacidadPasajero;
    }

    public int getCapacidadPasajero() {
        return capacidadPasajero;
    }

    public void setCapacidadPasajero(int capacidadPasajero) {
        this.capacidadPasajero = capacidadPasajero;
    }
   
   
}
