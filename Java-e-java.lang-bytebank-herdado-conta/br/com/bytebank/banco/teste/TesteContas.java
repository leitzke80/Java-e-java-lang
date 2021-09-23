package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.teste.TesteContas
public class TesteContas {
	
	//java.lang.String
	public static void main(String[] args) throws modelo.SaldoInsuficienteException {
		
		ContaCorrente cc = new modelo.ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupan�a cp = new modelo.ContaPoupan�a(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
