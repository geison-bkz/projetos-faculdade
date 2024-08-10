package view;

import domain.Pessoa;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class PrincipalController {

    @FXML private TextField txtNome;
    @FXML private TextField txtIdade;
    @FXML private RadioButton rdMasc;
    @FXML private RadioButton rdFem;
    @FXML private TextField txtTitulo;
    @FXML private TextField txtAno;
    @FXML private TextField txtValor;
    @FXML private TextArea txtResult;

    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    private void limpaTela(){
        txtNome.setText("");
        txtIdade.setText("");
        txtTitulo.setText("");
        txtAno.setText("");
        txtValor.setText("");
        rdMasc.setSelected(true);
        rdFem.setSelected(false);
    }

    @FXML
    void buscarNome() {
        txtResult.setText("");
        String nomeBusca = txtNome.getText().toUpperCase();
        for (Pessoa p: pessoas) {
            if(p.getNome().toUpperCase().startsWith(nomeBusca)){
                txtResult.appendText(p.toString());
            }

        }

    }

    @FXML
    void cadastrar() {
        Pessoa p = new Pessoa();
        p.setNome(txtNome.getText());
        p.setIdade(Integer.parseInt(txtIdade.getText()));
        p.getDvd().setTitulo(txtTitulo.getText());
        p.getDvd().setAno(Integer.parseInt(txtAno.getText()));
        p.getDvd().setValor(Double.parseDouble(txtValor.getText()));
        p.setSexo(rdMasc.isSelected()?'M':'F');
        pessoas.add(p);
        txtResult.setText("");

        for (Pessoa pessoa: pessoas) {
            txtResult.appendText(pessoa.toString());

        }
        limpaTela();

    }

    @FXML
    void dvdMaisCaro() {
        Pessoa pesDvdCaro = new Pessoa();
        for (Pessoa p : pessoas) {
            if(p.getDvd().getValor() > pesDvdCaro.getDvd().getValor()){
                pesDvdCaro = p;
            }
        }
        txtResult.setText(pesDvdCaro.toString());

    }

    @FXML
    void listarSexo() {
        txtResult.setText("");
        char sexo = rdMasc.isSelected()?'M':'F';
        for (Pessoa p : pessoas) {
            if(p.getSexo()==sexo){
                txtResult.appendText(p.toString());
            }
        }
    }

}

