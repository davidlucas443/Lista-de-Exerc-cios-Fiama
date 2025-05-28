package exercíciosfiama;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double[] valores = { 0.01, 0.05, 0.10, 0.25, 0.50, 1 };

		int[] quantidade = new int[valores.length];

		int valor = 0;
		double resultado = 0;

		System.out.println("Olá, digite a quantidade de moedas que você deseja colocar em seu cofrinho");
		System.out.println(" ");

		for (int i = 0; i < valores.length; i++) {

			System.out.printf("Você deseja colocar quantas moedas de R$%.2f ", valores[i]);
			quantidade[i] = sc.nextInt();

			resultado += quantidade[i] * valores[i];

		}

		System.out.printf("\nSeu saldo é igual a : R$%.2f\n", resultado);
		System.out.printf("\nPara você juntar 100 reais faltam : R$%.2f\n", (100 - resultado));

		double semanas = 0;

		semanas = 100 / resultado;

		System.out.printf("\nSe você depositar esse mesmo valor semanalmente, irá levar %.0f", semanas);

		System.out.print(" semanas para juntar 100 reais");

	}

}
