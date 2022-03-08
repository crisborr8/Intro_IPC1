
package Modificar;
import BaseDatos.BaseDeDatos;
import BaseDatos.Marca;
import VerDatos.VerMarca;
import java.util.Scanner;

public class ModificarMarca {
    
    VerMarca vm = new VerMarca();
    
    public void ModificarMarca(BaseDeDatos db){
        System.out.println("Seleccione el id de la marca a modificar");
        vm.VerMarcas(db);
        Scanner ingreso = new Scanner(System.in);
        int id = ingreso.nextInt();
        Marca[] marcas_actuales = db.getMarca();
        for(int i = 0; i < marcas_actuales.length; i++){
            if (marcas_actuales[i] != null){
                if (marcas_actuales[i].id == id){
                    System.out.println("Ingrese el nuevo nombre de la marca:");
                    ingreso = new Scanner(System.in);
                    String nombre = ingreso.nextLine();
                    marcas_actuales[i].Marca = nombre;
                    break;
                }
            }
        }
    }
    
    
    
}
