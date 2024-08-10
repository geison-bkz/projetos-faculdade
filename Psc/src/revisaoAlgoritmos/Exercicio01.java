package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia um número qualquer, ao final mostre uma mensagem
		// no vídeo
		// informando se o mesmo é positivo ou negativo. Considere que o número seja
		// diferente de zero.

		String resultado = "";

		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero qualquer: "));

		if (N == 0) {
			resultado = "O numero é zero.";

		} else {
			if (N > 0) {
				resultado = "O numero é positivo.";

			} else {
				resultado = "O numero é negativo.";

			}

		}

		JOptionPane.showInternalMessageDialog(null, resultado);

	}

}
