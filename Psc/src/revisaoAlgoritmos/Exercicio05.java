package revisaoAlgoritmos;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		// Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma
		// sendo vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em
		// que o usuário forneça a quantidade de camisetas pequenas, médias e grandes,
		// referentes a uma venda e informe quanto será o valor arrecadado.

		String menu = "Opçoes de compra:\n\n"
				+ "1-Camiseta P: R$10,00\n" 
				+ "2-Camiseta M: R$12,00\n"
				+ "3-Camiseta G: R$15,00\n\n" 
				+ "4-Total da compra\n\n" 
				+ "5-Finalizar programa.\n\n";

		
		int op, P = 0, qtP = 0, qtM = 0, M = 0, qtG = 0, G = 0;
		float somaP = 0, somaM = 0, somaG = 0, total = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (op) {
			case 1:
				P = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas P: "));
				qtP += P;
				somaP += P * 10;
				break;
			case 2:
				M = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas M: "));
				qtM += M;
				somaM += M * 12;
				break;
			case 3:
				G = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas G: "));
				qtG += G;
				somaG += G * 15;
				break;
			case 4:
				total = somaP + somaM + somaG;
				JOptionPane.showMessageDialog(null, "Camisetas P. Qt:" + qtP + "\n" + somaP + "\nCamisetas M. Qt: "
						+ qtM + "\n" + somaM + "\nCamisetas G. Qt: " + qtG + "\n" + somaG + "\nTOTAL: " + total);
			}
		} while (op != 5);

	}

}