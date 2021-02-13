package cursoJava;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 51;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;		
		nome = "Jefferson França";
		System.out.println("Uso de variáveis na inguagem Java");
		System.out.println("Exemplos");
		System.out.println("nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Arcondicionado: " + arCondicionado);
		System.out.println("___________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritméticos e Atribuições");
		System.out.println("Exeemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		System.out.println("i %= 5       | i = " + (i %= 5));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
		
	}

}
