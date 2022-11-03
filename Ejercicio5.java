/*
 *Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
 *
 *@author KuzaFkto
 */


public class Ejercicio5 {
    public static void main(String[] args) {
        int biggest=0;
        int tiniest=300;
        int num=0;
        float total=0;
        for (int i = 0; i<50; i++ ){
            num=(int)((Math.random()*200)+100);
            System.out.print(num+" ");
            total+=num;
            if (num>biggest){
                biggest=num;
            }
            if (num<tiniest){
                tiniest=num;
            }
        }

        System.out.print("\n El número mas grande es "+ biggest+" y el mas pequeño es "+tiniest+ " y la media es "+ total/50);
    }
}
