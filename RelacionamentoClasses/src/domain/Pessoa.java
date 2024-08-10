package domain;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Dvd dvd = new Dvd();

    public boolean temDvd(String titulo){
        if(dvd.getTitulo().equalsIgnoreCase(titulo))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return getNome()+"-"+getIdade()+"-"+getSexo()+"-"+"\nDVD: "+dvd;
    }

    public void cadastraJopt(){
        setNome(JOptionPane.showInputDialog("Nome da pessoa"));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
        setSexo(JOptionPane.showInputDialog("Sexo (M ou F)").toUpperCase().charAt(0));
        dvd.cadastrarJopt();

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

    public Dvd getDvd() {
        return dvd;
    }

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
    }
}
