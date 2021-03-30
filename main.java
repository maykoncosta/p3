package atividadeExceptions;

public class mai {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente(1000, 100, 5000);
		
		try {
			conta.sacar(120);
		} catch (SaldoInsuficienteException e) {	
			e.printStackTrace();
		}
		
		conta.depositar(1100);
		
		conta.setValorLimite(1100);
	}

}