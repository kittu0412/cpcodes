import java.util.*;
import java.io.*;
import java.math.*;

class mpower{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();
		int y = num.nextInt();
		int p = num.nextInt();
		
		int r = 1;
		
		x = x%p;
		
		if(x==0){
			System.out.println("0");
		}
		else{
			while(y>0){
			
				if(y%2!=0){
					r = (r*x)%p;
				}
			
				y = y/2;
				x = (x*x)%p;
			}
		
			System.out.print(r);
		}
	}
}
