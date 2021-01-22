package pe.eth.Travisaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.service.espec.EmpleadoServiceEspec;
public class EmpleadoServiceImpl implements EmpleadoServiceEspec{
  
 // private final String SQL_SELECT = "Select idEmpleado,Nombre,Apellidos,Email,Usuario from Empleados";
 // private final String SQL_SELECT = "Select idEmpleado,Nombre,Apellidos,Email,Usuario from Empleado";
  private final String SQL_SELECT = "Select idusuario,Nombre,Apellidos,Email,Nombre_Usuario,Clave from usuario";
  private final String SQL_INSERT = " ";
  private final String SQL_UPDATE = " ";
  private final String SQL_DELETE = " ";
  

  @Override
  public Empleado validar(String usuario, String clave) {
    Empleado bean = null;
    Connection cn = null;
    try {
      // Obtener el objeto Connection
      cn = AccesoDB.getConnection();
      // Preparar la sentencia
     // String sql = SQL_SELECT + "where Usuario = ? and Clave = ?";
      String sql = SQL_SELECT + " where Nombre_Usuario = ? and Clave = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if(!rs.next()){
        throw  new SQLException("Datos incorrectos.");
      }
      bean = rowToBean(rs);
      rs.close();
      pstm.close();
    } catch (SQLException e) {
      throw  new RuntimeException(e.getMessage());
    } catch (Exception e) {
      String texto = "No se tiene acceso al servidor.";
      if(e != null && !e.getMessage().isEmpty()){
        texto += "\n" + e.getMessage();
      }
      throw  new RuntimeException(texto);
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    
    return bean;
  }
//buscar empleado por id
 
  @Override
  public  String insertar(Empleado bean) {
   String mensaje=null;
      String sql="insert into usuario(IDUSUARIO,NOMBRE,APELLIDOS,EMAIL,NOMBRE_USUARIO,CLAVE) values(?,?,?,?,?,?)";
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps=cn.prepareStatement(sql);
          ps.setString(1, bean.getIdUsuario());
          ps.setString(2, bean.getNombre());
          ps.setString(3, bean.getApellidos());
          ps.setString(4, bean.getEmail());
          ps.setString(5, bean.getUsuario());
          ps.setString(6, bean.getClave());
ps.executeUpdate();

      } 
     
      catch (SQLException ex) {
//          Logger.getLogger(EmpleadoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
mensaje= ex.getMessage();
      }
      return mensaje;
  }

  @Override
  public  String update(Empleado bean) {
String mensaje=null;
      String sql="update usuario set NOMBRE=?,APELLIDOS=?,EMAIL=?,NOMBRE_USUARIO=?,CLAVE=? where IDUSUARIO=? ";
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps=cn.prepareStatement(sql);
          ps.setString(1, bean.getNombre());
          ps.setString(2, bean.getApellidos());
          ps.setString(3, bean.getEmail());
          ps.setString(4, bean.getUsuario());
          ps.setString(5, bean.getClave());
          ps.setString(6, bean.getIdUsuario());
ps.executeUpdate();

      } 
     
      catch (SQLException ex) {
//          Logger.getLogger(EmpleadoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
mensaje= ex.getMessage();
      }
      return mensaje;
  }

  @Override
  public String delete(String codigo) {
String mensaje=null;
      String sql="delete from usuario where IDUSUARIO=? ";
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
  public Empleado leer(String codigo) {
    Empleado emp=null;
      String sql="select *from usuario where idusuario=?";
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps=cn.prepareStatement(sql);
          
          ps.setString(1, codigo);
          ResultSet rs= ps.executeQuery();
          while(rs.next()){
              emp= new Empleado();
              emp.setIdUsuario(rs.getString(1));
              emp.setNombre(rs.getString(2));
              emp.setApellidos(rs.getString(3));
              emp.setEmail(rs.getString(5));
              emp.setUsuario(rs.getString(11));
              emp.setClave(rs.getString(12));
          }
          ps.close();
          rs.close();
          cn.close();
      } catch (SQLException ex) {
          Logger.getLogger(EmpleadoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
      return emp;
  }

  @Override
  public List<Empleado> leerVarios(Empleado bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  //retorna un objeto empleado
  public Empleado rowToBean(ResultSet rs) throws SQLException {
    Empleado bean = new Empleado();
    bean.setIdUsuario(rs.getString("idusuario"));
    bean.setApellidos(rs.getString("Apellidos"));
    bean.setNombre(rs.getString("Nombre"));
    bean.setUsuario(rs.getString("Nombre_Usuario"));
    bean.setEmail(rs.getString("Email"));
    return bean;
  }

    @Override
    public Empleado buscarporcodigo(String codigo) {
String sql="select IDUSUARIO from usuario where IDUSUARIO=?";
Empleado emp=null;
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps= cn.prepareStatement(sql);
   ps.setString(1, codigo);
    ResultSet rs=  ps.executeQuery();
    if(rs.next()){
        emp= new Empleado();
        emp.setIdUsuario(rs.getString(1));
    }
      } catch (SQLException ex) {
          Logger.getLogger(EmpleadoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
      return emp;
    }

    @Override
    public ArrayList<Empleado> buscarporNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public Empleado buscarDni(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Empleado> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado BuscarCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
  
}
