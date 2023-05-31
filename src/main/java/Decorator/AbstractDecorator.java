/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author SG701-17
 */
public class AbstractDecorator extends Component {
    //Atributos
    protected Component componente;
    //private ConcreteComponent componente;

    public void doJob() {
        if(componente!=null)
            componente.doJob();
        else
            System.out.println("No existen prestamos realizados");
    }

    public void setComponente(Component componente) {
        this.componente = componente;
    }
    
}
