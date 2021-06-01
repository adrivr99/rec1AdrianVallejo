package main.java.matrizletras;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MatrizLetras matriz = new MatrizLetras();
        matriz.imprimir();

        System.out.println("-----------------------------");
        matriz.ordenar();
        matriz.imprimir();
        System.out.println("-----------------------------");
        char caracter = leerLetra();
        System.out.println("Numero de veces que se repite la letra " + caracter + " = " + matriz.contarCaracter(caracter) + " veces");
    }
    private static char leerLetra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una letra del abecedario de A a la Z");
        String texto = teclado.next();
        char letra = texto.charAt(0);
        return letra;
    }
}
