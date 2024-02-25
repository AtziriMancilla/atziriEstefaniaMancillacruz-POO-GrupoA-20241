//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        //Persona
        Persona primera= new Persona("Ana",15,"female");
        Persona segunda= new Persona("Juan",25,"male");
        Persona tercera= new Persona("Pedro",18,"male");
        Persona cuarta= new Persona("Rosi",29,"female");
        System.out.println(primera.mostrar());
        System.out.println(segunda.mostrar());
        System.out.println(tercera.mostrar());
        System.out.println(cuarta.mostrar());
        //Libro
        Libro libro1 = new Libro();
        System.out.println(libro1.mostrar());
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        libro2.titulo="La cancion de Aquiles";
        libro2.autor="Madeline Miller";
        libro2.year=2011;
        libro3.titulo="Eleanor & Park";
        libro3.autor="Rainbow Rowell";
        libro3.year=2012;
        libro4.titulo="La tregua";
        libro4.autor="Mario Benedetti";
        libro4.year=1960;
        System.out.println(libro2.mostrar());
        System.out.println(libro3.mostrar());
        System.out.println(libro4.mostrar());
        //Rectangulo
        Rectangulo r1=new Rectangulo(3,5);
        Rectangulo r2=new Rectangulo(2.0,10.0);
        Rectangulo r3=new Rectangulo(1.8,4.5);
        Rectangulo r4=new Rectangulo(7.48,15.6);
        r1.mostrar();
        System.out.println("Perimetro: "+r1.perimetro());
        System.out.println("Area: "+r1.area());
        r2.mostrar();
        System.out.println("Perimetro: "+r1.perimetro());
        System.out.println("Area: "+r1.area());
        r3.mostrar();
        System.out.println("Perimetro: "+r1.perimetro());
        System.out.println("Area: "+r1.area());
        r4.mostrar();
        System.out.println("Perimetro: "+r1.perimetro());
        System.out.println("Area: "+r1.area());
    }
}