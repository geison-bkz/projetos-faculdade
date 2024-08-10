package tests;

import domain.Dvd;

import javax.swing.*;
import java.util.ArrayList;

public class Teste {

    static ArrayList<Dvd> dvds = new ArrayList<Dvd>();

    public static void main(String[] args) {

        String menu = "1 - Cadastrar DVD\n"
                + "2 - Listar todos\n"
                + "3 - Somar valores\n"
                + "4 - Buscar por ano\n"
                + "5 - Buscar por titulo\n\n"
                + "6 - Sair";

        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    Dvd d = new Dvd();
                    d.cadastrarJopt();
                    dvds.add(d);
                    break;
                case 2:
                    String r = "*** DVDS CADASTRADOS ***\n\n";
                    for(Dvd dv : dvds){
                        r += dv;
                    }
                    JOptionPane.showMessageDialog(null, r);
                    break;
                case 3:
                    double total = 0;
                    for(Dvd dv : dvds){
                        total += dv.getValor();
                    }
                    JOptionPane.showMessageDialog(null, total);
                    break;
                case 4:
                    int anoBusca = Integer.parseInt(JOptionPane.showInputDialog("Qual ano buscar? "));
                    r = "*** DVDS DO ANO "+anoBusca+" ***\n\n";
                    for(Dvd dv : dvds){
                        if(anoBusca == dv.getAno())
                            r+=dv;
                    }
                    JOptionPane.showMessageDialog(null, r);

                    break;
                case 5:
                    String tituloBusca = JOptionPane.showInputDialog("Qual titulo buscar?");
                    r = "*** TITULO DO DVD "+tituloBusca+" ***\n\n";
                    for(Dvd dv : dvds){
                        if(tituloBusca.equalsIgnoreCase(dv.getTitulo()))
                            r+=dv;
                    }
                    JOptionPane.showMessageDialog(null, r);
                    break;
            }

        }while (op!=6);

    }

}
