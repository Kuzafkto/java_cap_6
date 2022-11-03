/*
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
 *
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suspcounter=0;
        int sufcounter =0;
        int biencounter = 0;
        int notabcounter=0;
        int sobrecounter=0;
        String grade="";

        for (int i =0 ; i<20; i++){
            switch ((int)(Math.random()*5)+1){
                case 1:
                    grade ="suspenso";
                    suspcounter++;
                    break;
                case 2:
                    grade = "suficiente";
                    sufcounter++;
                    break;
                case 3:
                    grade ="bien";
                    biencounter++;
                    break;
                case 4:
                    grade = "notable";
                    notabcounter++;
                    break;
                case 5:
                    grade = "sobresaliente";
                    sobrecounter++;
                    break;
            }
            System.out.println(grade);
        }
        System.out.printf("Hay %d suspensos, %d suficientes , %d bien, %d notables y %d sobresalientes", suspcounter, sufcounter,biencounter,notabcounter,sobrecounter);
        sc.close();
    }
}
