package org.osantos.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    private List<Imprimible> paginas; //Lista de hoja de tipo genero de Hoja
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina) {
        this.paginas.add(pagina);
        return this;    //Retorna el this para que se pueda encadenar
    }

    @Override
    public String imprimir() {
        StringBuilder stringB = new StringBuilder("Titulo: ");
        stringB.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(this.genero).append("\n");

        for (Imprimible pag: this.paginas){
            stringB.append(pag.imprimir()).append("\n");
        }
        return stringB.toString();
    }

}
