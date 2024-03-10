import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    Scanner sc=new Scanner(System.in);
    private static ArrayList<Employee> empleados=new ArrayList<>();
    public ArrayList<Employee> getEmpleados() {
        return empleados;
    }
    public void agregarEmpleado(){
        System.out.println("Ingrese el nombre: ");
        String name = sc.next();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.next();
        System.out.println("Ingrese el numero de cuenta: ");
        long account = sc.nextLong();
        System.out.println("Ingrese el tipo de cuenta: ");
        char type = sc.next().charAt(0);
        empleados.add(new Employee(name, apellido, account, type));
    }
    public void eliminarEmpleado(Employee empleado){
        empleados.remove(empleado);
    }
    //muestra a todos los usuarios
    public void mostrarUsuarios(){
        if(empleados.isEmpty()){
            System.out.println("No hay usuarios registrados");
        }
        else {
            for (int i = 0; i < empleados.size(); i++) {
                mostrarUsuario(i);
            }
        }
    }
    //muestra un usuario en la posicion i
    public void mostrarUsuario(int i){
        System.out.printf("Nombre: %s\nApellido: %s", empleados.get(i).getName(), empleados.get(i).getLastName());
        System.out.print("Cuentas: ");
        for(int x=0;x<empleados.get(i).getAccounts().size();x++){
            System.out.println(empleados.get(i).getAccounts().get(x).getAccountNumber()+" ");
            System.out.printf("Dinero en cuenta: %f",empleados.get(i).getAccounts().get(x).getAmount());
        }
    }
    //buscador por nombre
    public void buscarNombre(String name){
        boolean band=true;
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i).getName().equals(name)){
                mostrarUsuario(i);
                band=false;
            }
        }
        if(band){
            System.out.println("No se encontro este usuario: "+name);
        }
    }
    //buscador por apellido
    public void buscarApellido(String lastName){
        boolean band=true;
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i).getLastName().equals(lastName)){
                mostrarUsuario(i);
                band=false;
            }
        }
        if(band){
            System.out.println("No se encontro este usuario: "+lastName);
        }
    }
    //buscador por numero de cuenta
    public void buscarCuenta(long account){
        boolean band=true;
        for (int i = 0; i < empleados.size(); i++) {
            for (int j = 0; j < empleados.get(i).getAccounts().size(); j++) {
                if(empleados.get(i).getAccounts().get(j).getAccountNumber()==account){
                    mostrarUsuario(i);
                    band=false;
                }
            }
        }
        if(band){
            System.out.println("No se encontro esta cuenta: "+account);
        }
    }
    public int[] posicionEmpleado(long account){
        int pos[]=new int[2];
        for (int i = 0; i < empleados.size(); i++) {
            for (int j = 0; j < empleados.get(i).getAccounts().size(); j++) {
                if (empleados.get(i).getAccounts().get(j).getAccountNumber() == account) {
                    pos[0] = i;
                    pos[1]=j;
                    break;
                }
            }
        }
        return pos;
    }
    public int posicionEmpleado(String name){
        int pos=-1;
        for (int i = 0; i < empleados.size(); i++) {
            for (int j = 0; j < empleados.get(i).getAccounts().size(); j++) {
                if (empleados.get(i).getName().equals(name)) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }
    public void buscarEmpleado(){
        System.out.println("¿Cómo desea buscar?\n1.Nombre\n2.Apellido\n3.Cuenta");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese el nombre: ");
            String name = sc.next();
            buscarNombre(name);

        }
        if (opcion == 2) {
            System.out.println("Ingrese el apellido: ");
            String apellido = sc.next();
            buscarApellido(apellido);
        }
        if (opcion == 3) {
            System.out.println("Ingrese el numero de cuenta: ");
            long account = sc.nextLong();
            buscarCuenta(account);
        }
    }
    public void agregarRetirar(){
        System.out.println("¿Desea agregar o retirar dinero?\n1.Agregar\n2.Retirar\n3.Volver al menu");
        int opcion=sc.nextInt();
        double cantidad;
        int posicion[]=new int[2];
        if(opcion==1){
            System.out.print("Ingrese la cuenta: ");
            long account= sc.nextLong();
            posicion=posicionEmpleado(account);
            System.out.println("¿Cuanto desea agregar?: ");
            cantidad=sc.nextDouble();
            empleados.get(posicion[0]).getAccounts().get(posicion[1]).agregarDinero(cantidad);
        }
        if(opcion==2) {
            System.out.print("Ingrese la cuenta: ");
            long account = sc.nextLong();
            posicion = posicionEmpleado(account);
            System.out.println("¿Cuanto desea agregar?: ");
            cantidad = sc.nextDouble();
            empleados.get(posicion[0]).getAccounts().get(posicion[1]).retirarDinero(cantidad);
        }
    }
    public void editarUsuarios(){
        System.out.println("¿Que desea hacer?: \n1.Agregar cuenta bancaria\n2.Eliminar usuario");
        int opcion=sc.nextInt();
        if(opcion==1){
            System.out.println("Ingrese el nombre de usuario:" );
            String name=sc.next();
            int pos=posicionEmpleado(name);
            System.out.println("Ingrese el numero de cuenta: ");
            long account=sc.nextLong();
            System.out.println("Ingrese el tipo de cuenta: ");
            char type=sc.next().charAt(0);
            empleados.get(pos).agregarCuenta(account,type);
        }
        if(opcion==2){
            System.out.println("Ingrese el nombre de usuario que desea eliminar: ");
            String name=sc.next();
            int pos=posicionEmpleado(name);
            Employee empleado=empleados.get(pos);
            eliminarEmpleado(empleado);
            System.out.printf("Empleado %s eliminado",name);
        }
    }
}
