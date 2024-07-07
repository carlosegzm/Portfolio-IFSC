
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double num1= input.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2= input.nextDouble();
        double x= num1 * num1 + num2 * num2;
        System.out.println("O resultado é "+x);
        
    }
}
