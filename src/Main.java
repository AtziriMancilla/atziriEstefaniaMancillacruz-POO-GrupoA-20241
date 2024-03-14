import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Boolean band=true;
        Libreria isc=new Libreria();
        System.out.println("Bienvenido a la libreria");
        int opcion;
        while (band){
            System.out.println("Menú");
            System.out.println("1.Registrar un libro\n2.Registrar un usuario\n3.Rentar un libro\n4.Comprar un libro\n5.Mostrar todos los usuarios\n6.Mostrar todos los libros\n7.Mostrar libros disponibles" +
                    "\n8.Mostrar libros rentados\n9.Mostrar usuarios que han comprado un libro\n10.Devolver libro\n11.Salir");
            System.out.print("Seleccione una opcion: ");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    isc.registrarLibro();
                    break;
                case 2:
                    isc.registrarUsuario();
                    break;
                case 3:
                    isc.rentarLibro();
                    break;
                case 4:
                    isc.comprarLibro();
                    break;
                case 5:
                    isc.mostrarUsuarios();
                    break;
                case 6:
                    isc.mostrarLibros();
                    break;
                case 7:
                    isc.mostrarLibrosDisponibles();
                    break;
                case 8:
                    isc.mostrarLibrosRentados();
                    break;
                case 9:
                    isc.usuariosQueHanComprado();
                    break;
                case 10:
                    isc.devolverLibro();
                    break;
                case 11:
                    System.out.println("Gracias por usar la libreria");
                    band=false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }


    }
}