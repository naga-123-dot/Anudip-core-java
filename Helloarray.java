package hello;
import java.util.Scanner;

public class Helloarray {
  public static void main(String[] args) {
   Scanner Sc=new Scanner(System.in);
   int[] numbers=new int[15];
   System.out.println("please enter 15 numbers");
   for( int i=0;i<numbers.length;i++) {
	   System.out.println(+(i+1)+":");
	   numbers[i]=Sc.nextInt();
   }
   int sum=0;
   for(int number:numbers) {
	   sum+=number;
   }
   float average=(float)sum/numbers.length;
   System.out.println("the average of the number is:"+average);
   Sc.close();
  }
}