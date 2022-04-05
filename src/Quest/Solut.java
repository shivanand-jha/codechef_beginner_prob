package Quest;

public class Solut {
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
                    return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,2,4};
        System.out.println(containsDuplicate(arr));
    }
}
