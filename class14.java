package cgu;
import java.util.*;

public class class14 {
	
	public static void swap(int[] arr,int x,int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void insertion_sort(int[] arr,int n) {
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void bubble_sort(int[] arr,int n) {
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n-i;j++) {
			if(arr[j-1]>arr[j]) {
//				temp=arr[j-1];
//				arr[j-1]=arr[j];
//				arr[j]=temp;
				swap(arr,j-1,j);
			}
		}
		}
	}
	//https://onlinegdp.com//cPAx3Edjk
	
	public static void selection_sort(int[] arr,int n) {
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}	
			}
			swap(arr,minindex,i);
		}
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
	    if(left < right) {
	        int mid = (left + right) / 2;

	        mergeSort(arr, left, mid);
	        mergeSort(arr, mid + 1, right);

	        merge(arr, left, mid, right);
	    }
	}

	public static void merge(int[] arr, int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    int[] L = new int[n1];
	    int[] R = new int[n2];

	    for(int i = 0; i < n1; i++)
	        L[i] = arr[left + i];
	    for(int j = 0; j < n2; j++)
	        R[j] = arr[mid + 1 + j];

	    int i = 0, j = 0, k = left;

	    while(i < n1 && j < n2) {
	        if(L[i] <= R[j])
	            arr[k++] = L[i++];
	        else
	            arr[k++] = R[j++];
	    }

	    while(i < n1)
	        arr[k++] = L[i++];

	    while(j < n2)
	        arr[k++] = R[j++];
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SORTING-BUBBLE,SELECTION , INSERTION ,MERGE SORT
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		//insertion_sort(arr,n);
		//bubble_sort(arr,n);
		selection_sort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
