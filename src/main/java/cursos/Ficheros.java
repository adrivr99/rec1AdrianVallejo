package main.java.cursos;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ficheros {
    public static ArrayList <Cursos> CSVCursos(String idFichero){
        // Variables para guardar los datos que se van leyendo
        String[] tokens;

        String linea;
        ArrayList<Cursos> listaCursos = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            datosFichero.nextLine();
            datosFichero.nextLine();
            datosFichero.nextLine();
            datosFichero.nextLine();
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
                Cursos cursos = new Cursos();
                cursos.setCentro(tokens[0]);
                cursos.setCodigo(tokens[1]);
                cursos.setTitulo(tokens[2]);
                cursos.setModalidad(tokens[3]);
                cursos.setEstado(tokens[4]);
                cursos.setFechaInicio(LocalDate.parse(tokens[5], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                cursos.setFechaFin(LocalDate.parse(tokens[6], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                cursos.setDirigidoA(tokens[7]);
                listaCursos.add(cursos);
            }//, DateTimeFormatter.ofPattern("dd/MM/yyyy"
            return listaCursos;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
