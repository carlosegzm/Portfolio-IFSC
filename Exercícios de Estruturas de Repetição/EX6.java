/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturas.de.repetição;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class EX6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalOtimo = 0;
        int somaIdadeRuim = 0;
        int quantidadeRuim = 0;
        int idadeMaior = 0;
        int idadeMenor = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {
            System.out.println("Informe a idade do espectador " + (i + 1) + ":");
            int idade = input.nextInt();

            System.out.println("A || Ótimo");
            System.out.println("B || Bom");
            System.out.println("C || Regular");
            System.out.println("D || Ruim");

            System.out.println("Informe a opinião do espectador " + (i + 1) + " (A, B, C ou D):");
            char opiniao = input.next().charAt(0);

            if (opiniao == 'A') {
                totalOtimo++;
            } else if (opiniao == 'D') {
                somaIdadeRuim += idade;
                quantidadeRuim++;
            }

            if (idade > idadeMaior) {
                idadeMaior = idade;
            }

            if (idade < idadeMenor) {
                idadeMenor = idade;
            }
        }

        double mediaIdadeRuim = somaIdadeRuim / (double) quantidadeRuim;
        int diferencaIdade = idadeMaior - idadeMenor;

        System.out.println("Quantidade de respostas Ótimo: " + totalOtimo);
        System.out.println("Média de idade das pessoas que responderam Ruim: " + mediaIdadeRuim);
        System.out.println("Diferença de idade entre a pessoa de maior e menor idade que responderam o questionário: " + diferencaIdade);

    }
}
