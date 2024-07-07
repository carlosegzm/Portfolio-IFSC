
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

        System.out.println("Insira a quantidade total de parcelas do consórcio: ");
        int total = input.nextInt();
        
        System.out.println("Insira o valor das parcelas: ");
        double valor = input.nextDouble();
        
        System.out.println("Insira a quantidade de parcelas já pagas: ");
        int pagas = input.nextInt();
        
        double x = total * valor;
        double totalPago = valor * pagas;
        double saldoDevedor = x - totalPago;
        
        System.out.println("Total pago: "+totalPago);
        System.out.println("Saldo devedor: "+saldoDevedor);
    }

}