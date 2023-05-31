/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author SG701-17
 */
public class ConcreteDecorator_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("--------------------eMail-------------------");        
        System.out.println("Recuerde devolver el libro o revista prestados entre hoy y mañana. Gracias!");
    }
}
