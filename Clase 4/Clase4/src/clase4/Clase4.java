/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

import clase4.Clasedeprueba;
import Paquetepublico.ClasePublica;
/**
 *
 * @author crisb
 */
public class Clase4 {
    
    //Funciones y metodos
    //--> Ejecutar codigo fuera del main para poder ser llamado o reutilizado en cualquier lugar.
    //Funciones -> Me retornan un valor -> String, int, float, char[], etc. etc. -> Primitiva o no primitiva
    //Metodos -> No me retornan un valor o retorna un valor vacio (nada)-> void
    
    //METODOS
    /*
            Modificadores de acceso
            public -> Acceder desde cualquier lugar siempre que sea parte del proyecto
            protected -> Acceder solo desde el mismo paquete
            private -> Acceder solo desde la misma clase
        [public | protected | private] void NOMBRE_DEL_METODO(){
            //TOOODO EL CODIGO
        }
    */
    private void MetodoPrivado(){
        MetodoProtegido();
        System.out.println("este es un método privado");
    }
    protected void MetodoProtegido(){
        MetodoPublico();
        System.out.println("este es un metodo protegido");
    }
    public void MetodoPublico(){
        System.out.println("Este es un metodo publico");
    }
    
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
    

    public static void main(String[] args) {
        ClasePublica var = new ClasePublica();
        var.MetodoPublico();
    }
    
}
