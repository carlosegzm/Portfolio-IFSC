
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX7 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é a altura da sala?");
        double alt = input.nextDouble();

        System.out.println("Qual é o comprimento da sala?");
        double comp = input.nextDouble();

        System.out.println("Qual é a largura da sala?");
        double larg = input.nextDouble();

        double piso = comp * larg;
        System.out.println("A área do piso é de " + piso + " metros quadrados.");

        double volume = alt * comp * larg;
        System.out.println("O volume da sala é de " + volume + " metros cúbicos.");

        double paredes = (alt * comp * 2) + (alt * larg * 2);
        System.out.println("A áres das paredes é de " + paredes + " metros quadrados");

        if (volume < 100) {
            System.out.println("O ar-condicionado deverá ser pequeno.");
        } else if (volume >= 100 && volume <= 500) {
            System.out.println("O ar-condicionado deverá ser médio.");
        } else {
            System.out.println("O ar-condicionado deverá ser grande.");
        }

    }

}
