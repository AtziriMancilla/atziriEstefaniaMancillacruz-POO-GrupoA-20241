import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Banco bank=new Banco();
        boolean band=true;
        int opcion;
        System.out.println("Bienvenido al banco");
        while(band) {
            System.out.println("");
            System.out.println("Menu:\n1.Añadir usuarios\n2.Buscar usuario\n3.Ver todos los usuarios\n" +
                    "4.Agregar/Retirar dinero\n5.Editar usuario\n5.Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                //Añadir usuarios
                case 1:
                    bank.agregarEmpleado();
                    break;
                //buscar usuario
                case 2:
                    bank.buscarEmpleado();
                    break;
                //ver todos los usuarios
                case 3:
                    bank.mostrarUsuarios();
                    break;
                //agregar-retirar dinero
                case 4: bank.agregarRetirar();
                    break;
                //editar usuarios
                case 5:
                    bank.editarUsuarios();
                    break;
                case 6:
                    System.out.println("Gracias por usar el banco");
                    band = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}