package Ejercicios;

public class Ejercicio4 {

public static void main(String[] args) {
    
    //if
    int numeroIf = 0;

    if (numeroIf < 0){
        System.out.println("La variable numeroIf " + numeroIf);            
        }
    else if(numeroIf > 0){
        System.out.println("La variable numeroIf " + numeroIf);
    }
    else {
        System.out.println("La variable numeroIf es 0");
    }

    //While
    int numeroWhile = 0;

    while (numeroWhile < 3) {
        numeroWhile ++;
        System.out.println("La variable numerroWhile ahora vale: " + numeroWhile);
    }

    //Do while
    int numeroDoWhile = 3;

    do {
        numeroDoWhile++;
        System.out.println("La variable numeroDoWhile ahora vale: " + numeroDoWhile);
    }while (numeroDoWhile < 3);

    //for
    for (int numeroFor= 0; numeroFor <= 3; numeroFor ++){
        System.out.println("La variable numeroFor ahora vale: " +numeroFor);
    }

    //Switch
    String estacion = "verano";

    switch(estacion) {
        case "verano":
        System.out.println("Estamos en verano");
        break;
        case "invierno":
        System.out.println("Estamos en invierno");
        break;
        case "primavera":
        System.out.println("Estamos en primavera");
        break;
        case "otoño":
        System.out.println("Estamos en otoño");
        break;
        default:
        System.out.println("Esta no es una estacion del año");
        }
    }
}