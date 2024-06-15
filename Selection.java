
package sorting;
public class Selection {
    public static void selection_sort(int[] data){
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(data[j] < data[min]){
                    min = j;
                
        int temp = data[min];
        data[min] = data[i];
        data[i] = temp;
                }
            }
        }
    }
    
    
}
