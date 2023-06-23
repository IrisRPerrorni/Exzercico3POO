package Ex1;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        if(taxaDeRendimento<1){
            taxaDeRendimento +=1;
        }
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }
    @Override
    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente! não é possivel sacar!");
        } else if (valor<saldo){
            saldo -= valor;
            System.out.println("Foi sacado" + valor);
        }
    }
    @Override
    public void  depositar (double valor){
        saldo += valor;
        System.out.println("Foi depositado: " + valor);
    }

    public void calcularNovoSaldo(double taxaDeRendimento){
        super.saldo = saldo * taxaDeRendimento;
        System.out.println("Seu saldo atual com a taxa de rendimento é de: " + saldo);
    }
    @Override
    public void exibirSaldo (){
        System.out.println("\n---------exibindo_--------\n");
        System.out.println("\nCliente: " + this.nomeCliente + "\nConta: " + this.numConta + "\nSaldo é: " + saldo);

    }

}
