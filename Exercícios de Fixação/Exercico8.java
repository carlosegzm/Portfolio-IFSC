
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercico8 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1= input.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2= input.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3= input.nextDouble();
        System.out.println("Digite o quarto número: ");
        double num4= input.nextDouble();
        double qua1= Math.pow(num1, 2);
        double qua2= Math.pow(num2, 2);
        double qua3= Math.pow(num3, 2);
        double qua4= Math.pow(num4, 2);
        double soma= qua1 + qua2+ qua3 + qua4; 
        System.out.println("A soma dos quadrados é: "+soma);
        
    }
}
