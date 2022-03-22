package Actividad2;

public class Actividad2 {
    public static void main(String[] args) {
        
        float num1=24,num2=15,num3=60;
        
        float suma = num1+num2+num3;
        float prom = suma/3;
        float producto = num1*num2*num3;
        float cociente = (num1+num2)/num3;
        float mod = (num1+num2)%num3;
        
        System.out.printf("Números: %.0f,%.0f,%.0f\n",num1,num2,num3);
        System.out.println("------------------");
        System.out.printf("Suma: %.2f\nPromedio: %.2f\nProducto: %.2f\nCociente: "
                + "%.2f\nModulo: %.2f\n",suma,prom,producto,cociente,mod); 
    }
}
