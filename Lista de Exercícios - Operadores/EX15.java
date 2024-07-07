
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX15 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o seu salário bruto: ");
        double bruto = input.nextDouble();
        
        System.out.println("Digite o número de dependentes que voce possui: ");
        int dependente = input.nextInt();
        
        double imposto = 0.74;
        double liq = bruto * imposto;
        double ganho = dependente * 150;
        System.out.println("O seu salario líquido é R$"+ liq +" e você ganhará mais R$"+ ganho);

    }

}