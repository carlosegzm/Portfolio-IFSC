
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite o horário (somente as horas): ");
        int horas= input.nextInt();
        System.out.println("Digite o horário (somente os minutos): ");
        int min= input.nextInt();
        System.out.println("Digite o horário (somente os segundos): ");
        int s= input.nextInt();
        int tempo= (horas * 3600)+(min * 60)+ s;
        System.out.println("Já se passaram "+tempo+" segundos desde que o dia começou.");
        
    }
}
