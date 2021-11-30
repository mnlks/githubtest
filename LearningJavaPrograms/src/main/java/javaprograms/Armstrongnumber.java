package javaprograms;

public class Armstrongnumber {
public static void main(String[] args) {
	int n=153;
	int orginal=n;
	int temp,armstrong=0;
	while(n>0)
	{
		temp=n%10;
		temp= (int) Math.pow(temp,3);
		armstrong=armstrong+temp;
		 n=n/10;
		
	}
	if(orginal==armstrong) {
		
		System.out.println("Its an armstrong number");
	}
		else
		{
			System.out.println("Its not an armstrong number");
			
	}
}
}
