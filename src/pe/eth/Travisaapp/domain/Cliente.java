package pe.eth.Travisaapp.domain;

import java.io.FileInputStream;
import javax.imageio.stream.FileImageInputStream;


public class Cliente { 
 private String IDCLIENTE;
 private String NOMBRE;
 private String DIRECCION;
 private String RUCDNI;
 private String TELEFONO;
 private String ESTADO;

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
private FileInputStream foto;

    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
    }
    public String getIDCLIENTE() {
        return IDCLIENTE;
    }

    public void setIDCLIENTE(String IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getRUCDNI() {
        return RUCDNI;
    }

    public void setRUCDNI(String RUCDNI) {
        this.RUCDNI = RUCDNI;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
 
}
