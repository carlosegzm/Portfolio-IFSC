
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual foi a nota da Prova 1?");
        double p1 = input.nextDouble();
        
        System.out.println("Qual foi a nota da Prova 2?");
        double p2 = input.nextDouble();
        
        System.out.println("Qual foi a nota do trabalho?");
        double t = input.nextDouble();
        
        if (t >= 7.0 && (p1 >= 6.0 || p2 >= 6.0)) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Infelizmente, você não foi aprovado!");
        }

    }
}
