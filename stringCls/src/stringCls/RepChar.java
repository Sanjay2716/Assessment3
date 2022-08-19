package stringCls;

import java.util.Scanner;

public class RepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]+" ");
				}
				else
					System.out.println("No Repeating");
			}
		}

	}

}
