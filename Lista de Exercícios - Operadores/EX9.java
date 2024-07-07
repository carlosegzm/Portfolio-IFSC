
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX9 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Qual foi o valor da compra?");
         int c = input.nextInt();
         
         System.out.println("Qual foi o valor pago pelo cliente?");
         int p = input.nextInt();
         
         int troco = p - c;
         int cem = (troco / 100) % 10;
         int dez = (troco / 10) % 10;
         int um = troco - ((cem * 100) + (dez * 10));
         
         System.out.println("O valor da compra foi R$"+c);
         System.out.println("O valor pago pelo cliente foi R$"+p);
         System.out.println("O troco dado ao clinte será R$"+troco);
         System.out.println("O troco deve ser dado em "+cem+" notas de 100, "+dez+" notas de 10 e "+um+" notas de 1.");
     }
}