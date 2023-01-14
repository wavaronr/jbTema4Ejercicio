/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jbtema4ejercicio.jbtema4ejercicio;

/**
 *
 * @author alexn
 */
public class SmartWatch extends SmartDevice{
    
    private String tipoPulsera;

    public SmartWatch() {
    }

    public SmartWatch(String tipoPulsera, String systemOperative, String Serial, String Fabricandte, String modelo) {
        super(systemOperative, Serial, Fabricandte, modelo);
        this.tipoPulsera = tipoPulsera;
    }

    public void setTipoPulsera(String tipoPulsera) {
        this.tipoPulsera = tipoPulsera;
    }

    public String getTipoPulsera() {
        return tipoPulsera;
    }
    
    
    
}
