package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

/**
 * Classe que representa um cliente no Bytebank.
 * @author Bianca
 *
 */
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		br.com.bytebank.banco.modelo.SeguroDeVida seguro = new br.com.bytebank.banco.modelo.SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}
}
