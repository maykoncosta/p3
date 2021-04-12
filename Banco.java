import java.util.ArrayList;
import java.util.List;

public class Banco {

	

	List<Conta> contas = new ArrayList<Conta>();
		
	public void adiciona(Conta c) {
		
	}
	
	public int pega(int x) {
		return x;
	}
	
	public int pegaTotalDeContas(int y) {
		y = contas.size();
		return y;
	}
	
	public boolean buscaPorNome(String nome) {
		return contas.contains(nome);
	}
	
	
	
}
