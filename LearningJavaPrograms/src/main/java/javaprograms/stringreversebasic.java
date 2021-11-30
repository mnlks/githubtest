package javaprograms;

public class stringreversebasic {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String str="this is good";
		
		System.out.println(str);
		
		
		stringreversebasic obj=new stringreversebasic();
		obj.reverse(str);
		obj.reversesb(str);
		
		
	}

	public static void reverse(String str) {
		// TODO Auto-generated method stub
		int count=str.length();
		for(int i = count-1;i>=0;i--) {
			String temp = "";
			temp= temp+ str.charAt(i);
			System.out.println(temp);
					}
		
	}
		
	public static void reversesb(String str) {
			// TODO Auto-generated method stub
			StringBuffer sb= new StringBuffer(str);
			sb.reverse();
			System.out.println(sb);
			
			
		}
	
	
		
}



//