
package pe.eth.Travisaapp.service.impl;
import clases.CustomImageIcon;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Producto;
import pe.eth.Travisaapp.service.espec.ProductoServiceEspec;

/**
 *
 * @author CARLOS
 */
public class ProductoServiceImpl implements ProductoServiceEspec{
InputStream is = null;
    CustomImageIcon ii = null;
    @Override
    public String insertar(Producto bean) {
        String mensaje=null;
Connection cn=null;
String sql="insert into producto(idProducto,Descripcion,idcategoria,PrecioVenta,Stock,Observacion,foto) VALUES(?,?,?,?,?,?,?)";
        try {
            cn=AccesoDB.getConnection();
            PreparedStatement pst=cn.prepareStatement(sql);
            //pst.setString(1, bean.getIDCLIENTE());
            pst.setString(1, bean.getIDPRODUCTO());
            pst.setString(2, bean.getDESCRIPCION());
            pst.setInt(3, bean.getIDCATEGORIA());
            pst.setDouble(4, bean.getPRECIOVENTA());
            pst.setInt(5, bean.getSTOCK());
            pst.setString(6, bean.getObservacion());
            pst.setBinaryStream(7, bean.getFoto());
            pst.executeUpdate();
        } catch (SQLException ex) {
mensaje= ex.getMessage();
        }
        return mensaje;
    }

    @Override
    public String update(Producto bean) {
String mensaje=null;
//String sql="update cliente set idCliente=?,Nombre=?,Direccion=?,RucDNI=?,Telefono=? where idCliente=?";
String sql="update producto set Descripcion=?,idcategoria=?,PrecioVenta=?,Stock=?,Observacion=?,foto=? where idProducto=?";
Connection cn=null;        
try {
            cn=AccesoDB.getConnection();
  PreparedStatement ps=cn.prepareStatement(sql);
  
  ps.setString(1, bean.getDESCRIPCION());
  ps.setInt(2, bean.getIDCATEGORIA());
  ps.setDouble(3, bean.getPRECIOVENTA());
  ps.setInt(4, bean.getSTOCK());
  ps.setString(5, bean.getObservacion());
 // ps.setString(6, String.valueOf(bean.getFoto()));
  ps.setBinaryStream(6, bean.getFoto());
    ps.setString(7, bean.getIDPRODUCTO());
  ps.executeUpdate();
        } catch (Exception e) {
        mensaje= e.getMessage();
        }
return mensaje;
    }

    @Override
    public String delete(String codigo) {
        String mensaje=null;
      String sql="delete from producto where idProducto=?";
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps=cn.prepareStatement(sql);
          ps.setString(1, codigo);
          ps.executeUpdate();
      } 
     
