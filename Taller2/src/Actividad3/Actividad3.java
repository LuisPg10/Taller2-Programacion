package Actividad3;

public class Actividad3 {
    public static void main(String[] args) {
        String producto = "Nevera";
        float costo = 1579419.00f;
        
        final float IVA = costo * 0.19f;
        float ingresos = 2500000;
        float utilidad = (ingresos - costo)/ingresos;
        float costoParcial = costo * utilidad + IVA;
        
        float costoFinal = costo + costoParcial;
        System.out.printf("El precio de la %s es de %.2f\n",producto,costoFinal); 
    }
}