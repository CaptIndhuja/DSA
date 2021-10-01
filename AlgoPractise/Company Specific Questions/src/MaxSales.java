import java.util.*;
class MaxSales{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] input = new int[n][m];
		int[] result = new int[n];
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				input[i][j] = sc.nextInt();
				if(max<input[i][j])
					max = input[i][j];
			}
			result[i] = max;
			max=0;
		}
		System.out.println(Arrays.toString(result));
	}
}