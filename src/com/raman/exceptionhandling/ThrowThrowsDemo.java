package com.raman.exceptionhandling;

/**
 * Syntax Errors -> Compiler will help.
 * Logical Error -> tracing /debugging will help.
 * Runtime Error -> A runtime error is a problem that happens during the execution of a program.
 * It may be due to bad input or due to unavailability of resources.
 * <p>
 * Exceptions are known errors that can occur at runtime . It may be due to bad input or due to
 * unavailability of resources . And when these exception occurs,the program crashes abruptly.So
 * to handle that, we have a concept of exception handling using which we can inform error to users
 * so that user can avoid the reason behind runtime error, and also it will prevent the program from
 * crashing.
 * finally block must be executed irrespective of whether there is exception or not.It
 * is mostly used for clean up process.
 * <p>
 * checked and unchecked exceptions
 * Checked exceptions are those which can detected by compiler itself, and it forces the developer
 * to handle the exception otherwise the program will not compile.
 * Unchecked Exceptions are not detected by compiler ,it is in hand of developer .These exceptions are arising
 * from Runtime Errors.
 * <p>
 * In hierarchy of exceptions , subclass should be put first.
 * <p>
 * throw vs throws
 * If a method doesn't want to handle checked exception(no try/catch block) , we write throws in its signature
 * so that calling method can handle it. catch is necessary to handle exception. If we don't have catch,then
 * method should have throws as signature ,  try can be there .
 * throw is used for defining exception
 */
public class ThrowThrowsDemo {
    public int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0)
            throw new NegativeDimensionException();
        return l * b;
    }

    public void meth1() throws NegativeDimensionException {
        System.out.println("Area is " + area(-10, 5));
    }
    public void meth2(){
        throw new UncheckedExceptionDemo();
    }
    public void meth3(){
        meth2();
    }

}
