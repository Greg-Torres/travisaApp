package pe.eth.Travisaapp.domain;

public class Empleado {

  private String Idusuario;
  private String Apellidos;
  private String nombre;
  private String Nombreusuario;
  private String clave;
  String Email;

  public Empleado() {
  }

    public String getIdUsuario() {
        return Idusuario;
    }

    public void setIdUsuario(String Idusuario) {
        this.Idusuario = Idusuario;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUsuario() {
    return Nombreusuario;
  }

  public void setUsuario(String Nombreusuario) {
    this.Nombreusuario = Nombreusuario;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }
  
  

}
