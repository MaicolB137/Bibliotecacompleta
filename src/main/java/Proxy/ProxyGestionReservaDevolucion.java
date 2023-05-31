/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;
import Objetos.*;
/**
 *
 * @author SG701-17
 */
public class ProxyGestionReservaDevolucion implements GestionReservaDevolucion {

    @Override
    public void reservaLibro(String ISBN) {
        System.out.println("Libro con ISBN: "+ISBN+ " reservado con exito");
    }

    @Override
    public void devolucionLibro(String ISBN) {
        System.out.println("Libro con ISBN: "+ISBN+ " Devolucion exitosa");
    }
    
}
