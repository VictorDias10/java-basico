package variaveis;

public class Booleano {

	public static void main(String[] args) {
		int idade = 18;
		boolean teste = 1 > 15;
		boolean eAdulto = idade >= 18;
		
		System.out.println("teste: " + teste);
		//System.out.println("É maior de idade: " + eAdulto);
		
		if(eAdulto) {
			System.out.println("É adulto!");
		} else {
			System.out.println("É menor de idade");
		}
		
	}

}
