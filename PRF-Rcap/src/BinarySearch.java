import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 12/18/2023 -- 8:10 PM
 **/

public class BinarySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {23, 45, 11, 78, 5, 67, 90, 34, 60, 88};

        System.out.print("Input number : ");
        int num = scanner.nextInt();

        sortArray(arr);
        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] == num) {
                System.out.println("Number found at index: " + mid);
                break;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }

        if (start > end) {
            System.out.println("Number not found!");

        }

    }

    public static void sortArray(int[] ar) {

        for (int j = 0; j < ar.length - 1; j++) {
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;
                }
            }
        }
    }
}
