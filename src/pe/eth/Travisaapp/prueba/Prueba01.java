package pe.eth.Travisaapp.prueba;

import java.sql.Connection;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.service.impl.ClienteServiceImpl;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    try {
        ClienteServiceImpl objeto= new ClienteServiceImpl();
     String max     =   objeto.obteneridcliente();
     //int max     =   objeto.obteneridcliente();
     // Connection cn = AccesoDB.getConnection();
     // System.out.println("Conexión ok.");
      System.out.println(max);
    //  cn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
