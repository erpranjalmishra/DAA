//! rotate an array 3 time(189)  
public class code5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int k = 3;
        rotate(arr, k);
        for(int i = 0; i < n-1; i++) {
            System.out.print(arr[i] +" ");
        }
        System.err.println("");

    }
    public static void rotate(int[] arr, int k){
        k = k % arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
