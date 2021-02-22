package datos;
import java.sql.*;
import java.util.*;
public class Conexion {
         
    protected Connection con;
    protected Statement state;
    

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root",null);
            state = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    

}