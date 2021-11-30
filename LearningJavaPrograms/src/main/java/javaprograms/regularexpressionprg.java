package javaprograms;

public class regularexpressionprg {

	public static void main(String[] args) {
		String str="this is234 #$^#";
		String str1;
		//This will delete non digits digits
		str1=str.replaceAll("\\D+", "");
		System.out.println("This will delete non digit : " + str1);

		//This will delete digits in the given string
		str1 = str.replaceAll("\\d+", "");
		System.out.println("This will delete  digit : " + str1);

		//This will delete white space in the given string
		str1 = str.replaceAll("\\s+", "");
		System.out.println("This will delete white space : " + str1);
		

		//This will delete non white space in the given string
		str1 = str.replaceAll("\\S+", "");
		System.out.println("This will delete non whitespace : " + str1);
		
		//This will delete words in the given string
		str1 = str.replaceAll("\\w+", "");
		System.out.println("This will delete word : " + str1);
				
		//This will delete non word space in the given string
		str1 = str.replaceAll("\\W+", "");
		System.out.println("This will delete non word : " + str1);
	}

}
