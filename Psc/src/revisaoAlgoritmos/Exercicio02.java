package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia salário e número de dependentes de um funcionário.
		// Sabendo que
		// funcionários com mais de 2 dependentes recebem um abono de R$ 100.00 por
		// dependente e os
		// demais R$ 150.00 fixos, mostre ao final o valor a receber.

		float total = 0;

		float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario: "));
		int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes: "));

		if (dependentes <= 2) {
			total = salario + 150;

		} else {
			total = salario + (dependentes * 100);

		}

		JOptionPane.showMessageDialog(null, "Salario a receber: " + total);

	}

}
