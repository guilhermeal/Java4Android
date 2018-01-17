package br.com.androidpro.javaandroid.capitulo2;

public class TestePalavrasChave {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.numeroLugares = 6;

        carro.acelerar(200);
        carro.trocaMarcha(5);

        carro.mostrar();
    }
}
