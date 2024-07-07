
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite um número para ser dividido por 2: ");
        int num= input.nextInt();
        double x= num/2;
        double y= num%2;
        System.out.println("O quociente da divisão é "+x+" e o resto é "+y);
        
    }
}
