package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio03b {

	public static void main(String[] args) {
		// Uma empresa que possui X funcionários precisa saber a média de seus salários.
		// Faça um algoritmo
		// para ler a quantidade de funcionários e o salário de cada um e escrever a
		// média dos salários. Primeiro,
		// utilize a estrutura de repetição enquanto, depois a estrutura de repetição
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

		JOptionPane.showMessageDialog(null, "A media de salario na empresa é: " + media);

	}

}
