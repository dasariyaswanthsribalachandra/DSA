import java.util.*;

class LinearSearch {
    public int search(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt();
        LinearSearch obj=new LinearSearch();
        System.out.println(obj.search(arr,target));
    }
}
