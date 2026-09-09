public class Tarea2Matrices {
    public static void main(String args[]) {

        int filas = Repositorio.ingresarEntero("Ingresa el numero de filas que quieres en tu matriz: ");
        int columnas = Repositorio.ingresarEntero("Ingresa el numero de columnas que quieres en tu matriz: ");

        int[][] matriz1 = new int[filas][columnas];

        if (filas != columnas) {
            System.out.println("Para llevar a cabo el programa es necesario que hagas una matriz cuadrada.");
            return;
        }

        int numero = Repositorio.ingresarEntero("Ingresa el numero en el que quieres que empiece tu matriz espiral: ");
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                int numeros = Repositorio.ingresarEntero("Escribe el numero para la fila " + (i + 1) + " y columna " + (e + 1) + ": ");
                matriz1[i][e] = numeros;
            }
        }
        mostrarMatriz(matriz1);

        int sumaMatriz = sumasMatriz(matriz1, filas, columnas);
        System.out.println("La suma de todos los numeros de tu matriz da: " + sumaMatriz +
                "\n");

        int[][] matriz2 = encontrarDiagnalPrincipal(matriz1, filas, columnas);
        mostrarMatriz2(matriz2);
        int suma = sumaDiagonalMatriz(matriz2, filas, columnas);
        System.out.println("La suma de la diagonal principal es: " + suma);

        int[][] matriz3 = encontarDiagonalSecundaria(matriz1, filas, columnas);
        mostrarMatriz3(matriz3);
        int sumaSecundaria = sumaDiagonalSecundariaMatriz(matriz1, filas, columnas, matriz3);
        System.out.println("La suma de la diagonal secundaria es: " + sumaSecundaria);

        int[][] matriz4 = matrizDiagonales(matriz1, filas, columnas);
        mostrarMatriz4(matriz4);
        int suma4 = sumaDiagonales(matriz1, filas, columnas, matriz4);
        System.out.println("La suma de las diagonales es: " + suma4);

        int[][] matrizEspiral= matrizEspiral(filas,columnas,numero);
        mostrarMatrizEspiral(matrizEspiral);

        int[][] matrizCuadro = dibujarCuadro(filas,columnas);
        mostrarMatrizCuadro(matrizCuadro);
    }

    public static void mostrarMatriz(int[][] matriz1) {
        for (int[] fila : matriz1) {
            for (int numero : fila) {
                System.out.print("[" + numero + "]");
            }
            System.out.println("");
        }
    }

    public static int sumasMatriz(int[][] matriz1, int filas, int columnas) {
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                suma += matriz1[i][e];
            }
        }
        return suma;
    }

    public static int[][] encontrarDiagnalPrincipal(int[][] matriz1, int filas, int columnas) {
        int[][] matriz2 = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                if (i == e) {
                    matriz2[i][e] = matriz1[i][e];
                }
            }
        }
        return matriz2;
    }

    public static void mostrarMatriz2(int[][] matriz2) {
        for (int[] filas : matriz2) {
            for (int numeros : filas) {
                System.out.print("[" + numeros + "]");
            }
            System.out.println("");
        }
    }

    public static int sumaDiagonalMatriz(int[][] matriz2, int filas, int columnas) {
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                if (i == e) {
                    suma += matriz2[i][e];
                }
            }
        }
        return suma;
    }

    public static int[][] encontarDiagonalSecundaria(int[][] matriz1, int filas, int columnas) {
        int[][] matriz3 = new int[filas][columnas];

        int j = 1;
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                if (e == matriz1.length - j) {
                    matriz3[i][e] = matriz1[i][e];
                    j++;
                }
            }
        }
        return matriz3;
    }

    public static void mostrarMatriz3(int[][] matriz3) {
        for (int[] filas : matriz3) {
            for (int numeros : filas) {
                System.out.print("[" + numeros + "]");
            }
            System.out.println("");
        }
    }

    public static int sumaDiagonalSecundariaMatriz(int[][] matriz1, int filas, int columnas, int[][] matriz3) {
        int suma2 = 0;
        int j = 1;
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                if (e == matriz1.length - j) {
                    suma2 += matriz3[i][e];
                    j++;
                }
            }
        }
        return suma2;
    }

    public static int[][] matrizDiagonales(int[][] matriz1, int filas, int columnas) {
        int j = 1;
        int[][] matriz4 = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                if (i == e) {
                    matriz4[i][e] = matriz1[i][e];
                }
                if (e == matriz1.length - j) {
                    j++;
                    matriz4[i][e] = matriz1[i][e];
                }
            }
        }
        return matriz4;
    }

    public static void mostrarMatriz4(int[][] matriz4) {
        for (int[] filas : matriz4) {
            for (int numeros : filas) {
                System.out.print("[" + numeros + "]");
            }
            System.out.println("");
        }
    }

    public static int sumaDiagonales(int[][] matriz1, int filas, int columnas, int[][] matriz4) {
        int j = 1;
        int suma4 = 0;

        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                if (i == e) {
                    suma4 += matriz1[i][e];
                }
                if (e == matriz1.length - j) {
                    suma4 += matriz4[i][e];
                    j++;
                }
            }
        }
        return suma4;
    }
    public static int[][] dibujarCuadro(int filas, int columnas){
        int[][] matrizCuadro = new int[filas][columnas];

        int inicioFila= 0;
        int inicioColumna = 0;
        int finFila= matrizCuadro.length-1;
        int finColumna = matrizCuadro[0].length-1;

        for(int i = inicioColumna;i<=finColumna;i++){
                matrizCuadro[inicioFila][i]=1;
        }
        inicioFila++;

        for(int e = inicioFila; e<=finFila;e++){
            matrizCuadro[e][finColumna]=1;
        }
        finColumna--;

        for(int j = finColumna;j>=inicioColumna;j--) {
             matrizCuadro[finFila][j] = 1;
        }
        finFila--;

        for(int k = finFila;k>=inicioFila;k--) {
            matrizCuadro[k][inicioColumna] = 1;
        }
        return matrizCuadro;
    }
    public static void mostrarMatrizCuadro(int[][] matrizCuadro){
        for(int[] filas: matrizCuadro){
            for(int numeros: filas){
                System.out.print("["+numeros+"]");
            }
            System.out.println("");
        }
    }

    public static int[][] matrizEspiral(int filas, int columnas, int numero) {
        int[][] matrizEspiral = new int[filas][columnas];

        int inicioFila = 0;
        int inicioColumna = 0;
        int finFila = matrizEspiral.length - 1;
        int finColumna = matrizEspiral[0].length - 1;

        while (finFila >= inicioFila && finColumna >= inicioColumna) {
            for (int i = inicioColumna; i <= finColumna; i++) {
                matrizEspiral[inicioFila][i] = numero++;
            }
            inicioFila++;

            for (int e = inicioFila; e <= finFila; e++) {
                matrizEspiral[e][finColumna] = numero++;
            }
            finColumna--;

            for (int j = finColumna; j >= inicioColumna; j--) {
                matrizEspiral[finFila][j] = numero++;
            }
            finFila--;

            for (int k = finFila; k >= inicioFila; k--) {
                matrizEspiral[k][inicioColumna] = numero++;
            }
            inicioColumna++;
        }
        return matrizEspiral;
    }

    public static void mostrarMatrizEspiral(int[][] matrizEspiral) {
        for (int[] filas : matrizEspiral) {
            for (int numeros : filas) {
                System.out.print("[" + numeros + "]");
            }
            System.out.println("");
        }
    }
}