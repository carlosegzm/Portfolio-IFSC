
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia do seu nascimento: ");
        int dian = input.nextInt();

        System.out.println("Digite o mês do seu nascimento: ");
        int mesn = input.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        int anon = input.nextInt();

        System.out.println("Digite o dia de hoje: ");
        int dia = input.nextInt();

        System.out.println("Digite o mês: ");
        int mes = input.nextInt();

        System.out.println("Digite o ano: ");
        int ano = input.nextInt();

        int totalano = ano - anon - 2;
        int totalmes = mesn - 12 + (mes-1) + totalano * 12;
        int totaldia = 30 - dian + dia + totalmes * 30;

        System.out.println("Você já viveu "+totaldia+"dias.");
    }

}
