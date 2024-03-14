import java.util.ArrayList;
import java.util.Scanner;
public class Libreria {
    Scanner sc=new Scanner(System.in);
    private ArrayList<Usuario> usuarios=new ArrayList<>();
    private ArrayList<Libro> libros=new ArrayList<>();

    public void registrarUsuario(){
        System.out.println("Ingrese el nombre: ");
        String nombre=sc.next();
        System.out.println("Ingrese el apellido: ");
        String apellido=sc.next();
        System.out.println("Ingrese la direccion: ");
        String direccion=sc.next();
        usuarios.add(new Usuario(nombre,apellido,direccion));
    }
    public void mostrarUsuarios(){
        int i=0;
        if(usuarios.isEmpty()){
            System.out.println("No hay usuarios registrados");
        }
        else {
            for (Usuario usuario : usuarios) {
                System.out.printf((i + 1) + " |Nombre: %s Apellido: %s Direccion: %s ", usuarios.get(i).getNombre(), usuarios.get(i).getApellido(), usuarios.get(i).getDireccion());
                System.out.println("");
                i++;
            }
        }
    }
    public void usuariosQueHanComprado(){
        int i=0,j=0;
        for(Usuario usuario:usuarios){
            if(!usuarios.get(i).getLibrosComprados().isEmpty()) {
                System.out.printf((i+1) + " |Nombre: %s Apellido: %s Direccion: %s ", usuarios.get(i).getNombre(), usuarios.get(i).getApellido(), usuarios.get(i).getDireccion());
                System.out.println("");
                j++;
            }
            i++;
        }
        if(j==0){
            System.out.println("Ningun usuario ha comprado");
        }
    }
    public void mostrarLibros(){
        int i=0;
        if(usuarios.isEmpty()){
            System.out.println("No hay libros registrados");
        }
        for(Libro libro:libros){
            System.out.printf((i+1)+" |Titulo: %s Autor: %s ",libros.get(i).getTitulo(),libros.get(i).getAutor());
            System.out.println("");
            i++;
        }
    }
    public void mostrarLibrosDisponibles(){
        int i=0,j=0;
        for(Libro libro:libros){
            if(libro.isDisponible()) {
                System.out.printf((i+1)+" |Titulo: %s Autor: %s ",libros.get(i).getTitulo(),libros.get(i).getAutor());
                System.out.println("");
                j++;
            }
            i++;
        }
        if(j==0){
            System.out.println("No hay libros disponibles");
        }
    }
    public void mostrarLibrosRentados(){
        int i=0,j=0;
        for(Libro libro:libros){
            if(!libro.isDisponible()) {
                System.out.printf((i+1)+" |Titulo: %s Autor: %s ",libros.get(i).getTitulo(),libros.get(i).getAutor());
                System.out.println("");
                j++;
            }
            i++;
        }
        if(j==0){
            System.out.println("No hay libros rentados");
        }
    }
    public void rentadosPorUsuario(int i){
        if(usuarios.get(i).getLibrosRentados().isEmpty()){
            System.out.println("No tiene libros rentados");
        }
        else{
            for(int j=0;j<usuarios.get(i).getLibrosRentados().size();j++){
                System.out.println((j+1)+"| Titulo: "+usuarios.get(i).getLibrosRentados().get(j).getTitulo()+"Autor: "+usuarios.get(i).getLibrosRentados().get(j).getAutor());
            }
        }
    }
    public int posicionLibro(Libro libro){
        int pos=-1;
        for(int i=0;i<libros.size();i++){
            if(libro==libros.get(i)){
                pos=i;
            }
        }
        return pos;
    }
    public void registrarLibro(){
        System.out.println("Ingrese el titulo: ");
        String titulo=sc.next();
        System.out.println("Ingrese el autor: ");
        String autor=sc.next();
        libros.add(new Libro(titulo,autor));
    }
    public void rentarLibro(){
        System.out.println("Seleccione el usuario: ");
        mostrarUsuarios();
        int opcionUs=sc.nextInt();
        opcionUs--;
        System.out.println("Seleccione el libro: ");
        mostrarLibrosDisponibles();
        int opcionLib=sc.nextInt();
        opcionLib--;
        usuarios.get(opcionUs).getLibrosRentados().add(libros.get(opcionLib));
        libros.get(opcionLib).setDisponible(false);
        System.out.printf("El usuario: %s ha rentado: %s",usuarios.get(opcionUs).getNombre(),libros.get(opcionLib).getTitulo());
    }
    public void comprarLibro(){
        System.out.println("Seleccione el usuario: ");
        mostrarUsuarios();
        int opcionUs=sc.nextInt();
        opcionUs--;
        System.out.println("Seleccione el libro: ");
        mostrarLibrosDisponibles();
        int opcionLib=sc.nextInt();
        opcionLib--;
        usuarios.get(opcionUs).getLibrosComprados().add(libros.get(opcionLib));
        Libro lib=usuarios.get(opcionUs).getLibrosComprados().get(opcionLib);
        int pos=posicionLibro(lib);
        libros.remove(pos);
        System.out.println("Compra exitosa");
        //libros.remove(opcionLib);
    }
    public void devolverLibro(){
        System.out.println("Seleccione el usuario: ");
        mostrarUsuarios();
        int opcionUs=sc.nextInt();
        System.out.println("Seleccione el libro: ");
        rentadosPorUsuario(opcionUs-1);
        int opcionLib=sc.nextInt();
        Libro lib=usuarios.get(opcionUs-1).getLibrosRentados().get(opcionLib-1);
        usuarios.get(opcionUs-1).getLibrosRentados().remove(opcionLib-1);
        int posLibro=posicionLibro(lib);
        libros.get(posLibro).setDisponible(true);
        System.out.printf("El usuario: %s ha devuelto: %s",usuarios.get(opcionUs-1).getNombre(),libros.get(posLibro).getTitulo());
    }
}

