
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class TesteOrdenacao {

	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		ContaPoupanca abella = new ContaPoupanca(2001, "Abellinha", 1000);
		contas.add(abella);

		ContaPoupanca jose = new ContaPoupanca(2002, "Jose", 2000);
		contas.add(jose);


		ContaPoupanca irineu = new ContaPoupanca(2000, "Joventino", 2000);
		contas.add(irineu);
		
		Collections.sort(contas);
		
		for(int i = 0; i< contas.size(); i++) {
			Conta atual = contas.get(i);
			System.out.println("O n�mero da conta do senhor " + atual.getTitular()+ " �: "+ atual.getNumero());
		}
		
		}
	
}

//questao 4
//S� com o m�todo n�o funciona, precisa implementar a interface para o collections.sort() funcionar.

//quest�o 5
//precisamos apenas importar o LinkedList, ap�s isso, o programa roda normal, sem nenhuma diferen�a vis�vel.

//quest�o 6
//Para inverter, basta colocar => Collections.reverseOrder()
//Para embaralhar, basta colocar => shuffle ( List <?> list)
//Para rotarcionar, use o seguinte c�digo => Cole��es.rotate (list.subList (j, k + 1), -1)

//quest�o 7
//com o seguinte c�digo consigo ordenar pela String titular =>
//public int compareTo(ContaPoupanca o) {
//return this.getTitular().compareTo(o.getTitular());
//}

//quest�o 13 n�o conseguir
//quest�es 14 e 15, ja enviei




