
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX14 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é a sua altura(Metros)?");
        double alt = input.nextDouble();
        
        System.out.println("Qual é o seu gênero(M ou F)?");
        char x = input.next().charAt(0);
        
        double m = 72.7 * alt - 58;
        double f = 62.1 * alt - 44.7;
        
        if (x == 'M' || x == 'm') {
            System.out.println("O peso ideal para o seu gênero é "+m+"Kg.");
        } else if (x == 'F' || x == 'f') {
            System.out.println("O peso ideal para o seu gênero é "+f+"Kg.");
        } else {
            System.out.println("Erro!");
        }
             
    }
}
