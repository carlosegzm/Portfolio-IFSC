
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome= input.nextLine();
        System.out.println("Digite o seu endereço: ");
        String endereco= input.nextLine();
        System.out.println("Digite o número do seu telefone: ");
        String telefone= input.nextLine();
        System.out.println("Seu nome é "+nome+", você mora no bairro "+endereco+" e seu telefone é "+telefone);
        
    }
}
