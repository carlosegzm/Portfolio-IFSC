
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX13 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o valor de A?");
        double a = input.nextDouble();

        System.out.println("Qual é o valor de B?");
        double b = input.nextDouble();

        System.out.println("Qual é o valor de C?");
        double c = input.nextDouble();

        if (a + b < c) {
            System.out.println("A some de A com B é menor que C");
        } else if (a + b == c) {
            System.out.println("A soma de A com B é igual a C");
        } else {
            System.out.println("A soma de A com B é maior que C");
        }

    }

}