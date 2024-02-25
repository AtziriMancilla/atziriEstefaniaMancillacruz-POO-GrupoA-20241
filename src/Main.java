//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangulo r=new Rectangulo();
        System.out.println("Area: "+ r.area(4.5,3.5));
        System.out.println("Perimetro: "+ r.perimetro(4.5,3.5));
        System.out.println("Area: "+ r.area(4,3));
        System.out.println("perimetro: "+ r.perimetro(4,3));
        // Empleado
        Empleado empleadoUno=new Empleado();
        System.out.println("Salario: "+empleadoUno.calcularSalario(2000));
        System.out.println("Salario: "+empleadoUno.calcularSalario(2850,300,2.5));
        System.out.println("Salario: "+empleadoUno.calcularSalario(3600,400));
        //CalculadoraImpuestos
        CalculadoraImpuestos calculadora1=new CalculadoraImpuestos();
        System.out.println("El total de impuestos es: "+calculadora1.calcularImpuestos(1560));
        System.out.println("El total de impuestos es: "+calculadora1.calcularImpuestos(1560,0.15));
        System.out.println("El total de impuestos es: "+calculadora1.calcularImpuestos(153,0.15,15));
        System.out.println("El total de impuestos es: "+calculadora1.calcularImpuestos(1568,25,0.5));
    }
}