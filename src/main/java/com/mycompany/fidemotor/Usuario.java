/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fidemotor;

import java.util.Date;

/**
 *
 * @author yagoa
 */
public class Usuario extends Persona {
    private String correoElectronico;
    private String tarjetaCredito;

    public Usuario() {
    }

    public Usuario(String correoElectronico, String tarjetaCredito, String nombre, String apellido, int identificacion, int numeroTelefono, String password, String direccion, char sexo, Date fechaNacimiento) {
        super(nombre, apellido, identificacion, numeroTelefono, password, direccion, sexo, fechaNacimiento);
        this.correoElectronico = correoElectronico;
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    
    
}
