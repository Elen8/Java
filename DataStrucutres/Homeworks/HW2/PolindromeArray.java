public class PolindromeArray
{
    public static int isPolindrome(int[] arr, int b, int e)
    {
        if (b >= e)
            return 1;
            
        if (arr[b] == arr[e]) 
            return isPolindrome(arr, b + 1, e - 1);
            
        return 0;
    }
    
	public static void main(String[] args) {
	    int[] arr = {1, 5, 4, 5, 4, 5, 1};
		System.out.println(isPolindrome(arr, 0, arr.length - 1));
	}
}

//O(n/2) = O(n)
