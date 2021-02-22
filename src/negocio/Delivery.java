package negocio;

import java.util.ArrayList;
import java.util.List;

public class Delivery extends Pedido{
    private int costoEntrega;

    public Delivery() {
    }

    public Delivery(int subtotal) {
        super(subtotal);
    }

    public int getCostoEntrega() {
        return costoEntrega;
    }

    public void setCostoEntrega(int costoEntrega) {
        this.costoEntrega = costoEntrega;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
