package br.com.androidpro.javaandroid.capitulo2;

public class TestePolimorfismo {
    public static void main (String[] args) {
        Veiculo veiculo1, veiculo2, veiculo3;

        veiculo1 = new Veiculo(30,2);

        veiculo2 = new Carro();
        veiculo2.setMarcha(2);
        veiculo2.setVelocidade(35);

        veiculo3 = new Caminhao();
        veiculo3.setVelocidade(40);
        veiculo3.setMarcha(4);

        veiculo1.mostrar();
        veiculo2.mostrar();
        veiculo3.mostrar();
    }
}
