/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author crisb
 */
public class Clase3 {
    
    //ciclos -- bucles -- LOOPS
    /*
        algo que se repite
        while, for, metodos recursivos 
        -> un ciclo infinito <-  ---> se come la memoria ---> el programa se va a detener
        -> tener un System.out.println("aqui en el bucle");
    */
    //WHILE
    public void Un_While(){
        /*
            se ejecuta siempre que la expresion sea verdadera
            si la expresion es falsa no se ejecuta
            while (EXPRESION -> [verdadera | falsa]){
                //TODO EL CODIGO
                //infinitas veces o hasta que se lo solicitemos al programa
            }
        */
        
        // |0|1|2|3|4|5|
        
        boolean variable = true; 
        int miaw = 5;
        while (variable){ // -> 1 espacio de procesamiento
            System.out.println("Estoy en un bucle :D");
            //miaw -> 0
            if(miaw == 1){
                variable = false;
            }
            //miaw -> 0 -1 = -1
            miaw = miaw- 1;
            //m miiaw -> -1
        }
        System.out.println("Resto del codigo");
        //al resto del codigo1!!
    }
    //FOR
    public void Un_for(){
        /*
            for (declaracion ; condicion ; incremento o decremento){
                Algun_Codigo
            }
            variable = variable + X; -> variable += X;
            variable = variable - X; -> variable -= X;
            variable = variable * X; -> variable *= X;
        */
        for(int i = 0; i < 5; i = i + 1){
            // i -> 0
            System.out.println("Esto es un for :>");
        }
        System.out.println("Resto del codigo");
    }
    
    public static void main(String[] args){
            //TipoDeDato variable = new TipoDeDatoXXX
            Clase3 hoy = new Clase3();
            hoy.Un_for();
    }
}
