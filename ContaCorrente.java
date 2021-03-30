package atividadeExceptions;

public class ContaCorrente {

	private double limite;
	private double saldo;
	private double valorLimite;
	public ContaCorrente(double limite, double saldo, double valorLimite) {
		super();
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (saldo >= valor) {
			saldo -= valor;			
		} else {
			throw new SaldoInsuficienteException("Não possui saldo suficiente! O seu saldo atual é " + saldo);
		}
	}
	
	public void depositar(double valor) {
		if (valor < limite) {
			saldo += valor;
			valorLimite -= valor; 
		}
			else{
				throw new DepositoMuitoAltoException("Deposito muito alto, por favor falar com o gerente.");
			
		}
	}
	
	public void setValorLimite(double valor) {
		if(valor < valorLimite) {
			System.out.println("Voce ainda pode depositar " + valorLimite);
		}else {
			throw new SemLimiteParaDepositoException("Seu limite diario de deposito acabou, aguarde ate amanha!");
		}
	}
}