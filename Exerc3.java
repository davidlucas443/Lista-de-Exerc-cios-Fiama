package exerciciosFiama;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Olá usuário, digite sua senha: ");
		String senha = scanner.nextLine();

		if (senhaValida(senha)) {
			System.out.println("Senha VÁLIDA ");
		} else {
			System.out.println("Senha INVÁLIDA ");
		}

		scanner.close();
	}

	public static boolean senhaValida(String senha) {

		boolean temMaiuscula = false;
		boolean temPrimo = false;
		boolean temEspecial = false;
		boolean semVogaisDuplicadas = true;

		String especiais = "!@#$%^&*()_+-=[]{},.<>?/";
		String vogais = "aeiouAEIOU";

		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);

			// o isUpperCase serve para verificar se a letra é maiúscula
			if (Character.isUpperCase(c)) {
				temMaiuscula = true;
			}

			else if (c == '2' || c == '3' || c == '5' || c == '7') {
				temPrimo = true;
			} // Será analisado na variável 'senha' se nela tem alguns dos caracteres da
				// String 'especiais'
			else if (especiais.contains(String.valueOf(c))) {
				temEspecial = true;
			}
			// Primeiro analisa se tem número negativos, depois se a variável 'vogais' é
			// diferente de '-1'(uma posição inexistente) e depois verifica se o caracter
			// anterior de senha é uma vogal
			else if (i >= 0 && vogais.indexOf(c) != -1 && c == senha.charAt(i - 1)) {
				semVogaisDuplicadas = false;
			}
		}

		// Tudo que for diferente das condições expressas nessas variáveis, será falso

		if (!temMaiuscula) {
			System.out.println("A senha precisa de pelo menos uma letra maiúscula.");
		} else if (!temPrimo) {
			System.out.println("A senha precisa de pelo menos um número primo .");
		} else if (!temEspecial) {
			System.out.println("A senha precisa de pelo menos um caractere especial.");
		} else if (!semVogaisDuplicadas) {
			System.out.println("A senha não pode conter vogais duplicadas seguidas.");
		}

		return temMaiuscula && temPrimo && temEspecial && semVogaisDuplicadas;
	}
}
