//! bubble sort
// public class code2 {
//     public static void main(String[] args) {
//         int arr[] = {42, 23, 19, 20, 5, 52};
//         int n = arr.length;
//         for(int i = 0; i < n-1; i++) {
//             for(int j = 0; j < n-i-1; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int i = 0; i < n; i++) {
//             System.out.print("arr: " + arr[i]+" ");
//         } 
//         System.out.println("");
//     }
// }

//! selection sort
// public class code2 {
//     public static void main(String[] args) {
//         int arr[] = {21,7,8,2,11};
//         int n = arr.length;

//         for(int i = 0; i < n-1; i++) {
//             int minIdx = i;
//             for(int j = i + 1;j < n; j++) {
//                 if(arr[j] < arr[minIdx]) {
//                     minIdx = j;
//                 }
//             }
//             int minvalue = arr[minIdx];
//             for(int k = minIdx; k > i;k--) {
//                 arr[k] = arr[k-1];
//             }
//             arr[i] = minvalue;
//         }
//         for(int i = 0; i < n; i++) {
//             System.out.print("arr: " + arr[i] + " ");
//         }
//         System.out.println(" ");

//     }
// }


//! remove duplicat

// import java.util.HashSet;

// public class code2 {

//     public static void main(String[] args) {
//         int arr[] = {1,2,2,3,3,4,5};
//         HashSet<Integer> set = new HashSet<>();

//         for(int num: arr) {
//             set.add(num);
//         }
//         System.out.println("remove duplicat: " + set);
//     }
// }

//!or

// import java.util.ArrayList;

// public class code2 {

//     public static void main(String[] args) {
//         int arr[] = {1,2,2,3,3,4,5};
//         ArrayList<Integer> array = new ArrayList<>();
//         array.add(arr[0]);
//         for(int i = 1;i < arr.length; i++) {
//             if(arr[i] != arr[i-1]) {
//                 array.add(arr[i]);
                
//             }
//             System.out.print("arr: " + array);
//         }
//         System.out.println(" ");
//     }
// }

//! Insercion sort

public class code2 {
    public static void main(String[] args) {
        int arr[] = {21,7,8,2,11};
        int n = arr.length;
        for(int i = 1; i < n ;i++) {
            int cur = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > cur) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = cur;
        }
        System.out.println("sort: ");
        for(int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}