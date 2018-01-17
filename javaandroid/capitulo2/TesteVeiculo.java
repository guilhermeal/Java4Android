package br.com.androidpro.javaandroid.capitulo2;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();

        carro1.mostrar();
        carro1.setVelocidade(10);
        carro1.setMarcha(2);

        carro1.mostrar();

        carro1.setVelocidade(35);
        carro1.setMarcha(3);

        carro1.mostrar();

    }
}
