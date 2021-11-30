package javaprograms;

import java.util.Scanner;

public class paliandrome {
	public static void manin(String[] args) {
		String str;
		String rev="";
		//char[] chr;
		System.out.println("Enter an String");
		Scanner sn=new Scanner(System.in);
		str=sn.next();
		char[] chr = str.toCharArray();
		
		for(int i=str.length();i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		if(str==rev) {
			System.out.println("its an palaiandrome");
		}else
		{
			System.out.println("its not an palaiandrome");
		}
				
	}


}
