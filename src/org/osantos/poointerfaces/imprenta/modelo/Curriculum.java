package org.osantos.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp) {
        this.experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder stringB = new StringBuilder();
        stringB.append("Nombre: ").append(this.persona).append("\n")
                .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesión: ").append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for (String exp : experiencias) {
            stringB.append("- ").append(exp).append("\n");
        }
        return stringB.toString();
    }
}
