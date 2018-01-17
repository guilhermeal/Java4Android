package br.com.androidpro.javaandroid.capitulo2.exercicio02;

public class Carro extends Veiculo {
    private int numeroLugares;

    public Carro (int velocidade, int marcha, int numeroLugares) {
        super(velocidade, marcha);
        this.numeroLugares = numeroLugares;
    }

    public int getNumeroLugares() {
        return this.numeroLugares;
    }

    public void setNumeroLugares(int l) {
        numeroLugares = l;
    }

    @Override
    public void mostrar() {
        System.out.println("");
        super.mostrar();
        System.out.println("CARRO: Lugares: " + this.numeroLugares);
        System.out.println("");
    }
}
