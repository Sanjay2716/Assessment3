package stringCls;

import java.util.Scanner;

public class StringCls {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an String:");
	String s1=sc.nextLine();
	String s2=" ";
	for(int i=s1.length()-1 ; i>=0; i--) {
		s2=s2+ (char) (s1.charAt(i));
	}
	System.out.println(s2);
	}

}
