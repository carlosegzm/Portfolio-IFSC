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
public class EX8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, d;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        String continuar;

        do {
            System.out.println("Digite a idade:");
            int id = input.nextInt();

            if (id < 6) {
                System.out.println("Isento de pagamento");
                a++;
            } else if (id >= 6 && id <= 12) {
                System.out.println("Bilhete de criança");
                b++;
            } else if (id >= 13 && id <= 65) {
                System.out.println("Bilhete normal");
                c++;
            } else {
                System.out.println("Bilhete de terceira idade");
                d++;
            }

            System.out.println("Deseja continuar (S/N)}?");
            continuar = input.next().toUpperCase();
        } while (continuar.equals("S"));

        System.out.println("Serão vendidos " + a + " bilhetes isentos de pagamento, " + b + " bilhetes de criança, " + c + " bilhetes normal e " + d + " bilhetes de terceira idade.");

    }
}
