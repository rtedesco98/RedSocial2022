package main.java.recuperatorio;



public class Perfil {
    private String nickname;
    private String nombre;
    private String apellido;
    private String descripcion;
    private Ubicacion ubicacion;


    public Perfil(String nickname, String nombre, String apellido, String descripcion, String string) {
        this.setNickname(nickname);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDescripcion(descripcion);
        this.setUbicacion(ubicacion);
        }
        
    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
