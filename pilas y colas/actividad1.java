public class actividad1 {
    public static void main(String[] args) {
        //Arreglos de 10

        Estudiante [] estudiantes = new Estudiante [10];
        int cantidad = 0;

        //crea estudiante

        estudiantes [cantidad] = new Estudiante ("Juan", 8858,"Sistemas", 3.5);
        cantidad++;   //Ahora hay 1 estudiante

        estudiantes [cantidad] = new Estudiante ("jhon", 7589, "Sistemas", 4.5);
        cantidad++;   //Ahora hay 2

        estudiantes [cantidad] = new Estudiante ("maria", 4589, "Sistemas", 2.5);
        cantidad++;   //Ahora hay 3

        for (int i = 0; i < cantidad; i++){
            System.out.println(estudiantes[i].getCodigo() + " - " + estudiantes[i].getNombre() + " - " + estudiantes[i].getPromedio());
        }


        int codigoBuscado = 7589;
        boolean encontrado = false;

        for (int i = 0; i < cantidad; i++) {
            if (estudiantes[i].getCodigo() == codigoBuscado) {
                System.out.println("Encontrado: " + estudiantes[i].getCodigo() + " - " + estudiantes[i].getNombre() + " - " + estudiantes[i].getPrograma() + " - " + estudiantes[i].getPromedio());
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("No se encontro estudiante" + codigoBuscado);
        }


    }
}