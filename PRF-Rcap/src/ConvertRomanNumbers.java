import java.util.HashMap;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 12/19/2023 -- 1:12 PM
 **/

public class ConvertRomanNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input roman number : ");
        String num = scanner.next();

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] array = num.toCharArray();

        int value = 0;
        int prevVal = 0;


        for (char c : array) {

            Integer x = map.get(c);

            if (x > prevVal) {

                int calValue = x - prevVal;
                value = value + calValue;

            } else {

                value += x;

            }

            prevVal = x;

        }

        System.out.println("Number is : " + value);
    }
}

