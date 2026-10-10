public class Estudiante {
    //Atributos
    private String nombre;
    private int codigo;
    private String programa;
    private double promedio;


    //constructor

    public Estudiante(String nombre, int codigo, String programa, double promedio){
        this.nombre = nombre;
        this.codigo = codigo;
        this.programa = programa;
        this.promedio = promedio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getPrograma(){
        return programa;
    }

    public double getPromedio(){
        return promedio;
    }

}