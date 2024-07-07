
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o saldo médio do cliente no último ano:?");
        double sm = input.nextDouble();
        
        double c1 = sm * 0.3;
        double c2 = sm * 0.4;
        double c3 = sm * 0.5;
        
        if (sm >= 500.01 && sm <= 1000) {
            System.out.println("O valor do crédio do cliente é R$"+c1);
        } else if (sm >= 1000.01 && sm <= 3000) {
            System.out.println("O valor do crédito do cliente é R$"+c2);
        } else if (sm > 3000){
            System.out.println("O valor do crédito do cliente é R$"+c3);
        } else {
            System.out.println("O cliente não tem nenhum crédito disponível");
        }
        
    }
}
