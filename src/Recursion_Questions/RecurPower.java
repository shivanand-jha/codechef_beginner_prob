package Recursion_Questions;

import java.util.Scanner;

public class RecurPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(power(n,x));
    }
    public static long power(int n, int x)
    {
        if(x==0)
            return 1;

        return n*power(n,x-1);
    }
}