package com.raman.concepts.lambda;

public class Main {
    public static void main(String[] args) {
        LambdaInterface lm = MethodReference::reverse;
        lm.display("rekha");
        MethodReference mr = new MethodReference();
        LambdaInterface lm1 = mr::reverse1;
        lm1.display("async");
    }
}
