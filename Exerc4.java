package exercíciosfiama;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {

		System.out.println("===Bem vindo ao VILANCE SAGA, aqui você pode criar seus heróis e batalhar entre eles=== ");
		System.out.printf("\nAqui está um exemplo sobre como criar seu personagem e como funciona o jogo\n");

		System.out.printf("\nOs heróis usam apenas o primeiro nome e seus atributos vão de 0-100 \n");

		System.out.println(" ");
		Scanner sc = new Scanner(System.in);

		String[] nomes = { "Aria", "Brutus", "Selene" };
		int[] forca = { 70, 95, 60 };
		int[] inteligencia = { 90, 50, 85 };
		int[] velocidade = { 80, 65, 95 };
		int[] total = new int[4];

		int forcaPer, inteligenciaPer, velocidadePer, poderPer, poderPer2;

		String nomePer2;

		String nomePer;

		int PoderAria = 0;

		int PoderBrutus = 0;

		int PoderSelene = 0;

		int poderTotal = 0;

		int opc = 0;

		int opc2 = 0;

		int opc3 = 0;

		for (int i = 0; i < velocidade.length; i++) {

			System.out.println("Nome : " + nomes[i]);
			System.out.println("Força : " + forca[i]);
			System.out.println("Inteligência : " + inteligencia[i]);
			System.out.println("Velocidade : " + velocidade[i]);

			poderTotal = ((forca[i] + inteligencia[i] + velocidade[i]) * 2);

			System.out.println("Poder Total : " + poderTotal);
			System.out.println("");

			PoderAria = forca[0] + inteligencia[0] + velocidade[0];
			PoderBrutus = forca[1] + inteligencia[1] + velocidade[1];
			PoderSelene = forca[2] + inteligencia[2] + velocidade[2];

		}

		System.out.println("Exemplo de batalha Aria VS Brutus");

		if (PoderAria > PoderBrutus) {

			System.out.println("Aria Win ");

		} else {

			System.out.println("Brutus Win ");
		}

		System.out.printf("\nVocê deseja criar seu próprio personagem ?");

		System.out.println("[1] SIM");
		System.out.println("[2] NÂO");
		opc = sc.nextInt();

		if (opc == 1) {

			System.out.println("Digite o nome do seu personagem -  ");
			nomePer = sc.next();

			System.out.println("Digite a força do seu personagem -  ");
			forcaPer = sc.nextInt();

			System.out.println("Digite o inteligência do seu personagem - ");
			inteligenciaPer = sc.nextInt();

			System.out.println("Digite a velocidade do seu personagem -  ");
			velocidadePer = sc.nextInt();

			poderPer = ((forcaPer + inteligenciaPer + velocidadePer) * 2);

			System.out.println("O poder total do seu personagem é igual a : " + poderPer);

			System.out.println("Você deseja criar mais um personagem ?");

			System.out.println("[1] SIM");
			System.out.println("[2] NÂO");
			opc2 = sc.nextInt();

			if (opc2 == 1) {

				System.out.println("Digite o nome do seu personagem -  ");
				nomePer2 = sc.next();

				System.out.println("Digite a força do seu personagem -  ");
				forcaPer = sc.nextInt();

				System.out.println("Digite o inteligência do seu personagem - ");
				inteligenciaPer = sc.nextInt();

				System.out.println("Digite a velocidade do seu personagem -  ");
				velocidadePer = sc.nextInt();

				poderPer2 = ((forcaPer + inteligenciaPer + velocidadePer) * 2);

				System.out.println("O poder total do seu personagem é igual a : " + poderPer2);

				System.out.printf("\nVocê deseja fazer um duelo entre eles ?");

				System.out.println("[1] SIM");
				System.out.println("[2] NÂO");
				opc3 = sc.nextInt();

				if (opc3 == 1) {

					if (poderPer > poderPer2) {

						System.out.println(nomePer + " Wins, pois seu poder total é maior");

					}

					else if (poderPer == poderPer2) {

						System.out.println("Deu Empate, pois o poder total dos dois personagens é igual");
					}

					else {

						if (poderPer2 > poderPer) {

							System.out.println(nomePer2 + " Wins, pois seu poder total é maior");

						}

						else if (opc == 2) {

						}

					}
				}

			}

			else if (opc2 == 2) {

			}

		}

		else if (opc == 2) {

		}

		System.out.println(
				"Obrigado por jogar VILANCE SAGA, sua experiência chegou ao fim, se quiser jogar mais um vez, fique a vontade!!");

	}
}
