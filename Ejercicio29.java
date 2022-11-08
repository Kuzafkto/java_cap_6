/*
 * Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima.

* Ejemplo:
1. Primavera
2. Verano
3. Otoño
4. Invierno
Seleccione la estación del año (1-4): 4
Previsión del tiempo para mañana
--------------------------------
Temperatura mínima: 10ºC
Temperatura máxima: 16ºC
Nublado

 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Primavera \n2. Verano\n3. Otoño\n4. Invierno\n" +
                "Seleccione la estación del año (1-4): ");
        int choice=sc.nextInt();
        int temp=0;
        int temp2=0;
        int weather=1+(int)(Math.random()*10);

        System.out.println("Previsión para el tiempo de mañana");
        System.out.println("---------------------------------------");
        while(choice<0||choice>4){
            System.out.print("La estación ha sido seleccionada incorrectamente, por favor vuelva a ingresar" +
                                " la estación del año correctamente (1-4): ");

            choice=sc.nextInt();
        }
        switch (choice){
            case 1:
                temp=15+(int)(Math.random()*16);
                temp2=15+(int)(Math.random()*16);
                if (temp>temp2){
                    System.out.println("Temperatura mínima: " + temp2 + "º \nTemperatura máxima: "+ temp +"º");
                }else if (temp2>temp){
                    System.out.println("Temperatura mínima: " + temp + "º \nTemperatura máxima: "+ temp2 +"º");
                }
                if(weather<=6){
                        System.out.println("Soleado");
                }else{
                        System.out.println("Nublado");
                }
                break;
            case 2:
                temp=25+(int)(Math.random()*21);
                temp2=25+(int)(Math.random()*21);
                if (temp>temp2){
                    System.out.println("Temperatura mínima: " + temp2 + "º \nTemperatura máxima: "+ temp +"º");
                }else if (temp2>temp){
                    System.out.println("Temperatura mínima: " + temp + "º \nTemperatura máxima: "+ temp2 +"º");
                }
                if(weather<=8){
                    System.out.println("Soleado");
                }else{
                    System.out.println("Nublado");
                }
                break;
            case 3:
                temp=20+(int)(Math.random()*11);
                temp2=20+(int)(Math.random()*11);
                if (temp>temp2){
                    System.out.println("Temperatura mínima: " + temp2 + "º \nTemperatura máxima: "+ temp +"º");
                }else if (temp2>temp){
                    System.out.println("Temperatura mínima: " + temp + "º \nTemperatura máxima: "+ temp2 +"º");
                }
                if(weather<=4){
                    System.out.println("Soleado");
                }else{
                    System.out.println("Nublado");
                }
                break;
            case 4:
                temp=(int)(Math.random()*26);
                temp2=(int)(Math.random()*26);
                if (temp>temp2){
                    System.out.println("Temperatura mínima: " + temp2 + "º \nTemperatura máxima: "+ temp +"º");
                }else if (temp2>temp){
                    System.out.println("Temperatura mínima: " + temp + "º \nTemperatura máxima: "+ temp2 +"º");
                }
                if(weather<=2){
                    System.out.println("Soleado");
                }else{
                    System.out.println("Nublado");
                }
                break;

        }
        sc.close();
    }
}
