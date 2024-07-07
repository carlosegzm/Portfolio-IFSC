
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é o nome do funcionário?");
        String nome = input.nextLine();
        
        System.out.println("Qual é a categoria do funcionário?");
        char cat = input.next().charAt(0);
        
        System.out.println("Qual é o salário atual do funcionário?");
        double sal = input.nextDouble();
        
        double ah = sal * 1.1;
        double bde = sal * 1.15;
        double cf = sal * 1.25;
        double x = sal * 1.3;
        
        System.out.println("O nome do funcionário é "+nome);
        System.out.println("A categoria do funcionário é "+cat);
        
        if (cat == 'A' || cat == 'H' || cat =='a' || cat == 'h') {
            System.out.println("O salário (já reajustado) é R$"+ah);
        } else if (cat == 'B' || cat == 'D' || cat == 'E' || cat == 'b' || cat == 'd' || cat == 'e'){
            System.out.println("O salário (já reajustado) é R$"+bde);
        } else if (cat == 'C' || cat == 'F' || cat == 'c' || cat == 'f') {
            System.out.println("O salário (já reajustado) é R$"+cf);
        } else {
            System.out.println("O salário (já reajustado) é R$"+x);
        }      
        
    }
}
