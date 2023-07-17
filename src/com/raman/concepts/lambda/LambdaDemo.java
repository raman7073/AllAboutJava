package com.raman.concepts.lambda;

public class LambdaDemo {
    public void show() {
        MyLambda ml = () -> System.out.println("Lambda Expression");
        ml.display();
    }

    public int sum(int a, int b) {
        SumInterface s = (x, y) -> x + y;
        int z = s.sum(a, b);
        return z;
    }

    public void anonyshow() {
        MyLambda m = new MyLambda() {
            @Override
            public void display() {
                System.out.println(" Lambda Anonymous class");
            }
        };
        m.display();
    }
}
