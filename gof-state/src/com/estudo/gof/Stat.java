package com.estudo.gof;

public class Stat {
	public static void main(String[] args) {
		procederVariacao();
	}

	public static void procederVariacao() {
		Acao padrao = new Acao("Patterns Inc.");
		padrao.setValor(1.0f);
		System.out.println(padrao);
		padrao.setValor(8.0f);
		System.out.println(padrao);
		padrao.setValor(25.0f);
		System.out.println(padrao);
		padrao.setValor(1.0f);
		System.out.println(padrao);
	}
}