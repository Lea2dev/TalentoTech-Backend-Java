
public class Producto {
    private String Descripcion;
    private Double importe;
    private int stock;
    
    public Producto(String descripcion, Double importe, int stock) {
        Descripcion = descripcion;
        this.importe = importe;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto [Descripcion=" + Descripcion + ", importe=" + importe + ", stock=" + stock + "]";
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    
}
