public class PracticaMain {
    public static void main(String args[]){

        Consola consola = new Consola(Repositorio.ingresarTexto("Ingresa el nombre de la consola: "),
                                      Repositorio.ingresarTexto("Ingresa el almacenamiento de la consola: "));

        int canJugadores=Repositorio.ingresarByte("Ingresa la cantidad de Jugadores: ");
        for(int i = 1; i<=canJugadores;i++){
            Jugador jugador = new Jugador(Repositorio.ingresarTexto("Ingresa el correo del jugador "+i+": "),
                                          Repositorio.ingresarTexto("Ingresa la contraseña del jugador "+i+": "),
                                          Repositorio.ingresarTexto("Ingresa el nombre de usuario del jugador "+i+": "),
                                          Repositorio.ingresarByte("Ingresa la edad del jugador "+i+": "));

            int juegos = Repositorio.ingresarEntero("Ingresa la cantidad de juegos del jugador "+i+": ");
            jugador.crearJuego(juegos);
        }
    }
}
