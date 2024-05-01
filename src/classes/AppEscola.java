package classes;

public class AppEscola {
	
	public static void main(String[] argumentos) {
        //System.out.println("Ola mundo!");

        // neste ponto apenas declaramos a variavel aluno1 que é do tipo Aluno
        Aluno aluno1;
        // neste ponto estamos iunicializando a variavel aluno1 usando a palavra reservada "new"
        aluno1 = new Aluno();
        System.out.println(aluno1.getRegistroAluno());

        // Dessa forma tinhamos o acesso ao atributo nome, pois o mesmo estava definido como public dentro da classe Aluno.
        //Aluno aluno2 = new Aluno("Victor Dias");
        //aluno2.nome = "Victor Dias";

        Aluno aluno2 = new Aluno();
        // Dessa forma foi utilizado o método setter setNome para atribuir o valor Victor Dias ao atributo nome da classe Aliuno.
        aluno2.setNome("Victor Dias");
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getRegistroAluno());


    }
}
