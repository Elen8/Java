

public class FindMax
{
    static int getMax(int[] arr, int start, int end)
    { 
        if (start == end)
            return arr[start];
        int mid = start + (end + start)/2;
        if (arr[mid] > arr[mid + 1])
            return getMax(arr, start, mid);
        else
            return getMax(arr, mid + 1, end);
    }
    
	public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 1, 0 };	   
        System.out.println(getMax(arr, 0, arr.length - 1));
	}
}

//O(logn)
