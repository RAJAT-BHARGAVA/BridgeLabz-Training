import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps occurred
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the total student count :");
        int size = sc.nextInt();
        int [] marks = new int[size];
        for(int i =0 ;i<size ;i++){
            marks[i]= sc.nextInt();
        }
        bubbleSort(marks);
        for(int i =0 ;i<size ;i++){
            System.out.println(marks[i]);
        }
        
    }
}
