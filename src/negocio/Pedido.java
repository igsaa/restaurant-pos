package negocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido{ 
    
    protected int subtotal;
    private List<Producto> productos = new ArrayList<Producto>();

    public Pedido() {
    }

    public Pedido(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    

}
