import java.util.*;
public class Sorting {
    //method to sort list using the selection sort algorithm
    public void selectionSortForString(String[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_element = i;
            String minString = list[i];
            for (int j = i + 1; j < n; j++)
                if (list[j].compareTo(minString)<0) {
                    minString = list[j];
                    min_element = j;
                }
            // Swap the found minimum element with the first
                if(min_element!=i) {
                    String temp = list[min_element];
                    list[min_element] = list[i];
                    list[i] = temp;
                }
        }
        orderOfStringSort(list);
    }
    //method to sort list using the bubble sort algorithm
    public void bubbleSortForString(String[] arr) {
        int n = arr.length;
        String temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++){
                if (arr[i].compareTo(arr[j])>0)
                {
                    // swap arr[j+1] and arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = temp;
                }
            }
        }
        orderOfStringSort(arr);
    }
    //method to sort list using the insertion sort algorithm
    public void insertionSortForString(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j=i + 1; j > 0;j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("Please how do you want your list sorted\n1.ascending order\t\t2.descending order");
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        if(order==1){
            System.out.println("Sorted array in ascending order:");
            for (int a = arr.length-1; a >= 0; a--){
                System.out.print(arr[a] + " ");
                System.out.println();
            }
        }
        else if(order==2){
            System.out.println("Sorted array in descending order:");
            for (int a = 0; a < arr.length; a++){
                System.out.print(arr[a] + " ");
                System.out.println();
            }
        }else{
            System.out.println("Sorry! you have entered a wrong input.");
        }
        //orderOfStringSort(arr);
    }
    //
    //method to sort list using the selection sort algorithm
    public void selectionSort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_element = i;
            for (int j = i+1; j < n; j++)
                if (list[j] < list[min_element])
                    min_element = j;
            // Swap the found minimum element with the first
            // element
            int temp = list[min_element];
            list[min_element] = list[i];
            list[i] = temp;
        }
        orderOfIntSort(list);
    }
    //method to sort list using the bubble sort algorithm
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       orderOfIntSort(arr);
    }
    //method to sort list using the insertion sort algorithm
    public void insertionSort(int[] arr) {
         for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            /* Move elements of arr[0i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        orderOfIntSort(arr);
    }
    //method to sort list using the nearly sorted algorithm
    public void nearlySorted(int[] arr){
        int n = arr.length;
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i-1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        orderOfIntSort(arr);
    }
    //
    //public void nearlySortedForString(String[] arr){
    //}
    //method to sort list using the shell sort algorithm
    public void shellSort(int[] arr){
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gaped insertion sort for this gap size.
            // The first gap elements a[0.gap-1] are already in gaped order
            // keep adding one more element until the entire array is
            // gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap sorted
                // save a[i] in temp and make a hole at position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until the correct
                // location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                //  put temp (the original a[i]) in its correct location
                arr[j] = temp;
            }
        }
        orderOfIntSort(arr);
    }
    //method to sort list using the quick sort algorithm
    //method to sort list using the merge sort algorithm
    public void mergeSort(int[] arr){
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr,0,arr.length-1);
        orderOfIntSort(arr);
    }
    //method to sort list using the radix sort algorithm
    public void radix(int[] arr){
        Radix radix = new Radix();
        radix.radixSort(arr,arr.length);
        radix.print(arr,arr.length);
    }
    //
    //method to determine and sort list in ascending of descending order
    public void orderOfStringSort(String[] list) {
        System.out.println("Please how do you want your list sorted\n1.ascending order\t\t2.descending order");
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        if(order==1){
            System.out.println("Sorted array in ascending order:");
            for (int a = list.length-1; a >= 0; a--){
                System.out.print(list[a] + " ");
                System.out.println();
            }
        }
        else if(order==2){
            System.out.println("Sorted array in descending order:");
            for (int a = 0; a < list.length; a++){
                System.out.print(list[a] + " ");
                System.out.println();
            }
        }else{
            System.out.println("Sorry! you have entered a wrong input.");
        }
    }
    public void orderOfIntSort(int[] list){
        System.out.println("Please how do you want your list sorted\n1.ascending order\t\t2.descending order");
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        if(order==1){
            System.out.println("Sorted array in ascending order:");
            for (int a = list.length-1; a >= 0; a--){
                System.out.print(list[a] + " ");
                System.out.println();
            }
        }
        else if(order==2){
            System.out.println("Sorted array in descending order:");
            for (int a = 0; a < list.length; a++){
                System.out.print(list[a] + " ");
                System.out.println();
            }
        }else{
            System.out.println("Sorry! you have entered a wrong input.");
        }
    }
    //method implemented in quick sort
    static class Radix{
    // A utility function to get maximum value in arr[]
    int getMax(int[] arr, int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > mx)
                mx = arr[i];
        }
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n]; // output array
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++){
            count[(arr[i] / exp) % 10]++;
            // Change count[i] so that count[i] now contains
            // actual position of this digit in output[]
            for (i = 1; i < 10; i++){
                count[i] += count[i - 1];
            }
            // Build the output array
            for (i = n - 1; i >= 0; i--) {
                output[count[(arr[i] / exp) % 10] - 1] = arr[i];
                count[(arr[i] / exp) % 10]--;
            }
        }
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < n; i++){
                arr[i] = output[i];
        }
    }

    // The main function to that sorts arr[] of size n using
    // Radix Sort
    void radixSort(int[] arr, int n) {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10){
            countSort(arr, n, exp);
        }
    }

    // A utility function to print an array
    void print(int[] arr, int n)
        {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }

}

 static class MergeSort {
     void merge(int[] arr, int beg, int mid, int end) {
         int l = mid - beg + 1;
         int r = end - mid;
         int[] LeftArray = new int [l];
         int[] RightArray = new int [r];

         System.arraycopy(arr, beg, LeftArray, 0, l);

         for (int j=0; j<r; ++j)
             RightArray[j] = arr[mid + 1+ j];
         int i = 0, j = 0;
         int k = beg;
         while (i<l&&j<r) {
             if (LeftArray[i] <= RightArray[j]) {
                 arr[k] = LeftArray[i];
                 i++;
             }
             else {
                 arr[k] = RightArray[j];
                 j++;
             }
             k++;
         }
         while (i<l) {
             arr[k] = LeftArray[i];
             i++;
             k++;
         }

         while (j<r) {
             arr[k] = RightArray[j];
             j++;
             k++;
         }
     }
     void sort(int[] arr, int beg, int end) {
         if (beg<end)
         {
             int mid = (beg+end)/2;
             sort(arr, beg, mid);
             sort(arr , mid+1, end);
             merge(arr, beg, mid, end);
         }
     }}
}





