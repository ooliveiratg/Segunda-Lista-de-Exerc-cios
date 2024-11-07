package lições.segundaLista;
import java.util.Scanner;

public class exercicioC {
    public static void main(String[] args) {
        double a, b,c,d,e, t;
 Scanner sc = new Scanner(System.in);

System.out.print("nota de trabalho: ");
 a= sc.nextDouble();
 System.out.print("nota de prova: ");
 b= sc.nextDouble();
 System.out.print("nota de participação: ");
 c= sc.nextDouble();
 System.out.print("nota de entrega: ");
 d= sc.nextDouble();
 
 t = (a+b+c+d)/4;

if(t>=7){
 System.out.println("passou aeee");
}else{
    System.out.print("nota de recuperação: ");
     e= sc.nextInt();
     double recuperação = (t+e)/2;
    if(recuperação>=7){
        System.out.print("passou, quase reprovou seu burro");
    }else{
        System.out.print("reprovado burro dms");
    }
}
}
}
