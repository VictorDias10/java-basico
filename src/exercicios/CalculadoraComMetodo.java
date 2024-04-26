package exercicios;

import java.util.Scanner;

public class CalculadoraComMetodo {

	public static void main(String[] args) {
		
		try {
			
			double valor1 = 0;
			double valor2 = 0;
			double resultado = 0;
			
			Scanner sc1 = new Scanner(System.in);
					
			System.out.println("Qual operação você deseja fazer?");
			System.out.println("Digite 1 para somar");
			System.out.println("Digite 2 para subtrair");
			System.out.println("Digite 3 para multiplicar");
			System.out.println("Digite 4 para dividir");
			
			int operacao = sc1.nextInt();
			if(operacao == 1) {
				System.out.println("Você escolheu a opção somar: ");
				System.out.println("Informe o primeiro valor: ");
				valor1 = sc1.nextDouble();
				System.out.println("Informe o segundo valor: ");
				valor2 = sc1.nextDouble();
				resultado = somar(valor1, valor2);
				
			}else if (operacao == 2){
				System.out.println("Você escolheu a opção subtrair");
				System.out.println("Informe o primeiro valor: ");
				valor1 = sc1.nextDouble();
				System.out.println("Informe o segundo valor: ");
				valor2 = sc1.nextDouble();
				resultado = subtrair(valor1, valor2);
				
			}else if (operacao == 3) {
				System.out.println("Você escolheu a opção multiplicar");
				System.out.println("Informe o primeiro valor: ");
				valor1 = sc1.nextDouble();
				System.out.println("Informe o segundo valor: ");
				valor2 = sc1.nextDouble();
				resultado = multiplicar(valor1, valor2);
				
			}else if (operacao == 4) {
				System.out.println("Você escolheu a opção dividir");
				System.out.println("Informe o primeiro valor: ");
				valor1 = sc1.nextDouble();
				System.out.println("Informe o segundo valor: ");
				valor2 = sc1.nextDouble();
				resultado = dividir(valor1, valor2);
			}else {
				System.out.println("Você não escolheu nenhuma operação!");
				System.exit(0);
			}
			
			System.out.println("O resultado da operação é: " + resultado);
			
			sc1.close(); //Encerra o programa
		} catch (Exception ex) {
			System.out.println("O valor da operação não é válido!");
		}

	}
	
	private static double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	private static double subtrair (double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	private static double multiplicar (double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	private static double dividir (double valor1, double valor2) {
		return valor1 / valor2;
	}

}
