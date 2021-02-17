package fundamentos;

public class EstruturaDeRepetições {

	public static void main(String[] args) {
		System.out.println("Estrutura de Repetições");
		System.out.println("");
		System.out.println("Exemplo 5 - Uso do 'For' ");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Exemplo 6 - Tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		
		System.out.println("");
		System.out.println("Exemplo 7 - Uso da estrutura 'while' ");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("");
		System.out.println("Exemplo 8 - Uso da estrutura ' do while' ");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(s/n)? ");
			novoJogo = 's';
		} while (novoJogo == 's');
		System.out.println("Game over");
	}

}
