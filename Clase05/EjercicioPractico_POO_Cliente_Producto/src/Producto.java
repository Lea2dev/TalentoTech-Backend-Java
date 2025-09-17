
public class Producto {

    public String descripcion;
    public double precio;
    public int stock;

    public Producto(String descripcion, double precio, int stock) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
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
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + stock;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        if (stock != other.stock)
            return false;
        return true;
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
    
    
}
