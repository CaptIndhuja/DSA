import java.util.Arrays;

class MoveTens{
	static void rotate(int[] arr, int n) {
		n=n%arr.length;
		System.out.println(n);
		while(n>0) {
			int temp = arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i] = arr[i-1];
			}
			arr[0]=temp;
			n--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		rotate(arr,7);
		System.out.println(Arrays.toString(arr));
	}
}