
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Qual é o preço do café?");
        double x= input.nextDouble();
        System.out.println("Quantos quilos de café foram comprados?");
        double q= input.nextDouble();
        double cafe= q * x;
        
        System.out.println("Qual é o preço do leite?");
        double y= input.nextDouble();
        System.out.println("Quantos litro de leite foram comprados?");
        double l= input.nextDouble();
        double leite= y * l;
        
        System.out.println("Qual é o preço da bolacha?");
        double z= input.nextDouble();
        System.out.println("Quantos pacotes de bolacha foram comprados?");
        double b= input.nextDouble();
        double bolacha= z * b;
        
        double total= cafe + leite + bolacha;
        System.out.println("Foi gasto R$"+cafe+" em café");
        System.out.println("Foi gasto R$"+leite+" em leite");
        System.out.println("Foi gasto R$"+bolacha+" em bolacha");
        System.out.println("O gasto total foi de R$"+total);
        
    }
}
