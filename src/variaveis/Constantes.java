package variaveis;

public class Constantes {

	public static void main(String[] args) {

		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 15 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14; // Para declarar uma constante deve-se usar a palavra "final".
		
		// Exemplos que não podem ser usados
		
		// VALOR_DE_PI = 3.14; //Esta linha vai apresentar erro de compilação!
		
		//VALOR_DE_PI = VALOR_DE_PI; //  Mesmo atribuindo a variável a ela mesmo, não roda.
		
		final String cep = "02230050";
		
		// cep = "abc";
		
		// a palavra final indica que aquela varivável não muda.

	}

}
