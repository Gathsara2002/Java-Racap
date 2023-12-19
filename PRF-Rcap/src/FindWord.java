import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 12/19/2023 -- 2:37 PM
 **/

public class FindWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input word : ");
        String word = scanner.next();

        System.out.print("Input find word : ");
        String findWord = scanner.next();

        int index = word.indexOf(findWord);

        char[] array1 = word.toCharArray();
        char[] array2 = findWord.toCharArray();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {

                }
            }
        }


        System.out.println(index);


    }
}

