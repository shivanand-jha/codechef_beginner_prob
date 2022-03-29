package Quest;

import java.util.Scanner;

public class Absolute_Diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int diff=sc.nextInt();

        System.out.println(findCount(n, arr,num,diff));
    }
    public static int findCount(int n,int[] arr,  int num, int diff) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(num - arr[i]) <= diff)
                count++;

        }
        return count >= 0 ? count : -1;

    }
}
