package corridaVirtual;

import javax.swing.*;

public class MainEstruturada {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("*** Corrida Virtual ***\n\nDigite o numero de participante contando homens e mulheres: "));
        String menu = "*** Corrida Virutal ***\n"+
                "1- Cadastrar novo corredor\n"+
                "2- Corredores cadastrados\n"+
                "3- Inicar nova corrida\n"+
                "4- Classificados\n\n"+
                "5- Sair";

        int op, op2;
        int idade[] = new int[n];
        String nome[] = new String[n];
        char sexo[] = new char[n];
        int tempo[] = new int[n];
        int primeiroLugar = 99999;
        String nomePrimeiro = "";
        int segundoLugar = 99999;
        String nomeSegundo = "";
        int terceiroLugar = 99999;
        String nomeTerceiro = "";
        float distancia;
        int percurso;
        String resultCadastro = "";
        String classificadoM = "";
        String classificadoF = "";
        int i = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    if (i >= n){
                        JOptionPane.showMessageDialog(null, "Limite de participantes excedido");
                    }else{
                        nome[i] = JOptionPane.showInputDialog("Digite o nome do corredor: ");

                        do {
                            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do corredor: "));
                            if (idade[i] < 16 || idade[i] > 100){
                                JOptionPane.showMessageDialog(null, "Idade minima permitira de 16 ano e maxima de 100");
                            }
                        }while(idade[i] < 16 || idade[i] > 100);
                        sexo[i] = JOptionPane.showInputDialog("Digite o sexo M/F").toUpperCase().charAt(0);

                        resultCadastro += "Nome: " + nome[i] + "\nidade: " + idade[i] + "\nsexo: " + sexo[i] + "\n\n";
                        i++;
                        System.out.println(i);
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,resultCadastro);
                    break;
                case 3:
                    distancia = Integer.parseInt(JOptionPane.showInputDialog("Digite a distancia da corrida: "));
                    for (int j = 0; j < n; j++) {
                        tempo[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de "+nome[j]+" em segundos: "));
                    }
                        break;
                case 4:
                    op2 = Integer.parseInt(JOptionPane.showInputDialog("Classificação por faixa etaria\n\n"+
                            "1- 16 anos a 25 anos\n"+
                            "2- 26 anos a 35 anos\n"+
                            "3- 36 anos a 45 anos\n"+
                            "4- 46 anos a 55 anos\n"+
                            "5- 56 anos a 65 anos\n"+
                            "6- 66 anos a 75 anos\n"+
                            "7- 76 anos a 85 anos\n"+
                            "8- 86 anos a 95 anos\n"+
                            "9- 96 anos a 100 anos\n"));
                    switch (op2){
                        case 1:
                            if(sexo[i] == 'M' && (idade[i] >= 16 && idade[i] <= 25)){
                                if (tempo[i] < primeiroLugar){
                                    primeiroLugar = tempo[i];
                                    nomePrimeiro = nome[i];
                                }else if (tempo[i] > primeiroLugar && tempo[i] < segundoLugar){
                                    segundoLugar = tempo[i];
                                    nomeSegundo = nome[i];
                                }else if (tempo[i] > primeiroLugar && tempo[i] > segundoLugar && tempo[i] < terceiroLugar){
                                    terceiroLugar = tempo[i];
                                    nomeTerceiro = nome[i];
                                }
                            }
                            if(sexo[i] == 'F' && (idade[i] >= 16 && idade[i] <= 25)){
                                if (tempo[i] < primeiroLugar){
                                    primeiroLugar = tempo[i];
                                    nomePrimeiro = nome[i];
                                }else if (tempo[i] > primeiroLugar && tempo[i] < segundoLugar){
                                    segundoLugar = tempo[i];
                                    nomeSegundo = nome[i];
                                }else if (tempo[i] > primeiroLugar && tempo[i] > segundoLugar && tempo[i] < terceiroLugar){
                                    terceiroLugar = tempo[i];
                                    nomeTerceiro = nome[i];
                                }
                            }
                            JOptionPane.showMessageDialog(null,"Classificados Masculino 16 a 25 anos: "
                                    +"\nPrimeiro lugar: "+nomePrimeiro
                                    +"\nSegundo lugar: "+nomeSegundo
                                    +"\nTerceiro lugar: "+nomeTerceiro);
                            JOptionPane.showMessageDialog(null,"Classificados Feminino 16 a 25 anos: "
                                    +"\nPrimeiro lugar: "+nomePrimeiro
                                    +"\nSegundo lugar: "+nomeSegundo
                                    +"\nTerceiro lugar: "+nomeTerceiro);

                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;

                    }
                    break;

            }


        }while (op !=5);

    }
}
