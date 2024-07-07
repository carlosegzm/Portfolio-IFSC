
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Quantos segundos tem o vídeo?");
        int total= input.nextInt();
        int h= total / 3600;
        int m= (total % 3600) / 60;
        int s= total % 60;
        System.out.println("Este vídeo tem duração de "+h+"h "+m+"m "+s+"s");
        
    }
}
