public class Libro {
    String titulo="La papisa";
    String autor="Donna Woolfolk Cross";
    int year= 1996;
    public String mostrar(){
        return String.format("Titulo: %s autor: %s year: %d",titulo,autor,year);
    }
}