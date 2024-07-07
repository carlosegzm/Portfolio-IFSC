
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX10 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho da pista(Km):");
        double pista = input.nextDouble();

        System.out.println("Digite o peso do avião(toneladas): ");
        int peso = input.nextInt();

        System.out.println("Digite a visibilidade da pista(metros): ");
        int visibilidade = input.nextInt();

        System.out.println("Digite a precipitação(em mm):");
        int precipitacao = input.nextInt();

        System.out.println("Digite a quantidade de passageiros no avião: ");
        int passageiros = input.nextInt();

        System.out.println("Digite se o avião possue sistema de decolagem(s/n):");
        char sistdecola = input.next().charAt(0);

        if (precipitacao <= 5) {
            if (passageiros > 100 && precipitacao == 0 || passageiros<=100) {

                if (visibilidade < 20 && sistdecola == 's' || visibilidade >=20) {

                    if (pista < 1.5 && peso < 40 || pista <= 2 && peso <= 60 || pista>2) {
                        System.out.println("O avião poderá decolar");
                    }
                    else {
                        System.out.println("O avião não pode decolar");
                    }
                }
                else {
                    System.out.println("O avião não pode decolar");
                }
            }
            else {
                System.out.println("O avião não pode decolar");
            }
        } else {
            System.out.println("O avião não pode decolar");
        }

    }

}