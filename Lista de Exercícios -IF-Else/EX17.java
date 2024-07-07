
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite qual é o peso na Terra(Kg):");
        double p = input.nextDouble();
        
        double merc = p * 0.37;
        double ven = p * 0.88;
        double marte = p * 0.38;
        double jup = p * 2.64;
        double sat = p * 1.15;         
        double ur = p * 1.17;       
        double net = p * 1.18;      
                
        System.out.println("O peso digitado em Mercúrio é "+merc+" Kg.");
        System.out.println("O peso digitado em Vênus é "+ven+" Kg.");
        System.out.println("O peso digitado em Marte é "+marte+" Kg.");        
        System.out.println("O peso digitado em Júpiter é "+jup+" Kg.");        
        System.out.println("O peso digitado em Saturno é "+sat+" Kg.");        
        System.out.println("O peso digitado em Urano é "+ur+" Kg.");
        System.out.println("O peso digitado em Netuno é "+net+" Kg.");
        
    }
}
