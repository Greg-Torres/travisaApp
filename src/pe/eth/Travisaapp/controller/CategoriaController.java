
package pe.eth.Travisaapp.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import pe.eth.Travisaapp.domain.Categoria;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.service.espec.CategoriaServiceEspec;
import pe.eth.Travisaapp.service.espec.ClienteServiceEspec;
import pe.eth.Travisaapp.service.impl.CategoriaServiceImpl;
import pe.eth.Travisaapp.service.impl.ClienteServiceImpl;

/**
 *
 * @author CARLOS
 */
public class CategoriaController {

    public static ArrayList<Categoria> listarcategoria() {
        ArrayList<Categoria> c= new ArrayList<>();
        CategoriaServiceEspec objcsi=new CategoriaServiceImpl();
        c=objcsi.listar();
         if (c == null) {
            mensaje("no existe categorias..¡¡", "error");
        }
        return c;
    }
     private static void mensaje(String msj, String tipo) {
               JOptionPane.showMessageDialog(null, msj,tipo,JOptionPane.INFORMATION_MESSAGE);

    }
}
