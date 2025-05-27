package exerciciosFiama;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String candidato1 = "Deivao";
		String candidato2 = "Deivona";

		int votos1 = 0;
		int votos2 = 0;
		int totalVotos = 0;

		System.out.println("Candidatos: " + candidato1 + " e " + candidato2);
		System.out.println("Digite o nome do candidato para votar ou 'fim' para encerrar:");

		while (true) {
			System.out.print("Seu voto: ");
			String voto = scanner.nextLine();

			if (voto.equalsIgnoreCase("fim")) {
				break;
			} else if (voto.equalsIgnoreCase(candidato1)) {
				votos1++;
				totalVotos++;
			} else if (voto.equalsIgnoreCase(candidato2)) {
				votos2++;
				totalVotos++;
			} else {
				System.out.println("Candidato inválido. Tente novamente.");
			}
		}

		System.out.println("\n=== Resultado da Votação ===");

		double media1, media2;

		media1 = votos1 * 100.0 / totalVotos;
		media2 = votos2 * 100.0 / totalVotos;

		System.out.printf("%s: %d voto(s) - %.2f%%\n", candidato1, votos1, media1);
		System.out.printf("%s: %d voto(s) - %.2f%%\n", candidato2, votos2, media2);

		scanner.close();
	}

}
