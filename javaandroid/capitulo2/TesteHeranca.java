package br.com.androidpro.javaandroid.capitulo2;

public class TesteHeranca {
    public static void main (String[] args) {
        Carro carro = new Carro();

        carro.numeroLugares = 4;
        carro.acelerar(60);
        carro.trocaMarcha(3);

        carro.mostrar();

        Caminhao caminhao = new Caminhao();

        caminhao.capacidadeCarga = 1000;
        caminhao.setVelocidade(55);
        caminhao.setMarcha(4);

        caminhao.mostrar();
    }
}
