package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Tela_app {
	public void telaCalculadora() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setTitle("Tabuada");
		frame.setLayout(null);
		
		JPanel header = new JPanel();
		header.setSize(600, 150);
		header.setBackground(Color.white);
		header.setLayout(null);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setBounds(10,30,300,30);
		lblTitulo.setFont(null);
		lblTitulo.setForeground(Color.blue);

		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multipicando");
		lblMultiplicando.setBounds(20, 170, 200, 40);
		lblMultiplicando.setFont(null);
		lblMultiplicando.setHorizontalTextPosition(SwingConstants.RIGHT);

		JTextField txtNumeroMultiplicando = new JTextField();
		txtNumeroMultiplicando.setText("");
		txtNumeroMultiplicando.setBounds(220, 110, 100, 3 0);

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


		frame.getContentPane().add(header);
		frame.getContentPane().add(lblMultiplicando);
		frame.getContentPane().add(txtNumeroMultiplicando);
		frame.getContentPane().add(lblMultiplicador);
		frame.getContentPane().add(txtNumeroMultiplicador);
		frame.getContentPane().add(bttCalcular);
		frame.getContentPane().add(bttLimpar);

		frame.setVisible(true);

	}


}
