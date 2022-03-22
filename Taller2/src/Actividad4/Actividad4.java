package Actividad4;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
       int num_dias;
       float kilometros,costo_gasolina,kilometroLitro,estacionamiento,peaje;
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Cuantos días ha durado el viaje: ");
       num_dias = sc.nextInt();
       System.out.print("Total de kilometros recorridos: ");
       kilometros = sc.nextFloat();
       System.out.print("Costo del litro de gasolina: ");
       costo_gasolina = sc.nextFloat();
       
       kilometroLitro = kilometros*costo_gasolina/num_dias;
       System.out.print("Costo del estacionamiento: ");
       estacionamiento = sc.nextFloat();
       System.out.print("Costo peaje: ");
       peaje = sc.nextFloat();
       
        System.out.printf("\nEl total a pagar por el viaje realizado es de %.2f\n",
        kilometroLitro+estacionamiento*num_dias+peaje*num_dias
        );
    }
}