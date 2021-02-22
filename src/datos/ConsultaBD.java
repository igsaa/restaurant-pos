package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Pedido;
import negocio.Cliente;
import negocio.Mesa;
import negocio.Producto;
import gui.VentanaPrincipal;

public class ConsultaBD extends Conexion {
    VentanaPrincipal vent = new VentanaPrincipal();
    //BUSQUEDA SQL MESA 
    public ArrayList<Cliente> listarCliente() throws SQLException {
        super.conectar();
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        ResultSet result = super.state.executeQuery("select * from pedido WHERE `numMesa` = "+vent.getNumMesa()+";");
        while (result.next()) {
            Cliente cli = new Cliente();
            cli.setNombre((String)result.getObject(2));
            cli.setDireccion((String)result.getObject(3));
            listaCliente.add(cli);
        } return listaCliente;
    }
    public ArrayList<Mesa> listarMesa() throws SQLException{
        super.conectar();
        ArrayList<Mesa> listaMesa = new ArrayList<Mesa>();
        ResultSet result = super.state.executeQuery("select * from pedido WHERE `numMesa` = "+vent.getNumMesa()+";");
        while (result.next()) {
            Mesa mesa = new Mesa();
            Producto prod = new Producto();
            mesa.setNumeroMesa((Integer)result.getObject(4));
            listaMesa.add(mesa);
        } return listaMesa;
    }
    public ArrayList<Producto> listarProducto() throws SQLException{
        super.conectar();
        ArrayList<Producto> listaProducto = new ArrayList<Producto>();
        ResultSet result = super.state.executeQuery("select * from pedido WHERE `numMesa` = "+vent.getNumMesa()+";");
        while (result.next()) {
            for (int i=5;i<10;i++){
                Producto prod = new Producto();
                prod.setNombre((String)result.getObject(i));
                listaProducto.add(prod);
            }
            
        }return listaProducto;
    
    }
        
}



