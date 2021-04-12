public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	private int numero;
	private String titular;

	public ContaPoupanca(int numero, String titular, int saldo) {
		super(numero, titular, saldo);
		this.titular = titular;
		this.numero = numero;
	}

	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		if(this.getNumero() < o.getNumero()) {
			return -1;
		}
		if(this.getNumero() > o.getNumero()) {
			return 1;
		}
		return 0;
	}

	
	
}
