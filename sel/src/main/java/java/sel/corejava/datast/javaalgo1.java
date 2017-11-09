package java.sel.corejava.datast;

import java.io.*;
import java.util.*;

public class javaalgo1{
	
	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// System.out.println(factorial(n));
		// System.out.println(fibonacci(n));
		// for (int i=1;i==n;i++){
		// 	System.out.println(factorial(i));
		// 	}

		// for (int i=1;i==n;i++){
		// 	System.out.println(fibonacci(i));
		// 	}
		// System.out.println(isPrime(n));
		String s=sc.nextLine();
		System.out.println(reversal(s));

	}

private static int factorial(int n) {
	/* fac(n)=n*n-1*n-2....1 */
if (n<2){
	return 1;
	}
	else if (n==2) {
		return n;
	}
	else {return n*factorial(n-1);}
}

private static int fibonacci(int n ){
	/* 1,2,3,5 ....,n-2+n-1*/
	if (n==0){
		return 1;
		}
	else if (n<=2) {
		 	return n;
		 }
	else {
			return fibonacci(n-2)+fibonacci(n-1);
		 }
		}

private static boolean isPrime(int n){
	/* n%2==0*/
	
	for (int i=1;i<n;i++){
		if (n%i==0) return false;
	}
	
	return true;

	}

private static String reversal(String s){
	/*String to char Array and rev the array
	* Arrays.toString() to convert back to String
	*/
	char[] charArray=s.toCharArray();
	//charArray=s.split();
	char temparray;
	int start=0;
	int end=charArray.length-1;
	for (start=0;start<end;start++,end--){
		temparray=charArray[end];
		charArray[end]=charArray[start];
		charArray[start]=temparray;
		}
		return Arrays.toString(charArray);
	}


}