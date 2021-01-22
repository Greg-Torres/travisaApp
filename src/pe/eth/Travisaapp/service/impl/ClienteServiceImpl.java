
package pe.eth.Travisaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.service.espec.ClienteServiceEspec;


/**
 *
 * @author CARLOS
 */
public class ClienteServiceImpl implements ClienteServiceEspec{

    @Override
    public String insertar(Cliente bean) {
String mensaje=null;
Connection cn=null;
String sql="insert into cliente(Nombre,Direccion,RucDNI,Telefono,foto,Estado) VALUES(?,?,?,?,?,?)";
        try {
            cn=AccesoDB.getConnection();
            PreparedStatement pst=cn.prepareStatement(sql);
        //  pst.setString(1, bean.getIDCLIENTE());
            pst.setString(1, bean.getNOMBRE());
            pst.setString(2, bean.getDIRECCION());
            pst.setString(3, bean.getRUCDNI());
            pst.setString(4, bean.getTELEFONO());
            pst.setBinaryStream(5, bean.getFoto());
            pst.setString(6, bean.getESTADO());
            pst.executeUpdate();
        } catch (SQLException ex) {
mensaje= ex.getMessage();
        }
        return mensaje;
    }

    @Override
    public String update(Cliente bean) {
String mensaje=null;
//String sql="update cliente set idCliente=?,Nombre=?,Direccion=?,RucDNI=?,Telefono=? where idCliente=?";
String sql="UPDATE cliente SET Nombre=?,Direccion=?,RucDNI=?,Telefono=?,foto=? ,estado=? where idCliente=?";
Connection cn=null;        
try {
            cn=AccesoDB.getConnection();
  PreparedStatement ps=cn.prepareStatement(sql);
  
  ps.setString(1, bean.getNOMBRE());
  ps.setString(2, bean.getDIRECCION());
  ps.setString(3, bean.getRUCDNI());
  ps.setString(4, bean.getTELEFONO());
  ps.setBinaryStream(5, bean.getFoto());
  ps.setString(6, bean.getESTADO());
  ps.setString(7, bean.getIDCLIENTE());
  ps.executeUpdate();
        } catch (Exception e) {
        mensaje= e.getMessage();
        }
return mensaje;
    }

    @Override
    public String delete(String codigo) {
String mensaje=null;
      String sql="delete from cliente where idcliente=? ";
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
    public Cliente buscarporcodigo(String codigo) {

      Cliente cli= null;
      String sql="select *from cliente where idcliente = ?";
        
        try {
           
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,codigo);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
             cli= new Cliente();
              cli.setIDCLIENTE(rs.getString(1));
              cli.setNOMBRE(rs.getString(2));
              cli.setDIRECCION(rs.getString(3));
              cli.setRUCDNI(rs.getString(4));
              cli.setTELEFONO(rs.getString(5));
              cli.setESTADO(rs.getString(7));
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
           // System.out.println("error :" +ex);
    return null;
        }
        return cli;
    }

    @Override
    public ArrayList<Cliente> buscarporNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente leer(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> leerVarios(Cliente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente rowToBean(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public Cliente buscarDni(String codigo) {
   Cliente cli=null;
      String sql="select *from cliente where RucDNI = ?";
        
        try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,codigo);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
              cli= new Cliente();
              cli.setIDCLIENTE(rs.getString(1));
              cli.setNOMBRE(rs.getString(2));
              cli.setDIRECCION(rs.getString(3));
              cli.setRUCDNI(rs.getString(4));
              cli.setTELEFONO(rs.getString(5));
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        return null;
        }
        return cli;      
    }

    @Override
    public ArrayList<Cliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente BuscarCodigo(String codigo) {
        Cliente cli=null;
      String sql="select idCliente from cliente where idCliente=?";
        
        try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,codigo);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
              cli= new Cliente();
              cli.setIDCLIENTE(rs.getString(1));
           
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        return null;
        }
        return cli; 
    }

    public String obteneridcliente() {
//int idventa = 0;
  String idventa = "";
        try {
            Connection cn = AccesoDB.getConnection();
            String sql = "select distinct max(idCliente) from cliente";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
             //  idventa =  rs.getInt(1) + 1;
              idventa =   rs.getString(1);
                idventa= idventa.substring(3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idventa;
    }
    
}
