
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
import pe.eth.Travisaapp.domain.Categoria;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.service.espec.CategoriaServiceEspec;
import pe.eth.Travisaapp.service.espec.ClienteServiceEspec;

/**
 *
 * @author CARLOS
 */
public class CategoriaServiceImpl implements CategoriaServiceEspec {

    @Override
    public String insertar(Categoria bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Categoria bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(String codigo) {
        PreparedStatement pst;
        ResultSet rs;
        String msje=null;
        try {
            Connection cn=null;
            String sql="delete *from producto where idProducto=?";
            cn=AccesoDB.getConnection();
            pst= cn.prepareStatement(sql);
            pst.executeUpdate();
            cuadromensaje();
        } catch (SQLException ex) {
            msje=ex.getMessage();
        }
    return msje;
    }

    @Override
    public Categoria buscarporcodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria buscarDni(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Categoria> buscarporNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria leer(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> leerVarios(Categoria bean) {
 return null;
    }

    @Override
    public Categoria rowToBean(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Categoria> listar() {
        PreparedStatement pst;
        ResultSet rs;
        ArrayList<Categoria> list= new ArrayList<>();
        Categoria cat=null;
        try {
            Connection cn=null;
            cn= AccesoDB.getConnection();
            String sql="select *from categoria";
            pst= cn.prepareStatement(sql);
            rs= pst.executeQuery();
            while(rs.next()){
                cat= new Categoria();
               cat.setIdcategoria(rs.getInt(1));
               cat.setNombre(rs.getString(2));
               list.add(cat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Categoria BuscarCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cuadromensaje() {

    }

   

   
    
}
