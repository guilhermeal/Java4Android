package br.com.androidpro.javaandroid.capitulo2;

public class Carro extends Veiculo {
    int numeroLugares;

    @Override
    void mostrar() {
        //int velocidade = super.getVelocidade();
        System.out.println("CARRO: ");
        System.out.println("Lugares: " + this.numeroLugares);
        //System.out.println("Velocidade: " + velocidade);
        super.mostrar();
    }

}