package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio03b {

	public static void main(String[] args) {
		// Uma empresa que possui X funcion�rios precisa saber a m�dia de seus sal�rios.
		// Fa�a um algoritmo
		// para ler a quantidade de funcion�rios e o sal�rio de cada um e escrever a
		// m�dia dos sal�rios. Primeiro,
		// utilize a estrutura de repeti��o enquanto, depois a estrutura de repeti��o
		// repita.

		int contador = 0;
		float soma = 0;
		float media = 0;
		char continua;

		do {
			contador++;

			float salario = Float
					.parseFloat(JOptionPane.showInputDialog("Digite o salario do " + contador + " funcionario: "));
			soma = soma + salario;

			continua = JOptionPane.showInputDialog("Deseja continuar? S/N").toUpperCase().charAt(0);

		} while (continua == 'S');

		media = soma / contador;

		JOptionPane.showMessageDialog(null, "A media de salario na empresa �: " + media);

	}

}
