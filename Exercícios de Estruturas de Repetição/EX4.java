/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturas.de.repetição;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class EX4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] itens = {"Cachorro quente", "X Salada", "Bauru com ovo", "Refrigerante"};
        int[] codigos = {100, 101, 102, 103};
        double[] precos = {4.00, 6.00, 6.50, 2.00};

        System.out.println("Cardápio:");
        for (int i = 0; i < itens.length; i++) {
            System.out.println(codigos[i] + " - " + itens[i] + ": R$" + precos[i]);
        }

        System.out.println("Informe o código do item pedido:");
        int codigoPedido = input.nextInt();

        int indiceItem = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigoPedido == codigos[i]) {
                indiceItem = i;
                break;
            }
        }

        if (indiceItem == -1) {
            System.out.println("Código de item inválido. Encerrando o programa.");
            return;
        }

        System.out.println("Informe a quantidade:");
        int quantidade = input.nextInt();

        double valorPago = precos[indiceItem] * quantidade;

        System.out.println("Item pedido: " + itens[indiceItem]);
        System.out.println("Valor a ser pago: R$" + valorPago);

    }
}
