package classes;

public class App {

    public static void main(String[] args) throws Exception {
        

        /*
         * Variáveis tipo referencia...
         * O que são ? 
         * Os programas utilizam as variáveis de tipos por referência para armazenar as localizações de objetos na memória do computador. 
         * Esses objetos que são referenciados podem conter várias variáveis de instância e métodos dentro do objeto apontado.
         * Para trazer em um objeto os seus métodos de instância, é preciso ter referência a algum objeto. 
         * As variáveis de referência são inicializadas com o valor “null” (nulo).
         * 
         * Por exemplo: 
         * Conta conta = new Conta(), cria um objeto de classe Conta e a variável acao contém uma referência a esse 
         * objeto Conta, onde poderá invocar todos os seus métodos e atributos da classe. 
         * A palavra chave new solicita a memória do sistema para armazenar um objeto e inicializa o objeto.
         * 
         */

        //  String nomeCorrentista1; 
        //  nomeCorrentista1 = new String ("Victor");
        //  String nomeCorrentista2; //= "Victor";
        //  nomeCorrentista2 = "Victor";
 
        //  System.out.println(nomeCorrentista1);
        //  System.out.println(nomeCorrentista2);

        //  System.out.println("usando == : " + (nomeCorrentista1 == nomeCorrentista2));
        //  System.out.println("usando o equals: " + nomeCorrentista1.equals(nomeCorrentista2));

    	
        String nomeCliente = "Victor Dias";
        double saldo = 999.99;
        double valorDeposito = 100.0;

        // ContaCorrente contaVictor = new ContaCorrente(nomeCliente, saldo);
        // double saldo = contaVictor.obterSaldo();
        
        // Criando instância da classe
        ContaCorrente contaVictor = new ContaCorrente();
        contaVictor.setNomeCliente(nomeCliente);
        contaVictor.setSaldo(saldo);

        System.out.println("Olá o saldo é de: " + contaVictor.getSaldo());
        contaVictor.depositar(valorDeposito);
        System.out.println("Depositando o valor de: " + valorDeposito);
        System.out.println("Olá " + contaVictor.getNomeCliente() + ", o saldo atual é de: " + contaVictor.getSaldo());

        // agora eu sei o numero da conta e digito
        // como atribuir na instancia de ContaCorrente ?

        int numero = 1234;
        short digito = 9;

        //  através de setters
        contaVictor.setNumero(numero);
        contaVictor.setDigito(digito);

        System.out.println("Seu numero e digito da conta foram gerados! " + contaVictor.getNumero() + "digito: " + contaVictor.getDigito());

        System.out.println(contaVictor);
    }
}
