package example;
import java.util.Scanner;
public class addition {
	public static int sum(int a,int b) {
		int add;
		add=a+b;
		return add;
	}
 public static void main(String[] args) {
			Scanner Sc=new Scanner(System.in);
			int a,b;
			System.out.println("enter number a:");
	        a=Sc.nextInt();
	        System.out.println("enter number b:");
	        b=Sc.nextInt();
	        int sum=sum(a,b);
	        int positive=sum(a,b);
	        if(sum>0) {
	        	System.out.println("positive");}
	        else	{
	        	System.out.println("not positive");
	        System.out.println("calculation:"+sum);
	        
		}
	}

}
