import java.util.Arrays; 

public class Main
{
    public static int[] doBubbleSort(int[] arr)
    {
        int length = arr.length;
        for (int i = 0; i < length; ++i)
            for (int j = i + 1; j < length; ++j)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        return arr;
    }
    
    public static int[] doSelectionSort(int[] arr)
    {
        int length = arr.length;
        for (int i = 0; i < length; ++i)
        {
            int min = i;
            for (int j = i + 1; j < length; ++j)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    
    public static int[] doInsertionSort(int[] arr)
    {
        int length = arr.length;
        for (int i = 0; i < length - 1; ++i)
        {
            int j = i;
            while (j >= 0 && arr[j + 1] < arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }
    
    private static void merge(int[] arr, int[] arr1, int[] arr2)
    {
        int i = 0, j = 0;
        while (i + j < arr.length)
        {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j]))
            {
                arr[i + j] = arr1[i];
                i++;
            }
            else if (i == arr1.length || (j < arr2.length && arr1[i] > arr2[j]))
            {
                arr[i + j] = arr2[j];
                j++;
            }
            else
            {
                arr[i + j] = arr1[i];
                arr[i + j + 1] = arr2[i];
                i++;
                j++;
            }
        }
    }
    
    public static int[] doMergeSort(int[] arr)
    {
        int length = arr.length;
        if (length < 2) return arr;
        int mid = length / 2;
        int[] arr1 = Arrays.copyOfRange(arr, 0, mid);
        int[] arr2 = Arrays.copyOfRange(arr, mid, length);
        
        doMergeSort(arr1);
        doMergeSort(arr2);
        merge(arr, arr1, arr2);
        return arr;
    }
    
    public static int[] doQuickSort(int[] arr)
    {
        int length = arr.length;
        if (length < 2) return arr;
        int pivot = arr[length - 1];
        int begin = 0, end = length;
        
        int[] temp = new int[length];
        for (int i = 0; i < length - 1; ++i)
        {
            if (arr[i] < pivot)
                temp[begin++] = arr[i];
            else if (arr[i] > pivot)
                temp[--end] = arr[i];
        }
        
        int[ ] L = Arrays.copyOfRange(temp, 0, begin);
        int[ ] E = new int[end - begin];
        Arrays.fill(E, pivot);
        int[ ] G = Arrays.copyOfRange(temp, end, length);
        doQuickSort(L); 
        doQuickSort(G);
        System.arraycopy(L, 0, arr, 0, begin);
        System.arraycopy(E, 0, arr, begin, end - begin);
        System.arraycopy(G, 0, arr, end, length - end);
        return arr;
    }
    
    public static int[] doBucketSort(int[] arr)
    {
        int bucketLength = arr[0];
        for (int i = 1; i < arr.length; ++i)
        {
            if (arr[i] > bucketLength)
                bucketLength = arr[i];
        }
        int[] bucket = new int[bucketLength + 1];
        for (int i = 0; i < arr.length; ++i)
        {
            bucket[arr[i]]++;
        }
        
        int i = 0; 
        for (int j = 0; j < bucket.length; ++j)
        {
            for (int k = 0; k < bucket[j]; ++k)
            {
                arr[i++] = j;
            }
        }
        return arr;
    }
    
    static void printArray(int arr[])
    {
        int i = 0, length = arr.length;
        for (i = 0; i < length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
	public static void main(String[] args) {
	                                      
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		//printArray(doBubbleSort(arr));
		//printArray(doSelectionSort(arr));
		//printArray(doInsertionSort(arr));
		//printArray(doMergeSort(arr));
		//printArray(doQuickSort(arr));
		printArray(doBucketSort(arr));

        long startTime = System.currentTimeMillis();
        //insert any sorting algorithm here to calculatie execution time
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
}
