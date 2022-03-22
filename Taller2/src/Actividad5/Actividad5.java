package Actividad5;
import javax.swing.JOptionPane;

public class Actividad5 {
    public static void main(String[] args) {
        String[] frutas = {"manzanas","piñas","peras","naranjas","fresas","melones"};
        int[] Vcalorias = {52,55,55,45,32,54};
        
        int calorias = 0,Cfrutas,Kfrutas;
        String desicion;
        
        String nombre = JOptionPane.showInputDialog("Nombre de la persona");
        for(int i=0;i<6;i++){
            desicion = JOptionPane.showInputDialog("¿Desea comer "+frutas[i]+"?").toLowerCase();
            if(desicion.equals("si")){
                Cfrutas = Integer.parseInt(JOptionPane.showInputDialog("¿Que cantidad de "+frutas[i]+
                        " desea comer?"));
                Kfrutas = Vcalorias[i]*Cfrutas;
                calorias += Kfrutas;
            }
        }
        JOptionPane.showMessageDialog(null,"La cantidad total de calorias consumidas por "+nombre+
                " es de "+calorias);
    }
}