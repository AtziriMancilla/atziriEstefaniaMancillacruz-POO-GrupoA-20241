import java.util.ArrayList;

public class Employee {
    private String name;
    private String lastName;
    private ArrayList<BankAccount> accounts=new ArrayList<>();


    public Employee(String name, String lastName, long accountNumber, char type) {
        type=Character.toUpperCase(type);
        if (type != 'A' && type != 'B' && type != 'C') {
            System.out.println("Tipo de cuenta no válido");
            return;
        }
        this.name = name;
        this.lastName = lastName;
        accounts.add(new BankAccount(accountNumber, type));
        System.out.println("Usuario creado con exito");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
    public void agregarCuenta(long account,char type){
        type=Character.toUpperCase(type);
        if (type != 'A' && type != 'B' && type != 'C') {
            System.out.println("Tipo de cuenta no válido");
            return;
        }
        accounts.add(new BankAccount(account, type));
    }
}
