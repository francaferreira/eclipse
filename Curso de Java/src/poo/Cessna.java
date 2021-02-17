package poo;

public class Cessna {

	public static void main(String[] args) {
		Aviao cessna = new Aviao();
		cessna.ano = 2020;
		cessna.cor = "Azul e Branco";
		cessna.envergadura = 11;
		System.out.println("Aviao: Cessna");
		System.out.println("Ano: " + cessna.ano);
		System.out.println("Cor: " + cessna.cor);
		System.out.println("Envergadura " + cessna.envergadura + "m");
		cessna.acelerar();
		cessna.aterrrizar();
		cessna.desligar();

	}

}
