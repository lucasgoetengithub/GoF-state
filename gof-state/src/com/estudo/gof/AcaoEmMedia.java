package com.estudo.gof;

public class AcaoEmMedia implements State {
	public byte getNivel() {
		return (byte) 2;
	}

	public boolean isValor(float valor) {
		return valor >= 4 && valor <= 20;
	}
}
