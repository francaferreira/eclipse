package array;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("Jos� de Assis");
		contatos.add("9999-9999");
		contatos.add("ze@email.com");
		contatos.add("Robson Vaamonde");
		contatos.add("5555-4444");
		contatos.add("vava@email.com");
		System.out.println("Tamanho do array: " + contatos.size());
		System.out.println(contatos);
		System.out.println("E-mail Jos� de Assis (�ndice[2] " + contatos.get(2));
		System.out.println("________________________________________");
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
		}

	}

}
