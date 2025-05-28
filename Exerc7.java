package exercíciosfiama;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] feit = { "Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa" };

		String[] posicoes = { "primeira", "segunda", "terceira", "quarta", "quinta" };

		int opcao = 0;

		System.out.println("Qual opção você deseja ?");

		System.out.println("1 - Aceleratio,2 - Defensio,3 - Expelliarmus,4 - Lumos,5 - Wingardium Leviosa");

		String opc = "0";

		opc = sc.nextLine();

		if (opc.equalsIgnoreCase("Aceleratio")) {
			System.out.print("Feitiço encontrado na "+ posicoes[0]+ " posição");

		} else if (opc.equalsIgnoreCase("Defensio")) {

			System.out.print("Feitiço encontrado na "+ posicoes[1]+ " posição");
		} else if (opc.equalsIgnoreCase("Expeliarmus")) {

			System.out.print("Feitiço encontrado na "+ posicoes[2]+ " posição");

		}

		else if (opc.equalsIgnoreCase("Lumos")) {

			System.out.print("Feitiço encontrado na "+ posicoes[3]+ " posição");

		} else if (opc.equalsIgnoreCase("Wingardium Leviosa")) {

			System.out.print("Feitiço encontrado na "+ posicoes[4]+ " posição");

		}
		
		else {
			
			System.out.println("Feitiço inexistente");
		}

	}

}
