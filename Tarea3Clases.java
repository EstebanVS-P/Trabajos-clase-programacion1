public class Tarea3Clases {
    public static void main (String args[]){

        int canNotas= Repositorio.ingresarEntero("Ingresa la cantidad de notas que deceas ingresar: ");

        Curso curso = new Curso(Repositorio.ingresarTexto("Ingresa el nombre del curso: "),
                                Repositorio.ingresarTexto("Ingresa el codigo del curso: "));

        int canEstudiantes= Repositorio.ingresarEntero("Ingresa la cantidad de estudiantes que deceas ingresar: ");
        for(int i = 1;i<=canEstudiantes;i++){
            Estudiante estudiante = new Estudiante(Repositorio.ingresarTexto("Ingresa el nombre de estudiante "+i+": "),
                                                   Repositorio.ingresarTexto("Ingresa el apellido del estudiante "+i+": "),
                                                   Repositorio.ingresarTexto("Ingresa el numero de identificacion del estudiante "+i+": "),
                                                   Repositorio.ingresarTexto("Ingresa el correo del estudiante "+i+": "),
                                                   Repositorio.ingresarTexto("Ingresa el numero del estudiante "+i+": "),
                                                   Repositorio.ingresarByte("Ingresa la edad del estudiante "+i+": "));

            estudiante.agregarNota(canNotas);
        }
    }
}
