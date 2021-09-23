package br.com.bytebank.banco.modelo;

// new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws saldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += super.saldo + valor;
	}
	
	@Override
	public String() {
		return super."ContaCorrente, " + super.toString();
	}
}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
