
package IngresoDeDatos;

import BaseDatos.BaseDeDatos;
import java.util.Scanner;

import VerDatos.VerProducto;
import VerDatos.VerMarca;

public class IngreosDeCodigoDeBarra {
    
    public void IngresarCodigos(BaseDeDatos db){
        /*
            String descripcion, double precio, int cantidad, int idTipoProducto, int idMarca
        */
        System.out.println("Ingrese la descripcion del codigo de barras a ingresar:");
        Scanner ingreso = new Scanner(System.in);
        String descripcion = ingreso.nextLine();
        System.out.println("Ingrese el precio del codigo de barras a ingresar:");
        double precio = ingreso.nextDouble();
        System.out.println("Ingrese la cantidad del codigo de barras a ingresar:");
        int cantidad = ingreso.nextInt();
        System.out.println("Ingrese el id del tipo de pruducto del codigo de barras a ingresar:");
        VerProducto vp = new VerProducto();
        vp.VerProductos(db);
        int idTipoProducto = ingreso.nextInt();
        System.out.println("Ingrese el id del tipo de pruducto del codigo de barras a ingresar:");
        VerMarca vm = new VerMarca();
        vm.VerMarcas(db);
        int idMarca = ingreso.nextInt();
        db.IngresarCodigoBarras(descripcion, precio, cantidad, idTipoProducto, idMarca);
        System.out.println("Se ha ingresado la marca con éxito!!!");
    }
    
}