      catch (SQLException ex) {
mensaje= ex.getMessage();
      }
      return mensaje;
    }

    @Override
    public Producto buscarporcodigo(String codigo) {
 Producto pro=null;
      String sql="select *from producto where idProducto=?";

       try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,codigo);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
              pro= new Producto();
              pro.setIDPRODUCTO(rs.getString(1));
              pro.setDESCRIPCION(rs.getString(2));
              pro.setIDCATEGORIA(rs.getInt(3));
              pro.setPRECIOVENTA(rs.getDouble(4));
              pro.setSTOCK(rs.getInt(5));
              pro.setObservacion(rs.getString(6));

            }
            cn.close();
            ps.close();
            rs.close();
          
        } catch (SQLException ex) {
        return null;
        } 
        return pro;
    }

    @Override
    public Producto leer(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Producto> productoxCategoria(String cat) {
//instruccion sql para listar los
        //articulos por categoria
        String sql = "select idarticulo,nombre,descripcion,precio"
                + " from articulo,categoria where categoria=? "
                + "and articulo.idcategoria=categoria.idcategoria";
        //conexion a la bd
        Connection cn =null;
        //arreglo con elementos tipo articulo
        ArrayList<Producto> lista = new ArrayList<>();
        try {
            cn= AccesoDB.getConnection();
            //preparestatement para ejecutar sql con
            //parametos ?
            PreparedStatement ps = cn.prepareStatement(sql);
            //asignar valor al parametro ?
            ps.setString(1, cat);
            //ejecutar ps
            ResultSet rs = ps.executeQuery();
            //variable tipo articulo
            Producto pr;
            //leer articulos de rs
            while (rs.next()) {
                pr = new Producto();
                pr.setIDPRODUCTO(rs.getString(1));
                pr.setDESCRIPCION(rs.getString(2));
                pr.setPRECIOVENTA(rs.getDouble(3));
                pr.setSTOCK(rs.getInt(4));
                pr.setObservacion(rs.getString(5));
                pr.setIDCATEGORIA(rs.getInt(6));
               // ar.setIdcategoria(rs.getInt(5));
                //agregar objeto a la lista
                lista.add(pr);
            }
            //cerrar objetos
            cn.close();
            rs.close();
            ps.close();

        } catch (SQLException ex) {
        }
        return lista;
    }
    

    @Override
    public Producto rowToBean(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> buscarporNombre(String nombre) {
    ArrayList<Producto> list = new ArrayList<>();
    String sql="select *from producto where Descripcion like ?";
    Producto pro= null;
        try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setString(1,nombre+'%');
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                pro= new Producto();
                pro.setIDPRODUCTO(rs.getString(1));
                pro.setDESCRIPCION(rs.getString(2));
                pro.setIDCATEGORIA(rs.getInt(3));
                pro.setPRECIOVENTA(rs.getInt(4));
                pro.setSTOCK(rs.getInt(5));
                pro.setObservacion((rs.getString(6)));
                list.add(pro);
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Producto buscarDni(String codigo) {
 Producto pro=null;
      String sql="select *from producto where RucDNI=?";
//      String sql="select p.idProducto,p.descripcion,p.precioventa,p.stock ,c.categoria "
//              + "from producto p,categoria c where p.idcategoria = c.idcategoria and"
//              + "p.idProducto=?";
        
        try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,codigo);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
              pro= new Producto();
              pro.setIDPRODUCTO(rs.getString(1));
              pro.setDESCRIPCION(rs.getString(2));
              pro.setIDCATEGORIA(rs.getInt(3));
              pro.setPRECIOVENTA(rs.getDouble(4));
              pro.setSTOCK(rs.getInt(5));
              pro.setObservacion(rs.getString(6));
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        return null;
        }
        return pro;

    }

    @Override
    public ArrayList<Producto> listar() {
           ArrayList<Producto> pl=null;
          // int cont=0;
        Producto prod=null;
    try {
     pl=new ArrayList<>();
        String sql= "select *from producto";
        Connection cn= AccesoDB.getConnection();
        PreparedStatement ps= cn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            prod= new Producto();
            prod.setIDPRODUCTO(rs.getString(1));
            prod.setDESCRIPCION(rs.getString(2));
            prod.setIDCATEGORIA(rs.getInt(3));
            prod.setPRECIOVENTA(rs.getDouble(4));
            prod.setSTOCK(rs.getInt(5));
            prod.setObservacion(rs.getString(6));
            pl.add(prod);
            //cont++;
        }
    } catch (SQLException ex) {
       return null;
    }
      return pl;
    }

    @Override
    public List<Producto> leerVarios(Producto bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public Producto BuscarCodigo(String id) {
     Producto pro=null;
      String sql="select idProducto from producto where idProducto=?";
        
        try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
              pro= new Producto();
              pro.setIDPRODUCTO(rs.getString(1));
           
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        return null;
        }
        return pro;
    }

    @Override
    public Producto buscarcodpro(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> BuscarPorCategoria(String cat) {
              ArrayList<Producto> lista = new ArrayList<>();
              Producto pro;
 String sql = "select p.idProducto,p.Descripcion,p.idcategoria,p.PrecioVenta,p.Stock,p.Observacion"
         + " from producto p,categoria c where c.Nombre=? and p.idcategoria=c.idcategoria";
        
          try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,cat);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
              pro= new Producto();
              pro.setIDPRODUCTO(rs.getString(1));
              pro.setDESCRIPCION(rs.getString(2));
              pro.setIDCATEGORIA(rs.getInt(3));
              pro.setPRECIOVENTA(rs.getDouble(4));
              pro.setSTOCK(rs.getInt(5));
              pro.setObservacion(rs.getString(6));
              
              lista.add(pro);
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        return null;
        }
    return lista;
    }

    private void limpiarcampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
            
            
}
