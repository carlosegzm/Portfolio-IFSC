
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é o valor do ângulo(graus)?");
        int g = input.nextInt();
        
        if (g == 90) {
            System.out.println("É um ângulo reto");
        } else if (g <90) {
            System.out.println("É um ângulo agudo");
        } else {
            System.out.println("É um ângulo obtuso");
        }    
        
    }
}
