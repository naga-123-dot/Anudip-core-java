package simpleinterest;
import java.util.Scanner;
public class amountcalculator {
	public static float calculatesimpleinterest(float principle,float rate,int time) {
		float si;
		si=(principle*rate*time)/100;
		return si;
		}
	//method to calculate simple interest
  public static void main(String[] args) {
	  Scanner Sc=new Scanner(System.in);
	  float principle,rate;
	  int time;
	  System.out.println("enter princeple in Rs:");
	  principle=Sc.nextFloat();
	  System.out.println("enter rate in %:");
	  rate=Sc.nextFloat();
	  System.out.println("enter time in year:");
	  time=Sc.nextInt();
	  float interest=calculatesimpleinterest(principle,rate,time);
	  float amount=principle+interest;
	  System.out.println("-----------------------------------");
	  System.out.println("amount to be paid after changing simple interest:Rs"+amount);
	 }
}
