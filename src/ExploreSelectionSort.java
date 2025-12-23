import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ExploreSelectionSort {

    // Postcondition: Uses Selection Sort to put arr
    // in ascending order
    public static void selectionSortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Postcondition: Uses Selection Sort to put arr
    // in descending order
    public static void selectionSortDescending(int[] arr) {

    }


    // Postcondition: Uses Selection Sort to put the
    // arr in ascending order based on the ones digit (e.g. 91, 32, 23, .... )
    public static void selectionSortOnesDigit(int[] arr) {

    }

    // Postcondition: Uses Selection Sort to put arr
    // in ascending alphabetical order
    public static void selectionSortAlpha(String[] arr) {

    }
    

    public static void main(String[] args) throws IOException {

        // Input arrays to be sorted
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        String[] words = new String[144];
        Scanner scan = new Scanner(new File("poem.txt"));
        int index = 0;
        while (scan.hasNext()) {
            words[index++] = scan.next().toUpperCase();
        }
        // end array input

        // Print initial array
        System.out.print("nums before sorting: ");
        System.out.println(Arrays.toString(nums));

        // Sort ascending 
        selectionSortAscending(nums);
        System.out.print("nums after sorting (ascending): ");
        System.out.println(Arrays.toString(nums));

        // Sort descending 
        selectionSortDescending(nums);
        System.out.print("nums after sorting (descending): ");
        System.out.println(Arrays.toString(nums));
  
        // Sort based on ones digit
        selectionSortOnesDigit(nums);
        System.out.print("nums after sorting based on ones digit (ascending): ");
        System.out.println(Arrays.toString(nums));

        // Sort alphbetically
        selectionSortAlpha(words);
        System.out.print("\nwords after sorting:\n");
        System.out.println(Arrays.toString(words));

    }

}


