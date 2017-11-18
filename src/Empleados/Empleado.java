/*
    Esta clase definira las caracteristicas basicas de un empleado
    FEcha de creacion: 18/9/2017
    Fecha de moduficacion: 18/9/2017
    Autor: Cesar
*/
package Empleados;

public abstract class Empleado {
    
    protected String nombre;
    protected String domicilio;
    protected String telefono;
    protected double sueldo;
    protected String departamento;
    protected String puesto;
    protected double comisiones;
    
    public abstract void nomina();
    
    public abstract void calcularComisiones();   

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
