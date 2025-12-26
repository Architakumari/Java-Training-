package cgu;
import java.util.*;

public class class7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		//ARRAYS-COLLECTION OF SIMILAR DATA ELEMENTS
		//in java we have only reference so array index may or may not be in contiguous manner
		//variable is stored in stack and its value in heap memory and variable is referring to that value
		
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
		}
//		Arrays.sort(arr);
//		for(int i=0;i<n;i++) {
//		System.out.print(arr[i]+" ");
//		
//		}
//		System.out.println();
//		int[] a= {1,2,3,4,5,6,7,8};
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
		//Array of n elements and print odd indexed elements
//		for(int i=1;i<n;i+=2) {
//			System.out.print(arr[i]+" ");
//			}
		
		
		
		//Array of n elements and print the sum of perfect square
		int sum=0;
		for(int i=0;i<n;i++) {
//			double sq=Math.sqrt(arr[i]);
//			if(sq%1==0) {
			int sq=(int)Math.sqrt(arr[i]);
			if(sq*sq==arr[i]) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		sc.close();

	}

}
