package exerciciosfiama;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] feit = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};
		
		String [] posicoes = {"primeira","segunda","terceira","quarta", "quinta"};
		
		int opcao = 0;
		
		System.out.println("Qual opção você deseja ?");
		
		System.out.println("1 - Aceleratio,2 - Defensio,3 - Expelliarmus,4 - Lumos,5 - Wingardium Leviosa");
		
		String opc = "0" ;
		
		
		opc = sc.nextLine();
//		for (int i = 0; i < posicoes.length; i++) {
			
		
		if (opc.equalsIgnoreCase("Aceleratio")) {
			
			System.out.print("Feitiço encontrado na posição "+ posicoes[0]);
			
			
//		}
			
		}

		

	}

}
