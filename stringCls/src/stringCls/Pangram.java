package stringCls;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		String s1=sc.nextLine();
		int index=0;
		boolean pangram=true;
		boolean[] mark=new boolean[26];
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
				index=s1.charAt(i)-'A';
			}
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				index=s1.charAt(i)-'a';
			}
			mark[index]=true;
		}
		for(int i=0;i<mark.length;i++) {
			if(mark[i]==false) {
				pangram=false;
			}
		}
		if(pangram) {
			System.out.println("Given Sentance Is Pangram");
		}
		else
			System.out.println("Given Sentance Is Not Pangram");
	}

}
