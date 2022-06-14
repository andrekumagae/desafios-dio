public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        ContaCorrente contaCorrente = new ContaCorrente(venilton);
        ContaPoupanca contaPoupanca = new ContaPoupanca(venilton);
        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
