import java.util.*;
class RemoveDuplicate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		int n = str.length();
		//str = str.toLowerCase();
		for(int i=0;i<n;i++) {
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i), 1);
		}
		String result="";
		for(char i : map.keySet())
			result+=String.valueOf(i);
		System.out.println(result);
			
	}
}