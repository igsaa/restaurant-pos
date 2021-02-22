package datos;

import java.util.ArrayList;
import java.util.List;
import negocio.Cliente;
import negocio.Mesa;
import negocio.Producto;
//import negocio.Cliente;

public class Registro {
  
    private Mesa mesa;
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<Producto>();
    //private List<Cliente> clientes = new ArrayList<Cliente>();

    public Registro() {
    }

    public Registro(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public Registro(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
