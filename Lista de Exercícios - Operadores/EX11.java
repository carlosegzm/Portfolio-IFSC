
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

        System.out.println("Qual é a distância a ser percorrida em Km?");
        double dist = input.nextDouble();

        System.out.println("Qual é o consumo médio do carro em Km/litro?");
        double cons = input.nextDouble();

        System.out.println("Qual é o preço do litro do combustível?");
        double preco = input.nextDouble();

        double x = dist / cons;
        double y = x * preco;

        System.out.println("O valor a ser gasto com combustível na viagem será de R$" + y);

    }

}