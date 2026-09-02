import java.util.Scanner;

public class Repositorio {
    public Repositorio() {
    }

    public static String ingresarTexto(String mensaje) {
        Scanner in = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = in.nextLine();
        return texto;
    }

    public static int ingresarEntero(String mensaje) {
        Scanner in = new Scanner(System.in);
        System.out.print(mensaje);
        int numero = in.nextInt();
        return numero;
    }

    public static double ingresaDecimal(String mensaje) {
        Scanner in = new Scanner(System.in);
        System.out.print(mensaje);
        double numero = in.nextDouble();
        return numero;
    }

    public static boolean ingresaBoolean(String mensaje) {
        Scanner in = new Scanner(System.in);
        System.out.print(mensaje);
        boolean variable = in.nextBoolean();
        return variable;
    }

    public static String[] ingresarArregloTexto(int cantidad, String mensaje) {
        String[] nuevoArreglo = new String[cantidad];

        for(int i = 0; i < cantidad; ++i) {
            nuevoArreglo[i] = ingresarTexto(mensaje + "(" + (i + 1) + " de " + cantidad + "): ");
        }

        return nuevoArreglo;
    }

    public static int[] ingresarArregloEntero(int cantidad, String mensaje) {
        int[] nuevoArreglo = new int[cantidad];

        for(int i = 0; i < cantidad; ++i) {
            nuevoArreglo[i] = ingresarEntero(mensaje + "(" + (i + 1) + " de " + cantidad + "): ");
        }

        return nuevoArreglo;
    }

    public static double[] ingresarArregloDecimal(int cantidad, String mensaje) {
        double[] nuevoArreglo = new double[cantidad];

        for(int i = 0; i < cantidad; ++i) {
            nuevoArreglo[i] = ingresaDecimal(mensaje + "(" + (i + 1) + " de " + cantidad + "): ");
        }

        return nuevoArreglo;
    }

    public static boolean[] ingresarArregloBoleano(int cantidad, String mensaje) {
        boolean[] nuevoArreglo = new boolean[cantidad];

        for(int i = 0; i < cantidad; ++i) {
            nuevoArreglo[i] = ingresaBoolean(mensaje + "(" + (i + 1) + " de " + cantidad + "): ");
        }

        return nuevoArreglo;
    }

    public static boolean identificarVocal(char letra) {
        boolean esVocal = false;
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            esVocal = true;
        }

        return esVocal;
    }
}