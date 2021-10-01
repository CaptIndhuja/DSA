import java.util.Arrays;

class Accolite_Count_Bucket_Question{
	static int min_operations(int[] arr) {
		int result=0,n=arr.length;
		while(true) {
			int i=0,zero_count=0;
			//loop until u get the first odd element
			//and count the number of zeros
			for(i=0;i<n;i++) {
				if(arr[i]%2 == 1)
					break;
				else if(arr[i]==0) {
						zero_count++;
					}
			}
			
			//if all elements are zero then return result
			if(zero_count==n) return result;
			//if no odd element found then just divide all element by 2
			//and increment result by once
			if(i==n) {
				for(int j=0;j<n;j++) {
					arr[j]/=2;
				}
				result++;
			}
			//decrement all odd numbers by 1 to make it even 
			// and increment result for each decrement 
			for(int j=i;j<n;j++) {
				if(arr[j]%2==1) {
					arr[j]--;
					result++;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {16,16,16};
		System.out.println(min_operations(arr));
	}
}