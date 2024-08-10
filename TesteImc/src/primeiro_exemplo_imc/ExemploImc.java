package primeiro_exemplo_imc;

import javax.swing.JOptionPane;

public class ExemploImc {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));

		float imc = peso / (altura * altura);

		String mensagem = nome + "\nSeu IMC é de: " + imc + "\n";

		if (imc < 18.55)
			mensagem += "Abaixo do peso.";
		if (imc > 24.99)
			mensagem += "Acima do peso.";
		if (imc >= 18.55 && imc <= 24.99)
			mensagem += "Peso normal.";

		JOptionPane.showMessageDialog(null, mensagem);

	}

}
