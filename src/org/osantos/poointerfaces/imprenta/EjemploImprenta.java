package org.osantos.poointerfaces.imprenta;

import org.osantos.poointerfaces.imprenta.modelo.*;

import static org.osantos.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Oswaldo", "Ing. en Control y Automatización", "Resumen laboral");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("C embebido");

        Libro libro = new Libro("Erick Gamma", "Patrón de diseños", PROGRAMACION);
        libro.addPagina(new Pagina("Patrón singletron"))
                .addPagina(new Pagina("Patrón observador"))
                .addPagina(new Pagina("Patrón factory"))
                .addPagina(new Pagina("Patrón composite"))
                .addPagina(new Pagina("Patrón facade"));


        Informe informe = new Informe("Piojo folder", "James LK", "Estudio de microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
