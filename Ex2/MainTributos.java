package Ex2;

public class MainTributos {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        System.out.println("Tributos da conta poupança: " + contaPoupanca.calcularTributos());

        ContaCorrente contaCorrente = new ContaCorrente(5000.0);
        System.out.println("Tributos da conta corrente: " + contaCorrente.calcularTributos());

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        System.out.println("Tributo do Seguro de vida " + seguroDeVida.calcularTributos());
    }
}
