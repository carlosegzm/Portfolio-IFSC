
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor de X:");
        int x = input.nextInt();
        
        System.out.println("Digite o valor de Y:");
        int y = input.nextInt();
        
        System.out.println("Digite o valor de Z:");
        int z = input.nextInt();
        
        if (x == y && y == z) {
            System.out.println("É um triângulo equilátero");
        } else if (x == y || x == z || y == z) {
            System.out.println("É um triângulo isócele");
        } else if (x + y < z || x + z < y || y + z < x) {
            System.out.println("Não é um triângulo");
        } else {
            System.out.println("É um triângulo escaleno");
        }
               
    }
}
