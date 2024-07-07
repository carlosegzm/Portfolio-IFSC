
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX16 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é a abscissa?");
        double y = input.nextDouble();
        
        System.out.println("Qual é a ordenada?");
        double x = input.nextDouble();
        
        if (x > 0 && y > 0) {
            System.out.println("O ponto está localizado no primeiro quadrante");
        } else if (x > 0 && y < 0 ) {
            System.out.println("O ponto está localizado no quarto quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está localizado no segundo quadrante");
        } else if (x < 0 && y < 00) {
            System.out.println("O ponto está localizado no terceiro quadrante");
        } else {
            System.out.println("O ponto está localizado em nenhum quadrante");
        }
   
    }
}
