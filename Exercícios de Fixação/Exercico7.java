
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercico7 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero= input.nextDouble();
        double quadrado= numero * numero;
        System.out.println("O quadrado de "+numero+" é "+quadrado);
        
    }
}
