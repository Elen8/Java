public class ArrayShift<T> {
   public void shiftLeft(T[] array, int n) {
       int length = array.length;
       n = n % length;
       for (int i = 0; i < n; i++) {
           T temp = array[0];
           for (int j = 0; j < length - 1; j++) {
               array[j] = array[j + 1];
           }
           array[length - 1] = temp;
       }
   }
   public static void main(String[] args) {
       Integer[] intArray = {1, 2, 3, 4, 5};
       ArrayShift<Integer> arrayShifter = new ArrayShift<>();
       arrayShifter.shiftLeft(intArray, 2);
       for (Integer value : intArray) {
           System.out.print(value + " ");
       }
   }
}
