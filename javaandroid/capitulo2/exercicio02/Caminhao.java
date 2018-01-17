package br.com.androidpro.javaandroid.capitulo2.exercicio02;

public class Caminhao extends Veiculo {
    private int cargaMaxima;

    public Caminhao (int velocidade, int marcha, int cargaMaxima) {
        super(velocidade, marcha);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void mostrar() {
        System.out.println("");
        super.mostrar();
        System.out.println("CAMINHAO: Carga Maxima: " + this.cargaMaxima);
        System.out.println("");
    }

    public int getCargaMaxima() {
        return this.cargaMaxima;
    }

    public void setCargaMaxima(int c) {
        cargaMaxima = c;
    }
}
