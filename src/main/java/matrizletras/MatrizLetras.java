package main.java.matrizletras;

import main.java.dominolista.FichaDomino;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MatrizLetras {
    private char[][] matriz = new char[10][10];
    Random rd = new Random();
    String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public MatrizLetras() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            matriz[i][j] = abecedario.charAt(rd.nextInt(abecedario.length()));
            }
        }
    }

    public void imprimir(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(" %c ",matriz[i][j]);
            }
            System.out.println();
        }
    }
    public void ordenar(){
        for (int i = 0; i < matriz.length; i++) {
           Arrays.sort(matriz[i]);
        }
    }

    public int contarCaracter(char x){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (Arrays.asList(matriz[i][j]).contains(x)){
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
