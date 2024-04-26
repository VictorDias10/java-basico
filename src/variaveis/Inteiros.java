package variaveis;

public class Inteiros {

	public static void main(String[] args) {
		
		byte idade = 127;
		byte outraIdade = (byte)128;
		idade = outraIdade;
		System.out.println("idade: " + idade );
		
		long telefone = (int)972156413;
		System.out.println("telefone: " + telefone );
		
		long codigoDeBarras = 1234567890;
		
		// Declarado como String pois os tipos Inteiro não armazenam zeros à esquerda, a direta sim.
		String cep = "02230050";
		System.out.println("cep: " + cep);
		
		long cpf = 98765432109l;

	}

}
