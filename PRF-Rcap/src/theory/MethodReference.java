package theory;

import java.util.Arrays;
import java.util.List;

/**
 * @author : Gathsara
 * created : 2/21/2024 -- 9:29 PM
 **/

public class MethodReference {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Danny", "Mike", "Ann");
        names.forEach(System.out::println);

        /*Method references are a special type of lambda expressions. They’re often used to create simple lambda
        expressions by referencing existing methods.*/

    }
}
