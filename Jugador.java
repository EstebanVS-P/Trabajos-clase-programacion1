import java.util.ArrayList;

public class Jugador {

    private String correo;
    private String contraseña;
    private String nombre;
    private byte edad;

    private ArrayList<Juego>juego;

    public Jugador(String correro, String contraseña, String nombre, byte edad){

        this.correo= correo;
        this.contraseña=contraseña;
        this.nombre= nombre;
        this.edad=edad;

        juego= new ArrayList<>();
    }

    public void crearJuego(int juegos){
        for(int i = 1; i<=juegos;i++){
            Juego jueg = new Juego(Repositorio.ingresarTexto("Ingresa el nombre del juego: "),
            Repositorio.ingresarTexto("Ingresa el genero de tu video juego: "),
            Repositorio.ingresaDecimal("Ingresa el precio del video juego: "),
            Repositorio.ingresarTexto("Ingresa el espacio de almacenamiento necesario: "),
            Repositorio.ingresarByte("Ingresa la cantidad de jugador permitidos: "));

            juego.add(jueg);
        }
    }
}
