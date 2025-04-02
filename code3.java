//! move zero at the end of the array

// public class code3 {
//     public static void main(String[] args) {
//         int arr[] = {0,1,0,4,3};
//         int n = arr.length;

//         for(int i = 1; i < n;i++) {
//             int key = arr[i];
//             int j = i-1;
//             while(j >= 0 && arr[j] == 0) {
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j +1] = key;
//         }
//         System.out.print("sort: ");
//         for(int value : arr) {
//             System.out.print(value + " ");
//         }
//         System.out.println("");
//     }
// }

//! minimum value in rotated arr

// public class code3 {

//     public static void main(String[] args) {
//         int arr[] = {3,4,5,1,2};
//         int n = arr.length;
        
//         int key = arr[0];
//         for(int i = 1; i < n; i++) {
//             if(arr[i] < key) {
//                 key = arr[i];
//             }
//         }
//         System.out.println("key: " + key);

//     }
// }

//!or

// public class code3{
//     public static void main(String[] args) {
//         int arr[] = {3,4,5,1,2};

//         int min_value = Integer.MAX_VALUE;
//         for(int i = 0; i < arr.length; i++) {
//             min_value = Math.min(min_value, arr[i]);
//         }
//         System.out.println("key: " + min_value);
//     }
// }

//! minimun value in rotated arr using binary search

public class code3 {
    public static void main(String[] args) {
        // int arr[] = {3,4,5,1,2};
        int arr[] = {4,5,6,0,1,2};
        int low = 0;
        int high = arr.length - 1;

        int minvalue = Integer.MAX_VALUE;
        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[low] <= arr[high]) {
                minvalue = Math.min(minvalue, arr[low]);
                break;
            }

            if(arr[low] <= arr[mid]) {
                minvalue = Math.min(minvalue, arr[low]);
                low = mid + 1;
            } else {
                high = mid - 1;
                minvalue = Math.min(minvalue, arr[mid]);
            }
        }
        System.out.println("min value: " + minvalue);
    }
}