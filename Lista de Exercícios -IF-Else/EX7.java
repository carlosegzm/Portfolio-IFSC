
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int a = input.nextInt();
        
        System.out.println("Digite o segundo número:");
        int b = input.nextInt();
        
        System.out.println("Digite o terceiro número:");
        int c = input.nextInt();
        
        if (a <= b && b<= c) {
            System.out.println("Valores em ordem crescente: "+a+", "+b+", "+c);
        } else if (a <= c && c <= b) {
            System.out.println("Valores em ordem crescente: "+a+", "+c+", "+b);
        } else if (b <= a && a <= c) {
            System.out.println("Valores em ordem crescente: "+b+", "+a+", "+c);
        } else if (b <= c && c <= a) {
            System.out.println("Valores em ordem crescente: "+b+", "+c+", "+a);
        } else if (c <= a && a <= b) {
            System.out.println("Valores em ordem crescente: "+c+", "+a+", "+b);
        } else {
            System.out.println("Valores em ordem crescente: "+c+", "+b+", "+a);
        }
        
    }
}
