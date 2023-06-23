package Ex1;

public abstract class ContaBancaria {
    protected String nomeCliente;
    protected int numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente! não é possivel sacar!");
        } else{
            saldo -= valor;
            System.out.println("Foi sacado" + valor);
        }
    }
    public void  depositar (double valor){
        saldo += valor;
        System.out.println("Foi depositado: " + valor);
    }
    public void exibirSaldo (){
        System.out.println("\n---------exibindo_--------\n");
        System.out.println("\nCliente: " + this.nomeCliente + "\nConta: " + this.numConta + "\nSaldo é: " + saldo);

    }

    public double getSaldo() {
        return saldo;
    }
}
