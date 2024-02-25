public class Rectangulo {
    double altura;
    double base;
    public Rectangulo(double altura,double base){
        this.altura=altura;
        this.base=base;
    }
    public double perimetro(){
        double p=2*altura+2*base;
        return p;
    }
    public double area(){
        double a=altura*base;
        return a;
    }
    public void mostrar(){
        System.out.println("Altura: "+altura+" Base:"+base);
        //return String.format("Altura: %f Base: %f",altura,base);
    }
}