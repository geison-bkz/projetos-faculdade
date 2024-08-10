package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculadoraController {

	@FXML
	private TextField txtNum1;

	@FXML
	private TextField txtNum2;

	@FXML
	private TextField txtResult;

	@FXML
	void dividir() {
		float num1 = Float.parseFloat(txtNum1.getText());
		float num2 = Float.parseFloat(txtNum2.getText());

		txtResult.setText("Divisao: " + (num1 / num2));

	}

	@FXML
	void multiplicar() {
		float num1 = Float.parseFloat(txtNum1.getText());
		float num2 = Float.parseFloat(txtNum2.getText());

		txtResult.setText("Multiplicaçao: " + (num1 * num2));

	}

	@FXML
	void somar() {
		float num1 = Float.parseFloat(txtNum1.getText());
		float num2 = Float.parseFloat(txtNum2.getText());

		txtResult.setText("Soma: " + (num1 + num2));

	}

	@FXML
	void subtrair() {
		float num1 = Float.parseFloat(txtNum1.getText());
		float num2 = Float.parseFloat(txtNum2.getText());

		txtResult.setText("Subtraçao: " + (num1 - num2));

	}

}
