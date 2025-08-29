import java.util.*;

public class Bubblesort {
  public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) break;
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
        
        bubbleSort(arr1);
        
        System.out.print("Sorted array: ");
        for(int i = 0; i < a; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
