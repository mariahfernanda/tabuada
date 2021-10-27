package br.senai.sp.jandira.model;

public class Conta {
	private int multiplicando;
	private int multiplicador;

	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}

	public int getMultiplicando() {
		return multiplicando;
	}

	public void seMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}

	public int getMultiplicador() {
		return multiplicador;
	}

	public String[] calcular() {

		String tabuada[] = new String[multiplicador + 1];

		for (int i = 0; i <= multiplicador; i++) {
			int produto = i * multiplicando;
			tabuada[i] =i + " x " + multiplicando + " = " + produto;
		}
		return tabuada;
	}
}
