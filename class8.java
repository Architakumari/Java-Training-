package cgu;
import java.util.*;
public class class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IN 2D ARRAY [][] FIRST [] IS NO OF ROWS AND 2ND [] IS NO OF COLUMN
		//int[][] a= {{1,2,3},{5,6,4},{7,8,9}};
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no of rows");
//		int r=sc.nextInt();
//		System.out.println("Enter no of columns");
//		int c=sc.nextInt();
//		int[][] a=new int[r][c];
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println(); //printing rowwise
//		}
		
		//read two matrix of same dim and add the matrix and print result
		//leetcode question no 1
		
		System.out.print("Enter no of rows ");
		int r=sc.nextInt();
		System.out.print("Enter no of columns ");
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		int[][] b=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print((a[i][j]+b[i][j])+" ");
			}
			System.out.println(); //printing rowwise
		}

	}

}
