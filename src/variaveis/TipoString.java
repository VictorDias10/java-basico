package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		// Para o tipo de String, se você não inicializou, é nulo.
		
		String texto = "Qualquer texto entre aspas é uma String";
		System.out.println(texto);
		
		int totalCaracteres = texto.length();
		
		System.out.println("Total de caracteres na String texto: " + totalCaracteres);

		for (int i = 0; i < totalCaracteres; i++) {
			System.out.println("Posição: " + i);
			System.out.println("Caractere: " + texto.charAt(i)); // método charAt é usado para obter o 
			//caractere em uma determinada posição dentro de uma String.
		}
		
		System.out.println("Caractere: " + texto.charAt(6));
		String nome = "Victor";
		String sobrenome = "Dias";
		String nomeCompleto = nome + " " + sobrenome;
		System.out.println("Nome completo: " + nomeCompleto);
		
		//String nomeCompletoconcat = new String().concat(nome.concat(sobrenome));
		String nomeCompletoconcat = nome.concat(sobrenome);
		System.out.println(nomeCompletoconcat);
		
		String apelido = "Zé das couve";
		System.out.println("Palavra capturada das ultimas 5 posições: " + apelido.substring(7));
		System.out.println("Palavra capturada do apelido tem que ser das: " + apelido.substring(3,6));
		
	}

}
