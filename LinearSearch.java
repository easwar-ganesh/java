import java.io.*;
import java.util.Scanner;

class Linearsearch{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pos = -1;
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element to search:");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                pos = i + 1;
                break;
            }
        }
        if (pos == -1) {
            System.out.println(key + " not found in the array. Search failed ey element not found.");
        } else {
            System.out.println(key + " found at position " + pos + " in the array.");
        }
    }
}
