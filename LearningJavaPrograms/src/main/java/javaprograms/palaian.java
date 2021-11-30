package javaprograms;
import java.util.Scanner;
public class palaian {

	public static void main(String[] args) {
		String str;
		String rev="";
		char[] chr;
		System.out.println("Enter an String");
		Scanner sn=new Scanner(System.in);
		str=sn.next();
		chr = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("its an palaiandrome");
		}else
		{
			System.out.println("its not an palaiandrome");
		}
				
	}

	}


