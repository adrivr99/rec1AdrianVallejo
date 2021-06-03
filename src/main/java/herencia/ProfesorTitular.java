package main.java.herencia;

import java.time.LocalDate;

public abstract  class ProfesorTitular extends Profesor implements Comparable <ProfesorTitular> {
    private LocalDate fechaPosesionTrabajo;

    public ProfesorTitular(LocalDate fechaPosesionTrabajo, int idProfesor, String nombre, String apellidos, int NIF) {
        super(idProfesor, nombre, apellidos, NIF);
        this.fechaPosesionTrabajo = fechaPosesionTrabajo;
    }

    public LocalDate getFechaPosesionTrabajo() {
        return fechaPosesionTrabajo;
    }

    public void setFechaPosesionTrabajo(LocalDate fechaPosesionTrabajo) {
        this.fechaPosesionTrabajo = fechaPosesionTrabajo;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorTitular{" +
                "fechaPosesionTrabajo=" + fechaPosesionTrabajo;
    }

    @Override
    public double importeNomina(double sueldoBase){
        return sueldoBase = sueldoBase + sueldoBase*0.3;
    }

    @Override
    public int compareTo(ProfesorTitular p){
        return this.fechaPosesionTrabajo.compareTo(p.fechaPosesionTrabajo);
    }
}
