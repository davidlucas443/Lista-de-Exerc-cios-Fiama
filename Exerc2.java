package exercíciosfiama;

import java.util.Random;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] opc = { "pedra", "papel", "tesoura", "spock", "largarto" };

		Random rm = new Random();

		int jogador = 0;

		int computador = 0;

		System.out.println("Olá, digite um número que será correspondente a essas ações : ");

		for (int i = 0; i < opc.length; i++) {

			System.out.println(i + " - " + opc[i]);

		}

		jogador = sc.nextInt();

		computador = rm.nextInt(opc.length);

		if (jogador >= 5) {

			System.out.println("Opção inválida");
			
			return;

		}

		else if (jogador == computador) {

			System.out.println("Deu empate.");
		}

		else if ((jogador == 0 && (computador == 2 || computador == 3)) || // Pedra > Tesoura, Lagarto
				(jogador == 1 && (computador == 0 || computador == 4)) || // Papel > Pedra, Spock
				(jogador == 2 && (computador == 1 || computador == 3)) || // Tesoura > Papel, Lagarto
				(jogador == 3 && (computador == 1 || computador == 4)) || // Lagarto > Papel, Spock
				(jogador == 4 && (computador == 0 || computador == 2)) // Spock > Pedra, Tesoura
		) {
			System.out.println("Parabéns, você ganhou.");

		}

		else {

			System.out.println("Que pena, você perdeu.");
		}

		System.out.println("Você escolheu: " + opc[jogador]);
		System.out.println("Já o computador escolheu: " + opc[computador]);
	}

}
