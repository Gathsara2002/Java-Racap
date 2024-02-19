import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author : Gathsara
 * created : 2/19/2024 -- 10:21 PM
 **/

public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        //normal flow --------------------------------
        /*Consumer<Integer> consumer = new Consumer() {
            @Override
            public void accept(Object n) {
                System.out.println(n);
            }
        };*/

        //with lambda
        Consumer<Integer> consumer = n -> System.out.println(n);
        nums.forEach(consumer);

    }
}
