package Actividad1;

public class Actividad1 {
    public static void main(String[] args) {
        int x = 20;
        
        System.out.printf("x = %d%n",x);
        System.out.printf("El valor de %d + %d es %d%n",x,x,(x+x));
        System.out.printf("El valor de %d/2 = %.2f%n",x,(float)(x/2));
        System.out.printf("El valor de %d mod 3 = %d%n",x,x%3);
    }
}