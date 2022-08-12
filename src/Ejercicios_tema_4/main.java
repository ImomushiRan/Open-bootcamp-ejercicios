package Ejercicios_tema_4;

public class main {
    public static void main (String[] args) {
    int numeroIf=0;
    if (numeroIf>0) {
            System.out.println("Es positivo");
        } else if (numeroIf<0){
        System.out.println("Es Negativo");
        } else System.out.println("Es 0");

    int numeroWhile=0;
    while (numeroWhile<3) {
        System.out.println(numeroWhile);
        numeroWhile= numeroWhile+1;
    }

    int numeroFor;
    for (numeroFor=0;numeroFor<=3;numeroFor++){
        System.out.println(numeroFor);
        }

    var estacion = "Primavera";
    switch (estacion){
        case "Verano":
        case "verano":
            System.out.println("Estamos en verano");
            break;
        case "Primavera":
        case "primavera":
            System.out.println("Estamos en primavera");
            break;
        case "Otoño":
        case "otoño":
            System.out.println("Estamos en otoño");
            break;
        case "Invierno":
        case "invierno":
            System.out.println("Estamos en invierno");
            break;
        default:
            System.out.println("No es una estacion");
            break;

        }

        do {
            System.out.println(numeroWhile);
            numeroWhile=numeroWhile+1;
        } while (numeroWhile<3);


    }
}
