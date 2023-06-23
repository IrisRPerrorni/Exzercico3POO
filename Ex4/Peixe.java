package Ex4;

public class Peixe extends Animal {
    public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, numPatas=0, cor="cinzenta", ambiente = "mar", velocidade);
        this.caracteristicas = "barbatanas e cauda";
    }

    String caracteristicas;

    @Override
    public void descricao() {
        System.out.println("\n-------Ficha-------\n");
        System.out.println("\nnome: " + nome + "\nComprimento: " + comprimento + "\nNumeroDePatas: " + numPatas +
                "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade + "\nCaracteristicas: " +caracteristicas);

    }
}
