package scene;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculoMediaController {

    @FXML
    private TextField txtNomeAluno;

    @FXML
    private TextField txtNota1;

    @FXML
    private TextField txtNota2;

    @FXML
    private TextField txtNota3;

    @FXML
    private Label lblMedia;

    @FXML
    private Label lblSituaçao;

    @FXML
    void CalculaMedia() {
    	
    	String aluno = txtNomeAluno.getText();
		float nota1 = Float.parseFloat(txtNota1.getText());
		float nota2 = Float.parseFloat(txtNota2.getText());
		float nota3 = Float.parseFloat(txtNota3.getText());

		String resultado = "";

		float media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			resultado = "Aprovado";

		} else if (media < 7 && media >= 5){
			resultado = "Recuperação";

		}else {
			resultado = "Reprovado";
			
		}

		lblMedia.setText("Media:" + media);
		lblSituaçao.setText("Aluno: " + aluno + "\nSituação: " + resultado);

    }

}
