import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner inp= new Scanner(System.in);

     System.out.print("Bir sayı giriniz = ");
     int x= inp.nextInt();

     int y,toplam=1;

     for (y=1;y<=x;y++){
         toplam=toplam*y;
         System.out.println(toplam);
     }



    }
}