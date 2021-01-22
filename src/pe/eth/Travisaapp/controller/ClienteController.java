
package pe.eth.Travisaapp.controller;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.service.espec.ClienteServiceEspec;
import pe.eth.Travisaapp.service.impl.ClienteServiceImpl;


/**
 *
 * @author CARLOS
 */
public class ClienteController {
 static int  r;
    public static Cliente BuscarClientexCodigo(String codigo) {
        /*
        Producto pro= null;
        ProductoServiceEspec objpse =new ProductoServiceImpl();
        pro=objpse.buscarporcodigo(codigo);
         if (pro == null) {
          mensaje("producto no existe con ese codigo..¡¡", "error");
        }
        return pro;    }
        */
        Cliente cli= null;
        ClienteServiceEspec objcsi=new ClienteServiceImpl();
        cli=objcsi.buscarporcodigo(codigo);
     //   System.out.println("nombre del cliente :"+cli.getNOMBRE());
      //  System.out.println("objeto cliente :"+cli);
         if (cli == null) {
          
        mensaje("cliente no existe con ese codigo..¡¡", "error");
        }
//         else{
//              mensaje2("cliente no existe con ese codigo..¡¡");
//              if(r==0){
//                  
//              }
//         }
           return cli;        
    }
 
   
       public static Cliente BuscarClientexDni(String dni) {
       Cliente cli= null;
        ClienteServiceEspec objcsi=new ClienteServiceImpl();
        cli=objcsi.buscarDni(dni);
         if (cli == null) {
            mensaje("cliente no existe con ese DNI..¡¡", "error");
        }
        return cli;
                
    }
    private static void mensaje(String msj, String tipo) {
               JOptionPane.showMessageDialog(null, msj,tipo,JOptionPane.INFORMATION_MESSAGE);

    }

    public static void eliminarCliente(String codigo) {
ClienteServiceEspec obj= new ClienteServiceImpl();
String mensaje=obj.delete(codigo);
    if(mensaje==null){
        cuadromensaje("cliente se elimino con exito...!!");
      
    }
    else{
         cuadromensaje("cliente no se pudo eliminar..");
    }
       
    }

    private static void cuadromensaje(String msj) {
    JOptionPane.showMessageDialog(null,msj);

    }

    public static void updateCliente(Cliente cli) {

        ClienteServiceEspec obj= new ClienteServiceImpl();
        String msje=obj.update(cli);
        if(msje==null){
            cuadromensaje("cliente se actualizo con exito..!!");
        }
        else{
            cuadromensaje("cliente no se pudo actualizar");
        }
    }

    public static void insertarCliente(Cliente cli) {
ClienteServiceEspec obj= new ClienteServiceImpl();
String mensaje=obj.insertar(cli);
if(mensaje==null){
    cuadromensaje("cliente se registro con exito..!!");
}
else{
    cuadromensaje("cliente no se registro");
}
    }

   public static Cliente buscarCodigo(String id) {
      ClienteServiceEspec obj= new ClienteServiceImpl();
Cliente mensaje=obj.BuscarCodigo(id);
return mensaje;
    }   

//    public static int obteneridcliente() {
//       
//     int cod = 0;
//        ClienteServiceImpl vsi = new ClienteServiceImpl();
//        try {
//            //Connection cn= AccesoDB.getConnection();
//
//            cod = vsi.obteneridcliente();
//        } catch (Exception ex) {
//            Logger.getLogger(VentasController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return cod;     
//    }

       public static String obteneridcliente() {
       
    String cod = "";
        ClienteServiceImpl vsi = new ClienteServiceImpl();
        try {
            //Connection cn= AccesoDB.getConnection();

            cod = vsi.obteneridcliente();
        } catch (Exception ex) {
            Logger.getLogger(VentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod;     
    }

    }
    

