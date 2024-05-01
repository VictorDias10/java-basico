package classes;

public class Aluno {
	
	// Definição dos atributos da classe Aluno
    // O que sao atributos ?
    // caracteristicas/propriedades de uma determinada classe.
    // é boa pratica definir os atriburtos como private, pois assim protegemos o acesso
    // a ele. com isso poderemos encapsular esses atributos em métodos getters e setters. 
	
    private String nome;
    private int registroAluno;


    // métodos setter usado para atribuir um valor ao atributo nome da classe Aluno que é privado.
    public void setNome(String nome) {
        // caso precise definir regra para a atribuiçao de valor, deve implementar dentro do método setter.
         
        // if (nome != null) { 
        //     String[] arrNome = nome.split(" ");   
        //     String primeiroNome = arrNome[0];            
        //     String sobreNome = arrNome[1];            
        //     this.nome = primeiroNome;//nome.split(nome)[0];
        // }
        this.nome = nome;
    }

    // método getter usado para retornar o valor do atributo nome da classe aluno, pois ele foi definido como privado,
    // impedindo que outra classe tenha acesso direto e ele. 
    public String getNome() {
        return this.nome;
    }

    public int getRegistroAluno() {
        return this.registroAluno;
    }

    public Aluno() {
        this.registroAluno = 999; // Definindo um valor padrão para o atributo registro do aluno.
        System.out.println("Inicializando pelo construtor padrão");
    }
    
    
    // Método construtor com parâmetro
     public Aluno(String nome) {
         //System.out.println("Inicializando pelo construtor com parametro nome");
         //System.out.println("O valor do parametro nome é igual a: " + nome);

         this.nome = nome;
         // a palavra reservada this serve para referenciar um atributo ou metodo dentro da própria classe
         // nesse caso atribuimos ao atributo "nome" o valor do parametro/argumento nome. 
     }

}
