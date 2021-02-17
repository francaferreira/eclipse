package array;


public class Array1 {

	public static void main(String[] args) {
		String[] carros = {"ferrari", "fusca", "camaro", "uno"};
		//índice do array    [0]        [1]       [2]      [3]
		System.out.println("Tamanho do array: " + carros.length);
		System.out.println("Carro: " + carros[3]);
		carros[3] = "porche";
		System.out.println("Carro: " + carros[3]);
		System.out.println("-------------------------------");
		System.out.println("Carros");
		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i]);
		}
		
	}
}
