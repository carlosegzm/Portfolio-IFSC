
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX13 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é o nome do produto?");
        String p1 = input.nextLine();
        System.out.println("Qual é a quantidade dele em estoque?");
        int e1 = input.nextInt();
        input.nextLine();
        
        System.out.println("Qual é o nome do segundo produto?");
        String p2 = input.nextLine();
        System.out.println("Qual é a quantidade dele em estoque?");
        int e2 = input.nextInt();
        input.nextLine();

        System.out.println("Qual é o nome do terceiro produto?");
        String p3 = input.nextLine();
        System.out.println("Qual é a quantidade dele em estoque?");
        int e3 = input.nextInt();
        input.nextLine();

        if (e1 < 30 && e2 < 30 && e3 < 30) {
            System.out.println("Os produtos "+p1+", "+p2+" e "+p3+" estão abaixo do estoque mínimo.");
        } else if (e1 < 30 && e2 < 30 && e3 >= 30) {
            System.out.println("Os produtos "+p1+" e "+p2+" estão abaixo do estoque mínimo.");
        } else if (e1 < 30 && e2 >= 30 && e3 < 30) {
            System.out.println("Os produtos "+p1+" e "+p3+" estão abaixo do estoque mínimo.");
        } else if (e1 < 30 && e2 >= 30 && e3 >= 30) {
            System.out.println("O produto "+p1+" está abaixo do estoque mínimo.");
        } else if (e1 >= 30 && e2 < 30 && e3 < 30) {
            System.out.println("Os produtos "+p2+" e "+p3+" estão abaixo do estoque mínimo.");
        } else if (e1 >= 30 && e2 < 30 && e3 >= 30) {
            System.out.println("O produto "+p2+" está abaixo do estoque mínimo.");
        } else if (e1 >= 30 && e2 >= 30 && e3 < 30) {
            System.out.println("O produto "+p3+" está abaixo do estoque mínimo.");
        } else {
            System.out.println("Todos os produtos estão com estoque normal.");
        }
       
    }
}
