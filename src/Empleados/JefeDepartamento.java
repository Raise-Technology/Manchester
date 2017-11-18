/*
    Esta clase definira las caracteristicas basicas de un empleado
    FEcha de creacion: 18/9/2017
    Fecha de moduficacion: 18/9/2017
    Autor: Cesar
*/
package Empleados;

import Prestaciones.Seguro;

/**
 *
 * @author Cesar
 */
public class JefeDepartamento extends Empleado implements Seguro{
    Vendedor vendedores[];
    double ventasDepartamento;
    
    public JefeDepartamento()
    {
        nombre = "nombre default";
        domicilio = "domicilio default";
        telefono = "0000000000";
        sueldo = 0;
        departamento = "Vendedores";
        puesto = "Jefe de Departamento";
        comisiones = 0;
        ventasDepartamento = 0;
    }
    
    public JefeDepartamento(String nombre, String domicilio, String telefono, double sueldo, String departamento, String puesto, double comisiones, double ventasDepartamento)
    {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.departamento = departamento;
        this.puesto = puesto;
        this.comisiones = comisiones;
        this.ventasDepartamento = ventasDepartamento;
    }

    public double getVentasDepartamento() {
        return ventasDepartamento;
    }

    public void setVentasDepartamento(double ventasDepartamento) {
        this.ventasDepartamento = ventasDepartamento;
    }
    
    public void asignarVendedores(int numeroVendedores)
    {
        vendedores = new Vendedor[numeroVendedores];
        Vendedor vendedor1 = new Vendedor("Jose", "calle 1", "123456789",2200,"Vendedores","Vendedor", 0);
        vendedores[0] = vendedor1;
        vendedores[1] = new Vendedor("Han Solo", "calle 2", "763298923762",2200,"Vendedores","Vendedor", 0);
        vendedores[2] = new Vendedor("Maximo Decimo Meridio", "calle 3", "45687223",2200,"Vendedores","Vendedor", 0);
        vendedores[3] = new Vendedor("Gandalf", "calle 4", "9622334",2200,"Vendedores","Vendedor", 0);
        vendedores[4] = new Vendedor("Harry Potter", "calle 5", "76456564",2200,"Vendedores","Vendedor", 0);
    }

    @Override
    public void nomina() {
        sueldo = 4000 + 500;
    }

    @Override
    public void calcularComisiones() {        
        for (int i = 0; i < vendedores.length; i++) {
            ventasDepartamento += vendedores[i].getVentasTotales();
        }
        comisiones = ventasDepartamento * 0.01;
    }

    @Override
    public void asignarIncapacidad() {
        System.out.println("Incapacidad por embarazo de 40 dias");
    }
}
