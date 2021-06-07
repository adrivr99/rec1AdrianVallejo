package main.java.cursos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.util.DurationUnitConverter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList <Cursos> curso= Ficheros.CSVCursos("RegActForCep.csv");
        curso.forEach(System.out::println);
        System.out.println("----------------------------");
        Collections.sort(curso);
        curso.forEach(System.out::println);
        ArrayList <Cursos> listaTerminados = new ArrayList<>(Cursos.terminadosMarzo(curso));
        System.out.println("-------------------------");
        listaTerminados.forEach(System.out::println);

        // Archivo JSON
        ObjectMapper mapeador = new ObjectMapper();

        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapeador.writeValue(new File("./Cursos.json"), generarCursos(curso));
    }

    public static ArrayList<Cursos> generarCursos(ArrayList<Cursos> listaCursos ){
        ArrayList<Cursos> lista = new ArrayList<>();
        lista.addAll(listaCursos);
        return lista;
    }

}
