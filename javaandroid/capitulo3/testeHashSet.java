package br.com.androidpro.javaandroid.capitulo3;

import java.util.HashSet;

public class testeHashSet {
    public static void main (String[] args) {

        HashSet<String> hash = new HashSet<>();

        hash.add("Guilherme");
        hash.add("Allan");
        hash.add("Guilherme");
        hash.add("Xavier");
        hash.add("Almeida");
        hash.add("Xavier");

        for (String nome : hash) {
            System.out.println("Nome: " + nome);
        }
    }
}
