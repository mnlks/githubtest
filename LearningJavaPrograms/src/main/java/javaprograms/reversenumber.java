package javaprograms;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=987,reverse=0,lastdigit;

while(n>0)
{
	lastdigit =n%10;
	reverse= reverse *10 + lastdigit;
	n=n/10;
}
System.out.println(reverse);
	}

}
