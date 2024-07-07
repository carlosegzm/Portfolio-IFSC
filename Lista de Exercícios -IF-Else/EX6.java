
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int n1 = input.nextInt();
        
        System.out.println("Digite o segundo número:");
        int n2 = input.nextInt();
        
        System.out.println("Digite o terceiro número:");
        int n3 = input.nextInt();
        
        if (n1 <= n2 && n1 <= n3) {
            System.out.println("O menor número é "+n1);
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println("O menor número é "+n2);
        } else {
            System.out.println("O menor número é "+n3);
        }
        
    }
}
