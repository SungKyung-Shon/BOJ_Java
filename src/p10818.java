import java.util.Scanner;

public class p10818 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
				
		}
		System.out.printf("%d %d",min,max);
		scanner.close();
	}

}
