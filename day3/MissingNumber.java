import java.util.*;

class MissingNumber {
    public int missingNumber(int arr[]) {
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++) sum+=arr[i];
        return ((n+1)*(n)/2)-sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        MissingNumber obj=new MissingNumber();
        System.out.println(obj.missingNumber(arr));
    }
}
