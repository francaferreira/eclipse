package array;

public class ArrayMultidimencional {

	public static void main(String[] args) {
		String [] [] agenda= {{"José", "9123-0984", "professorjoseassis@gmail.com"},
				{"Bill", "2222-2222","bill@outlook.com"}, {"Linus", "9999-9999", "tux@linux.com"}};
         //a linha abaixo recupera o telefone do José
		//System.out.println(agenda[0][1]);]
		//as estruturas abaixo percorrem os índices dos arrays
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("_______________________");
			System.out.println(" ");
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i] [j]);
			}
		}
	}

}
