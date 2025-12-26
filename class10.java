package cgu;
import java.util.*;
public class class10 {
	public int lengthOfLastWord(String s) {

        // s=s.trim();
        // int count=0;
        // for(char ch:s.toCharArray()){
        //     count++;
        //     if(ch==' '){
        //            count=0;
        //     }

        // }
        // return count;

        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
            count++;
           else return count;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*58. Length of Last Word
		Given a string s consisting of words and spaces, return the length of the last word in the string.

		A word is a maximal substring consisting of non-space characters only.*/
		
		/*14. Longest Common Prefix
             Write a function to find the longest common prefix string amongst an array of strings.
             If there is no common prefix, return an empty string "".*/
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		class10 obj=new class10();
		int size=obj.lengthOfLastWord(s);
		System.out.println("last word size is:"+size);
		
		

	}

}
