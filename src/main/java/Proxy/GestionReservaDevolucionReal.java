/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;
import Objetos.*;
import java.util.List;
/**
 *
 * @author SG701-17
 */
public class GestionReservaDevolucionReal implements GestionReservaDevolucion {

    ProxyGestionReservaDevolucion service;
    @Override
    public void reservaLibro(String ISBN) {
        System.out.println("Ejecutando Proxy: reserva del libro\n");
        if (service==null) 
            service=new ProxyGestionReservaDevolucion();
        service.reservaLibro(ISBN);
    }

    @Override
    public void devolucionLibro(String ISBN) {
        System.out.println("Ejecutando Proxy: devolucion del libro\n");
        if (service==null) 
            service=new ProxyGestionReservaDevolucion();
        service.devolucionLibro(ISBN);
    }
    
}

