package Quest;

import java.util.Scanner;

public class Sign_of_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s= new int[5];
        for (int i = 0; i < 5; i++) {
            s[i]=sc.nextInt();
        }
        System.out.println(arraySign(s));
    }
    public  static int arraySign(int[] nums) {
        int pro=1;
        int c=0;
        for (int num : nums) {
            pro = pro * num;
        }
        if(pro>0)
            c++;
        return c;
    }
}
