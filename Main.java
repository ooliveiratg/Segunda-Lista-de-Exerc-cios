package lições.segundaLista;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Scanner sc = new Scanner(System.in);
        double a ,b ,c ,d ,r;
    a=2; 
    b=3;
    c=5;
    d=9;
    if(d>5) {
        r=(a+b)*d;
    } else{
        r= (a-b)/c;
    }
System.out.println(r);



                                             //exercicio b

System.out.println("bem vindo ao exercicio B ");
   if((a>2) && b<7){
    r =  (a + 2) * (b - 2);
   }else{
    r = (a + b) / d * (c + d);
   }
   System.out.println(df.format(r));


System.out.println("exercicio c");

if((a == 2) || (b < 7)){
r =  (a + 2) * (b - 2);
} else{
    r =  (a + b) / d * (c + d);



}
System.out.println(r);
}
}