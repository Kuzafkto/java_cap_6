/*
 *Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.
*
 *@author KuzaFkto
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        int genColor=0;
        int color1=0;
        int color2=0;
        int color3=0;

        while (color1==0 || color2==0 || color3==0){
            genColor=(int)(Math.random()*6)+1;
            if (genColor!=color1 && genColor!=color2&&genColor!=color3){
                if (color1==0){
                    color1=genColor;
                }else if (color2==0){
                    color2=genColor;
                }else if (color3==0){
                    color3=genColor;
                }
                switch (genColor){
                    case 1:
                        System.out.print(" rojo ");
                        break;
                    case 2:
                        System.out.print(" azul ");
                        break;
                    case 3:
                        System.out.print(" verde ");
                        break;
                    case 4:
                        System.out.print(" amarillo ");
                        break;
                    case 5:
                        System.out.print(" violeta ");
                        break;
                    case 6:
                        System.out.print(" naranja ");
                        break;
                }
            }
        }
    }
}
