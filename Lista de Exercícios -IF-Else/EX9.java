
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX9 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número da sua conta bancária:");
        String c = input.nextLine();
        
        System.out.println("Digite o saldo atual da conta:");
        double s = input.nextDouble();
        
        System.out.println("Digite o tipo de operação (1 - depósito ou 2 - saque):");
        char o = input.next().charAt(0);
        
        System.out.println("Digite o valor da operação:");
        double v = input.nextDouble();
        
        double dep = s + v;
        double saq = s - v;
        
        if (o == '2') {
            System.out.println("O novo saldo é de R$"+saq);
            if (saq < 0) {
                System.out.println("Conta estourada!");
            }
        } else {
            System.out.println("O novo saldo é de R$"+dep);
        }
        
    }
}
