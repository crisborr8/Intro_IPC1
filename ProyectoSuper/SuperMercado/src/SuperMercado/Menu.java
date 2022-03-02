package SuperMercado;

import BaseDatos.BaseDeDatos;

public class Menu {
    
    public static void main (String[] args){
        BaseDeDatos db = new BaseDeDatos();
        int cantidad_llena = 0;
        for(int i = 0; i < db.marcas.length; i++){
            if (db.marcas[i] != null){
                cantidad_llena ++;
            }
        }
        System.out.println("El tamaño inicial de Marcas[] es -> " + cantidad_llena);
        db.IngresarMarca("Tommy");
        cantidad_llena = 0;
        for(int i = 0; i < db.marcas.length; i++){
            if (db.marcas[i] != null){
                cantidad_llena ++;
            }
        }
        System.out.println("El tamaño actual de Marcas[] es -> " + cantidad_llena);
    }
    
}
