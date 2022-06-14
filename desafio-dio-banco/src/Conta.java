import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected String tipo;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        agencia = Conta.AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Número: %d\n", this.numero);
        System.out.printf("Tipo: %s\n", this.tipo);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}
