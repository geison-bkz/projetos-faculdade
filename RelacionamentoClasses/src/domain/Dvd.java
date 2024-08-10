package domain;

import javax.swing.*;

public class Dvd {

    private String titulo;
    private int ano;
    private double valor;

    @Override
    public String toString() {
        return getTitulo()+"-"+getAno()+"- R$"+getValor()+"\n";
    }

    public void cadastrarJopt(){
        setTitulo(JOptionPane.showInputDialog("Titulo do DVD"));
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano do Lançamento")));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
