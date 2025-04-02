//! check arr is sorted or not
// public class code {
//     public static void main(String[] args) {
//         int arr[] = {1,2,5,9,2};
//         int n = arr.length;
//         for(int i = 0; i < n; i++) {
//             if(arr[i] < arr[i+1]) {
//                 System.out.println("yes");
//             } else {
//                 System.out.println("no");
//             }
//         }
//     }
// }

//! find largest no.
// public class code {
//     public static void main(String[] args) {
//         int arr[] = {1,5,2,6};
//         int n = arr.length;
//         int temp = 0;
//         for(int i = 0; i < n; i++) {
//             if(temp < arr[i]) {
//                 temp = arr[i];
//             }
//         }
//         System.out.println("value = " +temp);
//     }
// }

//! find second largest no.
// public class code {
//     public static void main(String[] args) {
//         int arr[] = {1,2,5,9,2};
//         int n = arr.length;
//         int temp = 0;

//         for(int i = 0; i < n; i++) {
//             if (temp < arr[i]) {
//                 temp = arr[i];
//             }    
//         }
//         int m = 0;
//         for(int i = 0; i < n; i++) {
//             if(m > arr[i] && m < temp) {
//                 m = arr[i];   
//             }
//         }
//         System.out.println(" m = "+m);
//     }
// }

//! prime no.
// import java.util.Scanner;
// public class code {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         sc.close();

//         if (isPrime(num)) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//     }

//     public static boolean isPrime(int num) {
//         if (num < 2) return false;
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) return false;
//         }
//         return true;
//     }
// }

//! bineary search
public class code {

    public static void main(String[] args) {
        int[] myArray = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int myTarget = 15;

        int result = binarySearch(myArray, myTarget);

        if (result != -1) {
            System.out.println("Value " + myTarget + " found at index " + result);
        } else {
            System.out.println("Target not found in array.");
        }
    }

    public static int binarySearch(int[] arr, int targetVal) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == targetVal) {
                return mid;
            }

            if (arr[mid] < targetVal) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
