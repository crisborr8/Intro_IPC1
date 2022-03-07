
package IngresoDeDatos;

import BaseDatos.BaseDeDatos;
import java.util.Scanner;

public class IngresoDeMarca {
    
    public void IngresarMarca(BaseDeDatos db){
        System.out.println("Ingrese el nombre de la marca a ingresar:");
        Scanner nombre_marca = new Scanner(System.in);
        String nombre = nombre_marca.nextLine();
        db.IngresarMarca(nombre);
        System.out.println("Se ha ingresado la marca con éxito!!!");
    }
    
}
