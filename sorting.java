package sorting;

import java.util.Arrays;
import java.util.Random;

public class sorting {
    public static void main(String[] args) {
       int data10[] = new int[10];
       int data100[] = new int[100];
       int data1000[] = new int[1000];
       int data10000[] = new int[10000];
       Random angka= new Random();
       
       for (int i = 0; i < 10000 ; i++){
           if(data10.length > i){
               data10[i] = angka.nextInt(100);}
           if(data100.length > i){
               data100[i] = angka.nextInt(100);}
           if(data1000.length > i){
               data1000[i] = angka.nextInt(100);}
           if(data10000.length > i){
               data10000[i] = angka.nextInt(100);}
           
       }
        System.out.println("Data Sebelum di Urut:");
        System.out.println("Data 10 : " + Arrays.toString(data10));
        System.out.println("Data 100 : " + Arrays.toString(data100));
        System.out.println("Data 1000 : " + Arrays.toString(data1000));
        System.out.println("Data 10000 : " + Arrays.toString(data10000));
        
        System.out.println("\n--------------------------------------------");
              
        System.out.println("Selection Sort: ");
        hasil_selection_sort(data10);
        hasil_selection_sort(data100);
        hasil_selection_sort(data1000);
        hasil_selection_sort(data10000);
               
        System.out.println("\nBubble Sort: ");
        hasil_bubble_sort(data10);
        hasil_bubble_sort(data100);
        hasil_bubble_sort(data1000);
        hasil_bubble_sort(data10000);

        System.out.println("\nInsertion Sort: ");
        hasil_insertion_sort(data10);
        hasil_insertion_sort(data100);
        hasil_insertion_sort(data1000);
        hasil_insertion_sort(data10000);
   
        System.out.println("\nMerge Sort: ");
        hasil_merge_sort(data10);
        hasil_merge_sort(data100);
        hasil_merge_sort(data1000);
        hasil_merge_sort(data10000);
        
        System.out.println("\nQuick Sort: ");
        hasil_quick_sort(data10);
        hasil_quick_sort(data100);
        hasil_quick_sort(data1000);
        hasil_quick_sort(data10000);

        System.out.println("\nHeap Sort: ");
        hasil_heap_sort(data10);
        hasil_heap_sort(data100);
        hasil_heap_sort(data1000);
        hasil_heap_sort(data10000);
        
        System.out.println("\nCounting Sort: ");
        hasil_counting_sort(data10);
        hasil_counting_sort(data100);
        hasil_counting_sort(data1000);
        hasil_counting_sort(data10000);
      
        System.out.println("\nRadix Sort: ");
        hasil_radix_sort(data10);
        hasil_radix_sort(data100);
        hasil_radix_sort(data1000);
        hasil_radix_sort(data10000);
 

        
    }
    
    static void hasil_selection_sort(int[] data){
    int n = data.length;
    int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = data[i];
        }
        long awal = System.nanoTime();
        selection_sort(temp);
        long akhir = System.nanoTime();
        long durasi = akhir - awal;
        System.out.println(durasi);
    }
    
    
    static void hasil_bubble_sort(int[] data){
    int n = data.length;
    int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = data[i];
        }
        long awal = System.nanoTime();
        bubble_sort(temp);
        long akhir = System.nanoTime();
        long durasi = akhir - awal;
        System.out.println(durasi);
    }
    
    static void hasil_insertion_sort(int[] data){
    int n = data.length;
    int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = data[i];
        }
        long awal = System.nanoTime();
        insertion_sort(temp);
        long akhir = System.nanoTime();
        long durasi = akhir - awal;
        System.out.println(durasi);
    }
    
    static void hasil_merge_sort(int[] data){
    int n = data.length;
    int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = data[i];
        }
        long awal = System.nanoTime();
        merge_sort(temp);
        long akhir = System.nanoTime();
        long durasi = akhir - awal;
        System.out.println(durasi);
    }
    
    static void hasil_quick_sort(int[] data){
    int n = data.length;
    int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = data[i];
        }
        long awal = System.nanoTime();
        quick_sort(temp);
        long akhir = System.nanoTime();
        long durasi = akhir - awal;
        System.out.println(durasi);
    }
 
    static void hasil_counting_sort(int[] data){
    int n = data.length;
    int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = data[i];
        }
        long awal = System.nanoTime();
        counting_sort(temp);
        long akhir = System.nanoTime();
        long durasi = akhir - awal;
        System.out.println(durasi);
    }
        
    static void hasil_radix_sort(int[] data){
    int n = data.length;
    int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = data[i];
        }
        long awal = System.nanoTime();
        radix_sort(temp);
        long akhir = System.nanoTime();
        long durasi = akhir - awal;
        System.out.println(durasi);
    }
    
    static void hasil_heap_sort(int[] data){
    int n = data.length;
    int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = data[i];
        }
        long awal = System.nanoTime();
        heapSort(temp);
        long akhir = System.nanoTime();
        long durasi = akhir - awal;
        System.out.println(durasi);
    }
    
    
    
    static void selection_sort(int[] data){
        int n = data.length;
      
        for (int i = 0; i < n-1; i++)
        {
    
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (data[j] < data[min_idx])
                    min_idx = j;

            int temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;                  
        }
    }
    
    static void bubble_sort(int[] data){
        int n = data.length;
        
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {

                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        
    }
 
    static void insertion_sort(int[] data){
        int n = data.length;
        
        for (int i = 1; i < n; i++) {
            int temp = data[i];
            int j = i - 1;
        
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            
            data[j + 1] = temp;
        }
    }
 
    static void merge_sort(int arr[]){
       if (arr.length <= 1) {
            return; // already sorted
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        merge_sort(left);
        merge_sort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }}
    
     public static void quick_sort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
     public static void counting_sort(int[] arr) {
        int max = getMax(arr);
        int[] count = new int[max + 1];
        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    
   public static void radix_sort(int[] arr) {
        int max = getMax2(arr);
        int exp = 1;
        while (max / exp > 0) {
            countingSort(arr, exp);
            exp *= 10;
        }
    }

    private static int getMax2(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move the root element to the end of the array
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest!= i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
    
    
}