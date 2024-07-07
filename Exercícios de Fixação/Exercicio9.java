
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
        System.out.println("Digite um número para calcular a raiz quadrada: ");
        double num= input.nextDouble();
        double raiz= Math.sqrt(num);
        System.out.println("A raiz quadrado do número "+num+" é "+raiz);
        
    }
}
