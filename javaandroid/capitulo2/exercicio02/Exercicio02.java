package br.com.androidpro.javaandroid.capitulo2.exercicio02;

public class Exercicio02 {
    public static void main (String[] args) {
        Carro carro = new Carro(100, 4, 6);
        //carro.setNumeroLugares(5);
        //carro.setVelocidade(100);
        //carro.setMarcha(5);
        carro.mostrar();

        Caminhao caminhao = new Caminhao(60, 4, 1000);
        caminhao.mostrar();

    }
}
