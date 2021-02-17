package array;

import java.util.Random;

public class JogoCarta {

	public static void main(String[] args) {
		String[] cartasBaralho = {"AZ", "2", "3", "4", "5", "6", "7", "8", "9" ,"10", "J", "Q", "K"};
		String[] nipes = {"Ouro", "Paus", "copas", "Espadas"};
		//as linhas abaixo recuperam de forma aleátoria o conteúdo dos arrays
		String nipe = nipes[(int) (Math.random()*4)];
		String face = cartasBaralho[(int) (Math.random()*cartasBaralho.length)];
		//a linha abaixo exibe a carta sorteada
		System.out.println(face + " de " + nipe);
		
	}

}
