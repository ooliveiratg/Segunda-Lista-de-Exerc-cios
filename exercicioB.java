package lições.segundaLista;

import java.util.Scanner;

public class exercicioB {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 double a, b,c,d,e, t;

System.out.print("digite o valor que deseja subtrair: ");
 a= sc.nextInt();
 System.out.println("digite o outro valor: ");
 b= sc.nextInt();
 
t = a-b;

 if(t<0){
    System.out.print("result: " + t*-1);
 }else{
    System.out.print("result: " + t);
 }
}
}