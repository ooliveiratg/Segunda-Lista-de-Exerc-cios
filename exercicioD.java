package lições.segundaLista;
import java.util.Scanner;

public class exercicioD {
    public static void main(String[] args) {
    
 Scanner sc = new Scanner(System.in);

double a,b,c,delta,x1,x2,t;

System.out.print("digite o valor de A: ");
a = sc.nextDouble();

System.out.print("digite o valor de B: ");
b = sc.nextDouble();

System.out.print("digite o valor de C: ");
c = sc.nextDouble();

delta = b*b -4*a*c;

x1 =  (-b + Math.sqrt(delta))/(2*a);

x2 = (-b - Math.sqrt(delta))/(2*a);

System.out.println("esse é o valor do delta: " + delta);

if(delta<0){
    System.out.print("não a resolução");
}else{
    if(delta == 0){
        System.out.print("a apenas um valor: " + x1);
    }else{
        System.out.print("o valor de x1 = " + x1 +" \no valor de x2 é = " + x2);
    }
}



 
}
}