public class Empleado {

    double calcularSalario(double sueldoBase){
        return sueldoBase;
    }
    double calcularSalario(double sueldoBase,double bonificacion){
        return sueldoBase+bonificacion;
    }
    double calcularSalario(double sueldoBase,double bonificacion,double horasExtras){
        return sueldoBase+bonificacion+horasExtras*20;
    }

}