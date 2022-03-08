package VerDatos;

import BaseDatos.BaseDeDatos;
import BaseDatos.TipoDeProducto;

public class VerProducto {
     public void VerProductos(BaseDeDatos db){
        System.out.println("*************************");
        System.out.println("Ver productos");
        System.out.println("*************************");
        TipoDeProducto[] productos_actuales = db.getProducto();
        for(int i = 0; i < productos_actuales.length; i++){
            if (productos_actuales[i] != null)
            System.out.println("id: " + productos_actuales[i].id + ", Nombre: " + productos_actuales[i].TipoDeProducto);
        }
        System.out.println("*************************");
    }
     
    public String getProducto(BaseDeDatos db, int id){
        TipoDeProducto[] productos_actuales = db.getProducto();
        for(int i = 0; i < productos_actuales.length; i++){
            if (productos_actuales[i] != null){
                if (productos_actuales[i].id == id){
                    return productos_actuales[i].TipoDeProducto;
                }
            }
        }
        return "";
    }
}
