
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercico6 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Digite a distância total percorrida (em km): ");
        double distancia= input.nextDouble();
        System.out.println("Digite o volume de combustível consumido (em L): ");
        double combustivel= input.nextDouble();
        double consumo= distancia/combustivel;
        System.out.println("O consumo médio do automóvel é de: "+consumo+" (Km/l)");
        
    }
}
