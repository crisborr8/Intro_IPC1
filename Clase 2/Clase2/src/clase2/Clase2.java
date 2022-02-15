/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author crisb
 */
public class Clase2 {
    //Sentencias lógicas
    //if
    public void UnIf(){
        /*
        == igualacion
        != no igual
        > mayor
        < menor que
        >= mayor o igual
        <= menor o igual
        !(2<1) no o negacion
        
        || -> or ->> voy a devolver un valor verdadero siempre que alguna de las expresiones a mi derecha o a mi
                    izquierda sea verdadera
                    (1==1) || (2==1) --> (true) || (false) --> regreso verdadero
        && -> and ->> voy a devolver un valor verdader siempre que las DOS expresiones a mi derecha e izquierda
                    sean verdaderas
                    (1==1) && (2==1) --> (true) && (falsa) --> regreso falsa
        
                      True
        if (ALGUNA_SENTENCIA_LÓGICA){
        
        }
        */
        if(false){
            System.out.println("Estoy adentro del if");
        }
        System.out.println("Fin del if");
    }
    //if - else
    //si es verdadero -> hacer lo siguiente
    //si no -> hacer lo siguiente
    public void if_else(){
        /*
        if (ALGUNA_SENTENCIA_LÓGICA){
            ALGUN_CODIGO
        }
        else{
            ALGUN_OTRO_CODIGO
        }
        EL_RESTO_DEL_CODIGO
        */
        if (false){
            System.out.println("Es verdadera la sentencia");
        }
        else{
            System.out.println("Es falsa la sentencia");
        }
        System.out.println("Resto del codigo");
    }
    //if anidados
    public void if_anidado1(){
        /*
           True True-> 
                      True
            if (ALGUNA_SENTENCIA_LÓGICA){
                if (ALGUNA_SENTENCIA_LÓGICA){

        
        
        
                }
            }
        */
        if (false){
            if(true){
                System.out.println("Son dos verdaderas seguidas");
            }
            else{
                System.out.println("La última es falsa");
            }
        }
        else{
            System.out.println("La primera es falsa");
        }
        
    }
    public void eleccion(){
        
        /*
        1 - 10   -> 54
                    valor_ingresado == 1
            if (ALGUNA_SENTENCIA_LÓGICA){ 
                ALGUN_CODIGO
            }
                        valor_ingresado == 2
            else if(ALGUNA_SENTENCIA_LÓGICA){
                ALGUN_CODIGO
            } 
            else if(ALGUNA_SENTENCIA_LÓGICA){ == 3
                ALGUN_CODIGO
            } 
            else if(ALGUNA_SENTENCIA_LÓGICA){ ==4
                ALGUN_CODIGO
            } 
            else if(ALGUNA_SENTENCIA_LÓGICA){
                ALGUN_CODIGO
            } 
            else if(ALGUNA_SENTENCIA_LÓGICA){ ==10
                ALGUN_CODIGO
            } 
            else {
                ALGUN_OTRO_CODIGO
            }
        */
        /// Valor1 == (exactamente igual a ) Valor2
        /// (Siempre que el valor 1 sea string) -> Valor1.equals(Valor2)
        System.out.println("Ingresa una opcion");
        System.out.println("10.- Menu principal");
        System.out.println("9.- Contabilidad");
        System.out.println("8.- Base de datos");
        System.out.println("7.- Chat princiapal");
        
        Scanner ingreso = new Scanner(System.in);
        String eleccion = ingreso.nextLine();
        
        if(eleccion.equals("10")){
            System.out.println("Menu principal!!!");
        }
        else if (eleccion.equals("9")){
            System.out.println("Contabilidad!!!");
        }
        else if (eleccion.equals("8")){
            System.out.println("Base de datos!!!");
        }
        else if (eleccion.equals("7")){
            System.out.println("Chat princiapal!!!");
        }
    }
    
    //Switch
    public void estoEsUnSwitch(){
        /*
            if cuando este es una condicion de igualacion
            cuando todos los if que intentamos realizar son igualaciones
            switch (VARIABLE){
                case COMPARACION1:
                    ALGUN_CODIGO;
                break;
                case COMPARACION2:
                    ALGUN_CODIGO;
                break;
                case COMPARACION3:
                    ALGUN_CODIGO;
                break;
                case COMPARACION4:
                    ALGUN_CODIGO;
                break;
                case COMPARACION5:
                    ALGUN_CODIGO;
                break;
            }
        */
        
        System.out.println("Ingresa una opcion");
        System.out.println("10.- Menu principal");
        System.out.println("9.- Contabilidad");
        System.out.println("8.- Base de datos");
        System.out.println("7.- Chat princiapal");
        
        Scanner ingreso = new Scanner(System.in);
        String eleccion = ingreso.nextLine();
        
        switch (eleccion){
            case "10":
            System.out.println("Menu principal!!!");
            break;
            case "holis":
            case "9":
            System.out.println("Contabilidad!!!");
            break;
            case "8":
            System.out.println("Base de datos!!!");
            break;
            case "7":
            System.out.println("Chat princiapal!!!");
            break;
        }
    }
    
    //Bucles
    public static void main(String[] args) {
        //TipoDeDato variable = new TipoDeDatoXX
        Clase2 llamada = new Clase2();
        llamada.estoEsUnSwitch();
    }
    
}
