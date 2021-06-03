package main.java.herencia;

import java.time.LocalDate;

public abstract class ProfesorInterino extends Profesor implements Comparable <ProfesorInterino>{
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ProfesorInterino(int idProfesor, String nombre, String apellidos, int NIF, LocalDate fechaInicio, LocalDate fechaFin) {
        super(idProfesor, nombre, apellidos, NIF);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorInterino{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }

    @Override
    public double importeNomina(double sueldoBase) {
        return sueldoBase = sueldoBase + sueldoBase*0.15;
    }

    @Override
    public int compareTo(ProfesorInterino p) {
        return this.fechaInicio.compareTo(p.fechaInicio);
    }
}
