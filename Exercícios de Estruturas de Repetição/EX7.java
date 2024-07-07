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
public class EX7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char continuar = 0;

        do {
            System.out.println("Digite o nome do hóspede:");
            String nome = input.nextLine();

            System.out.println("Digite o tipo de apartamento utilizado (A, B ou C):");
            char tipo = input.next().charAt(0);

            System.out.println("Digite o número de diárias utilizadas pelo hóspede:");
            int d = input.nextInt();

            double vd = 0;
            switch (tipo) {
                case 'A':
                    vd = 150;
                    break;
                case 'B':
                    vd = 100;
                    break;
                case 'C':
                    vd = 75;
                    break;
                default:
                    System.out.println("Tipo de apartamento inválido.");
                    continue;
            }

            double tp = vd * d;

            System.out.println("Nome do hóspede: " + nome);
            System.out.println("Tipo do apartamento: " + tipo);
            System.out.println("Valor total das diárias: R$" + tp);

            System.out.println("\nDeseja continuar (S/N)?");
            continuar = input.next().charAt(0);
            input.nextLine();
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Obrigado por utilizar nosso serviço!");

    }
}
