package br.com.bytebank.banco.modelo;

public class ContaPoupança {

	public ContaPoupança(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "ContaPoupança, " + super.getNumero();
	}

}
