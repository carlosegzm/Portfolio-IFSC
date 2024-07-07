
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um valor entre 0 e 999: ");
        int num = input.nextInt();
        
        int num1 = num / 100;
        int sobra1 = num % 100;

        int num2 = sobra1 / 10;
        int sobra2 = sobra1 % 10;

        int num3 = sobra2;
        int soma = num1 + num2 + num3;

        System.out.println("A soma dos dígitos do número digitado é " + soma);
    }

}