package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class tabuada {
	public static void main(String[] args) {

		Conta x = new Conta();
		Conta Z = new Conta();

		x.seMultiplicador(8);
		x.setMultiplicando(10);

		Z.seMultiplicador(6);
		Z.setMultiplicando(5);

		String tabuadaX[] = x.calcular();
		String tabuadaZ[] = Z.calcular();

		for (int i = 0; i < tabuadaX.length; i++) {
			System.out.println(tabuadaX[i]);
		}

		System.out.println("------------------------------------------");
		
		for (int i = 0; i < tabuadaZ.length; i++)
			System.out.println(tabuadaZ[i]);
	}

}
