public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
        stock=0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if ("".equals(nombre))
            System.out.println("ingrese un nombre valido");
        else {
            this.nombre = nombre;
        }
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio<0)
            System.out.println("Ingrese un numero valido");
        else {
            this.precio = precio;
        }
    }
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock<0)
            System.out.println("Ingrese un numero valido");
        else {
            this.stock = stock;
        }
    }
    public void aumentarStock(int cantidad){
        if(cantidad<=0){
            System.out.println("Ingrese un numero valido");
        }
        else{
            stock=stock+cantidad;
        }
    }
    public void reducirStock(int cantidad){
        if(cantidad<=0||cantidad>stock){
            System.out.println("Ingrese un numero valido");
        }
        else{
            stock=stock-cantidad;
        }
    }


}
