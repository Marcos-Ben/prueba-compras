package principal;

import tienda.Compras;
import tienda.TarjetaDeCredito;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime el saldo total en tu tarjeta");
        double saldo = lector.nextDouble();
        TarjetaDeCredito card = new TarjetaDeCredito(saldo);
        int salir = 1;
        while (salir != 0) {
            System.out.println("dime lo que quieres comprar");
            String descripcion = lector.next();

            System.out.println("dime el precio de  la compra");
            double valor = Double.valueOf(lector.nextDouble());

            Compras compra = new Compras(valor, descripcion);
            boolean compraRealizada = card.hacerCompra(compra);

            if (compraRealizada) {
                System.out.println("Su compra ah sido realizada");
                System.out.println("Presione 0 para salir 1 para continuar");
                salir = lector.nextInt();
            } else {
                System.out.println("saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("* * * * * * * * * * * * * * ");
        System.out.println("Compras Realizadas");
        Collections.sort(card.getListaCompras());
        for (Compras compra : card.getListaCompras()){
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " + card.getSaldo());
    }
}
