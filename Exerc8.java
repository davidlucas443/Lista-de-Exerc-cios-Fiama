package exerciciosfiama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println(" -Bem Vindo a CALC TUDO-");
		System.out.println("");
		do {

			System.out.println(" Digite qual operação você deseja realizar : ");
			System.out.println("");

			System.out.println(" [1] | SOMA          ");
			System.out.println(" [2] | SUBTRAÇÃO     ");
			System.out.println(" [3] | MULTIPLICAÇÃO ");
			System.out.println(" [4] | DIVISÃO       ");
			System.out.println(" [5] | SAIR          ");

			double opc = sc.nextDouble();

			double alg1, alg2;
			// alg = algarismos

			if (opc == 1)

			{

				System.out.println(" Digite o primeiro número da sua soma");
				alg1 = sc.nextDouble();

				System.out.println(" Digite o segundo número da sua soma");
				alg2 = sc.nextDouble();

				System.out.println(" O resultado da sua soma é " + df.format((alg1 + alg2) * 1.01));
				System.out.println("");

			}

			else if (opc == 2)

			{
				System.out.println(" Digite o primeiro número da sua subtração");
				alg1 = sc.nextDouble();

				System.out.println(" Digite o segundo número da sua subtração");
				alg2 = sc.nextDouble();

				System.out.println("O resultado da sua subtração é : " + df.format((alg1 - alg2) * 1.01));
				System.out.println("");

			}

			else if (opc == 3)

			{
				System.out.println(" Digite o primeiro número da sua multiplicação");
				alg1 = sc.nextDouble();

				System.out.println(" Digite o segundo número da sua multiplicação");
				alg2 = sc.nextDouble();

				System.out.println(" O resultado da sua multiplicação é : " + df.format((alg1 * alg2) * 1.01));
				System.out.println("");
			}

			else if (opc == 4)

			{
				System.out.println(" Digite o primeiro número da sua divisão");
				alg1 = sc.nextDouble();

				System.out.println(" Digite o segundo número da sua divisão");
				alg2 = sc.nextDouble();

				System.out.println(" O resultado da divisão é : " + df.format((alg1 / alg2) * 1.01));
				System.out.println("");

			}

			else if (opc == 5)

			{

				System.out.println(" Saindo...");
				sc.close();
				break;

			}

			else

			{
				System.out.println("Essa ação não é possivel");
				System.out.println("");

			}

		} while (0 <= 1);

	}

}
