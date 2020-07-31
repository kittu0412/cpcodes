import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class permutation{   
	static BigInteger factorial(int N) 
    {  
        BigInteger f = new BigInteger("1");
		
        for (int i = 2; i <= N; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f; 
    } 
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		int t = num.nextInt();
		int i;
		for(i=0;i<t;i++){
			int n = num.nextInt();
			int m = num.nextInt();
			BigInteger A  = BigInteger.valueOf(1000000007);
			System.out.println((factorial(n+m-1).divide(factorial(n).multiply(factorial(m-1)))).remainder(A));
		}
	}
}