package theory;

/**
 * @author : Gathsara
 * created : 2/20/2024 -- 4:43 PM
 **/

@FunctionalInterface
interface Lambda {
    void onlyOneMethod();
}

class LambdaImpl implements Lambda {

    @Override
    public void onlyOneMethod() {
        System.out.println("Normal class");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {

        //without anonymous inner class
        Lambda lambda = new LambdaImpl();
        lambda.onlyOneMethod();


        //with anonymous inner class
        Lambda lambda1=new Lambda() {
            @Override
            public void onlyOneMethod() {
                System.out.println("Inner class");
            }
        };
        lambda1.onlyOneMethod();


        //with lambda expression
        Lambda lambda2=() -> {
            System.out.println("Lambda expression");
        };
        lambda2.onlyOneMethod();
    }
}
