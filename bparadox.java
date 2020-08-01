import java.util.*;
import java.io.*;
import java.math.*;

class bparadox{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("1.People or 2.Probability");
		int n = num.nextInt();
		if(n==1){
			double p = num.nextDouble();
			System.out.println(Math.ceil(Math.sqrt(2*365*Math.log(1/(1-p)))));
		}
		if(n==2){
			int m = num.nextInt();
			System.out.println(1-Math.pow(2.718,-(m*m)/(2*365)));
		}
	}
}