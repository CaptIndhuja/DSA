import java.util.*;
class EncryptDecryptString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to Encode");
		String s1 = sc.next();
		System.out.println("Enter string to Decode");
		String s2 = sc.next();
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();

		for(int i=0;i<s1.length();i++) {
			char s =str1[i];
			if(str1[i]==' ')
				continue;
			else if(s >=65 && s <=90 || s>=97 && s<=122)
				str1[i] = (char) (Integer.valueOf(s)+5);
			else{
				System.out.println("Invalid String");
				return;
			}
		}
		for(int i=0;i<s2.length();i++) {
			char s =str2[i];
			if(str2[i]==' ')
				continue;
			else if(s >=65 && s <=90 || s>=97 && s<=122)
				str2[i] = (char) (Integer.valueOf(s)-5);
			else {
				System.out.println("Invalid String");
				return;
			}
		}
		s1 = String.valueOf(str1);
		s2 = String.valueOf(str2);
		System.out.println(s1+ " " + s2);
	}
}