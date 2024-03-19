import java.util.Arrays;

public class Main {

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

    static void printArray(int arr[])
    {
        int i = 0, length = arr.length;
        for (i = 0; i < length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 2 };
        printArray(doQuickSort(arr));
    }
}
