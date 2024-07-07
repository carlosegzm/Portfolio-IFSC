
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int n = input.nextInt();
        
        if (n <= 100) {
            if (n > 10) {
                System.out.println("F2");
            }
            if (n <= 10) {
                System.out.println("F1");
            }
        } else {
            System.out.println("F3");
        }
        
    }
}
