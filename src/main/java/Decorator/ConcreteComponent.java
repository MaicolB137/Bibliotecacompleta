/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author SG701-17
 */
public class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("Accediendo a base de datos de la biblioteca institucional");
        System.out.println(prestamo());
    }
    
    public String prestamo (){
        return "Prestamo realizado con exito";
    }
    
}
