import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;

    private String direccion;


    private ArrayList<Libro> librosRentados=new ArrayList<>();

    private ArrayList<Libro> librosComprados=new ArrayList<>();

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public ArrayList<Libro> getLibrosRentados() {
        return librosRentados;
    }
    public ArrayList<Libro> getLibrosComprados() {
        return librosComprados;
    }

    public Usuario(String nombre,String apellido,String direccion) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
    }
}

