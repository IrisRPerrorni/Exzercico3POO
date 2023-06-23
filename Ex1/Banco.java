package Ex1;
//Crie uma classe Teste que contenha a seguinte lógica:
//Criar contas
//Sacar um valor das contas
//Depositar
//Mostrar um novo saldo a partir de um rendimento
//Mostrar os dados da conta do cliente

public class Banco {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("José Januário",12568 ,1000);
        contaPoupanca.exibirSaldo();
        contaPoupanca.sacar(200.0);
        contaPoupanca.exibirSaldo();
        contaPoupanca.depositar(150.0);
        contaPoupanca.exibirSaldo();
        contaPoupanca.calcularNovoSaldo(1.02);
        contaPoupanca.exibirSaldo();

        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Mariana",2586 ,5);
        contaPoupanca1.exibirSaldo();

        contaPoupanca1.sacar(100);


        ContaEspecial contaEspecial1 = new ContaEspecial("Janaina de Jesus" , 1258 , 5000,10000);
        contaEspecial1.exibirSaldo();
        contaEspecial1.sacar(500);
        contaEspecial1.exibirSaldo();
        contaEspecial1.depositar(500);
        contaEspecial1.exibirSaldo();
        contaEspecial1.sacar(11000);
        contaEspecial1.exibirSaldo();



    }


}
