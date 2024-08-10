package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// Uma empresa que possui X funcionários precisa saber a média de seus salários.
		// Faça um algoritmo
		// para ler a quantidade de funcionários e o salário de cada um e escrever a
		// média dos salários. Primeiro,
		// utilize a estrutura de repetição enquanto, depois a estrutura de repetição
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

		JOptionPane.showMessageDialog(null, "A media de salario na empresa é: " + media);

	}

}
