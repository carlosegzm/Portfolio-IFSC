
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX4 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Digite o seu peso(Kg):");
       double peso = input.nextDouble();
       
       System.out.println("Digite a sua altura(Metros):");
       double altura = input.nextDouble();
       
       double IMC = peso / (altura * altura);
       
       if (IMC > 25.0) {
           System.out.println("Você está acima do peso ideal!");
       } else {
           System.out.println("Você está no peso ideal");
       }
       
    }
}