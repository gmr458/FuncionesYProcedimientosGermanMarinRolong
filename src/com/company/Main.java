package com.company;

public class Main {

    // Ejemplo de una funcion, en este caso retorna un valor de tipo entero y recibe un parametro de tipo entero
    public static int funcionNumeroMasNumero(int numero) {

        numero = numero + numero;

        return numero;

    }

    // Ejemplo de una procedimiento, en este caso no retorna valor, solo imprime en consola el parametro de tipo entero que le pasemos
    public static void procedimientoPrintNumero(int numero) {

        System.out.println(numero);

    }

    public static void main(String[] args) {

        int numero = 50; // variable de tipo entero que pasaremos por parametro a la funcion y el procedimiento

        // FUNCION
        // Como la funcion retorna un valor lo guardaremos en una variable del mismo tipo que retorna la funcion
        // llamamos a la funcion escribiendo el nombre de la funcion, abriendo parentesis despues del nombre
        // y entre esos parentesis pasamos los parametros correspondiente, si no require parametros entonces
        // los paretensis se dejan vacios
        int numeroRetornado = funcionNumeroMasNumero(numero);

        System.out.println("numero retornado -> " + numeroRetornado); // Imprimimos numero retornado

        // ---------------------------------------------------------------------

        // PROCEDIMIENTO
        // Como el procedimiento NO retorna valor simplemente llamamos al procedimiento escribiendo el nombre
        // y abriendo paretesis y pasando parametros si el procedimiento lo requiere
        procedimientoPrintNumero(numero);

    }

}
