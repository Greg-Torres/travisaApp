//
package pe.eth.Travisaapp.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import pe.eth.Travisaapp.domain.Categoria;

import pe.eth.Travisaapp.domain.Producto;
import pe.eth.Travisaapp.service.espec.CategoriaServiceEspec;

import pe.eth.Travisaapp.service.espec.ProductoServiceEspec;
import pe.eth.Travisaapp.service.impl.CategoriaServiceImpl;

import pe.eth.Travisaapp.service.impl.ProductoServiceImpl;


public class ProductoController {
    
       public static ArrayList<Categoria> listarproductoxcategoria(String cat) {
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

    public static ArrayList<Producto> listarProducto(String inicialesprod) {
        ArrayList<Producto> list ;
        ProductoServiceEspec obj= new ProductoServiceImpl();
        
        list = obj.buscarporNombre(inicialesprod);

        return list; 
    }

    public static Producto BuscarProducto(String codigo) {
Producto pro= null;
        ProductoServiceEspec objpse =new ProductoServiceImpl();
        pro=objpse.buscarporcodigo(codigo);
         if (pro == null) {
          mensaje("producto no existe con ese codigo..¡¡", "error");
        }
        return pro;    }
    
    public static void updateProducto(Producto Prod) {
ProductoServiceEspec obj= new ProductoServiceImpl();
        String msje=obj.update(Prod);
        if(msje==null){
            cuadromensaje("Producto se actualizo con exito..!!");
        }
        else{
            cuadromensaje("Producto no se pudo actualizar");
        }
    }
     private static void cuadromensaje(String msj) {
    JOptionPane.showMessageDialog(null,msj);

    }

    public static void eliminar(String codigo) {
        ProductoServiceEspec obj= new ProductoServiceImpl();
String mensaje=obj.delete(codigo);
    if(mensaje==null){
        cuadromensaje("Producto se elimino con exito...!!");
      
    }
    else{
         cuadromensaje("Producto no se pudo eliminar..");
    }
    }

    public static void InsertarProducto(Producto pro) {
    ProductoServiceEspec obj= new ProductoServiceImpl();
String mensaje=obj.insertar(pro);
if(mensaje==null){
    cuadromensaje("Producto se registro con exito..!!");
}
else{
    cuadromensaje("Producto no se registro codigo repetido");
}
    }    

    public static ArrayList<Producto> listarProductoxcategoria(String cat) {

      ArrayList<Producto> lista;
      ProductoServiceEspec Obj= new ProductoServiceImpl();
      lista=Obj.BuscarPorCategoria(cat);
if(lista.isEmpty()){
    mensaje(" No hay productos en la categoria "+cat, "informativo");
}
    return lista;

    }

    public static Producto buscarCodigo(String id) {
      ProductoServiceEspec obj= new ProductoServiceImpl();
Producto mensaje=obj.BuscarCodigo(id);
return mensaje;
    }       

    public static ArrayList<Producto> listarAll() {
      ProductoServiceEspec obj= new ProductoServiceImpl();
      ArrayList<Producto> lista= obj.listar();
      
      return lista;
    }
    }
    
    

