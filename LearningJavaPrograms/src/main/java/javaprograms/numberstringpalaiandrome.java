package javaprograms;

import java.util.Scanner;

public class numberstringpalaiandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String orginal,reverse="";
System.out.println("Enter an string/number :");
Scanner sc=new Scanner(System.in);
orginal=sc.next();
int length=orginal.length();
for(int i=length-1;i>=0;i--)
	reverse=reverse+orginal.charAt(i);
if(orginal.equals(reverse)) {
	System.out.println("palaiandrome");
}else
{
	System.out.println("not palaiandrome");
}
	}

}
