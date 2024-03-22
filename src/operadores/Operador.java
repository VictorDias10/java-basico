package operadores;

public class Operador {
	
	public static void main(String[] args) {
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("Resultado da adicao: " + soma);
		System.out.println("Resultado da subtracao: " + subtracao);
		System.out.println("Resultado da multiplicacao: " + multiplicacao);
		System.out.println("Resultado da divisao: " + divisao);
		System.out.println("Resultado do modulo: " + resto);
		
		x++;
		System.out.println("Resultado do incremento de x: " + x);
		
		y--;
		System.out.println("Resultado do decremento de y: " + y);
		
		x += 10;
		System.out.println("Resultado da atribuicao aditiva: " + x);
		
		y -= 10;
		System.out.println("Resultado da atribuicao subtrativa: " + y);
	}

}
