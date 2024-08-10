package corridaVirtual;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Corrida {
    private ArrayList<Participante> participantes = new ArrayList<>();
    private boolean status = false;
    private int faixaEtaria;

    int primeiroLugarM = 11111;
    String nomePrimeiroM;
    int segundoLugarM = 22222;
    String nomeSegundoM;
    int terceiroLugarM = 33333;
    String nomeTerceiroM;
    int primeiroLugarF = 11111;
    String nomePrimeiroF;
    int segundoLugarF = 22222;
    String nomeSegundoF;
    int terceiroLugarF = 33333;
    String nomeTerceiroF;

    @Override
    public String toString() {
        return ""+ participantes + "\n";
    }

    public void addParticipante(String nome, int idade, char sexo, String endereco){
        Participante p = new Participante(nome,idade,sexo,endereco);
        if(p.getIdade() > 16 && p.getIdade() <= 100){
            podeCorrer();
        }
        if (getStatus()){
            JOptionPane.showMessageDialog(null, "Qualificado");
            getParticipantes().add(p);
        }else{
            JOptionPane.showMessageDialog(null, "Desqualificado por idade");
            getParticipantes().clear();
        }
        p.setModalidade(Integer.parseInt(JOptionPane.showInputDialog(
                "Modalidade: "
                        +"\n1- 5km"
                        +"\n2- 10km"
                        +"\n3- 15km"
                        +"\n4- 20km"
                        +"\n5- 30km")));
        Random random = new Random();
        switch (p.getModalidade()){
            case 1:
                p.setTempo(random.nextInt((1800 - 1200) + 1 ) + 1200);
                break;
            case 2:
                p.setTempo(random.nextInt((2700 - 2100) + 1 ) + 2100);
                break;
            case 3:
                p.setTempo(random.nextInt((3600 - 3000) + 1 ) + 3000);
                break;
            case 4:
                p.setTempo(random.nextInt((5400 - 4200) + 1 ) + 4200);
                break;
            case 5:
                p.setTempo(random.nextInt((7200 - 6600) + 1 ) + 6600);
                break;
        }
        if(p.getIdade() >= 16 && p.getIdade() <= 25){
            setFaixaEtaria(1);
        }
        if(p.getIdade() >= 26 && p.getIdade() <= 35){
            setFaixaEtaria(2);
        }
        if(p.getIdade() >= 36 && p.getIdade() <= 45){
            setFaixaEtaria(3);
        }
        if(p.getIdade() >= 46 && p.getIdade() <= 55){
            setFaixaEtaria(4);
        }
        if(p.getIdade() >= 56 && p.getIdade() <= 65){
            setFaixaEtaria(5);
        }
        if(p.getIdade() >= 66 && p.getIdade() <= 75){
            setFaixaEtaria(6);
        }
        if(p.getIdade() >= 76 && p.getIdade() <= 85){
            setFaixaEtaria(7);
        }
        if(p.getIdade() >= 86 && p.getIdade() <= 95){
            setFaixaEtaria(8);
        }
        if(p.getIdade() >= 96 && p.getIdade() <= 100){
            setFaixaEtaria(9);
        }

    }

    public void podeCorrer(){
        setStatus(true);
    }

    public void listarClassificados(){
        int aux = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Modalidade"
                +"\n1- 5km"
                +"\n2- 10km"
                +"\n3- 15km"
                +"\n4- 20km"
                +"\n5- 30km"));
        switch (aux){
            case 1:
                aux = Integer.parseInt(JOptionPane.showInputDialog("Escolha a faixa etaria: "
                        +"\n1- 16 a 25 anos"
                        +"\n2- 26 a 35 anos"
                        +"\n3- 36 a 45 anos"
                        +"\n4- 46 a 55 anos"
                        +"\n5- 56 a 65 anos"
                        +"\n6- 66 a 75 anos"
                        +"\n7- 76 a 85 anos"
                        +"\n8- 86 a 95 anos"
                        +"\n9- 96 a 100 anos"));
                for (Participante p : participantes) {
                    switch (aux){
                        case 1:
                            if(getFaixaEtaria() == 1){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 1){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                        case 2:
                            if(getFaixaEtaria() == 2){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 2){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                        case 3:
                            if(getFaixaEtaria() == 3){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 3){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                        case 4:
                            if(getFaixaEtaria() == 4){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 4){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                        case 5:
                            if(getFaixaEtaria() == 5){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 5){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                        case 6:
                            if(getFaixaEtaria() == 6){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 6){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                        case 7:
                            if(getFaixaEtaria() == 7){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 7){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                        case 8:
                            if(getFaixaEtaria() == 8){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 8){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                        case 9:
                            if(getFaixaEtaria() == 9){
                                if(p.getTempo() < primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    primeiroLugarM = p.getTempo();
                                    nomePrimeiroM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() < segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    segundoLugarM = p.getTempo();
                                    nomeSegundoM = p.getNome();
                                }else if (p.getTempo() > primeiroLugarM && p.getTempo() > segundoLugarM && p.getTempo() < terceiroLugarM && p.getSexo() == 'M'){
                                    terceiroLugarM = p.getTempo();
                                    nomeTerceiroM = p.getNome();
                                }
                            }
                            if(getFaixaEtaria() == 9){
                                if(p.getTempo() < primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    primeiroLugarF = p.getTempo();
                                    nomePrimeiroF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() < segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    segundoLugarF = p.getTempo();
                                    nomeSegundoF = p.getNome();
                                }else if (p.getTempo() > primeiroLugarF && p.getTempo() > segundoLugarF && p.getTempo() < terceiroLugarF && p.getSexo() == 'F'){
                                    terceiroLugarF = p.getTempo();
                                    nomeTerceiroF = p.getNome();
                                }
                            }

                            break;
                    }

                }
                break;

        }
        JOptionPane.showMessageDialog(null,"Classificados Masculino: "
                + "\nPrimeiro lugar: " + nomePrimeiroM + "Tempo: " + primeiroLugarM
                + "\nSegundo lugar: " + nomeSegundoM + "Tempo: " + segundoLugarM
                + "\nPrimeiro lugar: " + nomeTerceiroM + "Tempo: " + terceiroLugarM
                + "\n\n Clasificados Feminino: "
                + "\nPrimeiro lugar: " + nomePrimeiroF + "Tempo: " + primeiroLugarF
                + "\nSegundo lugar: " + nomeSegundoF + "Tempo: " + segundoLugarF
                + "\nPrimeiro lugar: " + nomeTerceiroF + "Tempo: " + terceiroLugarF );

    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
