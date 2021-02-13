package cursoJava;

public class EstruturaDeControle {

	public static void main(String[] args) {
	System.out.println("Estruturas de Controle Condicional");
	System.out.println("");
	System.out.println("Exemplo 1 - Uso do 'if' ");
	char sexo = 'M';
	if (sexo == 'M') {
		System.out.println("Alistamento militar obrigat�rio");
	}
	System.out.println("");
	System.out.println("--------------------------------");
	System.out.println("");
	System.out.println("Exemplo 2 - Uso do 'if e else' ");
	int idade = 16;
	if (idade < 18) {
		System.out.println("Menor de idade");
		} else {
			System.out.println("maior de idade");
		}
	System.out.println("");
	System.out.println("Exemplo 3 - Uso do ' else - if ' ");
	idade = 10;
	if (idade < 16) {
		System.out.println("Proibido votar");
	} else if (idade >= 18 && idade <= 70) {
		System.out.println("Voto obrigat�rio");
	} else  {
		System.out.println("Voto facultativo");
	}
	
	System.out.println("");
	System.out.println("Exemplo  - Uso do ' Switch case ' ");
	System.out.println("1. Cadastro de clientes");
	System.out.println("2. Cadastro de usu�rio");
	System.out.println("3. Relat�rio");
	int opcao = 2;
	switch (opcao) {
	case 1:
		System.out.println("Clientes");
		break;
	case 2:
		System.out.println("Usu�rio");
		break;
	case 3:
		System.out.println("Relat�rio");
		break;
	default:
		System.out.println("Op��o inv�lida");
	}
	
			
	

	}

}
