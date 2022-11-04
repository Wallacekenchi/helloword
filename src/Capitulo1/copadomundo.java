package Capitulo1;

import java.sql.SQLOutput;

public class copadomundo {
    public static void main(String[] args) {
        for (long ano = 1930; ano <=2022; ano +=4){
            if (ano !=1942 && ano!=1946) {
                System.out.println("Copa do mundo de " + ano + "!");
            }
            else {
                System.out.println("Nao teve copa" +ano +" !");
            }
        }
    }
}
