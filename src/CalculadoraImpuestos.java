public class CalculadoraImpuestos {
    double calcularImpuestos(int ingresos){
        return ingresos +0.15;
    }
    double calcularImpuestos(int ventas,double porcentajeImpuestos){
        return ventas * (porcentajeImpuestos / 100);
    }
    double calcularImpuestos(double dividendos,double porcentajeImpuestos,double exencion){
        double impuestos = dividendos * (porcentajeImpuestos / 100);
        if(impuestos>exencion){
            return impuestos-exencion;
        }
        else return 0;
    }
}
