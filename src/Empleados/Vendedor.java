/*
    Esta clase implementara los metodos de un vendedor
    FEcha de creacion: 18/9/2017
    Fecha de moduficacion: 18/9/2017
    Autor: Cesar
*/
package Empleados;

import Prestaciones.Seguro;

public class Vendedor extends Empleado implements Seguro{
    private double ventasTotales;
    
    public Vendedor()
    {
        nombre = "nombre default";
        domicilio = "domicilio default";
        telefono = "0000000000";
        sueldo = 0;
        departamento = "Vendedores";
        puesto = "Vendedor";
        comisiones = 0;
    }
    
    public Vendedor(String nombre, String domicilio, String telefono, double sueldo, String departamento, String puesto, double comisiones)
    {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.departamento = departamento;
        this.puesto = puesto;
        this.comisiones = comisiones;
    }
    
    @Override
    public void nomina() {
        sueldo = 2200+500;
    }

    @Override
    public void calcularComisiones() {
        comisiones = ventasTotales * 0.05;
    }
    
    public void calcularVenta(double venta)
    {
        ventasTotales += venta;
    }

    public double getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(double ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    @Override
    public void asignarIncapacidad() {
        System.out.println("Incapacidad de 10 dias por esguince de tobillo");
    }
    
}
