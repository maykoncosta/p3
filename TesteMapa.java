import java.util.HashMap;
import java.util.Map;

public class TesteMapa {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente(10000, "Maykon", 1000);
		
		Conta c2 = new ContaCorrente(2000,"Daniel",10000);
		
		//cria o mapa
		Map mapaDeContas = new HashMap();
		
		//adiciona chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		//qual a conta do diretor
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}

}
