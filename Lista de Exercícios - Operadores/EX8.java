
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX8 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quanto tempo transcorreu entre você ver o raio e ouvir o som do trovão?");
        double temp = input.nextDouble();
        
        double dist = temp * 340.0;
        System.out.println("Voce está a "+ dist +"metros do raio.");
        
          if (dist < 200.0) {
              System.out.println("O raio representou perigo!");
          }
          else {
              System.out.println("O raio não representou perigo!");
          }
    }

}