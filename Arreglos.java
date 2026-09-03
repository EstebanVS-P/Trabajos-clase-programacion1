public class Arreglos {
    public static void main(String args[]){

        int[] arreglo= {2,4,6,8,10};

        int suma = sumaArreglo(arreglo);
        System.out.println("La suma del arreglo es: "+suma);

        int numero = Repositorio.ingresarEntero("Ingresa el numero que quieres saber si esta en tu arreglo: ");

        String mensaje = revisarNumero(arreglo,numero);
        System.out.println(mensaje);
    }
    public static int sumaArreglo(int[] arreglo){
        int suma = 0;
        for(int i = 0; i<arreglo.length; i++){
            suma+=arreglo[i];
        }
        return suma;
    }
    public static String revisarNumero(int[] arreglo, int numero){
        String mensaje = "";
        for(int i = 0; i<arreglo.length; i++){
            if(arreglo[i]==numero){
                mensaje="El numero esta en tu arreglo";
                break;
            }else{
                mensaje= "El numero no esta en tu arreglo";
            }
        }
        return mensaje;
    }
}
