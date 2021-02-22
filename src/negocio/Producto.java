package negocio;

public class Producto {
    
    private String nombre;
    private int precio;
    private String tipo;

    public Producto() {
    }

    public Producto(String nombre, int precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    public void hola() {
            System.out.println(this);
    }
    
}
