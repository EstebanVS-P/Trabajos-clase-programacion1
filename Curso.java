import java.util.ArrayList;

public class Curso {

    private String nombre;
    private String codigo;

    private ArrayList<Estudiante> estudiante;

    public Curso(String nombre, String codigo) {

        this.nombre = nombre;
        this.codigo = codigo;

        estudiante = new ArrayList<>();
    }
}
