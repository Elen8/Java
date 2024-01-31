

public class SumOfPreviouses
{
    public static boolean checkIfPreviousTwo(int[] A, int i, int j, int k, int n){
        if(i >= n) return false;
        if(j < i && k < i){
            if(A[j] + A[k] == A[i]) return true;
            return (checkIfPreviousTwo(A, i, j + 1, k, n) || checkIfPreviousTwo(A, i, j, k + 1, n));
        }
        return checkIfPreviousTwo(A, i + 1, j, k, n);
    }
    
	public static void main(String[] args) {
	    int[] arr = {1, 3, 4};
        System.out.println(checkIfPreviousTwo(arr, 0, 0, 0, arr.length));
	}
}

//O(n^2)
