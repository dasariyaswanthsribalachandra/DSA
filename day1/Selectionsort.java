import java.util.*;

public class Selectionsort{
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){   
                if(arr[i]>arr[j]){         
                      arr[i]=arr[i]+arr[j];
                      arr[j]=arr[i]-arr[j];
                      arr[i]=arr[i]-arr[j];
                }
            }
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
        
        SelectionSort(arr1);
        
        System.out.print("Sorted array: ");
        for(int i=0;i<a;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}

