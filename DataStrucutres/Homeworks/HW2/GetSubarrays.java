
public class GetSubarrays
{
    static void printSubArrays(int[] arr, int start, int end)
    { 
        if (end == arr.length)
            return;

        else if (start > end)
            printSubArrays(arr, 0, end + 1);

        else {
            for (int i = start; i <= end; i++)
                System.out.print(arr[i] + " ");
            System.out.println();    
            printSubArrays(arr, start + 1, end);
        }
        return;
    }
    
	public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };	   
        printSubArrays(arr, 0, 0);
		System.out.println();
	}
}

//2^n
