import java.util.Arrays;

/**
 * @author : Gathsara
 * created : 12/19/2023 -- 2:17 PM
 **/

public class RemoveDuplicateValues {
    public static void main(String[] args) {

        int[] ar = {0, 0, 1, 1, 5, 4, 9, 9};
        Arrays.sort(ar);
        int unique = ar.length;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i - 1] == ar[i]) {
                unique--;
            }
        }

        System.out.println("Length is : " + unique);
    }
}
