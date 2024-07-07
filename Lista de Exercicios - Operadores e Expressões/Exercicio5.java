
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite a base: ");
        double base= input.nextDouble();
        System.out.println("Digite a altura: ");
        double altura= input.nextDouble();
        double x= base * altura;
        double y= 2 * base + 2* altura;
        System.out.println("A área é "+x+" e o perímetro é "+y);
        
    }
}
