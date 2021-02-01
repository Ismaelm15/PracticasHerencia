/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author ismael
 */
public class Empleado extends Persona {

    double salario;

    public Empleado() {
        super();
        this.salario=900;
    }

    public Empleado(String nombre, String nif, int edad, double salario) {
        super(nombre, nif, edad);
        this.salario = salario;

    }
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void salario(double dineros){
    this.salario+=dineros;
    }
    
    @Override
    public String toString() {
        return "Empleado{"+super.toString() + "salario=" + salario + '}';
    }

    
    
}
