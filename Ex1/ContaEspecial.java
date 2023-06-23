package Ex1;

public class ContaEspecial extends ContaBancaria {
   private double limite;


    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }
    @Override
    public void sacar(double valor){
        if (valor>limite){
            System.out.println("Valor acima do limite! não é possivel sacar!" );
        } else{
            saldo -= valor;
            System.out.println("Foi sacado" + valor);
        }
    }
    @Override
    public void  depositar (double valor){
        saldo += valor;
        System.out.println("Foi depositado: " + valor);
    }
    @Override
    public void exibirSaldo (){
        System.out.println("\n---------exibindo_--------\n");
        System.out.println("\nCliente: " + this.nomeCliente + "\nConta: " + this.numConta + "\nSaldo é: " + saldo);

    }

    public double getLimite() {
        return limite;
    }
}
