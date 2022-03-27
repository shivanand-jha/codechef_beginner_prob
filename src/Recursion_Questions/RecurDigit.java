package Recursion_Questions;

import java.util.Scanner;

public class RecurDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       digit(n);
    }
    public static int digit(int n)
    {
        if(n==0)
            return 1;
        int a=n%10;
        System.out.println(a);
        return digit((n/10));
    }
}
