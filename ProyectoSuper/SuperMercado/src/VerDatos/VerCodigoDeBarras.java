
package VerDatos;

import BaseDatos.BaseDeDatos;
import BaseDatos.CodigoBarras;
import VerDatos.VerProducto;
import VerDatos.VerMarca;

public class VerCodigoDeBarras {
    CodigoBarras[] codigo;
    VerProducto vp = new VerProducto();
    VerMarca vm = new VerMarca();
        
    public void VerCodigoDeBarras(BaseDeDatos db){
        codigo = db.getCodigo();
        System.out.println("*************************");
        System.out.println("Ver codigo de barras");
        System.out.println("*************************");
        for(int i = 0; i < codigo.length; i++){
            if (codigo[i] != null)
            {
                System.out.println("id: " + codigo[i].id + ", Precio: " + codigo[i].precio + ", Cantidad: " + codigo[i].cantidad + ", Descripcion: " + codigo[i].descripcion);
                System.out.println("Tipo de producto: " + vp.getProducto(db, codigo[i].idTipoProducto));
                System.out.println("Marca: " + vm.getMarca(db, codigo[i].idMarca));
            }
        }
        System.out.println("*************************");
    }
}
