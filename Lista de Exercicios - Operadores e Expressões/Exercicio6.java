
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        double temp= input.nextDouble();
        double f= temp * 9/5 + 32;
        System.out.println("A temperatura em graus Fahrenheit é: "+f);
        
    }
}
