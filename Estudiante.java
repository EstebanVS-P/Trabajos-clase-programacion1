import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String identificacion;
    private String correo;
    private String numero;
    private byte edad;

    private ArrayList<Nota> nota;

    public Estudiante(String nombre, String apellido, String identificacion, String correo, String numero, byte edad){
        this.nombre= nombre;
        this.apellido= apellido;
        this.identificacion= identificacion;
        this.correo= correo;
        this.numero= numero;
        this.edad= edad;

        nota= new ArrayList<>();

    }
    public void agregarNota() {
        for (int i = 1; i <= 5; i++) {
            Nota notas = new Nota(Repositorio.ingresarTexto("Ingresa el nombre de la nota "+i+": "),
                    Repositorio.ingresarDecimalFloat("Ingresa la nota: "));
            nota.add(notas);
        }
    }
}
