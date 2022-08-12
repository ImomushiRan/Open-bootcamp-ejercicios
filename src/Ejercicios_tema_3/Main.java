package Ejercicios_tema_3;

public class Main {
    public static void main (String[] args) {
        Coche miCoche = new Coche();
        miCoche.AñadirPuerta();
        System.out.println(miCoche.puertas);


        suma (1,2,3);
    }

    public static int suma (int a, int b, int c) {
        int resultado;
        resultado = a + b + c ;
        System.out.println(resultado);
        return resultado;
    }

}

class Coche {
    public int puertas = 0;

    public void AñadirPuerta() {
        this.puertas++;
    }
}