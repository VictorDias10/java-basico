package variaveis;

public class TiposPrimitivos {

	public static void main(String[] args) {
		  
		  // variáveis são posições na memória do computador que podem armazenar dados.
		  byte tipoByte = 127;
	      short tipoShort = 32767;
	      char tipoChar = 'C'; // char é sempre declarado com aspas simples porque o tamanho é somente de 1 caractere.
	      float tipoFloat = 2.6f;
	      double tipoDouble = 3.59;
	      int tipoInt = 2147483647;
	      long tipoLong = 9223372036854775807L;
	      boolean tipoBooleano = true; // tipo boolean são inicializadas como false por padrão
	      
	      System.out.println("Valor do tipoByte = " + tipoByte);
	      System.out.println("Valor do tipoShort = " + tipoShort);
	      System.out.println("Valor do tipoChar = " + tipoChar); 
	      System.out.println("Valor do tipoFloat = " + tipoFloat);
	      System.out.println("Valor do tipoDouble = " + tipoDouble);
	      System.out.println("Valor do tipoInt = " + tipoInt);
	      System.out.println("Valor do tipoLong = " + tipoLong);
	      System.out.println("Valor do tipoBooleano = " + tipoBooleano);

	}

}
