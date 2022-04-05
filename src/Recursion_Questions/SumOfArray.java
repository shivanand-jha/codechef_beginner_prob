package Recursion_Questions;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(sumOfArr(arr,n));
    }
    public static int sumOfArr(int[] arr,int n)
    {
        if(n==-1) {
            return 0;
        }
        return arr[n-1]+sumOfArr(arr,n-2);
    }
}
