
// Nome do pacote indica o local onde a Classe pertence
package classes;

/*
 * O que são classes?
 *  
 * Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real. (CLASSE GERA OBJETOS)
 * Dentro dela é comum declararmos atributos e métodos, que representam, respectivamente, 
 * as características e comportamentos desse objeto. 
 */

 // nome da classe -> Precisa ser identico ao nome do arquivos, ou seja, Conta.java
	public class ContaCorrente extends Object {

    /*
    * O que são atributos da classe? 

    * São as características gerais definidas em uma classe, como por exemplo: cor, tamanho, nome, ordem, etc. 
    * São também chamados de dados-membro. São as atividades realizadas e podem usar os atributos da classe.
    */
    private int numero;
    private short digito;
    private String nomeCliente;
    private double saldo;

    /*
     * 
     * O que são métodos construtor(es)
     * 
     * serve para inicializar os atributos da classe
     * Construtor em linguagens de programação orientadas a objeto é um método chamado assim que uma nova instância do objeto for criada. 
     * Tal método geralmente é responsável pela alocação de recursos necessários ao funcionamento do objeto além da definição inicial 
     * das variáveis de estado (atributos).
     */

     // Construtor padrão declarado explicitamente.
    public ContaCorrente() {
        System.out.println("Não faz nada!");
    }
    

    public ContaCorrente(String nomeCliente, double saldo) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public ContaCorrente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /*
     * 
     * O que são métodos ?
     * 
     * Os métodos determinam o comportamento dos objetos de uma classe e são análogos às funções ou procedimentos da 
     * programação estruturada. O envio de mensagens (chamada de métodos) pode alterar o estado de um objeto. Em linguagens baseadas em classe eles são definidos na classe.
     */
    public double getSaldo() {
        return this.saldo;
    }

    // outros métodos
    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public int getNumero() {
        return this.numero;
    }

    public short getDigito() {
        return this.digito;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDigito(short digito) {
        this.digito = digito;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "NomeCliente: " + this.nomeCliente +
        ", Saldo: " + this.saldo;
    }

    
}
