public class Tarea1{
    public static void main (String args[]){

        int cantidadNumeros = Repositorio.ingresarEntero("\nIngrese la cantidad de numeros que quiere en su arreglo: ");

        int[] arreglo = new int[cantidadNumeros];

        for(int i = 0 ; i<arreglo.length; i++){
            int numeros= Repositorio.ingresarEntero("Ingresa el numero que quieres en la posicion "+(i+1)+" de su arreglo: ");
            arreglo[i]=numeros;
        }
        int[] contarNumero= contadorRepetidos(arreglo);
        String mensaje = revisionContador(contarNumero, arreglo);
        System.out.println("\n"+mensaje);

        int[] arregloOrdenado= organizarNumeroBurbuja(arreglo);
        String mensaje2 = mostrarOrdenado(arregloOrdenado);
        System.out.println("\n"+mensaje2);
    }
    public static int[] contadorRepetidos(int[] arreglo){
        int j = 0;
        int[] contadorArreglo = new int[arreglo.length];
        int contador= 0;

        for(int e = 0; e< arreglo.length; e++){
            for(int i = 0; i<arreglo.length;i++){
                if(arreglo[e]==arreglo[i]){
                    contador++;
                }
            }
            contadorArreglo[j]= contador;
            contador=0;
            j++;
        }
        return contadorArreglo;
    }
    public static String revisionContador(int[] contadorArreglo, int[] arreglo){
        int mayor = 0;
        String mensaje = "";
        int guardar= 0;
        int contadorRepetidos= 0;

        for(int i = 0; i<contadorArreglo.length;i++){
            if(contadorArreglo[i]>mayor){
                mayor=contadorArreglo[i];
                guardar= i;
            }
        }
        for(int e = 0; e<contadorArreglo.length;e++){
            if(contadorArreglo[e] == mayor && arreglo[e]!= arreglo[guardar]){
                contadorRepetidos++;
            }
        }
        if(mayor==1){
            mensaje= "En tu arreglo no se encuentran valores repetidos.";
        }else if(contadorRepetidos>1){
            mensaje= "En tu arreglo hay numeros que se repiten la misma cantidad de veces, estos repitiendose "+mayor+" veces.";
        }else{
            mensaje="El numero que mas se repite de tu arreglo es el "+arreglo[guardar]+" que se repite "+mayor+" veces.";
        }
        return mensaje;
    }

    private static int getInt(int contadorArreglo) {
        return contadorArreglo;
    }

    public static int[] organizarNumeroBurbuja(int[] arreglo){

        for(int i = 0; i<arreglo.length; i++){
            for(int e = 0;e<arreglo.length-1;e++){
                if(arreglo[e]>arreglo[e+1]){
                    int c = arreglo[e];
                    arreglo[e]=arreglo[e+1];
                    arreglo[e+1]= c;
                }
            }
        }
        return arreglo;
    }
    public static String mostrarOrdenado(int[] arreglo){
        String mensaje = "";
        for(int numeros: arreglo){
            mensaje+= numeros+", ";
        }
        return mensaje;
    }
}