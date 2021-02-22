package negocio;

public class Mesa extends Pedido{
   
    private int numeroMesa;
    private boolean tieneCliente;

    public Mesa() {
        super();
    }

    public Mesa(int numeroMesa, boolean tieneCliente) {
        this.numeroMesa = numeroMesa;
        this.tieneCliente = tieneCliente;
    }

    public Mesa(int numeroMesa, boolean tieneCliente, int subtotal) {
        super(subtotal);
        this.numeroMesa = numeroMesa;
        this.tieneCliente = tieneCliente;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isTieneCliente() {
        return tieneCliente;
    }

    public void setTieneCliente(boolean tieneCliente) {
        this.tieneCliente = tieneCliente;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    
}
