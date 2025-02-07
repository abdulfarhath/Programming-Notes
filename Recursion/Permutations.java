public class Permutations {
    
    static void printPermutations(int[] arr, int idx){
        if(idx == arr.length){
            for(int ele : arr) System.out.print(ele);
            System.out.println(); return;
        }
        for(int i = idx; i<arr.length; i++){
            swap(arr,i,idx);
            printPermutations(arr, idx+1);
            swap(arr, idx, i);
        }
    }

    static void swap(int[] arr, int i, int j){
        int t= arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printPermutations(arr, 0);
    }
}
