/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jbtema4ejercicio.jbtema4ejercicio;

/**
 *
 * @author alexn
 */
public class SmartDevice {
    
    private String systemOperative;
    private String Serial;
    private String Fabricandte;
    private String modelo;

    public SmartDevice() {
    }

    public SmartDevice(String systemOperative, String Serial, String Fabricandte, String modelo) {
        this.systemOperative = systemOperative;
        this.Serial = Serial;
        this.Fabricandte = Fabricandte;
        this.modelo = modelo;
    }

    public String getSystemOperative() {
        return systemOperative;
    }

    public String getSerial() {
        return Serial;
    }

    public String getFabricandte() {
        return Fabricandte;
    }

    public String getModelo() {
        return modelo;
    }

    public void setSystemOperative(String systemOperative) {
        this.systemOperative = systemOperative;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public void setFabricandte(String Fabricandte) {
        this.Fabricandte = Fabricandte;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

  
    
    
    
}
