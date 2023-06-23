package Ex4;

public class Repteis extends Animal{
    public Repteis(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
    }

    @Override
    public void descricao() {
        System.out.println("\nnome: " + nome + "\nComprimento: " + comprimento + "\nNumeroDePatas: " + numPatas +
                "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade );
    }
}
