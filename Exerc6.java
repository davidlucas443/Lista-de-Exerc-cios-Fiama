package exerciciosFiama;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String resultado = "";

		while (true) {
			System.out.print("Digite a quantidade ou 'fim' para encerrar: ");
			String entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("fim")) {
				break;
			}

			int quantidade;
			try {

				// o parseInt converte a String em número inteiro
				quantidade = Integer.parseInt(entrada);

				// Se o usuário digitar algo que não é um número , o NumberFormat...
				// impede que o programa quebre e o try executa o programa mesmo que ele possa causar erro.
			} catch (NumberFormatException e) {
				System.out.println("Quantidade inválida. Tente novamente.");
				continue;
			}

			System.out.print("Digite a letra: ");
			String letra = sc.nextLine();

			if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
				System.out.println("Letra inválida. Tente novamente.");
				continue;
			}

			for (int i = 0; i < quantidade; i++) {
				resultado += letra;
			}
		}

		System.out.println("Código reconstruído: " + resultado);
		sc.close();
	}

}
