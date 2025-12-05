package org.osantos.poointerfaces.imprenta.modelo;

public interface Imprimible {
    //final static String TEXTO_DEFECTO="Imprimiendo un valor por defecto";
    String TEXTO_DEFECTO="Imprimiendo un valor por defecto";    //Por defecto ya es final static

    default String imprimir() {
        return TEXTO_DEFECTO;
    }

     //Se puede también tener un metodo default con contenido que no es de uso obligatorio en la herencia


     static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
