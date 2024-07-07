
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é a idade do nadador?");
        int i = input.nextInt();
        
        if (i >= 5 && i <= 10) {
            System.out.println("A categoria do nadador é Infantil!");
        } else if (i >= 11 && i <= 17) {
            System.out.println("A categoria do nadador é Juvenil!");
        } else if (i >= 18 && i <= 60) {
            System.out.println("A categoria do nadador é Adulto!");
        } else if (i > 60) {
            System.out.println("A categoria do nadador é Senior!");
        } else {
            System.out.println("Vocâ não se encaixa em nenhuma categoria!");
        }
           
    } 
}
