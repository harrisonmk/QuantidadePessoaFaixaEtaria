package projeto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Paulo", 31);
        Pessoa p1 = new Pessoa("Joao", 12);
        Pessoa p2 = new Pessoa("Antonio", 16);
        Pessoa p3 = new Pessoa("Marcos", 13);
        Pessoa p4 = new Pessoa("Diogo", 15);
        Pessoa p5 = new Pessoa("Carlos", 46);
        Pessoa p6 = new Pessoa("Amando", 24);
        Pessoa p7 = new Pessoa("Roberto", 28);
        Pessoa p8 = new Pessoa("Vanessa", 35);
        Pessoa p9 = new Pessoa("Maria ", 86);
        Pessoa p10 = new Pessoa("Tadeu", 45);
        Pessoa p11 = new Pessoa("Ulisses", 54);
        Pessoa p12 = new Pessoa("Claudia", 56);
        Pessoa p13 = new Pessoa("Eduardo", 61);
        Pessoa p14 = new Pessoa("Matheus", 72);

        List<Pessoa> lista = new ArrayList<>();
        int cont = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        double calculaP = 0, calculaU = 0;

        lista.add(p);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);
        lista.add(p11);
        lista.add(p12);
        lista.add(p13);
        lista.add(p14);

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getIdade() <= 15) {

                cont++;

                calculaP = ((double) cont / (double) lista.size()) * 100;

            } else if (lista.get(i).getIdade() >= 16 && lista.get(i).getIdade() <= 30) {
                cont2++;
            } else if (lista.get(i).getIdade() >= 31 && lista.get(i).getIdade() <= 45) {
                cont3++;
            } else if (lista.get(i).getIdade() >= 46 && lista.get(i).getIdade() <= 60) {
                cont4++;
            } else if (lista.get(i).getIdade() >= 61) {
                cont5++;
                calculaU = (((double) cont5 / (double) lista.size()) * 100);
            }

        }

        System.out.println("Quantidade de Pessoas ate 15 anos: " + cont);
        System.out.println("Quantidade de Pessoas Entre 16 e 30 anos: " + cont2);
        System.out.println("Quantidade de Pessoas Entre 31 e 45 anos: " + cont3);
        System.out.println("Quantidade de Pessoas Entre 46 e 60 anos: " + cont4);
        System.out.println("Quantidade de Pessoas acima de 61 anos: " + cont5);
        System.out.println("Porcentagem de Pessoas ate 15 anos: " + (int) calculaP + "%");
        System.out.println("Porcentagem de Pessoas acima de 61 anos: " + (int) calculaU + "%");

    }

}
