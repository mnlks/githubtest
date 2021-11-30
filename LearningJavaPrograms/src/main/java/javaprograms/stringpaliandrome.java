package javaprograms;

import java.util.Scanner;

public class stringpaliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,rev="";
		char[] chr;
		System.out.println("Enter an String");
		Scanner sn=new Scanner(System.in);
		str=sn.next();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		if (rev.equals(str)) {
			System.out.println("string is an paliandrome");
		} else
		{
			System.out.println("string is not an paliandrome");
		}
	}

}
