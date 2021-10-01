import java.util.*;
class sumZeroArray{
	public static void main(String[] args) {
		System.out.print("Enter Array Size :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum += arr[j];
				if(sum == 0) {
					System.out.println(1);
					return;
				}
			}
			sum=0;
		}
		System.out.println(0);
 	
	}
}