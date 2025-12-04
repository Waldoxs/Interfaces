package org.osantos.poointerfaces.imprenta;

import org.osantos.poointerfaces.imprenta.modelo.Curriculum;
import org.osantos.poointerfaces.imprenta.modelo.Hoja;
import org.osantos.poointerfaces.imprenta.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Oswaldo", "Ing. en Control y Automatización", "Resumen laboral");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("C embebido");

        Informe informe = new Informe("Piojo folder", "James LK", "Estudio de microservicios");

        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
