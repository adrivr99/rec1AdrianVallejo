/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) {

        // Crea un objeto ListaEnteros.
        ListaEnteros lE = new ListaEnteros();

        // Rellena la lista con 15 objetos Integer. Para ello usa el método estático leerEntero().
        for (int i = 0; i < 15; i++) {
            lE.insertarElemento(leerEntero());
        }

        // Muestra la lista.
        lE.mostrar();

        // Inserta un elemento en la posición 4.
        lE.insertarElemento(leerEntero(), 4);

        // Muestra la lista.
        lE.mostrar();

        // Obtén el elemento que ocupe la posición 2 e imprime su valor por consola.
        System.out.println("Elemento de la posición 2: " + lE.obtenerElemento(2));

        // Busca en la lista el elemento "98" y muestra el resultado de la búsqueda.
        System.out.println("Posicion del 98: " + lE.buscarElemento(98));

        // Muestra la suma de los pares, impares, el elemento mayor y el elemento menor.
        lE.mostrarSumaPares();
        lE.mostrarSumaImpares();
        System.out.println("Número mayor: " + lE.getMayor());
        System.out.println("Número menor: " + lE.getMenor());

        // Borra el elemento que ocupa la posición 12.
        lE.borrarElemento(12);

        // Muestra la lista.
        lE.mostrar();

    }
    
    // Método para leer enteros por teclado
    private static int leerEntero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entre el 10 y el 100");
        String texto = teclado.next();
        int entero = Integer.parseInt(texto);
        return entero;
    }
}
