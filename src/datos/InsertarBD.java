package datos;

import negocio.Cliente;
import negocio.Delivery;
import negocio.Mesa;
import negocio.Pedido;
import negocio.Producto;
import datos.Registro;
import java.sql.SQLException;

public class InsertarBD extends Conexion{
    
    public void insertar(Mesa mesa, Pedido pedido, Registro registro, Producto producto) throws SQLException{
        try {
            super.conectar();
            state.executeUpdate("INSERT INTO mesa VALUES('" + mesa.getNumeroMesa()+");");
            state.executeUpdate("INSERT INTO pedido VALUES('" + null + pedido.getSubtotal()+");");
            state.executeUpdate("INSERT INTO producto VALUES('" + null + registro.getProductos().toString()+
                    producto.getPrecio()+producto.getTipo()+");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
