package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// Quando a pandemia passar voc� quer receber seus amigos e pretende fazer
		// cachorro quente para a �festa�. Supondo que cada pessoa come em m�dia 2
		// cachorros quentes (com uma salsicha), fa�a um algoritmo que calcule quantos
		// quilos de salsicha e molho pronto, e quantos p�es voc� precisa comprar.
		// Considere que uma salsicha pesa 100 gramas e cada cachorro leva 50 gramas de
		// molho pronto. Voc� deve fornecer como entrada o n�mero de amigos que ir�
		// convidar. (lembra dos profs rsrsrs)

		int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas: "));

		double salsicha = 100 * pessoas;
		double molho = 050 * pessoas;

		JOptionPane.showMessageDialog(null,
				"Vao ser necessarios: \nPaes: " + (pessoas * 2) + "\nSalcichas: " + salsicha * 2 + "\nMolho: " + molho * 2);

	}

}
