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
public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        int n1 = input.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int n2 = input.nextInt();
        
        while (n1 >= n2) {            
            System.out.println("O segundo valor deve ser maior que o primeiro. Digite os valores novamente.");
            n1 = input.nextInt();
            n2 = input.nextInt();
        }
        
        int n3 = n1 + n2;
        System.out.println("A soma dos dois número é "+n3);
        
    }
}
