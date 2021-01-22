package pe.eth.Travisaapp.db;

import clases.CustomImageIcon;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;

public final class AccesoDB {

     public static CustomImageIcon getFoto(String id,String sql)
    {
        Connection cn=null;
        PreparedStatement Pst;
        ResultSet rs;
        CustomImageIcon ii = null;
        InputStream is = null;
         if(cn == null)
            
       try{
           cn=AccesoDB.getConnection();
           Pst = cn.prepareStatement(sql);
           Pst.setString(1,id);
           rs = Pst.executeQuery(); 
           if(rs.next()){
               is = rs.getBinaryStream(1);
               if(is != null)
               {
                   
                   BufferedImage bi = ImageIO.read(is);
                   ii = new CustomImageIcon(bi);
               }
               
           }
          
       }
       catch(SQLException ex){
           ex.printStackTrace();
       }
       catch(IOException ex){
           ex.printStackTrace();}
        
        return ii;
    }

  /**
   * Constructor privado para que no permita crear objeto de esta clase.
   */
  private AccesoDB() {
  }
      // Parámetros de conexion con sql server:
//    protected static Connection cn = null;
//    protected static String url = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=travisa1";
//    protected static String usuario = "sa";
//    protected static String clave = "123";
//    protected PreparedStatement stm;
//    protected ResultSet rs;
//    
//  public  static Connection abrirConexion() {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            cn = DriverManager.getConnection(url, usuario, clave);
//        } catch (Exception ex) {
//            System.out.println("cn:"+ex);
//        }
//        return cn;
//    }
  // Parámetros de conexión con oracle
//  private static final String CN_DRIVER = "oracle.jdbc.OracleDriver";
//  private static final String CN_URL = "jdbc:oracle:thin:@localhost:1521:XE";
//  private static final String CN_USER = "ventas";
//  private static final String CN_PASS = "admin";
  
    // Parámetros de conexión con MySql
  // protected Connection cn = null;
//  private static final String DRIVER ="com.mysql.jdbc.Driver";
 //   protected static String url = "jdbc:mysql://localhost/travisa2";
  //  protected static String usuario = "root";
  //  protected static String clave = "12345678";
   // protected PreparedStatement stm;
    //protected ResultSet rs;
  
        // Parámetros de conexión con MySql
  // protected Connection cn = null;
  private static final String DRIVER ="org.postgresql.Driver";
    protected static String url = "jdbc:postgresql://localhost:5432/travisa2";
    protected static String usuario = "postgres";
    protected static String clave = "12345";
    protected PreparedStatement stm;
    
  public static Connection getConnection() throws SQLException{
    Connection cn = null;
    try {
      // Paso 1: Cargar el driver
      Class.forName(DRIVER).newInstance();
      // Obtener el objeto Connection
      cn = DriverManager.getConnection(url, usuario, clave);
    } catch (ClassNotFoundException e) {
      String texto = "No se ha encontrado del driver de la BD.";
      throw new SQLException(texto);
    } catch(SQLException e){
      throw e;
    } catch(Exception e){
      String texto = "No se tiene acceso a la BD.";
      throw new SQLException(texto);
    }
    return cn;
  }
  
  
  
}
