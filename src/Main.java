//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto producto1=new Producto("Papa",15.5);
        Producto producto2=new Producto("Papel",32.8,12);

        System.out.println("El stock de: "+producto1.getNombre()+" es "+producto1.getStock());
        producto1.setStock(12);
        System.out.println("El stock de: "+producto1.getNombre()+" es "+producto1.getStock());
        System.out.println("El precio de: "+producto2.getNombre()+" es "+producto2.getPrecio());
        producto2.aumentarStock(0);
    }
}