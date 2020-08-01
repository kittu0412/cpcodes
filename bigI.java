import java.util.*;
import java.io.*;
import java.math.*;

class bigI{
	public static void main(String args[]){
		int n = 100;
		BigInteger f = new BigInteger("1");
		
		int i; 
		for(i=2;i<=n;i++){
			f = f.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(f);
	}
}