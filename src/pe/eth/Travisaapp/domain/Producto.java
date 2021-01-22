
package pe.eth.Travisaapp.domain;
import java.io.FileInputStream;

/**
 *
 * @author Alumno
 */
public class Producto {
     private String IDPRODUCTO;
 private String DESCRIPCION;
private int IDCATEGORIA;
 private double PRECIOVENTA;
 private double PRECIOCOMPRA;
 private int STOCK;
 private String Observacion;
//private String foto;
//private ImageIcon foto;
//private  Blob foto;
private  FileInputStream foto;
//    public String getNomcat() {
//       return Categoria.setNombre();
//    }
 
    public Producto() {
    }

    public String getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(String IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getIDCATEGORIA() {
        return IDCATEGORIA;
    }

    public void setIDCATEGORIA(int IDCATEGORIA) {
        this.IDCATEGORIA = IDCATEGORIA;
    }

    public double getPRECIOVENTA() {
        return PRECIOVENTA;
    }

    public void setPRECIOVENTA(double PRECIOVENTA) {
        this.PRECIOVENTA = PRECIOVENTA;
    }

    public double getPRECIOCOMPRA() {
        return PRECIOCOMPRA;
    }

    public void setPRECIOCOMPRA(double PRECIOCOMPRA) {
        this.PRECIOCOMPRA = PRECIOCOMPRA;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

//    public String getFoto() {
//        return foto;
//    }
//
//    public void setFoto(String foto) {
//        this.foto = foto;
//    }

//    public ImageIcon getFoto() {
//        return foto;
//    }
//
//    public void setFoto(ImageIcon foto) {
//        this.foto = foto;
//    }

//    public Blob getFoto() {
//        return foto;
//    }
//
//    public void setFoto(Blob foto) {
//        this.foto = foto;
//    }

    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
    }
 
}
