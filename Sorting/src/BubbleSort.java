import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BubbleSort{
	static List<Integer> bubbleSort(List<Integer> arr){
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.size()-i-1;j++) {
				if(arr.get(j)>arr.get(j+1)) {
					int temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, 10,20,40,8,2,6,5,49,7,3);
		System.out.println("Before Sorting :"+(arr));
		System.out.println("After Sorting  :"+bubbleSort(arr));
	}
}