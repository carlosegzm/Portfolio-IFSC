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
public class EX3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        int rep = 0;
        
        System.out.println("Digite o seu nome:");
        String n = input.nextLine();
        
        System.out.println("Digite o seu gênero:");
        String g = input.nextLine();
        
        while (i <= 0) {            
            System.out.println("Digite uma idade válida:");
            i = input.nextInt();
            rep++;
        }
        
        System.out.println("O algoritmo se repete "+rep+" vezes.");
        
    }
}
