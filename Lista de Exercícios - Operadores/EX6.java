
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a nota da prova 1: ");
        double prova1 = input.nextDouble();
        
        System.out.println("Insira a nota da prova 2: ");
        double prova2 = input.nextDouble();
        
        System.out.println("Insira a nota do trabalho: ");
        double trabalho = input.nextDouble();
        
        System.out.println("Insira a frequência(%): ");
        double frequencia = input.nextDouble();
        
        Boolean aprovado = false;
        
        if (trabalho >= 7.0 && (prova1 >= 6.0 || prova2 >= 6.0) && frequencia >= 75.0) {
            aprovado = true;
        } else if (trabalho == 6.0 && frequencia >= 90.0) { 
            aprovado = true;
        }
        
        if (aprovado) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }
        
    }
}