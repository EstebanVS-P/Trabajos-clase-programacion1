public class Juego {
    private String nombre;
    private String genero;
    private double precio;
    private String espacio;
    private byte jugadores;

    public Juego(String nombre, String genero, double precio, String espacio, byte jugadores){
        this.nombre=nombre;
        this.genero=genero;
        this.precio=precio;
        this.espacio=espacio;
        this.jugadores=jugadores;
    }
}
