package main.java.herencia;

import main.java.dominolista.FichaDomino;

import java.util.ArrayList;

public class ListaProfesores {
    private ArrayList <Profesor> lista = new ArrayList<Profesor>();

    public void imprimir() {
        for (Profesor listaProfesores : lista) {
            System.out.println(listaProfesores);
        }
    }

}
