package br.com.androidpro.javaandroid.capitulo3;

import java.util.ArrayList;

public class testeArrayList {

    public static void main(String[] args) {

        // CRIAR NOVA ARRAY LIST - TIPO STRINGS
        ArrayList<String> list = new ArrayList<>();

        // ADICIONANDO ELEMENTOS NO ARRAY LIST
        list.add("Guilherme");
        list.add("Allan");
        list.add("Xavier");
        list.add("de");
        list.add("Almeida");

        // PRINTAR NA TELA OS ITENS DO ARRAY LIST
        for (String android : list) {
            System.out.println("Nome: " + android);
        }

        // REMOVER ITEM POR INDICE DO ARRAY LIST
        list.remove(2);


        // PULAR LINHA
        System.out.println();

        for (String android : list) {
            System.out.println("Nome: " + android);
        }




    }

}
