
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite o peso apresentado na balança (em kg): ");
        double peso= input.nextDouble();
        double preco= (peso - 0.450) * 39;
        System.out.println("O preço dessa refeição é de R$"+preco);
        
    }
}
