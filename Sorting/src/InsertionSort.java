import java.util.*;
class InsertionSort{
	static List<Integer> insertionSort(List<Integer> arr){	
		for(int i=0;i<arr.size();i++) {
			int j = i;
			while(j>0 && arr.get(j)<arr.get(j-1)) {
				int temp = arr.get(j);
				arr.set(j,arr.get(j-1));
				arr.set(j-1, temp);
				j--;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, 10,20,40,8,2,6,5,49,7,3);
		System.out.println("Before Sorting: "+(arr));
		System.out.println("After Sorting:  "+insertionSort(arr));
	}
}