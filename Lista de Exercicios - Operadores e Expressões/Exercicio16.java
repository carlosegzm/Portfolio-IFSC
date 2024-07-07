
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        double salario= 1500.00;
        double c1= 200.00;
        double c2= 120.00;
        double x= salario - ((c1 * 1.02)+(c2 * 1.02));
        System.out.println("Sobrará R$"+x+" do salário do João.");
        
    }
}
