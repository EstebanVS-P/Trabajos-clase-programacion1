public class Tarea3Clases {
    public static void main (String args[]){

        Curso curso = new Curso(Repositorio.ingresarTexto("Ingresa el nombre del curso: "),
                                Repositorio.ingresarTexto("ingresa el codigo del curso: "));

        int estudiantes = Repositorio.ingresarEntero("Ingresa la cantidad de estudiantes en tu clase: ");
        for(int i = 1; i<=estudiantes;i++) {
            Estudiante estudiante = new Estudiante(
                    Repositorio.ingresarTexto("Ingresa el nombre del estudiante "+i+": "), Repositorio.ingresarTexto("Ingresa el apellido: "),
                    Repositorio.ingresarTexto("Ingresa su identificacion: "), Repositorio.ingresarTexto("Ingresa su correo: "),
                    Repositorio.ingresarTexto("Ingresa su numero: "), Repositorio.ingresarByte("Ingresa su edad: "));

            estudiante.agregarNota();
        }
    }
}
