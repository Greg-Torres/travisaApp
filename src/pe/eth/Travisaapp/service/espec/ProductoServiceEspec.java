
package pe.eth.Travisaapp.service.espec;

import java.util.ArrayList;
import pe.eth.Travisaapp.domain.Producto;

/**
 *
 * @author CARLOS
 */
public interface ProductoServiceEspec extends CrudServiceEspec<Producto>,RowMapper<Producto>{

    public Producto buscarcodpro(String text);

    public ArrayList<Producto> BuscarPorCategoria(String cat);
    
}
