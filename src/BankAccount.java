public class BankAccount{
    private long accountNumber;
    private double amount;
    private char type;

    public BankAccount(long accountNumber, char type) {
        this.accountNumber = accountNumber;
        this.type = type;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void agregarDinero(double amount) {
        if (type == 'A') agregarDineroA(amount);
        else if (type == 'B') agregarDineroB(amount);
        else {
            this.amount += amount;
            System.out.printf("Se han agregado: %f a su cuenta",amount);
        }
    }

    private void agregarDineroA(double amount) {
        if (this.amount + amount <= 50000) {
            this.amount += amount;
            System.out.printf("Se han agregado: %f a su cuenta",amount);
        } else {
            System.out.println("No puede tener más de 50,000 cuenta A");
        }
    }

    private void agregarDineroB(double amount) {
        if (this.amount + amount <= 100000) {
            this.amount += amount;
            System.out.printf("Se han agregado: %f a su cuenta",amount);
        } else {
            System.out.println("No puede tener más de 100,000 cuenta B");
        }
    }
    public void retirarDinero(double retiro){
        switch(type){
            case 'A':
                retirarDineroA(retiro);
                System.out.printf("Se han retirado: %f de su cuenta, su nuevo saldo es %d",retiro,amount);
                break;

            case 'B':
                retirarDineroB(retiro);
                System.out.printf("Se han retirado: %f de su cuenta, su nuevo saldo es %d",retiro,amount);
                break;

            case 'C':
                retirarDineroC(retiro);
                System.out.printf("Se han retirado: %f de su cuenta, su nuevo saldo es %d",retiro,amount);
                break;
        }
    }
    private void retirarDineroA(double retiro){
        if(amount < 1000){
            System.out.println("\nSaldo insuficiente para retirar");
        }
        else if(amount < retiro){
            System.out.println("\nEl dinero a retirar es mayor al saldo disponible");
        }
        else{
            amount -= retiro;
        }
    }

    private void retirarDineroB(double retiro){
        if(amount < 5000){
            System.out.println("\nSaldo insuficiente para retirar");
        }
        else if(amount < retiro){
            System.out.println("\nEl dinero a retirar es mayor al saldo disponible");
        }
        else{
            amount -= retiro;
        }
    }

    private void retirarDineroC(double retiro){
        if(amount < 10000){
            System.out.println("\nSaldo insuficiente para retirar");
        }
        else if(amount < retiro){
            System.out.println("\nEl dinero a retirar es mayor al saldo disponible");
        }
        else{
            amount -= retiro;
        }
    }
}

