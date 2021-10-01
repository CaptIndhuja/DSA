import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SelectionSort{
	static List<Integer> selectionSort(List<Integer> arr){
		int smallest,i,j;
		for(i=0;i<arr.size()-1;i++) {
			smallest =i;
			boolean needsSwap = false;
			for(j=i+1;j<arr.size();j++) {
				if(arr.get(j)<arr.get(smallest)) {
					smallest = j;
					needsSwap= true;
				}
			}
			if(needsSwap) {
				int temp = arr.get(smallest);
				arr.set(smallest,arr.get(i));
				arr.set(i, temp);
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, 10,20,40,8,2,6,5,49,7,3);
		System.out.println("Before Sorting :"+(arr));
		System.out.println("After Sorting  :"+selectionSort(arr));
	}
}