package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //NECESITO HACER UN LISTADO DE LOS PAISES SURAMERICANOS

        //PARA CADA PAIS NECESITO ALAMACENAR EL NUMEERO DE:
        //MEDALLAS DE ORO
        //MEDALLAS DE PLATA
        //MEDALLAS DE BRONCE

        //SUMAR EL NUMERO DE MEDALLAS

        //INFORMAR CUAL ES EL PAIS CON MAS MEDALLAS

        //INFORMAR CUAL ES EL PAIS CON MENOS MEDALLAS

        // TERMINAR SUMANDO EL TOTAL DE MEDALLAS DE LOS PAISES
        //SURAMERICANOS
        /////////////////////////////////////////////////////

        ArrayList<String>paises=new ArrayList<>();
        ArrayList<Integer> medallas=new ArrayList<>();

        Scanner leerTeclado=new Scanner(System.in);

        System.out.println("****OLIMPICOS 2024****");

        for (int i=0;i<3; i++){
            String pais;
            int sumatoriaMedallas=0;
            System.out.println("Ingrese un pais: ");
            pais=leerTeclado.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE MEDALLAS DE CADA PAIS
            System.out.println("Digita el numero de medellas de oro de "+pais+": ");
            int medallasOro=leerTeclado.nextInt();
            System.out.println("Digita el numero de medallas de plata de "+pais+": ");
            int medallasPlata=leerTeclado.nextInt();
            System.out.println("Digita el numero de medallas de bronce de "+pais+": ");
            int medallaBronce=leerTeclado.nextInt();
            sumatoriaMedallas=medallasOro+medallasPlata+medallaBronce;
            System.out.println(pais+"obtuvo en total: "+sumatoriaMedallas+" Medallas en paris");

            leerTeclado.nextLine();

            medallas.add(sumatoriaMedallas);

        }
        //RECORRIENDO UN ARREGLO
        int paisMayor=medallas.get(0);
        int paisMenor=medallas.get(0);
        for (Integer medalla:medallas){

            if (medalla>paisMayor){
                paisMayor=medalla;

            }
        }
        System.out.println("El pais con mas medallas obtuvo un total de: "+paisMayor);

        //QUIERO PREGUNTAR CUAL ES EL CAJON (INDICE) DONDE SE GUARDO
        //LA CANTIDAD DE MEDALLAS MAYOR
        int indiceGanador=medallas.indexOf(paisMayor);
        System.out.println("El indice ganador es el: "+indiceGanador);

        //QUIERO OBTENER EL VALOR QUE HAY DENTRO DE UN CAJON
        System.out.println("Asi pues, el pais ganador fue: "+paises.get(indiceGanador));

        //QUIEN FUE EL ULTIMO PAIS
        int indicePerdedor=medallas.indexOf(paisMenor);
        System.out.println("El indice perdedor es el: "+indicePerdedor);

        //QUIERO OBTENER EL VALOR QUE HAY DENTRO DE UN CAJON
        System.out.println("Asi pues, el pais perdedor fue: "+paises.get(indicePerdedor));
       /*for(String pais:paises){
        System.out.println(pais);
       } */
//get=ttraer
        //add agregar
        //set


    }

}