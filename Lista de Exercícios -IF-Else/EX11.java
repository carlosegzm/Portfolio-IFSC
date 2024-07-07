
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX11 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o horário(hora):");
        int h = input.nextInt();
        
        System.out.println("Digite o horário(minutos):");
        int min = input.nextInt();
        
        System.out.println("Digite o horário(segundos):");
        int s = input.nextInt();
        
        s++;
        
        if (s >= 60) {
            s = 0;
            min++;
            
            if (min >=60) {
                min = 0;
                h++;
                
                if (h >= 24) {
                    h = 0;
                }
            }
        } 
        
        System.out.println("O horário acrescido de 1 segundo será "+h+":"+min+":"+s);
              
    }
}
