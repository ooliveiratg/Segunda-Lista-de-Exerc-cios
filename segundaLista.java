package lições.segundaLista;
import java.util.Scanner;







public class segundaLista {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int a,r;

System.out.print("digite um valor: ");
a= sc.nextInt();
r = a%2; 

if(r == 0){
    if(a>0){
        System.out.println(a + " seu numero é par e positivo");
    } if (a<0) {
        System.out.println(a + " seu numero é par e negativo");
        
    }


}
if(r != 0 ){
if(a<0){
    System.out.println(a + " seu numero é impar e negativo");
}if(a>0){
    System.out.println(a + " seu numero é impar e positivo");
}
}


}
}