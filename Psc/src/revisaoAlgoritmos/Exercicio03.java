package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// Uma empresa que possui X funcion�rios precisa saber a m�dia de seus sal�rios.
		// Fa�a um algoritmo
		// para ler a quantidade de funcion�rios e o sal�rio de cada um e escrever a
		// m�dia dos sal�rios. Primeiro,
		// utilize a estrutura de repeti��o enquanto, depois a estrutura de repeti��o
		// repita.

		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de funcionarios: "));
		int contador = N;
		int funcionario = 0;
		float soma = 0;
		float media = 0;

		while (contador > 0) {
			contador--;
			funcionario++;

			float salario = Float
					.parseFloat(JOptionPane.showInputDialog("Digite o salario do " + funcionario + " funcionario: "));

			soma = soma + salario;

		}
		media = soma / N;

		JOptionPane.showMessageDialog(null, "A media de salario na empresa �: " + media);

	}

}
