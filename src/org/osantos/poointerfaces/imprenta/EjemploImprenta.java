package org.osantos.poointerfaces.imprenta;

import org.osantos.poointerfaces.imprenta.modelo.*;

import static org.osantos.poointerfaces.imprenta.modelo.Genero.*;
import static org.osantos.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("Oswaldo", "Santos"), "Ing. en Control y Automatización", "Resumen laboral");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("C embebido");

        Libro libro = new Libro(new Persona("Erick", "Gamma")
                , "Patrón de diseños",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patrón singletron"))
                .addPagina(new Pagina("Patrón observador"))
                .addPagina(new Pagina("Patrón factory"))
                .addPagina(new Pagina("Patrón composite"))
                .addPagina(new Pagina("Patrón facade"));


        Informe informe = new Informe(new Persona("Piojo", " folder")
                , new Persona("James ", "LK")
                , "Estudio de microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        //Clase anónima en la interface
        imprimir(new Imprimible() {

        });

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }



}
