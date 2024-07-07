/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturas.de.repetição;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class EX9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cpf;
        int rm = 0;
        String classe;

        do {
            System.out.println("Digite o CPF:");
            cpf = input.nextLine();

            if (cpf.equals("00")) {
                System.out.println("CPF inválido");
                break;
            }
            
            System.out.println("Digite a renda mensal:");
            rm = input.nextInt();

            System.out.println("Digite a classe de renda:");
            classe = input.next().toUpperCase();

            String p = "";
            double al = 0;
            switch (classe) {
                case "A":
                    al = 1;
                    p = "isento";
                    break;
                case "B":
                    al = 0.95;
                    p = "5%";
                    break;
                case "C":
                    al = 0.9;
                    p = "10%";
                    break;
                case "D":
                    al = 0.85;
                    p = "15%";
                    break;
                case "E":
                    al = 0.8;
                    p = "20%";
                    break;
                default:
                    System.out.println("Classe de renda inválida.");
                    break;
                    
            } 
                    double x = al * rm;
                    double y = rm - x;
                    
                    System.out.println("A alíquota de desconto aplicada será de "+p);
                    System.out.println("O valor a ser descontado será de R$"+y);
   
            

        } while (!cpf.equals("00"));
        
        
    }
}
