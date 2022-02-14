
package clase1;
import java.lang.Math; //Tener acceso a funciones matematicas sin tener que escribirlas nosotros
import java.util.Scanner;

// Esto es un comentario de 1 sola linea
/*
    Esto es un comentario
    multilinea
*/

public class Clase1 {
    
    //Al declarar una variable
    /*
        a-z A-Z -> a-z A-Z _ 0-9
        _ ---->  a-z A-Z _ 0-9
    */
    
    int e;
    //Tipos de datos
    //1. Primitivos
    //Inician con minuscula 
    //Son definidos por Java
    boolean b1; // 1bit -> |1| -> Verdadero (1) o Falso (0) -> Falso(0) 
    char c1;    // 2bytes -> |0|0|1|0|1|1|0|1| |0|0|1|0|1|1|0|1| ->  Ascii  -> 'u0000' -> vacio
    
    //numericos
    /// -128, -127, -126, ..., -3, -2, -1, 0, 1, 2, 3, ..., 126, 127
    byte by1;   //1byte -> |0|0|1|0|1|1|0|1| -> -128 hasta 127 -> 0
    short sh1;  //2bytes ->|0|0|1|0|1|1|0|1| |0|0|1|0|1|1|0|1| -> -32,768 hasta 32,767 -> 0
    int i1;     //4bytes -> -2^31 hasta 2^31 -> 0    ***************
    long l1;    //8bytes -> -2^63 hasta 2^63 -> 0
    
    //punto flotantes o decimales
    float f1;   //4bytes -> 3.4*10^-38 hasta 3.4*10^38 -> 0.0 -> (6 digitos de presicion)
    double d1;  //8bytes -> -1.7*10^-308 hasta 1.7*10^307 -> 0.0 -> (15 digitos de presicion) ***********
    
    //2. No primitivos  -> String, [], clases, interfacez, Scanner, ...
    //Inician con mayuscula
    //Son definidos por el usuario o programdor (menos el String)
    //Todo poseen aproximadamente el mismo tamaño
    String s1;  //Tipo texto, guarda secuencias de caracteres
    /*
        String s1 = "hola";  -> "" | "r" | "asdf" ->  0 o mas caractes -> "un texto entre comillas ->\"texto\"<-" -> un texto entre comillas ->"texto"<-
        hola -> 104 - 111 - 108 - 97
          0   1   2  3
        |104|111|108|97|\0| | | | | | | | | | | |
    */
    //****************
    //Todos debe de ser declarados antes de ser utilizados
    //TipoDeDato NombreVariable = new TipoDeDatoXX;
    boolean array_boleano [];
    /*
           0   1 2 3 4 5 6
        |true | | | | | | |
    */
    public void ArrayB(){
        boolean array_boleano[] = new boolean[7];
        array_boleano[0] = true;
        System.out.println(array_boleano[4]); 
    }
    int array_int [];
    /*
         0  1 2 3 4 
        |24|0|0|0|0|
    */
    public void Array_entero(){
        array_int = new int[5];
        array_int[0] = 24;
        System.out.println(array_int[3]);
    }
    char arreglo_char [] = new char[6];
    /*
          0  1 2 3 4 5
        |114| | | | | |
    */
    public void LecturaChar(){
        arreglo_char[0] = 'd';
        System.out.println(arreglo_char[2]);
    }
    //****************
    //Todos debe de ser declarados antes de ser utilizados
    //TipoDeDato NombreVariable = new TipoDeDatoXX;
    
    
    //******************************************
    //Operaciones
    public void operacionXd(){
        System.out.println(5+5); //Suma
        System.out.println(5*5); //Resta
        System.out.println(5/5); //Divicion            1         06
        System.out.println(19%3); //Modulo -> 20/3 -> 5 |5    3 |19
                                                  //  -5       - 0
                                                  //   0         19
                                                  //           - 18
                                                  //              1
        //sin(32) -> java.lang.Math;
        System.out.println(Math.sin(32));
    }
    public void operacionConVariable(){
        int i1 = 24;
        int i2 = 11;
        System.out.println(i1+i2); //27
        System.out.println(i1-i2); //21
        System.out.println(i1*i2); //72
        System.out.println(i1/i2); //8  2.181818 -> 2
        System.out.println(i1+i2+999); //1026
        System.out.println(i1%i2); //0
        System.out.println(Math.sqrt(i1));// -> decimal
        double resultadoDivicion = (double)i1/(double)i2;
        System.out.println(resultadoDivicion);
    }
    
    //Parceo de datos -> Convertir un tipo de dato a otro tipo de dato
    public void parsearDatos(){
        boolean b_3 = false;
        String boleanoAtexto = String.valueOf(b_3);
        System.out.println(boleanoAtexto);
        
        int numero = 9548358;
        String numeroAtexto = String.valueOf(numero);
        System.out.println(numeroAtexto);
        
        String decimal = "2403.99915";
        double d_1 = Double.valueOf(decimal);
        System.out.println(d_1*100);
        
        String entero = "950";
        int i_1 = Integer.valueOf(entero);
        System.out.println(i_1*99);
        
        String boleano = "false";
        boolean b_1 = Boolean.valueOf(boleano);
        System.out.println(b_1);
        
    }
    
    public void programaDeIngresoDeDatos(){
        //try -catch
        /*
        funciona bien -> try
        funciona mal o hay error -> cath
        */
        try{
            Scanner entrada = new Scanner(System.in);       //1             //1
            System.out.println("ingrese un numero:");       //2             //2
            int textoIngresado  = entrada.nextInt();        //3             //3  -> estariamos guardando un string como numero
            System.out.println("su numero ingresado es:");  //4
            System.out.println(textoIngresado);             //5
        }catch(Exception ex){
            System.out.println("Hey! el numero ingresado no es un numero!!!");  //4
            System.out.println(5*8-674);    
            //5
        }
        
        System.out.println("codigo finalizado, feliz dia :D"); //6
    }
    
    
    public static void main(String[] args) {
        Clase1 variable = new Clase1();
        variable.programaDeIngresoDeDatos();
    }
    
}
