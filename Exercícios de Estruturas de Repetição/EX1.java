/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturas.de.repetição;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class EX1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        int n1 = input.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int n2 = input.nextInt();
        
        while (n1 != n2) {            
            System.out.println("Os valores não são iguais. Digite dois novos valores: ");
            n1 = input.nextInt();
            n2 = input.nextInt();
        
        }
        
        System.out.println("Os valores são iguais. Encerrando o algoritmo.");
        
    }
    
}
