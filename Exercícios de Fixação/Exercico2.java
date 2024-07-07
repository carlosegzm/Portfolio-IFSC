
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercico2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero= input.nextInt();
        int sucessor= numero + 1;
        int antecessor= numero - 1;
        System.out.println("O número que você digitou é "+numero+", seu antecessor é "+antecessor+" e seu sucessor é "+sucessor);
        
    }
}
