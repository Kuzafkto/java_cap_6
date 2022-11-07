/*
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
Ejemplo 1:
Q J 7 J As
Ejemplo 2:
K 8 J As
 *@author KuzaFkto
 */


public class Ejercicio23 {
    public static void main(String[] args) {
        int genDice=0;
        int dice1=0;
        int dice2=0;
        int dice3=0;
        int dice4=0;
        int dice5=0;
        while (dice1==0 || dice2==0 || dice3==0 || dice4==0 || dice5==0){
            genDice=(int)(Math.random()*6)+1;
                if (dice1==0){
                    dice1=genDice;
                }else if (dice2==0){
                    dice2=genDice;
                }else if (dice3==0){
                    dice3=genDice;
                }else if (dice4==0){
                    dice4=genDice;
                }else if (dice5==0){
                    dice5=genDice;
                }
                switch (genDice){
                    case 1:
                        System.out.print(" As ");
                        break;
                    case 2:
                        System.out.print(" K ");
                        break;
                    case 3:
                        System.out.print(" Q ");
                        break;
                    case 4:
                        System.out.print(" J ");
                        break;
                    case 5:
                        System.out.print(" 7 ");
                        break;
                    case 6:
                        System.out.print(" 8 ");
                        break;
                }
        }
    }
}
