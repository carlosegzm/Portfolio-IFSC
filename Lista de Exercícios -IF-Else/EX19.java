
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX19 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Escolha uma data");
        System.out.println("Digite o dia:");
        int dia = input.nextInt();
        
        System.out.println("Digite o mês:");
        int mes = input.nextInt();
        
        System.out.println("Digite o ano:");
        int ano = input.nextInt();
        
        int maxd;
        
        if (ano >= 0 && ano <= 9999) {
            if (mes >= 1 && mes <= 12) {
                maxd = 31;

                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    maxd = 30;
                } else if (mes == 2) {
                    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                        maxd = 29;
                    } else {
                        maxd = 28;
                    }
                }

                if (dia >= 1 && dia <= maxd) {
                    System.out.println("A data é válida.");
                } else {
                    System.out.println("A quantidade de dias é incompatível com o mês.");
                }
            } else {
                System.out.println("O mês deve estar entre 1 e 12.");
            }
        } else {
            System.out.println("O ano deve estar entre 0 e 9999.");
        }
    }
}
