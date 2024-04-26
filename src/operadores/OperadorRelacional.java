package operadores;

public class OperadorRelacional {

	public static void main(String[] args) {
		
		// Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões.
		// É um operador de comparação, retornando um valor booleano como resultado.
		
		int numero1 = 1;
		int numero2 = 2;
		int idade = 17;
		boolean solteiro = true;
		
		if(idade>18 && solteiro) {
			System.out.println("Pode entrar no recinto");
		}else {
			System.out.println("Não pode entrar nesse recinto");
		}

		if(numero1 > numero2)
			System.out.print("Numero 1 maior que numero 2");

		if(numero1 < numero2)
			System.out.print("Numero 1 menor que numero 2");

		if(numero1 >= numero2)
			System.out.print("Numero 1 maior ou igual que numero 2");

		if(numero1 <= numero2)
			System.out.print("Numero 1 menor ou igual que numero 2");

		if(numero1 != numero2)
			System.out.print("Numero 1 é diferente de numero 2");
		
		// == Quando desejamos verificar se uma variável é IGUAL A outra.

		// != Quando desejamos verificar se uma variável é DIFERENTE da outra.

		// > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

		// >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

		// < Quando desejamos verificar se uma variável é MENOR QUE outra.

		// <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

	}

}
