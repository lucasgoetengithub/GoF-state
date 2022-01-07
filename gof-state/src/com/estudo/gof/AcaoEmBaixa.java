package com.estudo.gof;

public class AcaoEmBaixa implements State {
	public byte getNivel() {
		return (byte) 1;
	}

	public boolean isValor(float valor) {
		return valor < 4;
	}
}
