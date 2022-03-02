package BaseDatos;

public class BaseDeDatos {
    /*
    ---> Tipo de producto
            - Tipotipog  -> Leche, Quesos, ropa, comida, shampoo, bebida, 
    ---> Marca
            - Marca: string  -> Lactomi, Lala, dos pinos, sara, maruchan... etc...
    ---> Descripcion --> Producto
            - Descripcion : string -> Leche de 2 litros, Leche de 1 litro, Yogurth para niños,, etc...
            - Codigo de barras: int -> 5684684
            - Precio: Double
            - Cantidad
            
        (string)Tipo de producto -> Leche, ropa, instantanea, ...
        (string)Marca -> Lactomi, Lala, dos pinos, , Sara, Maruchan,..
    
        (string)Decripcion -> Leche lactomi deslactosada para niños, Sueter para mujer talla M, Maruchan de pollo,...
        (int)Id -> Codigo de barra
        (double)Precio -> Q64.58, Q124.25
        (int)Cantidad -> 58, 1000, 2, 0
    
        Leche - Lactomi -- 0589843 -- Q15 - 20
        - Leche de 2 litros
    
        Leche - Lactomi -- 168038 -- Q10 - 30
        - Leche de 1 libros
    
        Yogurth - Lactomi -- 16806855 -- Q7.50 - 15
        - Yogurth para niño sabor fresa
    */
    /*
        structs  --> tipo de dato no primitivo que puede
    almacenar datos dentro de el..        
    */
    
    //Arreglos   ->> :D
    //Debe tener un tamaño definido.
    /*
        1. - Dejarlo asi, definir un tamaño grande y trabajar
        2. - Redefinir el límite del arreglo cada vez que se llene este
        3. - Trabajar simulando punteros
    */
    int id_marca;
    public Marca[] marcas; // |x|x|x|x|new_marca| | | | | |
    
    int id_tipos;
    TipoDeProducto[] tipos;
    
    int id_codigos;
    CodigoBarras[] codigos;
    
    int id_tipo_marcas;
    TipoDeProducto_Marca[] tipo_marcas;
    
    /*
    Se ejecutan cuando se llaman
        Metodos   -> void 
        Funciones -> int, bool, char, Clase, etc...
    Se ejecuta al momento de crear la variable que hacer referencia a la clase (automaticamente la primera vez)
        Constructores -> Al momento de crear una variable que hagar referencia a una clase, este se ejecuta automaticamente
        Simplmente hay que escribir el nombre de la clase seguido de (){//codigo }
    */
    
    public BaseDeDatos(){
        id_marca = 0;
        marcas = new Marca[999];
        
        id_tipos = 0;
        tipos = new TipoDeProducto[999];
        
        id_codigos = 0;
        codigos = new CodigoBarras[999];
        
        id_tipo_marcas = 0;
        tipo_marcas = new TipoDeProducto_Marca[999];
    }
    
    public void IngresarMarca(String marca){
        id_marca++; // id_marca = id_macra + 1
        Marca new_marca = new Marca();
        new_marca.id = id_marca;
        new_marca.Marca = marca;
        for(int i = 0; i < marcas.length; i++){
            if (marcas[i] == null){
                marcas[i] = new_marca;
                break;
            }
        }
    }
    
    public void IngresarTipoDeProducto(String tipodeproducto){
        id_tipos++;
        TipoDeProducto new_producto = new TipoDeProducto();
        new_producto.id = id_tipos;
        new_producto.TipoDeProducto = tipodeproducto;
        for(int i = 0; i < tipos.length; i++){
            if (tipos[i] == null){
                tipos[i] = new_producto;
                break;
            }
        }
    } 
    
    public void IngresarCodigoBarras(String descripcion, double precio, int cantidad, int idTipoProducto){
        id_codigos++;
        CodigoBarras new_codigo = new CodigoBarras();
        new_codigo.id = id_codigos;
        new_codigo.descripcion = descripcion;
        new_codigo.precio = precio;
        new_codigo.cantidad = cantidad;
        new_codigo.idTipoProducto = idTipoProducto;
        for(int i = 0; i < codigos.length; i++){
            if (codigos[i] == null){
                codigos[i] = new_codigo;
                break;
            }
        }
    } 
    
    public void IngresarTipoDeProducto_Marca(int id_Marca, int id_TipoDeProducto){
        id_tipo_marcas++;
        TipoDeProducto_Marca new_TipoMarca = new TipoDeProducto_Marca();
        new_TipoMarca.id_TipoMarca = id_tipo_marcas;
        new_TipoMarca.id_Marca = id_Marca;
        new_TipoMarca.id_TipoProducto = id_TipoDeProducto;
        for(int i = 0; i < tipo_marcas.length; i++){
            if (tipo_marcas[i] == null){
                tipo_marcas[i] = new_TipoMarca;
                break;
            }
        }
    } 
    
}