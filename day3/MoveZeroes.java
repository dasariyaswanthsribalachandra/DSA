import java.util.*;

class MoveZeros {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(;j<nums.length;j++) nums[j]=0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        MoveZeros obj=new MoveZeros();
        obj.moveZeroes(arr);
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
