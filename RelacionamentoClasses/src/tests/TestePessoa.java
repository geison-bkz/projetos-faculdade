package tests;

import domain.Pessoa;

import javax.swing.*;
import java.util.ArrayList;

public class TestePessoa {

    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {
        String menu = "1 - Cadastrar Pessoa\n"
                + "2 - Listar por sexo\n"
                + "3 - Listar por DVD\n\n"
                + "4 - Pessoa com o DVD mais caro"
                + "5 - Sair";

        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    Pessoa pessoa = new Pessoa();
                    pessoa.cadastraJopt();
                    pessoas.add(pessoa);
                    break;
                case 2:
                    char sexoBusca = JOptionPane.showInputDialog("Sexo (M/F)").toUpperCase().charAt(0);
                    String r = "***Pessoas do sexo "+sexoBusca+"***\n\n";
                    for (Pessoa p : pessoas) {
                        if(p.getSexo()==sexoBusca)
                            r += p;

                    }
                    JOptionPane.showMessageDialog(null, r);
                    break;
                case 3:
                    String tituloBusca = JOptionPane.showInputDialog("Qual titulo? ");
                    r = "****Pessoas que possuem o DVD: "+tituloBusca+"***\n\n";
                    for (Pessoa p : pessoas) {
                        if(p.temDvd(tituloBusca))
                            r += p;
                    }
                    JOptionPane.showMessageDialog(null, r);
                    break;
                case 4:
                    Pessoa pessoaDvDMaisCaro = new Pessoa();
                    for (Pessoa p : pessoas) {
                        if(p.getDvd().getValor() > pessoaDvDMaisCaro.getDvd().getValor())
                            pessoaDvDMaisCaro = p;
                    }
                    JOptionPane.showMessageDialog(null, pessoaDvDMaisCaro);
                    break;
            }

        }while(op != 5);
    }

}
