package corridaVirtual;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String menu = "#### Corrida Virtual ####\n\n"
                +"1- Cadastrar novo participante\n"
                +"2- Listar participantes\n"
                +"3- Classificados\n\n"
                +"4- Sair";

        int op;
        Corrida corrida = new Corrida();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    corrida.addParticipante(JOptionPane.showInputDialog("Digite o nome do participante:"),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do participante: ")),
                            JOptionPane.showInputDialog("Digite o sexo M/F").toUpperCase().charAt(0),
                            JOptionPane.showInputDialog("Digite o endereço do participante: "));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,corrida.toString());
                    break;
                case 3:
                    corrida.listarClassificados();
                    break;
            }

        }while(op != 4);



    }
}
