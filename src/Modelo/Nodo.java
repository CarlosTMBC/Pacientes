
package Modelo;


public class Nodo {
    Nodo nombreCompleto ;
    String Apellidos;
    String Nombre;

    public Nodo(String Apellidos, String Nombre) {
        this.nombreCompleto = null;
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
    }



    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
