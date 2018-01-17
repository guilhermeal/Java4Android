package br.com.androidpro.javaandroid.capitulo2;

public class Veiculo implements IVeiculo{
    int velocidade = 0;
    int marcha = 1;

    public Veiculo(int v, int m) {
        velocidade = v;
        marcha = m;
    }

    public Veiculo() {

    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int v) {
        velocidade = v;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int m) {
        marcha = m;
    }

    public void trocaMarcha(int novaMarcha) {
        marcha = novaMarcha;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
    }

    void mostrar() {
        System.out.println("VEICULO: Velocidade: " + getVelocidade() + " Km/h  ||  Marcha: " + getMarcha());
    }

    public void acelerar(int incremento, int marcha) {
        velocidade = (velocidade + incremento) * marcha;
    }

}
