package br.com.androidpro.javaandroid.capitulo2.exercicio02;

public class Veiculo implements IVeiculo {
    int velocidade;
    int marcha;

    public Veiculo(int velocidade, int marcha) {
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    @Override
    public void acelera(int novaVelocidade) {
        this.velocidade = this.velocidade + novaVelocidade;
    }

    @Override
    public void trocaMarcha(int novaMarcha) {
        this.marcha = novaMarcha;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int v) {
        velocidade = v;
    }

    public int getMarcha() {
        return this.marcha;
    }

    public void setMarcha(int m) {
        marcha = m;
    }

    public void mostrar() {
        System.out.println("VEICULO");
        System.out.println("Velocidade: " + this.velocidade  + " | Marcha: " + this.marcha);
        System.out.println("");
    }

}