//! in an arr all element have pair of same number or not
import java.util.Arrays;
public class code6 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,2,3,2};
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = 0; i < n; i += 2) {
            if(i + 1 >= n || arr[i] != arr[i + 1]) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
        
    }
}

//!or

// import java.util.HashMap;

// public class code6 {

//     public static void main(String[] args) {
//         int arr[] = {1,2,1,2,2,3,2,3};

//         HashMap<Integer,Integer> hashmap = new HashMap<>(); 
//         for(int num : arr) {
//             hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
//         }

//         for(int count : hashmap.values()) {
//             if(count % 2  != 0) {
//                 System.out.println("False");
//                 return;
//             }
//         }
//         System.out.println("True");
//     } 
// }

//! product of an array element leave current position(238)

// public class code6 {

//     public static void main(String[] args) {
//         int arr[] = {1,0,8,0};
//         int n = arr.length;
//         int product = 1;
//         int count = 0;
//         for(int i = 0; i < n; i++) {
//             if(arr[i] == 0) {
//                 count++;
//             } else {
//                 product = product * arr[i];
//             } 
//         }
//         for(int i = 0; i < n; i++){
//             if(count > 1) {
//                 arr[i] = 0;
//             } else if(count == 1) {
//                 if(arr[i] == 0) {
//                     arr[i] = product;
//                 } else {
//                     arr[i] = 0; 
//                 }
//             } else {
//                 arr[i] = product / arr[i];
//             }
//         }

//         System.out.print("arr: ");
//         for(int j = 0; j < n; j++) {
//             System.out.print(arr[j] + " ");
//         } 
//         System.out.println("");
//     }
// }

//! or

// public class code6 {
//     public static void main(String[] args) {
//         int arr[] = {1,2,8,4};
//         int n = arr.length;
//         int ans[] = new int[n];
//         ans[0] = 1;
//         for(int i = 1; i < n; i++) {
//             ans[i] = ans[i - 1] * arr[i - 1];
//         }
//         int suffix = 1;
//         for(int j = n - 2; j >=0; j--){
//             suffix = suffix * arr[j + 1];
//             ans[j] = ans[j] * suffix;
//         }
//         for(int i = 0; i < n; i++) {
//             System.out.print(ans[i] + " ");
//         }
//         System.out.println();
//     }
// }

//! matrix (set matrix 0)(73)

// public class code6 {

//     public static void main(String[] args) {
//         int[][] arr = {{1,1,1,1},{1,1,0,1},{1,0,1,1},{1,1,0,1}};
//         for(int i = 0; i < arr.length;i++){
//             for(int j = 0; j < arr.length;j++) {
//                 if(arr[i][j] == 0) {
//                     for(int k = 0; k < arr.length; k++) {
//                         if(arr[i][k] == 1) {
//                             arr[i][k] = -1;
//                         }
//                         if(arr[k][j] == 1) {
//                             arr[k][j] = -1;
//                         }
//                     }
//                 }
//             }
//         }
//         for(int k = 0; k < arr.length;k++){
//             for(int h = 0; h < arr.length;h++) {
//                 if(arr[k][h] == -1) {
//                     arr[k][h] = 0;
//                 }
//             }
//         }
//         for(int i = 0; i < arr.length;i++){
//             for(int j = 0; j < arr.length;j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println("");
//         }
//     }
// }

//! or

// public class code6 {

//     public static void main(String[] args) {
//         int[][] arr = {{1,1,1,1},{1,1,0,1},{1,0,1,1},{1,1,0,1}};
//         int[] row = new int[4];
//         int[] col = new int[4];
//         for(int i = 0; i < arr.length;i++){
//             for(int j = 0; j < arr.length;j++) {
//                 if(arr[i][j] == 0) {
//                     row[i] = 1;
//                     col[j] = 1;
//                 }
//             }
//         }
//         for(int k = 0; k < arr.length;k++){
//             for(int h = 0; h < arr.length;h++) {
//                 if(row[k] == 1 || col[h] == 1) {
//                     arr[k][h] = 0;
//                 }
//             }
//         }
//         for(int i = 0; i < arr.length;i++){
//             for(int j = 0; j < arr.length;j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println("");
//         }
//     }
// }

//! or

// public class code6 {

//     public static void main(String[] args) {
//         int[][] arr = { { 1, 1, 1, 1 }, { 1, 1, 0, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 } };
//         int col0 = 1;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[i][j] == 0) {
//                     arr[i][0] = 0;
//                     if (j != 0) {
//                         arr[0][j] = 0;
//                     } else {
//                         col0 = 0;
//                     }
//                 }
//             }
//         }
//         for (int i = 1; i < arr.length; i++) {
//             for (int j = 1; j < arr.length; j++) {
//                 if (arr[i][j] != 0) {
//                     if (arr[i][0] == 0 || arr[0][j] == 0) {
//                         arr[i][j] = 0;
//                     }
//                 }
//             }
//         }
//         if (arr[0][0] == 0) {
//             for (int j = 0; j < arr.length; j++) {
//                 arr[0][j] = 0;
//             }
//         }
//         if (col0 == 0) {
//             for (int i = 0; i < arr.length; i++) {
//                 arr[i][0] = 0;
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println("");
//         }
//     }
// }