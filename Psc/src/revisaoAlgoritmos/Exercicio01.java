package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que leia um n�mero qualquer, ao final mostre uma mensagem
		// no v�deo
		// informando se o mesmo � positivo ou negativo. Considere que o n�mero seja
		// diferente de zero.

		String resultado = "";

		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero qualquer: "));

		if (N == 0) {
			resultado = "O numero � zero.";

		} else {
			if (N > 0) {
				resultado = "O numero � positivo.";

			} else {
				resultado = "O numero � negativo.";

			}

		}

		JOptionPane.showInternalMessageDialog(null, resultado);

	}

}
