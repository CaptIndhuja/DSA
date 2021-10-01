import java.util.*;

class RotateArray{
	public static void moveTens(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> tens = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%10==0 && arr[i]!=0)
				tens.add(arr[i]);
			else
				list.add(arr[i]);
		}
		int temp = arr.length,i=0;
		for(i=0;i<list.size();i++)
			arr[i]=list.get(i);
		for(int j=0;j<tens.size();j++)
			arr[i++]=tens.get(j);
	}
	public static void main(String[] args) {
		int[] arr = {10,12,36,30,0,24,20,14,10,12,19,90,87,20,58};
		moveTens(arr);
		System.out.println(Arrays.toString(arr));
	}
}