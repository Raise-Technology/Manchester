/*
    Esta clase definira las caracteristicas basicas de un empleado
    FEcha de creacion: 18/9/2017
    Fecha de moduficacion: 18/9/2017
    Autor: Cesar
*/
package RecursosHumanos;

import Empleados.Empleado;
import Empleados.JefeDepartamento;
import Empleados.Vendedor;


public class RecursosHumanos {
    
    public void aumentarSueldo(Empleado empleado)
    {
        empleado.setSueldo(empleado.getSueldo()*1.2);
    }
    
    public static void main(String[] args) {
        RecursosHumanos RH = new RecursosHumanos();
        
        Vendedor v1 = new Vendedor("Gandalf", "calle 4", "9622334",2200,"Vendedores","Vendedor", 0);
        JefeDepartamento j1 = new JefeDepartamento("Jose", "calle 1", "123456789",4000,"Vendedores","Vendedor", 0,0);
        
        System.out.println(v1.getSueldo());
        System.out.println(j1.getSueldo());
        RH.aumentarSueldo(v1);
        RH.aumentarSueldo(j1);
        System.out.println("Aumento el sueldo: "+v1.getSueldo());
        System.out.println("Aumento el sueldo: "+j1.getSueldo());     
        
        Empleado empleado1 = new Vendedor();
        
        
        
        
    }
    
}
