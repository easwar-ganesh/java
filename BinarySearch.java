import java.io.*;
import java.util.Scanner;
class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values into the array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        int low = 0, high = n - 1, pos = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (pos == -1) {
            System.out.println("Search unsuccessful");
            System.out.println("Key not found");
        } else {
            System.out.println("Search successful")
            System.out.println("Search successful: Key " + key + " found at index " + pos);
        }
    }
}
