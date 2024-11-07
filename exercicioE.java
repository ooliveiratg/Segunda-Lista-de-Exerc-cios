package lições.segundaLista;
import java.util.Scanner;

public class exercicioE {
public static void main(String[] args) {
    
 Scanner sc = new Scanner(System.in);
 int a,b,c,t,r,g;

System.out.print("digite o valor de A: ");
a = sc.nextInt();

System.out.print("digite o valor de B: ");
b = sc.nextInt();

System.out.print("digite o valor de C: ");
c = sc.nextInt();


// if(a>b && a>c){
//     System.out.print(a);
// }if(b>c){
//     System.out.print(b);
// }else{
//     System.out.print(c);
//     if(b>c && b>a){
//         System.out.print(b);
//     }if(a>c){
//         System.out.print(a);
//     }
//         System.out.print(c);
//         if(c>a && c>b){
//             System.out.print(c);
//         }if(a>c){
//             System.out.print(b);
//         }else{
//             System.out.print(a);
//         }
// }
if(a>b && b>c){
    System.out.println(c);
    System.out.println(b);
    System.out.println(a);
}if(b>c && c>a){
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
}if(c>a && a>b){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
}if(a>c && c>b){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
}if(b>a && a>c){
    System.out.println(c);
    System.out.println(a);
    System.out.println(b);
}if(c>b && b>a){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}else if(a==b && b==c && a==c){
    System.out.println("para de ser doente");
}
        




}
}