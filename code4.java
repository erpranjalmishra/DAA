//! find min index of occuring no.
// public class code4 {
//     public static void main(String[] args) {
//         int arr[] = {1,2,2,2,3,4,5};
//         int target = 2;
//         int low = 0;
//         int high = arr.length - 1;
//         int min = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if(arr[mid] == target) {
//                 min = mid;
//                 high = mid - 1;
//             } else if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         System.out.println("ans = "+ min);
//     }
// }

//! find max index of occuring no.
// public class code4 {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 2, 2, 3, 4, 5 };
//         int target = 2;
//         int low = 0;
//         int high = arr.length - 1;
//         int min = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {
//                 min = mid;
//                 low = mid + 1;
//             } else if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         System.out.println("ans = " + min);
//     }
// }

//! count no. of occurance 
// public class code4 {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 2, 2, 3, 4, 5 };
//         int target = 2;
//         int min = min_index(arr, target);
//         int max = max_index(arr, target);
//         int count = (max - min) + 1;
        
//         System.out.println("count of "+ target + " = " + count);
//     }
//     public static int min_index(int[] arr, int target) {
//         int low = 0;
//         int high = arr.length;
//         int ans = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if(arr[mid] == target) {
//                 ans = mid;
//                 high = mid - 1;
//             } else if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }
//     public static int max_index(int[] arr, int target) {
//         int low = 0;
//         int high = arr.length;
//         int ans = -1;
//         while(low <= high) {
//             int mid = (low + high) / 2;
//             if(arr[mid] == target) {
//                 ans = mid;
//                 low = mid + 1;
//             } else if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }
// }

//! find square root of any number by  

public class code4 {

    public static void main(String[] args) {
        int num = 25;
        double ans = Math.sqrt(num);
        System.out.println("square root = " + ans);
    }
}

//! find square root of any number by using binary search

// public class code4 {

//     public static void main(String[] args) {
//         int num = 25;
//         int low = 0;
//         int high = num;
//         int ans = -1;
//         while(low <= high) {
//             int mid = (low + high) / 2;
//             if (mid * mid <= num) {
//                 ans = mid;
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         System.out.println("ans = " + ans);
//     }
// }

//! peck element
//! using linear search
// public class code4 {

//     public static void main(String[] args) {
//         int arr[] = {1,2,5,8,7,9};
//         int n = arr.length;
//         for(int i = 0; i < n; i++) {
//             if(i == 0 && arr[i] > arr[i+1] || i == n-1 && arr[i] > arr[i-1]) {
//                 System.out.println(i);
//             } else if(i > 0 && i < n-1 &&arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
//                 System.out.println(i);
//             } else {
//                 System.out.println("no peak");
//             }
//         }
//     }
// }

//! using binary search

// public class code4 {

//     public static void main(String[] args) {
//         int arr[] = {1,2,5,8,7,6};
//         int n = arr.length;
//         if(n == 1) {
//             System.out.println("peak = 0");
//             return;
//         }
//         if(arr[0] > arr[1]) {
//             System.out.println("peak = 0");
//             return;
//         }
//         if(arr[n-1] > arr[n-2]) {
//             System.out.println("peak = " + (n-1));
//             return;
//         }
//         int low = 1;
//         int high = n-2;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
//                 System.out.println("peak = "+mid);
//                 return;
//             } else if (arr[mid] > arr[mid - 1]) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//     }
// }