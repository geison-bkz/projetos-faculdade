package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		// Escreva um algoritmo que faça o cálculo do índice de massa corporal (IMC).
		// Para isso você terá como
		// dados de entrada a altura e o peso da pessoa. Mostre após o cálculo se o
		// status (o status vai variar da
		// seguinte forma se o índice for menor que 18,5 a pessoa estará abaixo do peso,
		// se estiver acima de
		// 24,99 estará acima do peso, do contrário estará no peso normal).Desenvolva um
		// algoritmo em
		// pseudocódigo e depois procure reescrever em JAVA. Cálculo do IMC é peso
		// dividido pela altura ao
		// quadrado.

		float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));

		float IMC = peso / (altura * altura);

		if (IMC < 18.55)
			JOptionPane.showMessageDialog(null, "IMC = " + IMC + "\nAbaixo do peso.");
		if (IMC > 24.99)
			JOptionPane.showMessageDialog(null, "IMC = " + IMC + "\nAcima do peso.");
		if (IMC >= 18.55 && IMC <= 24.99)
			JOptionPane.showMessageDialog(null, "IMC = " + IMC + "\nPeso normal.");
	}

}
