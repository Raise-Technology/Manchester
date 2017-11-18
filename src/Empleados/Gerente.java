/*
    Esta clase definira las caracteristicas basicas de un gerente
    FEcha de creacion: 18/9/2017
    Fecha de moduficacion: 18/9/2017
    Autor: Cesar
*/
package Empleados;


public class Gerente extends Empleado{
    JefeDepartamento jefesDepartamento[];
    
     public Gerente()
    {
        nombre = "nombre default";
        domicilio = "domicilio default";
        telefono = "0000000000";
        sueldo = 0;
        departamento = "Vendedores";
        puesto = "Gerente";
        comisiones = 0;       
    }
     
     public void asignarJefesDepartamento(int numeroJefesDepartamento)
    {
        jefesDepartamento = new JefeDepartamento[numeroJefesDepartamento];
        
      
        jefesDepartamento[0] = new JefeDepartamento("Jose", "calle 1", "123456789",2200,"Vendedores","Vendedor", 0,0);
        jefesDepartamento[1] = new JefeDepartamento("Han Solo", "calle 2", "763298923762",2200,"Vendedores","Vendedor", 0,0);
        jefesDepartamento[2] = new JefeDepartamento("Maximo Decimo Meridio", "calle 3", "45687223",2200,"Vendedores","Vendedor", 0,0);
        jefesDepartamento[3] = new JefeDepartamento("Gandalf", "calle 4", "9622334",2200,"Vendedores","Vendedor", 0,0);
        jefesDepartamento[4] = new JefeDepartamento("Harry Potter", "calle 5", "76456564",2200,"Vendedores","Vendedor", 0,0);
    }
    @Override
    public void calcularComisiones() {
        double ventasGerente = 0;
        for (int i = 0; i < jefesDepartamento.length; i++) {
            ventasGerente += jefesDepartamento[i].getVentasDepartamento();
        }
        comisiones = ventasGerente * 0.01;
    }
    @Override
    public void nomina() {
        sueldo = 8000 + 500;
    }

    
    
    
}
