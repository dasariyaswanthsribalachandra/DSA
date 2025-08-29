import java.util.Scanner;

public class Insertionsort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.print("Enter elements: ");
        for(int i = 0; i < a; i++){ 
            arr1[i] = sc.nextInt();
        }
        
        insertionSort(arr1);
        
        System.out.print("Sorted array: ");
        for(int i=0;i<a;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
