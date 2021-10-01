import java.util.Arrays;

class Sort012{
	static void sort012(int[] arr) {
		int left=0,right=arr.length-1,mid=0;
		while(mid<=right) {
			switch(arr[mid]) {
			case 0 : swap(arr,mid,left);
						mid++;
						left++;
						break;
			case 1: mid++;
					break;
			case 2: swap(arr,mid,right);
					right--;
					break;
			}
		}
		
	}
	static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,0,0,2,0,2,1,1,2,2,0,1,2};
		System.out.println(Arrays.toString(arr));
		sort012(arr);
		System.out.println("Result: "+Arrays.toString(arr));
	}
}