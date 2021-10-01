import java.util.Arrays;
class KthMaxAndMin{
	static int[] kthMinMax(int[] arr, int k) {
		int[] result = new int[2];
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		result[1] = arr[arr.length-k];
		result[0] = arr[k-1];
		return result;
	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void quickSort(int[] arr,int start, int end) {
		int pivot = start,l=start+1,r = end;
		if(start>end)
			return;
		while(l<=r) {
			if(arr[l]>arr[pivot] && arr[r]<arr[pivot])
				swap(arr,l,r);
			else if(arr[l]<=arr[pivot])
				l++;
			else
				r--;
		}
		swap(arr,pivot,r);
		quickSort(arr,r+1,end);
		quickSort(arr,start,r-1);
		
	}
	public static void main(String[] args) {
		int[] arr = {6,96,8,9,1,2,96,96,4,6,5,13,15,1,19,12};
		System.out.println(Arrays.toString(arr));
		System.out.println("Result: "+Arrays.toString(kthMinMax(arr,3)));
		System.out.println("Result: "+Arrays.toString(kthMinMax(arr,4)));
	}
}