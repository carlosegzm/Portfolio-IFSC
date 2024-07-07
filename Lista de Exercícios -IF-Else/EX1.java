
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX1 {
    public static void main(String[] args) {        
    Scanner input = new Scanner(System.in);
        System.out.println("Qual é o preço do quilowatt de energia?");
        double p = input.nextDouble();
        
        System.out.println("Qual é a quantidade gasta de quilowatt na residência?");
        double q = input.nextDouble();
        
        double conta = p * q;
        double atraso = conta * 1.1;
        
        System.out.println("O valor a ser pago é de R$"+conta);
        System.out.println("O valor caso a conta sseja paga com atraso será de R$"+atraso);
        
        
        if (q > 70.0) {
            System.out.println("Consumo elevado de energia!");
        } else {
            System.out.println("Você é um consumidor consciente!");
        }
    
    }
}