package Ex4;

public class Mamifero extends Animal {
    String alimento;

    public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numPatas=4, cor, ambiente="terra", velocidade);
        this.alimento = alimento;
    }

    @Override
    public void descricao() {
        System.out.println("\nnome: " + nome + "\nComprimento: " + comprimento + "\nNumeroDePatas: " + numPatas +
                "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade + "\nAlimento: " + alimento);
    }
}
