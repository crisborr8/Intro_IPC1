package SuperMercado;

import BaseDatos.BaseDeDatos;
import IngresoDeDatos.IngresoDeMarca;
import VerDatos.VerMarca;
import java.util.Scanner;

public class Menu {
    
    /*
    1. Base de datos
    2. Menu para ingresar datos
    3. Ingresar los datos
    4. Menu para visualizar los datos ingresados
    */
    
    private int IngresoDato(int minimo, int maximo){
        Scanner ingreso = new Scanner(System.in);
        int var_ingreso = 0;
        while (true){
            try{
                var_ingreso = ingreso.nextInt();
                if (var_ingreso >= minimo && var_ingreso <= maximo){
                    return var_ingreso;
                }
                System.out.println("ERROR!! El número a ingresar debe de estar entre " + minimo + " y " + maximo);
                ingreso = new Scanner(System.in);
            }catch(Exception ex){
                System.out.println("ERROR!! Ingrese un dato tipo numérico");
                ingreso = new Scanner(System.in);
            }
        }
    }
    /*
        1. Muestre el mensaje de donde estoy
        2. Quiero que me permita escoger entre ingresar una marca, un tipo de producto, o un codigo de barras
        3. quiero que me informe si se ingreso con exito
        4. quiero que me pregunte si quiero ingresar otro dato o salir
    */
    IngresoDeMarca im = new IngresoDeMarca();
    BaseDeDatos db = new BaseDeDatos();
    private void IngresoDatos(){
        int eleccion = 0;
        System.out.println("*************************");
        while(true){
            System.out.println("*************************");
            System.out.println("Ingreso de datos!!!!");
            System.out.println("*************************");
            System.out.println("Seleccione una opcion:");
            System.out.println("1.- Ingresar marca");
            System.out.println("2.- Ingresar tipo de producto");
            System.out.println("3.- Ingresar codigo de barras");
            System.out.println("4.- Salir");
            eleccion = IngresoDato(1, 4);
            switch(eleccion){
                case 1:
                    //Ingreso de marca
                    im.IngresarMarca(db);
                    break;
                case 2:
                    //Ingreso de tipo de producto
                    break;
                case 3:
                    //Ingreso de codigo de barras
                    break;
            }
            if (eleccion == 4) break;
        }
        System.out.println("Ha salido de ingreso...");
    }
    
    VerMarca vm = new VerMarca();
    private void VerDatos(){
        int eleccion = 0;
        System.out.println("*************************");
        while(true){
            System.out.println("*************************");
            System.out.println("Ver datos!!!!");
            System.out.println("*************************");
            System.out.println("Seleccione una opcion:");
            System.out.println("1.- Ver marca");
            System.out.println("2.- Ver tipo de producto");
            System.out.println("3.- Ver codigo de barras");
            System.out.println("4.- Salir");
            eleccion = IngresoDato(1, 4);
            switch(eleccion){
                case 1:
                    //Ingreso de marca
                    vm.VerMarcas(db);
                    break;
                case 2:
                    //Ingreso de tipo de producto
                    break;
                case 3:
                    //Ingreso de codigo de barras
                    break;
            }
            if (eleccion == 4) break;
        }
        System.out.println("Ha salido de ver datos...");
    }
    
    private void MenuPrincipal(){
        int eleccion = 0;
        while(true){
            System.out.println("Bienvenido a SuperMarket");
            System.out.println("*************************");
            System.out.println("Menu principal");
            System.out.println("*************************");
            System.out.println("Seleccione una opcion:");
            System.out.println("1.- Ingresar datos");
            System.out.println("2.- Ver datos");
            System.out.println("3.- Vender producto");
            System.out.println("4.- Salir");
            eleccion = IngresoDato(1, 4);
            // eleccion == 1 || eleccion == 2, ....
            switch(eleccion){
                case 1:
                    //Ingreso de datos
                    IngresoDatos();
                    break;
                case 2:
                    VerDatos();
                    //Ver datos
                    break;
                case 3:
                    //Vender producto
                    break;
            }
            if (eleccion == 4) break; /// if, while, for ---> no usar {} siempre y cuando lo que este adentro solo sea 1 linea de codigo
        }
        System.out.println("Gracias por su compra");
    }
    
    public static void main (String[] args){
        BaseDeDatos db = new BaseDeDatos();
        Menu mn = new Menu();
        mn.MenuPrincipal();
    }
    
}
