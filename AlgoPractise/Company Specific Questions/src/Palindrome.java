import java.util.*;

class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		boolean isPali = true;
		for(int i=0;i<=n/2;i++) {
			if(str.charAt(i) != str.charAt(n-1-i))
				isPali = false;
		}
		if(isPali)
			System.out.println(1);
		else
			System.out.println(0);
	}
}