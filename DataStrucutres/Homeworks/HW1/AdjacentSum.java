
public class AdjacentSum {
    public boolean isAdjacentSumEqual(int[] nums, int n) {
        for (int i = 0; i < nums.length - 1; ++i)
        {
            if (nums[i] + nums[i + 1] == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AdjacentSum as = new AdjacentSum();
        int[] intArray = {1, 2, 3, 4, 3};
        System.out.print(as.isAdjacentSumEqual(intArray, 7));
    }
}
