package stringCls;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		String s1=sc.nextLine();
		System.out.println("Enter The Second String");
		String s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(c1.length!=c2.length) {
			System.out.println("The Two Strings Are Not Anagram");
		}
		for(int i=0; i<c1.length;i++) {
			if(c1[i]==c2[i]) {
				System.out.println("The Two Strings Are Not Anagram");
			}
			else
				System.out.println("The Two Strings Are Anagram");
		}
	}

}
