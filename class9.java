package cgu;
import java.util.*;
public class class9 {
	
	    public int[] productExceptSelf(int[] nums) {
	        int n=nums.length;
	        int[] ans=new int[n];
	        int right=1;
	         ans[0] = 1;
	        for(int i=1;i<n;i++){
	            ans[i]=ans[i-1]*nums[i-1];
	        }

	        for(int i=n-1;i>=0;i--){
	            ans[i]=ans[i]*right;
	            right*=nums[i];
	        }
	        
	        return ans;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//238. Product of Array Except Self
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
		}
		
		class9 obj=new class9();
		 
		int[] result = obj.productExceptSelf(arr);
	    for (int i= 0; i < result.length; i++) {
	        System.out.print(result[i] + " ");
	    }
	}
	
		

	}

