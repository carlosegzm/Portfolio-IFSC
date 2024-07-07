
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual era o preço da mercadoria A no dia 01/01/2022?");
        double a = input.nextDouble();

        System.out.println("Qual era o preço da mercadoria B no dia 01/01/2022?");
        double b = input.nextDouble();

        System.out.println("Qual era o preço da mercadoria C no dia 01/01/2022?");
        double c = input.nextDouble();

        System.out.println("Qual era o preço da mercadoria A no dia 01/02/2022?");
        double aa = input.nextDouble();

        System.out.println("Qual era o preço da mercadoria B no dia 01/02/2022?");
        double bb = input.nextDouble();

        System.out.println("Qual era o preço da mercadoria C no dia 01/02/2022?");
        double cc = input.nextDouble();

        double v = (((aa - a) / a * 100) + ((bb - b) / b * 100) + ((cc - c) / c * 100)) / 3;

        if (v > 0.55) {
            System.out.println("A inflação está acima da meta");
        } else {
            System.out.println("A inflação está dentro da meta");
        }

    }

}
