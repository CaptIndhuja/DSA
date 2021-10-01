import java.util.*;

class RepeatedDigits{
	private static boolean isDigitRepeated(int i) {
		HashSet<Integer> elem = new HashSet<>();
		while(i!=0) {
			if(elem.contains(i%10))
				return true;
			else {
				elem.add(i%10);
				i/=10;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int l=11000,r=1500000,count=0;
		for(int i=l;i<=r;i++) {
			if(!isDigitRepeated(i))
				count++;
		}
		System.out.println(count);
	}
}