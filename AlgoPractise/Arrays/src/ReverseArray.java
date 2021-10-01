import java.util.Arrays;
// O(n) & O(1)
class ReverseArray{
	static void reverse(int[] arr) {
		int n= arr.length-1;
		for(int i=0;i<=n/2;i++) {
			int temp = arr[n-i];
			arr[n-i] = arr[i];
			arr[i] = temp;
		}
	}
	static void reverseRecursive(int[] arr,int start,int end) {
		if(start>end)
			return;
		int temp = arr[start];
		arr[start++] = arr[end];
		arr[end--] = temp;
		reverseRecursive(arr,start,end);
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(Arrays.toString(arr));
		//reverse(arr);
		reverseRecursive(arr,0,arr.length-1);
		System.out.println("Result: "+Arrays.toString(arr));
	}
}