
public class Producto {

    public String descripcion;
    public double precio;
    public int stock;
    static int contadorProductos;

    public Producto(String descripcion, double precio, int stock) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = validarStock(stock);
        contadorProductos++;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = validarStock(stock);
    }

    public int validarStock(int stock){
        if(stock>=0)
            return stock;
        else
            return this.stock;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto [descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + "]";
    }

    public void mostrarInformacion() {
        // TODO Auto-generated method stub
        System.out.println("Info de producto:\n================");
        System.out.println("Descripción: " + descripcion);
        System.out.format("Precio: %.2f", precio);
        System.out.println("\nCantidad: " + stock);
    }
    
    public void aplicarDescuento(double descuento){
        precio = precio*((100-descuento)/100);
    }
    
    
}
