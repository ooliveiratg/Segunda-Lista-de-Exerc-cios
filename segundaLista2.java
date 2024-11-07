package lições.segundaLista;
import java.lang.System;
import java.util.Scanner;

public class segundaLista2 {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int d,e,l,p,c;
        double v;
        System.out.print("digite o valor que você deseja converter: ");
        v = t.nextDouble();
        
        d = 1;
        e = 2;
        l = 3;
        p = 4;

        System.out.println("\n" +d + " - dollar  " + "\n"+ e + " - euro " + "\n" + l +" - libra"+ "\n"+ p + " - peso" );
        System.out.println("qual a moeda que o senhor deseja converter?");
        c = t.nextInt();

        switch (c) {
            case 1:
                if(c == d){
                 double v2 = v*5;
                 System.out.print(v2);
                }
                break;
            case 2:
            if(c == e){
                double e2 = v*6;
                System.out.print(e2);
                
               }
               break;
            case 3:
            if(c == l){
                double l2 = v*7;
                System.out.print(l2);
               }   
               break;
            case 4:
            if(c == p){
                double p2 = v*5;
                System.out.print(p2);
                break;
               }   
        }













    }

}
