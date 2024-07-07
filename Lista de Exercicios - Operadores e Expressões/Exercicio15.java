
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite o seu peso: ");
        double peso= input.nextDouble();
        double x= peso * 1.15;
        double y= peso * 0.8;
        System.out.println("O seu peso será "+x+"kg se você engordar 15%");
        System.out.println("O seu peso será "+y+"kg se você emagrecer 20%");
        
    }
}
