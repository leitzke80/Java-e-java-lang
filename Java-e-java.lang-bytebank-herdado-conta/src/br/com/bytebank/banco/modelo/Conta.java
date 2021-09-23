package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Bianca
 *
 */
public abstract class Conta extends Object {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
		}
	
	public abstract void deposita(double valor);
	/**
	 * valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * throws SaldoInsuficienteException
	 */
	public void saca(double valor) {
		
		if(this.saldo < valor) {
				throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
		
		public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
			this.saca(valor);
			destino.deposita(valor);
		}
	
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
					
			public int getAgencia() {
				return this.agencia;
			}
			public void setAgencia(int agencia) {
				this.agencia = agencia;
			}
			public void setTitular(Cliente titular) {
				this.titular = titular;
			}
			public Cliente getTitular() {
				return titular;
			}
			
			@Override
			public String toString() {
				return "Numero; " + this.numero + "Agencia: " + this.agencia;
			}
	}