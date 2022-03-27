package Recursion_Questions;

import java.util.Scanner;

public class RecurPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(print(n));
    }
    public static int  print(int n)
    {

        if(n==1)
            return 1;

       System.out.println(n);

        return print(n-1);
    }
}
