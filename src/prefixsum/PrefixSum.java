package prefixsum;

import java.util.Scanner;

public class PrefixSum {

	public static void prefixSum(int array[],int size) {
		int[] P = new int[size];
		P[0] = array[0];
		for(int i=1;i<size;i++) {
			P[i] = P[i-1]+array[i];
		}
		for(int i=0;i<size;i++) {
			System.out.print(P[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		prefixSum(array,n);
	}
}
