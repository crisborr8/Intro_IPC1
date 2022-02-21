/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

import java.util.Scanner;
import clase5.ClasePrueba;

/**
 *
 * @author crisb
 */
public class Clase5 {
    //FUNCIONES
    /*
            Modificadores de acceso
            public -> Acceder desde cualquier lugar siempre que sea parte del proyecto
            protected -> Acceder solo desde el mismo paquete
            private -> Acceder solo desde la misma clase
        [public | protected | private] [DATO PRIMITIVO | DATO NO PRIMITIVO] NOMBRE_DEL_METODO(){
            //TOOODO EL CODIGO
        }
    */
    
    public int retornoDeEntero(){
        System.out.println("Esto es una suma!!!");
        int op1 = 5;
        int op2 = 7; /// 5 * 7 = 36
        int res = op1 * op2 + 1;
        if (res == 35) return res;
        return 0;
    }
    
    
    public void Calculadora(){
        // 1. Mensaje de hola!!
        // 2. Me solicite dos numeros a operar
        // 2.1  Si no ingresa numeros enteros mostrar mensaje de error y solicitarlo nuevamente
        // 3. Me pregunte que operacion quiero realizar -> suma, resta, multiplicacion, division, etc..
        // 4. Efectue la operacion
        // 5. Mostrar el resultado.
        System.out.println("Este es un salto de linea\nAqui seguimos escribiendo");
        System.out.println("Hola! esta es una calculadora:");
        System.out.println("Ingrese el primer numero a operar:");
        Scanner entrada = new Scanner(System.in);
        int operador1 = entrada.nextInt(); //
        System.out.println("Ingrese el segundo numero a operar:");
        int operador2 = entrada.nextInt();
        System.out.println("Seleccione la operacion a realizar:");
        System.out.println("\t1. Suma");// Enter -> Salto de linea   -> \n
                                // Tabulador -> Salta unos espacios  -> \t
        System.out.println("\t2. Resta");
        System.out.println("\t3. Multiplicacion");
        System.out.println("\t4. Division");
        System.out.println("\t5. Potencia");
        int eleccion = entrada.nextInt();
        ClasePrueba calcular = new ClasePrueba();
        /*if (eleccion == 1){
            System.out.println("El resultado es: " + calcular.Suma(operador1, operador2)); 
        }
        else if (eleccion == 2){
            System.out.println("El resultado es: " + calcular.Resta(operador1, operador2)); 
        }
        else if (eleccion == 3){
            System.out.println("El resultado es: " + calcular.Multiplicacion(operador1, operador2)); 
        }
        else if (eleccion == 4){
            System.out.println("El resultado es: " + calcular.Division(operador1, operador2)); 
        }
        else if (eleccion == 5){
            System.out.println("El resultado es: " + calcular.Exponente(operador1, operador2)); 
        }
        else{
            System.out.println("Error, selecciono una opcion incorrecta");
        }*/
        switch (eleccion){
            case 1:
                System.out.println("El resultado es: " + calcular.Suma(operador1, operador2)); 
                break;
            case 2:
                System.out.println("El resultado es: " + calcular.Resta(operador1, operador2)); 
                break;
            case 3:
                System.out.println("El resultado es: " + calcular.Multiplicacion(operador1, operador2)); 
                break;
            case 4:
                System.out.println("El resultado es: " + calcular.Division(operador1, operador2)); 
                break;
            case 5:
                System.out.println("El resultado es: " + calcular.Exponente(operador1, operador2)); 
                break;
            default:
                System.out.println("Error, selecciono una opcion incorrecta");
        }
    }
    
    public static void main(String[] args) {
        Clase5 llamada = new Clase5();
        llamada.Calculadora();
    }
    
}



