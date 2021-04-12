import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerfomance {
	
	public static void main(String[] args) {
		System.out.println("Inicializando...");
		Collection<Integer> teste = new HashSet<Integer>();
		//a diferença entre HashSet e ArrayList foi de mais que 500 ms a favor do HashSet
		int total = 30000;
		long inicioIns = System.currentTimeMillis();
		for(int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fimIns = System.currentTimeMillis();
		long timeIns = fimIns - inicioIns;
		System.out.println("O tempo gasto no processo de Inserção foi de "+ timeIns + "ms");

		long inicioCons = System.currentTimeMillis();
		
		for(int i = 0; i < total; i ++) {
			teste.contains(i);
		}
		
		long fimCons = System.currentTimeMillis();
		long timeCons = fimCons - inicioCons;
		System.out.println("O tempo gasto no processo de consulta foi de "+ timeCons + "ms.");
		
		
		if(timeCons > timeIns) {
			long diferenca = timeCons - timeIns;
			System.out.println("O tempo de consulta foi maior do que o de inserção, a diferença foi de " + diferenca + "ms.");
			
		}else {
			long diferenca = timeIns - timeCons;
			System.out.println("O tempo de inserção foi maior do que o de consulta, a diferença foi de " + diferenca + "ms.");
			
		}
		
	}
	
}
