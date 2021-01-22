package pe.eth.Travisaapp.service.espec;

import java.util.ArrayList;
import java.util.List;

public interface  CrudServiceEspec<T> {
 //ventas:
    String insertar(T bean);

    String update(T bean);

    String delete(String codigo);
T BuscarCodigo(String codigo);
    T buscarporcodigo(String codigo);
   T buscarDni(String codigo);
     
    ArrayList<T> buscarporNombre(String nombre);

    T leer(String codigo);
 ArrayList<T> listar();
//public ArrayList<T> list();
    List<T> leerVarios(T bean);

}
