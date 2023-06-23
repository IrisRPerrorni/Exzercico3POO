package Ex4;

public abstract class Animal {
    String nome;
    double comprimento;
    int numPatas;
    String cor;
    String ambiente;
    double velocidade;

    public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public abstract void descricao();
}
