/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fidemotor;

/**
 *
 * @author yagoa
 */
public class Vehiculo {
    private String marca;
    private int anio;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, int anio, String modelo, float precio) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Vehiculo() {
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
