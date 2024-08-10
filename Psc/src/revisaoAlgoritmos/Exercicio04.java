package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		// Escreva um algoritmo que fa�a o c�lculo do �ndice de massa corporal (IMC).
		// Para isso voc� ter� como
		// dados de entrada a altura e o peso da pessoa. Mostre ap�s o c�lculo se o
		// status (o status vai variar da
		// seguinte forma se o �ndice for menor que 18,5 a pessoa estar� abaixo do peso,
		// se estiver acima de
		// 24,99 estar� acima do peso, do contr�rio estar� no peso normal).Desenvolva um
		// algoritmo em
		// pseudoc�digo e depois procure reescrever em JAVA. C�lculo do IMC � peso
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
