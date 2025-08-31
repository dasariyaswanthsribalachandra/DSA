import java.util.*;

class ArrayUnion {
    public Set<Integer> findUnion(int[] a,int[] b){
        Set<Integer> set=new HashSet<>();
        for(int i:a) set.add(i);
        for(int i:b) set.add(i);
        return set;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++) arr2[i]=sc.nextInt();
        ArrayUnion obj=new ArrayUnion();
        Set<Integer> union=obj.findUnion(arr1,arr2);
        for(int val:union) System.out.print(val+" ");
    }
}
