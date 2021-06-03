package main.java.matrizletras;

import java.util.Arrays;
import java.util.Random;

public class MatrizLetras {
    private char[][] matriz = new char[10][10];
    Random rd = new Random();
    // String para introducir todas las letras del abecedario en mayuscula
    String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Constructor sin parametros que introduce letras aleatorias dentro de la matriz
    public MatrizLetras() {
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Usamos el charAt para convertir la letra que cogemos de abecedario
                matriz[i][j] = abecedario.charAt(rd.nextInt(abecedario.length()));
            }
        }*/
    }

    public char [][] llenarAleatoriamente(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = abecedario.charAt(rd.nextInt(abecedario.length()));
            }
        }
        return matriz;
    }

    // Método para imprimir por pantalla la matriz
    public void imprimir() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(" %c ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Metodo para ordenar las filas de la matriz de forma alfabetica usando Arrays.sort
    public void ordenar() {
        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }
    }

    // Método para contar el número de veces que se repite un carácter que pasamos como parametro en la matriz
    public int contarCaracter(char x) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // Método asList convierte un Array en un ArrayList
                if (x == matriz[i][j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "MatrizLetras{" +
                "matriz=" + Arrays.toString(matriz) +
                ", rd=" + rd +
                ", abecedario='" + abecedario + '\'' +
                '}';
    }
}
