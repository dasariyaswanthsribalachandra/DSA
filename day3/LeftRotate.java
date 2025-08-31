import java.util.*;

class LeftRotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++, j++) temp[j] = nums[i];
        for (int i = 0; i < n - k; i++, j++) temp[j] = nums[i];
        for (int i = 0; i < n; i++) nums[i] = temp[i];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int d=sc.nextInt();
        LeftRotate obj=new LeftRotate();
        obj.rotate(arr,d);
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
