import java.util.Arrays;

class MoveNegative{
	static void moveNegative(int[] arr) {
		int left=0,right = arr.length-1;
		while(left<=right) {
			if(arr[right] < 0 && arr[left]>0) {
				swap(arr,left,right);
				right--;
				left++;
			}
			else if(arr[left] <0)
				left++;
			else if(arr[right]>=0)
				right--;
		}
	}
	static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {-2,-8,8,9,7,4,-9,-1,-5,6,9,-4};
		System.out.println(Arrays.toString(arr));
		moveNegative(arr);
		System.out.println(Arrays.toString(arr));
	}
}