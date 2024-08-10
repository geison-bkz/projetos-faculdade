package corridaVirtual;

public class Participante {
    private String nome;
    private int idade;
    private char sexo;
    private int tempo;
    private String endereco;
    private int modalidade;


    public Participante(String nome, int idade, char sexo, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        String modalidade = "";
        switch (getModalidade()){
            case 1:
                modalidade = "5 km";
                break;
            case 2:
                modalidade = "10 km";
                break;
            case 3:
                modalidade = "15 km";
                break;
            case 4:
                modalidade = "20 km";
                break;
            case 5:
                modalidade = "30 km";
                break;
        }
        return "Participante: " + this.getNome() + " idade: " + this.getIdade() + " sexo: " + this.getSexo()
                 + " endereco: " + this.getEndereco() + " modalidade: " + modalidade + " tempo: " + this.getTempo() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getModalidade() {
        return modalidade;
    }

    public void setModalidade(int modalidade) {
        this.modalidade = modalidade;
    }
}
