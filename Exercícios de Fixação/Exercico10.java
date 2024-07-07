
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercico10 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Digite a temperatura em Clesius: ");
        double C= input.nextDouble();
        double F= (9 * C + 160);
        System.out.println("A temperatura em Fahrenheit é: "+F);
        
    }
}
