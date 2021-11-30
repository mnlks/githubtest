package javaprograms;
//To sort an given array
public class sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {35,34,20,99};

for(int i=0;i<arr.length;i++)
{
	for(int j=i;j<arr.length;j++)

{
		int temp=0;
		if (arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}

}
	
}
	for(int e:arr) {
		System.out.println(e);
	}
	}

}
