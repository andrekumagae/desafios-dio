public class ContaPoupanca extends  Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        tipo = "Poupança";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfosComuns();
    }

}
