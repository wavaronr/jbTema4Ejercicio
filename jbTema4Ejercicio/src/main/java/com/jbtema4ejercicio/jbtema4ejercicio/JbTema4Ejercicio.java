/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jbtema4ejercicio.jbtema4ejercicio;

/**
 *
 * @author alexn
 */
public class JbTema4Ejercicio {

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        // instancia telefono con herencia desde SmartDevice
        myPhone.setCamara("20Mpx");
        myPhone.setCantSim(2);
        myPhone.setSystemOperative("Andorid ");
        myPhone.setSerial("ASDFG123456");
        myPhone.setFabricandte("OPPO");
        myPhone.setModelo("2022");        
        
        System.out.println("Telefono");
        System.out.println("Camara: "+myPhone.getCamara());
        System.out.println("Cantidad de Sim: "+myPhone.getCantSim());     
        System.out.println("SO: "+myPhone.getSystemOperative());     
        System.out.println("Serial: "+myPhone.getSerial());     
        System.out.println("Fabricante: "+myPhone.getFabricandte());     
        System.out.println("Modelo: "+myPhone.getModelo());     
        System.out.println("\n");  
        SmartWatch myWatch = new SmartWatch("Plastico Nego", "Apple 14", "abcdef456789", "APPLE", "2023");
        
        System.out.println("Reloj");
        System.out.println("Pulsera: "+myWatch.getTipoPulsera());
        System.out.println("SO: "+myWatch.getSystemOperative());     
        System.out.println("Serial: "+myWatch.getSerial());     
        System.out.println("Fabricante: "+myWatch.getFabricandte());     
        System.out.println("Modelo: "+myWatch.getModelo());     
        
        
    }
}
