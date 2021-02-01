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
public class Programador extends Empleado{
    public TProgramador estado;


    public Programador(String nombre, String nif, int edad, double salario,TProgramador estado) {
        super(nombre, nif, edad, salario);
        this.estado=estado;
    }

    public TProgramador getEstado() {
        return estado;
    }

    public void setEstado(TProgramador estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Programador{" + "estado=" + estado + '}';
    }

    
    
}
