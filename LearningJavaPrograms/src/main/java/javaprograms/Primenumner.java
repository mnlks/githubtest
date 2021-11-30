package javaprograms;

public class Primenumner {

	public static void main(String[] args) {
		int n=11;
        boolean prime=true;
        for(int i=2;i<n;i++) {
        	if(n%i==0)
        	{
        		prime=false;
        		break;
        	}
        }
        if(prime==true)
        {
 System.out.println("Its an prime number");
 
	}else
	{
		 System.out.println("Its not an prime number");
		 
	}

}
}
