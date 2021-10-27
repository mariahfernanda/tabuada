package br.senai.sp.jandira;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class telinha {

	public void telaCalculadora() {
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(600, 800);
		tela.setTitle("Calculadora");
		tela.setLayout(null);

		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multipicando");
		lblMultiplicando.setBounds(20, 50, 70, 40);

		JTextField txtNumeroMultiplicando = new JTextField();
		txtNumeroMultiplicando.setText("");
		txtNumeroMultiplicando.setBounds(70, 50, 50, 60);

		JLabel lblMultiplicador = new JLabel();
		lblMultiplicador.setText("Máximo Multiplicador: ");
		lblMultiplicador.setBounds(20, 70, 100, 40);

		JTextField txtNumeroMultiplicador = new JTextField();
		txtNumeroMultiplicador.setText("");
		txtNumeroMultiplicador.setBounds(70, 70, 50, 60);

		JButton bttCalcular = new JButton();
		bttCalcular.setText("CALCULAR");
		bttCalcular.setBounds(20, 100, 60, 70);

		JButton bttLimpar = new JButton();
		bttLimpar.setText("LIMPAR");
		bttLimpar.setBounds(20, 170, 80, 70);

		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtNumeroMultiplicando);
		tela.getContentPane().add(lblMultiplicador);
		tela.getContentPane().add(txtNumeroMultiplicador);
		tela.getContentPane().add(bttCalcular);
		tela.getContentPane().add(bttLimpar);

		tela.setVisible(true);

	}
}
