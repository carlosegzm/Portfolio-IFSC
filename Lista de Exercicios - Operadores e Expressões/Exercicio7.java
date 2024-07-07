
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite a quantidade de picolés de uva vendidos: ");
        double uva= input.nextDouble();
        System.out.println("Digite a quantidade de picolés de chocolate vendidos: ");
        double chocolate= input.nextDouble();
        System.out.println("Digite a quantidade de picolés de morango vendidos: ");
        double morango= input.nextDouble();
        double uvat= uva * 1.5;
        double chocolatet= chocolate * 2;
        double morangot= morango * 0.75;
        double t= uvat + chocolatet + morangot;
        System.out.println("O valor arrecadado com as vendas de picolé de uva foram R$"+uvat);
        System.out.println("O valor arrecadado com as vendas de picolé de chocolate foram R$"+chocolatet);        
        System.out.println("O valor arrecadado com as vendas de picolé de morango foram R$"+morangot);
        System.out.println("O valor total da vendas foi de R$"+t);
    }
}
