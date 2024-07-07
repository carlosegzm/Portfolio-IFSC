
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é o seu peso(Kg)?");
        double peso = input.nextDouble();
        
        System.out.println("Qual é a sua altura(Metros)?");
        double alt = input.nextDouble();
        
        double imc = peso / (alt * alt);
        
        System.out.println("O seu IMC é "+imc);

        if (imc < 30) {
            if (imc >= 25.0) {
                System.out.println("Sobrepeso");
            }
            if (imc >= 20.0 && imc < 25.0) {
                System.out.println("Normal");
            }
            if (imc < 20.0) {
                System.out.println("Magro");
            }
        } else {
            System.out.println("Obeso");
        }
        
    }
}
