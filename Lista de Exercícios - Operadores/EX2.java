
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author boli6
 */
public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é o preço do quilowatt de energia?");
        double p = input.nextDouble();
        
        System.out.println("Qual foi a quantidade de quilowatt gasta na residência?");
        double q = input.nextDouble();
        
        double conta = p * q;
        double conta2= conta * 1.1;
        
        System.out.println("O valor da conta é de R$"+conta);
        System.out.println("O valor da conta caso seja paga em atraso é R$"+conta2);
    }
}