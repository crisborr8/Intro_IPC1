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
    
    
    /*
        Un codigo que solicite un dato y si este no es tipo entero
        solicitar nuevamente el dato, cuando el dato ya sea tipo entero
        entonces regresará ese dato tipo entero que se ingresó
    
        el bucle va a verificar que el dato ingresado sea entero regresa ese dato, de lo contario se repetira
        -> While -- For 
    */
    
    Scanner entrada = new Scanner(System.in); // -> 50 kb (nul) 
    public int SolicitarDato(){
        while (true){
            try{
                return entrada.nextInt();
                // break -> -> ciclos (while/for) -- switch ---> detene la sentencia lógica actual
            }catch(Exception manejo_de_error){
                System.out.println("Error, ingrese un dato tipo entero");
            }
            entrada = new Scanner(System.in); // nul
        }
    }
    
    public void Calculadora(){
        // 1. Mensaje de hola!!
        // 2. Me solicite dos numeros a operar
        // 2.1  Si no ingresa numeros enteros mostrar mensaje de error y solicitarlo nuevamente
        // 3. Me pregunte que operacion quiero realizar -> suma, resta, multiplicacion, division, etc..
        // 4. Efectue la operacion
        // 5. Mostrar el resultado.
        // 6. Preguntar si se desea realizar otra operacion, si es así repetir el codigo si no, terminarlo
        
        //while -> repite 0 o mas veces    dowhile -> repite 1 o mas veces
        int eleccion;
        do{
            System.out.println("Este es un salto de linea\nAqui seguimos escribiendo");
            System.out.println("Hola! esta es una calculadora:");
            System.out.println("Ingrese el primer numero a operar:");

            int operador1 = SolicitarDato(); // 


            System.out.println("Ingrese el segundo numero a operar:");

            int operador2 = SolicitarDato();


            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("\t1. Suma");// Enter -> Salto de linea   -> \n
                                    // Tabulador -> Salta unos espacios  -> \t
            System.out.println("\t2. Resta");
            System.out.println("\t3. Multiplicacion");
            System.out.println("\t4. Division");
            System.out.println("\t5. Potencia");
            eleccion = SolicitarDato();
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
            System.out.println("Desea realizar ota operacion??");
            System.out.println("\t1.- Si");
            System.out.println("\t2.- No");
            eleccion = SolicitarDato();
        }
        while(eleccion == 1);
  
        
    }
    
    public static void main(String[] args) {
        Clase5 llamada = new Clase5();
        llamada.Calculadora();
    }
    
}



