package codeforces;

import java.util.Scanner;

public class CountPairs {
	static int n,p,k;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = sc.nextInt();
		k = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(pairs());
	}
	
	public static int pairs() {
		int cnt = 0;
		k++;
		for (int i = 0; i <= n; i++) {
			for (int j = i+1; j <= n; j++) {
				if (j >= arr.length) {
					break;
				}
				int ai = arr[i];
				int aj = arr[j];
				System.out.println("ai : "+ai);
				System.out.println("aj : "+aj);
				
				int temp1 = (int) ((ai+aj)*(Math.pow(ai, 2)+Math.pow(aj, 2)));
				int temp2 = (int) Math.pow(k++, p);
				
				System.out.println("temp1 : "+temp1);
				System.out.println("temp2 : "+temp2);
				if (temp1 == temp2) {
					System.out.println("¿©±â ¿È?");
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	
}
