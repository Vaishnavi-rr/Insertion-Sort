Algorithm for Insertion Sort:

    n = length of arr
    for i = 1 to n-1
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key
            arr[j+1] = arr[j]
            j = j - 1
        arr[j+1] = key 
  
  code:

import java.util.Scanner;
public class Main {
  // Main method
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Array Before Insertion Sort: ");
        printArray(a);

        insertionSort(a);

        System.out.println("Array After Insertion Sort: ");
        printArray(a);

        
    }

    /*Function to sort array using insertion sort*/
    static void insertionSort(int arr[]) {
        int len = arr.length; //calculating the length of the array
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;

            /* Shift elements of a[i-1 .... 0], that are greater 
            than key, to one position right of their 
            current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int a[]) {
        int len = a.length;
        for (int i = 0; i < len; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
//Time Complexity	O(n2)
//Best Case	Ω(n)
//Worst Case	O(n2)
//Aux. Space Complexity	O(1)
//Best case when	Array is already sorted
//Worst case when	Array is reverse sorted
