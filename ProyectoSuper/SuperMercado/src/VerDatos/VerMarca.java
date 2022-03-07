
package VerDatos;

import BaseDatos.BaseDeDatos;
import BaseDatos.Marca;

public class VerMarca {
    
    public void VerMarcas(BaseDeDatos db){
        System.out.println("*************************");
        System.out.println("Ver marcas");
        System.out.println("*************************");
        Marca[] marcas_actuales = db.getMarca();
        for(int i = 0; i < marcas_actuales.length; i++){
            if (marcas_actuales[i] != null)
            System.out.println("id: " + marcas_actuales[i].id + ", Nombre: " + marcas_actuales[i].Marca);
        }
        System.out.println("*************************");
    }
    
}
