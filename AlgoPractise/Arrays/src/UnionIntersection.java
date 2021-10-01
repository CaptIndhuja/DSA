import java.util.*;
class UnionIntersection{
	static int[] union(int[] arr1,int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> finalSet = new HashSet<>();
		for(int i=0;i<arr1.length;i++)
			set.add(arr1[i]);
		for(int i=0;i<arr2.length;i++)
			set.add(arr2[i]);
		java.util.Iterator<Integer> iter = set.iterator();
		int[] result = new int[set.size()];
		int j=0;
		while(iter.hasNext()) {
			result[j] = iter.next();
			j++;
		}
		return result;
	}
	static int[] intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> finalSet = new HashSet<>();
		for(int i=0;i<arr1.length;i++)
			set.add(arr1[i]);
		for(int i=0;i<arr2.length;i++) {
			if(set.contains(arr2[i])) 
				finalSet.add(arr2[i]);
		}
		java.util.Iterator<Integer> iter = finalSet.iterator();
		int[] result = new int[finalSet.size()];
		int j=0;
		while(iter.hasNext()) {
			result[j] = iter.next();
			j++;
		}
		return result;
	}
	public static void main(String args[]) {
		int[] arr1 = {10,2,3,5,4,6,6,6,7,8};
		int[] arr2 = {2,4,5,5,6};
		System.out.println(Arrays.toString(union(arr1,arr2)));
		System.out.println(Arrays.toString(intersection(arr1,arr2)));

	}
}