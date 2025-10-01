import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Carrito {

    private ArrayList<Producto> productos;
    private Cliente cliente;
    
    public Carrito(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>(); // inicializo 
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void agregarProductos(Producto item) {
        productos.add(item);
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getTotal(){
        double total=0;
        for (Producto producto : productos) {
          total += producto.getPrecio()*producto.getStock();  
        }
        return total;
    }

    @Override
    public String toString() {
        NumberFormat formatoNumero = NumberFormat.getNumberInstance(Locale.forLanguageTag("es-ES"));
        String descCarrito ="";
        for (Producto producto : productos) {
            String unidades = (producto.getStock()>1)?" unidades\n":" unidad\n";
            descCarrito+=" -> "+producto.getDescripcion()+", "+ producto.getStock() + unidades;
        }
        return "Carrito del cliente = " + cliente + "\nContiene los siguientes productos:\n" + descCarrito + "con este total: " + formatoNumero.format(getTotal());
    }
    
    

}
