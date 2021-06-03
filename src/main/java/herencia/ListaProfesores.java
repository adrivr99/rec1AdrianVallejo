package main.java.herencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaProfesores {
    private ArrayList <Profesor> lista = new ArrayList<>();

    public void imprimir() {
        for (Profesor listaProfesores : lista) {
            System.out.println(listaProfesores);
        }
    }

    public long diasTrabajados(ProfesorTitular p){
        LocalDate fechaActual = LocalDate.now();
        Long dias = ChronoUnit.DAYS.between(p.getFechaPosesionTrabajo(), fechaActual);
        return dias;
    }

    public double importeTotal(double sueldoBase) {
        double total = 0;
        double interino = 0;
        double titular = 0;
        for (Profesor profesor : lista) {
            if (profesor instanceof ProfesorTitular){
                double auxTitular = profesor.importeNomina(sueldoBase);
                titular = titular + auxTitular;
            }else {
                double auxInterino = profesor.importeNomina(sueldoBase);
                interino = interino + auxInterino;
            }
            total = titular + interino;
        }
        return total;
    }

    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Profesor> lista) {
        this.lista = lista;
    }
}
