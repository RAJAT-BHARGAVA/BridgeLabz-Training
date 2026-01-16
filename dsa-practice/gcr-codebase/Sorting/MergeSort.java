package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid=left+(right-left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	public static void merge(int[] arr, int left, int mid, int right) {
		int n1=mid-left+1;
		int n2=right-mid;
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		System.arraycopy(arr,left,arr1,0,n1);
		System.arraycopy(arr, mid+1, arr2, 0, n2);
		int i=0,j=0,k=left;
		while(i<n1 && j<n2) {
			if(arr1[i]<=arr2[j]) {
				arr[k++]=arr1[i++];
			}else {
				arr[k++]=arr2[j++];
			}
		}
		while(i<n1) arr[k++]=arr1[i++];
		while(j<n2) arr[k++]=arr2[j++];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of books: ");
		int numberOfBooks=sc.nextInt();
		int[] prices=new int[numberOfBooks];
		System.out.println("Enter the prices of books: ");
		for(int i=0;i<numberOfBooks;i++) {
			prices[i]=sc.nextInt();
		}
		mergeSort(prices,0,numberOfBooks-1);
		System.out.println(Arrays.toString(prices));
		sc.close();
	}
}
