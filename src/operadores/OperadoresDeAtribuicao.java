package operadores;

import java.util.Date;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		
		// Operador de atribuição é representado pelo símbolo "=" e serve como o próprio nome diz para atribuir
		// valores a algo, por exemplo: variaveis.
		
		String nome = "Victor";
		String sobrenome = new String("Dias");
		int idade = 25;
		double peso = 68.5;
		char sexo = 'M';
		boolean doadorOrgao = false;
		Date dataNascimento; // O date é um tipo de variavel referência.
		dataNascimento = new Date();
		Double salario = 1000d; // Estudar classes Wrapper
		salario.byteValue();
		
		System.out.println(dataNascimento);

	}

}
