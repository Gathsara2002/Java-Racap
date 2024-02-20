package theory;

import java.util.ArrayList;

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
        nums.forEach(n -> System.out.println(n));


        /*forEach() method eka argument ekak vidiyata consumer ekak gannava.consumer kiyanne functional interface ekak.
         e nisa consumer eka annonymous inner class ekak vidiyata liyanne natuva lambda expression use karala forEach
         eka atulema apata avshya process eka karaganna puluvn*/

    }
}
