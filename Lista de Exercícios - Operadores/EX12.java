
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boli6
 */
public class EX12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o primeiro número?");
        double a = input.nextDouble();

        System.out.println("Qual é o segundo número?");
        double b = input.nextDouble();

        if (a == b) {
            System.out.println("Os dois número são iguais");
        } else {
            System.out.println("Os dois números são diferentes");
        }

    }

}