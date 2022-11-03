/*
 *Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
 *@author KuzaFkto
 */


public class Ejercicio3 {
    public static void main(String[] args) {
        int value = (int)(Math.random()*10)+1;
        String card="";
        int suit =(int)(Math.random()*4)+1;



        switch (value){
            case 8:
                card+="Sota de ";
                break;
            case 9:
                card+="Caballo de ";
                break;
            case 10:
                card+="Rey de ";
                break;
            case 1:
                card+="As de ";
                break;

            default:
                card+= value + " de ";
                break;

        }

        switch (suit){
            case 1:
                card+="espadas";
                break;
            case 2:
                card+="oro";
                break;
            case 3:
                card+="basto";
                break;
            case 4:
                card+="copas";
                break;
        }

        System.out.print(card);
    }
}
