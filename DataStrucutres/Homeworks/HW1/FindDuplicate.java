public class FindDuplicate {
    public boolean isDuplicate(int[] nums, int max) {
        int[] buckets = new int[max];
        for (int value: nums)
        {
            if (buckets[value] != 0)
                return true;
            else
                buckets[value]++;
        }
        return false;
    }

    public static void main(String[] args) {
        FindDuplicate fd = new FindDuplicate();
        int[] intArray = {1, 2, 3, 4, 3};
        System.out.print(fd.isDuplicate(intArray, 8));
    }
}
