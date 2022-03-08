package IngresoDeDatos;

import BaseDatos.BaseDeDatos;
import java.util.Scanner;

public class IngresoDeProducto {
    
    public void IngresarProducto(BaseDeDatos db){
        System.out.println("Ingrese el nombre del producto a ingresar:");
        Scanner nombre_producto = new Scanner(System.in);
        String nombre = nombre_producto.nextLine();
        db.IngresarTipoDeProducto(nombre);
        System.out.println("Se ha ingresado el producto con éxito!!!");
    }
    
}
