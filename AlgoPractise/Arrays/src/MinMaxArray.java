import java.util.Arrays;

class MinMaxArray{
	//O(n) & O(1)
	static int[] minMax(int[] arr) {
		int[] result = new int[2];
		int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		result[0] = min;
		result[1] = max;
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(Arrays.toString(arr));
		System.out.println("Result: "+Arrays.toString(minMax(arr)));
	}
}