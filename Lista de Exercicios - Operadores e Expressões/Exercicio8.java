
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite o salário mínimo: ");
        double min= input.nextDouble();
        System.out.println("Digite quantos carros o vendedor vendeu: ");
        double car= input.nextDouble();
        System.out.println("Digite o valor total das vendas desse vendedor: ");
        double total= input.nextDouble();
        double salario= min * 2 + 150 * car + 0.05 * total;
        System.out.println("O salário desse vendedor neste mês será de R$"+salario);
        
    }
}
