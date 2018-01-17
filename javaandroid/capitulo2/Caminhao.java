package br.com.androidpro.javaandroid.capitulo2;

public class Caminhao extends Veiculo {
    int capacidadeCarga;

    @Override
    void mostrar() {
        System.out.println("CAMINHAO: ");
        System.out.println("Capacidade Carga: " + this.capacidadeCarga);
        super.mostrar();
    }
}
