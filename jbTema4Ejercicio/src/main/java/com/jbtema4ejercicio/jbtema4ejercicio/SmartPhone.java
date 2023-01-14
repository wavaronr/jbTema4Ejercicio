/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jbtema4ejercicio.jbtema4ejercicio;

/**
 *
 * @author alexn
 */
public class SmartPhone extends SmartDevice {
    
    private String Camara;
    private int cantSim;

    public SmartPhone() {
    }

    public SmartPhone(String Camara, int cantSim, String systemOperative, String Serial, String Fabricandte, String modelo) {
        super(systemOperative, Serial, Fabricandte, modelo);
        this.Camara = Camara;
        this.cantSim = cantSim;
    }

    public String getCamara() {
        return Camara;
    }

    public int getCantSim() {
        return cantSim;
    }

    public void setCamara(String Camara) {
        this.Camara = Camara;
    }

    public void setCantSim(int cantSim) {
        this.cantSim = cantSim;
    }

   

 
    
    
}
