package br.com.androidpro.javaandroid.capitulo3.exercicio03;

import java.util.ArrayList;

public class exercicio3 {

    public static void main (String[] args) {

        ArrayList<String> array = new ArrayList<>();

        // OTIMIZANDO CODIGO
        for(int i = 1; i<=10; i++) {
            array.add("Elemento - " + i);
        }
        /*
        array.add("Elemento - 1");
        array.add("Elemento - 2");
        array.add("Elemento - 3");
        array.add("Elemento - 4");
        array.add("Elemento - 5");
        array.add("Elemento - 6");
        array.add("Elemento - 7");
        array.add("Elemento - 8");
        array.add("Elemento - 9");
        array.add("Elemento - 10");
        */

        for (String mostrar : array) {
            System.out.println("Valor: " + mostrar);
        }

        System.out.println();
        array.remove(4);
        array.remove(8);
        array.remove(3);

        for (String mostrar : array) {
            System.out.println("Valor: " + mostrar);
        }

        System.out.println();

        System.out.println("Chave do Elemento 6: " + array.indexOf("Elemento - 6"));
    }
}
