
public class Producto {
    private String desc;
    private Double importe;
    private int stock;
    
    public Producto(String descripcion, Double importe, int stock) {
        desc = descripcion;
        this.importe = importe;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto [desc=" + desc + ", importe=" + importe + ", stock=" + stock + "]";
    }

    public String getdesc() {
        return desc;
    }

    public void setdesc(String descripcion) {
        desc = descripcion;
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
