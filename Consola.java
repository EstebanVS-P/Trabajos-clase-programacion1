import java.util.ArrayList;

public class Consola {

    private String nombre;
    private String almacenamiento;

    private ArrayList<Jugador>jugador;

    public Consola(String nombre, String almacenamiento){

        this.nombre=nombre;
        this.almacenamiento=almacenamiento;

        jugador=new ArrayList<>();
    }
}
