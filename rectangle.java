package example;
import java.util.Scanner;
public class rectangle {
	public static int area(int length,int width) {
		int A;
		A=length*width;
		return A;
	}
		public static void main(String[] args) {
			Scanner Sc=new Scanner(System.in);
			int length,width;
			System.out.println("enter length in meters:");
			length=Sc.nextInt();
			System.out.println("enter width in meters:");
			width=Sc.nextInt();
			int area=area(length,width);
			System.out.println("rectangle area is:"+area);
			int parimeter=(length+width)*2;
			
			System.out.println("rectangle parimeter is:"+parimeter);
		
	}

}
