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
public class EX5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = 0;
        double maior = 0;
        double somam = 0;
        double somat = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
            double alt = input.nextDouble();

            System.out.println("Digite o código de sexo da pessoa " + (i + 1) + " (1 para masculino, 2 para feminino): ");
            int sex = input.nextInt();

            if (alt > maior) {
                maior = alt;
            }

            somat += alt;

            if (sex == 2) {
                somam += alt;
                m++;
            }
        }

        double mediam = somam / m;
        double mediat = somat / 10;

        System.out.println("Maior altura da turma: " + maior + " metros");
        System.out.println("Média de altura das mulheres: " + mediam + " metros");
        System.out.println("Média de altura da turma: " + mediat + " metros");

    }
}
