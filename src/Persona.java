public class Persona{
    String name;
    int age;
    String gender;
    public Persona(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String mostrar(){
        return String.format("Name: %s Age: %d Genero: %s",name,age,gender);
    }
}
