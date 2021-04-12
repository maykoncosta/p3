public class ContaCorrente extends Conta{

	private int deposito;
	private String titular;
	private int saldo;
	
	public ContaCorrente(int deposito, String titular, int saldo) {
		super(deposito, titular, saldo);
		this.deposito = deposito;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getdeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}



	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	
}
