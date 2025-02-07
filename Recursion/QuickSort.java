import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 9 , 78 , 3, 4,4, 0};
        System.err.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.err.println(Arrays.toString(arr));
    }
    static void quickSort(int arr[], int low , int hi){
        if(low < hi){
            int mid = (low + hi)/2;
            int pivot = arr[mid];
            int s = low;
            int e = hi;
            while(s <= e){
                while(arr[s] < pivot){
                    s++;
                }
                while(arr[e] > pivot){
                    e--;
                }
                if(s <= e){
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;e--;
                }
            }
            quickSort(arr, low, e);
            quickSort(arr, s, hi);
        }
    }
}