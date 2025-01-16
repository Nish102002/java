package series;
import java.util.Scanner;
public class S1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number: ");
    int y=sc.nextInt();
    int h=y%5 ;
    int g=y-h;
    System.out.println(g);
}
}
